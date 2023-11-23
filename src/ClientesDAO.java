
    import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

    public class ClientesDAO {
        public static void crearClientesDB(Clientes clientes) {
            Conexion db_connect = new Conexion();
            try (Connection conexion = (Connection) db_connect.get_conConnection()) {
                PreparedStatement ps = null;
                try {
                    String query = "INSERT INTO Clientes (Nombre, Contacto) VALUES (?, ?)";
                    ps = conexion.prepareStatement(query);
                    ps.setString(1, clientes.getNombre());
                    ps.setString(2, clientes.getContacto());
                    ps.executeUpdate();

                    System.out.println("¡Registro de cliente creado correctamente!");

                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

        public static void leerClientesDB() {
            Conexion db_connect = new Conexion();
            try (Connection conexion = (Connection) db_connect.get_conConnection()) {
                PreparedStatement ps = null;
                try {
                    String query = "SELECT * FROM Clientes";
                    ps = conexion.prepareStatement(query);
                    ps.execute();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

        public static void borrarClientesDB(int id) {
            Conexion db_connect = new Conexion();
            try (Connection conexion = (Connection) db_connect.get_conConnection()) {
                PreparedStatement ps = null;
                try {
                    String query = "DELETE FROM Clientes WHERE ID = ?";
                    ps = conexion.prepareStatement(query);
                    ps.setInt(1, id);
                    ps.executeUpdate();

                    System.out.println("¡Registro de cliente eliminado correctamente!");

                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

        public static void actualizarClientesDB(Clientes clientes) {
            Conexion db_connect = new Conexion();
            try (Connection conexion = (Connection) db_connect.get_conConnection()) {
                PreparedStatement ps = null;
                try {
                    String query = "UPDATE Clientes SET Nombre = ?, Contacto = ? WHERE ID = ?";
                    ps = conexion.prepareStatement(query);
                    ps.setString(1, clientes.getNombre());
                    ps.setString(2, clientes.getContacto());
                    ps.setInt(3, clientes.getId());
                    ps.executeUpdate();

                    System.out.println("¡Registro de cliente actualizado correctamente!");

                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
}
