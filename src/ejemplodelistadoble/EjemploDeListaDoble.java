
package ejemplodelistadoble;

import java.util.Scanner;

public class EjemploDeListaDoble {

    public static void main(String[] args) {
        Scanner sel = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        
        int opc = 0;
        ListaDoble Lista1 = new ListaDoble();
        
        do{
            System.out.println("\n");
            System.out.println("    Menu\n");
            System.out.println("1) Agregar Matricula Nueva");
            System.out.println("2) Buscar Matricula");
            System.out.println("3) Modificar Matricula");
            System.out.println("4) Eliminar Matricula");
            System.out.println("5) Mostrar todas las Matricula");  
            System.out.println("6) Salir\n");
            
            
            System.out.println("---> : ");
            opc = sel.nextInt();  
            
            
            switch (opc) {
                case 1: {
                    System.out.println("Agregar Matricula\n");
                    System.out.println("Digite la matricula : ");
                    int dato = teclado.nextInt();
                    Lista1.agregar(dato);
                }
                    break;
                case 2:
                    System.out.println("Buscar Matricula");
                    System.out.println("Matricula a buscar : ");
                    int dato2 = teclado.nextInt();
                    Lista1.buscar(dato2);
                    break;
                case 3: {
                    System.out.println("Modificar Matricula");
                    System.out.println("Ingrese la matricula : ");
                    int dato3 = teclado.nextInt();
                    Lista1.modificar(dato3);
                }
                    break;
                case 4: {
                    System.out.println("Eliminar Matricula ");
                    System.out.println("Matricula a eliminar : ");
                    int dato4 = teclado.nextInt();
                    Lista1.eliminar(dato4);

                }
                    break;
                case 5: {
                    System.out.println("Mostrar todas las matriculas : ");
                    Lista1.mostrar();
                }
                    break;
                case 6:{
                    System.exit(0);
                }
                default:
            }            
        }while(opc < 7);
        
        // Lista1.agregar(33);
        // Lista1.agregar(80);
        // Lista1.agregar(15);

        // Lista1.mostrar();        
        
    }
    
}
