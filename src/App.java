import java.util.Scanner;

import net.salesianoslacuesta.biologo.Biologo;
import net.salesianoslacuesta.matematico.Matematico;
import net.salesianoslacuesta.quimico.Quimico;
import net.salesianoslacuesta.trabajoDual.TrabajoDual;
import net.salesianoslacuesta.investigador.Investigador;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    Biologo bio = new Biologo("Juan", 1400);
    Quimico qui = new Quimico("Pablo", 1300);
    Matematico mat = new Matematico("Pedro", 1700);

    int opcionPrincipal = -1;

    while (opcionPrincipal != 0) {
        System.out.println("Selecciona un investigador");
        System.out.println("1. Biolgo.");
        System.out.println("2. Químico.");
        System.out.println("3. Matemático.");
        System.out.println("0. Salir.");
        System.out.println("Escoge una opción: ");

        opcionPrincipal = scanner.nextInt();
            
        
        if (opcionPrincipal == 1) {

            int opcion = -1;

            while (opcion != 0) {
                System.out.println("MENU BIOLOGO");
                System.out.println("1. Añadir especimen");
                System.out.println("2. Mostrar especimenes");
                System.out.println("3. Trabajar");
                System.out.println("4. Trabajo dual");
                System.out.println("5. Estado de sueldo");
                System.out.println("0. Volver");
                System.out.println("Opción");

                opcion = scanner.nextInt();
                scanner.nextLine();


                    switch (opcion) {
                        case 1:
                            System.out.print("Introduce espécimen: ");
                            bio.anadirEspecimen(sc.nextLine());
                            break;
                        
                        case 2: 
                            bio.mostrarEspecimenes();
                            break;
                        case 3: 
                            bio.trabajar();
                            break;
                        case 4: 
                            bio.trabajoDual();
                            break;
                        case 5: 
                            System.out.println(bio.estadoSueldo());
                            break;
                        case 0:
                             System.out.println("Volviendo...");
                             break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
            }
            
        }
    }

    else if (opcionPrincipal == 2) {

                int opcion = -1;

                while (opcion != 0) {

                    System.out.println("MENÚ QUÍMICO");
                    System.out.println("1) Añadir elemento");
                    System.out.println("2) Mostrar elementos");
                    System.out.println("3) Trabajar");
                    System.out.println("4) Trabajo Dual");
                    System.out.println("5) Estado del sueldo");
                    System.out.println("0) Volver");
                    System.out.print("Opción: ");

                    opcion = sc.nextInt();
                    sc.nextLine();

                    switch (opcion) {
                        case 1: 
                            System.out.print("Introduce elemento: ");
                            qui.anadirElemento(sc.nextLine());
                            break;
                        case 2: 
                            
                            qui.mostrarElementos();
                            break;
                        case 3: 
                            qui.trabajar();
                            break;
                        case 4: 
                            qui.trabajoDual();
                            break;

                        case 5: 
                            System.out.println(qui.estadoSueldo());
                            break;
                        case 0: 
                            System.out.println("Volviendo...");
                            break;
                        default: 
                            System.out.println("Opción inválida.");
                            break;
                    }
                }
            }

           
            else if (opcionPrincipal == 3) {

                int opcion = -1;

                while (opcion != 0) {

                    System.out.println(" MENÚ MATEMÁTICO");
                    System.out.println("1) Rellenar matriz");
                    System.out.println("2) Mostrar matriz");
                    System.out.println("3) Trabajar");
                    System.out.println("4) Estado del sueldo");
                    System.out.println("0) Volver");
                    System.out.print("Opción: ");

                    opcion = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcion) {
                        case 1:
                             mat.rellenarMatriz();
                             break;
                        case 2:
                             mat.mostrarMatriz();
                             break;
                        case 3: 
                            mat.trabajar();
                            break;

                        case 4: 
                            System.out.println(mat.estadoSueldo());
                            break;
                        case 0: 
                            System.out.println("Volviendo...");
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }
                }
            }

            else if (opcionPrincipal == 0) {
                System.out.println("Saliendo del programa...");
            }

            else {
                System.out.println("Opción inválida.");
            }
        }

        scanner.close();
    }
}
