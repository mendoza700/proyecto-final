
    import java.util.Scanner;
    public class inicio {

        public static void main(String[] args) {
            Scanner Ro = new Scanner(System.in);
            int opcion = 0;
            do {
                System.out.println("----------------------");
                System.out.println("TIENDA Clientes ");
                System.out.println("1. Crear ClienteS");
                System.out.println("2. Listar ClienteS");
                System.out.println("3. Editar ClienteS");
                System.out.println("4. Eliminar ClienteS");
                System.out.println("5. Salir");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><");
                ;
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><>>>");
                System.out.println("tienda empleados");
                System.out.println("6. Crear Laptop");
                System.out.println("7. Listar laptops");
                System.out.println("8. Editar laptop");
                System.out.println("9. Eliminar Laptop");
                System.out.println("10. Salir");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>><>>>");
                System.out.println("tienda provedores");
                System.out.println("11. Crear tienda");
                System.out.println("12. Listar tienda");
                System.out.println("13. Editar tienda");
                System.out.println("14. Eliminar tienda");
                System.out.println("15. Salir");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                opcion = Ro.nextInt();
                switch (opcion) {
                    case 1:
                        ClientesService.crearClientes();
                        break;
                    case 2:
                        ClientesService.listarClientes();
                        break;
                    case 3:
                        ClientesService.editarClientes();
                        break;
                    case 4:
                        ClientesService.borrarClientes();
                        break;
                    case 5:
                        System.out.println("<<<<<Hasta luego>>>>>>>");
                        break;
                    case 6:
                        EmpleadosService.crearEmpleados();
                        break;
                    case 7:
                        EmpleadosService.listarempleados();
                        break;
                    case 8:
                        EmpleadosService.editarEmpleados();
                        break;
                    case 9:
                        EmpleadosService.borrarEMPLEADOS();
                        break;
                    case 10:
                        System.out.println("<<<<<<<<HASTA LUEGO>>>>>>>>>>>>");
                        break;
                    case 11:
                        ProvedoresService.crearProvedores();
                        break;
                    case 12:
                        ProvedoresService.listarProvedores();
                        break;
                    case 13:
                        ProvedoresService.editarProvedores();
                        break;
                    case 14:
                        ProvedoresService.borrarPROVEDORES();
                        break;
                    default:
                        System.out.println("<<<<<<<<<<<<<HASTA LUEGO>>>>>>>>>>>>>>");
                        break;
                }
            } while (opcion != 15);

        }
    }