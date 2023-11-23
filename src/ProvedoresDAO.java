import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProvedoresDAO {

        public static void crearProvedoresDB(Provedores provedores) {
            Conexion db_connect = new Conexion();
            try (Connection conexion = (Connection) db_connect.get_conConnection()) {
                PreparedStatement ps = null;
                try {
                    String query = "INSERT INTO Clientes (Nombre, Contacto) VALUES (?, ?)";
                    ps = conexion.prepareStatement(query);
                    ps.setString(1, provedores.getNombre());
                    ps.setString(2, provedores.getContacto());
                    ps.executeUpdate();

                    System.out.println("¡Registro de provedores creado correctamente!");

                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

        public static void leerProvedoresDB() {
            Conexion db_connect = new Conexion();
            try (Connection conexion = (Connection) db_connect.get_conConnection()) {
                PreparedStatement ps = null;
                try {
                    String query = "SELECT * FROM Provedores";
                    ps = conexion.prepareStatement(query);
                    ps.execute();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

        public static void borrarProvedoresDB(int id) {
            Conexion db_connect = new Conexion();
            try (Connection conexion = (Connection) db_connect.get_conConnection()) {
                PreparedStatement ps = null;
                try {
                    String query = "DELETE FROM Provedores WHERE ID = ?";
                    ps = conexion.prepareStatement(query);
                    ps.setInt(1, id);
                    ps.executeUpdate();

                    System.out.println("¡Registro de provedores eliminado correctamente!");

                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

        public static void actualizarProvedoresDB(Provedores provedores) {
            Conexion db_connect = new Conexion();
            try (Connection conexion = (Connection) db_connect.get_conConnection()) {
                PreparedStatement ps = null;
                try {
                    String query = "UPDATE Clientes SET Nombre = ?, Contacto = ? WHERE ID = ?";
                    ps = conexion.prepareStatement(query);
                    ps.setString(1,provedores.getNombre());
                    ps.setString(2, provedores.getContacto());
                    ps.setInt(3, provedores.getId());
                    ps.executeUpdate();

                    System.out.println("¡Registro del provedor actualizado correctamente!");

                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }


