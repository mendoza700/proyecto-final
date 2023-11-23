import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Conexion get_conConnection(){
        Conexion conection = null;
        try {
            conection = (Conexion) DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda","root","");
            if(conection!=null){
                System.out.println("conexion exitosa........");
            }
        }catch (SQLException e){
            System.out.println("Error: "+e);
        }
        return conection;
    }
    }

