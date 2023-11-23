import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpleadosDAO {
    public static void crearEmpleadosDB(Empleados empleados) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = (Connection) db_connect.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO Clientes (Nombre, puesto) VALUES (?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, empleados.getNombre());
                ps.setString(2, empleados.getPuesto());
                ps.executeUpdate();

                System.out.println("¡Registro de cliente creado correctamente!");

            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void leerEmpleadosDB() {
        Conexion db_connect = new Conexion();
        try (Connection conexion = (Connection) db_connect.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "SELECT * FROM empleados";
                ps = conexion.prepareStatement(query);
                ps.execute();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void borrarempleadosDB(int id) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = (Connection) db_connect.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM empleados WHERE ID = ?";
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

    public static void actualizarempleadosDB(Empleados empleados) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = (Connection) db_connect.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "UPDATE empleados SET Nombre = ?, puesto = ? WHERE ID = ?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, empleados.getNombre());
                ps.setString(2, empleados.getPuesto());
                ps.setInt(3, empleados.getId());
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








