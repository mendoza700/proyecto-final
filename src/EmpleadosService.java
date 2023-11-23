import java.util.Scanner;

public class EmpleadosService {

        public static void crearEmpleados() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe el nombre del empleados: ");
            String nombre = sc.nextLine();

            System.out.println("Escribe el puesto del empleados: ");
            String puesto = sc.nextLine();

           Empleados empleados = new Empleados();
            empleados.setNombre(nombre);
            empleados.setPuesto(puesto);
            ClientesDAO.crearClientesDB(empleados);
        }

        public static void listarempleados() {
            EmpleadosDAO.leerEmpleadosDB();
        }

        public static void borrarEMPLEADOS() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe el ID del EMPLEADO que deseas borrar: ");
            int id = sc.nextInt();

            EmpleadosDAO.borrarempleadosDB(id);
        }

        public static void editarEmpleados() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe el ID del empleado que deseas editar: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Escribe el nuevo nombre del Empleado: ");
            String nombre = sc.nextLine();

            System.out.println("Escribe el nuevo puesto del empleado: ");
            String puesto = sc.nextLine();

            Empleados empleados = new Empleados();
            empleados.getId();
            empleados.setNombre(nombre);
            empleados.setPuesto(puesto);
            EmpleadosDAO.actualizarempleadosDB(empleados);
        }
    }



