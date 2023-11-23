
    import java.util.Scanner;

    public class ClientesService {

        public static void crearClientes() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe el nombre del cliente: ");
            String nombre = sc.nextLine();

            System.out.println("Escribe el contacto del cliente: ");
            String contacto = sc.nextLine();

            Clientes clientes = new Clientes();
            clientes.setNombre(nombre);
            clientes.setContacto(contacto);
            ClientesDAO.crearClientesDB(clientes);
        }

        public static void listarClientes() {
            ClientesDAO.leerClientesDB();
        }

        public static void borrarClientes() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe el ID del cliente que deseas borrar: ");
            int id = sc.nextInt();

            ClientesDAO.borrarClientesDB(id);
        }

        public static void editarClientes() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe el ID del cliente que deseas editar: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Escribe el nuevo nombre del cliente: ");
            String nombre = sc.nextLine();

            System.out.println("Escribe el nuevo contacto del cliente: ");
            String contacto = sc.nextLine();

            Clientes clientes = new Clientes();
            clientes.getId();
            clientes.setNombre(nombre);
            clientes.setContacto(contacto);
            ClientesDAO.actualizarClientesDB(clientes);
        }
    }

