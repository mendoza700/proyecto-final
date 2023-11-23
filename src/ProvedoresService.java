import java.util.Scanner;

public class ProvedoresService {

        public static void crearProvedores() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe el nombre del proverdores: ");
            String nombre = sc.nextLine();

            System.out.println("Escribe el contacto del provedores: ");
            String contacto = sc.nextLine();

            Provedores provedores = new Provedores();
            provedores.setNombre(nombre);
            provedores.setContacto(contacto);
            ProvedoresDAO.crearProvedoresDB(provedores);
        }

        public static void listarProvedores() {
            ProvedoresDAO.leerProvedoresDB();
        }

        public static void borrarPROVEDORES() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe el ID del PROVEDOR que deseas borrar: ");
            int id = sc.nextInt();

            ProvedoresDAO.borrarProvedoresDB(id);
        }

        public static void editarProvedores() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe el ID del prtovedores que deseas editar: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Escribe el nuevo nombre del provedor: ");
            String nombre = sc.nextLine();

            System.out.println("Escribe el nuevo contacto del provedor: ");
            String contacto = sc.nextLine();

            Provedores provedores = new Provedores();
            provedores.getId();
            provedores.setNombre(nombre);
            provedores.setContacto(contacto);
            ProvedoresDAO.actualizarProvedoresDB(provedores);
        }
    }


