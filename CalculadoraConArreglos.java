package Practica4;
import java.util.Scanner;
public class CalculadoraConArreglos {
    public static void main(String[] args) {
        Scanner leerUsuario = new Scanner (System.in);
        int opcion;
                
        //Declarar arreglo
        double[]numeros={20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3}; 
        
        do{
        System.out.println("Aqui hay 7 numeros:");
        System.out.println("20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3");

        System.out.println("¿Que quieres hacer con ellos?");
        System.out.println("1) Sumarlos");
        System.out.println("2) Multiplicarlos");
        System.out.println("3) Salir");
        
            System.out.print("Escoje el numero de opcion: ");
        opcion = leerUsuario.nextInt();
        
       
        switch(opcion){
            case 1:
                double suma= 20.5+ 40.6+ 78.4+ 94.7+ 55.3+ 22.6+ 84.3;
                System.out.println("La suma es: "+suma);
                System.out.println("*******************************************");
                break;
            case 2:
                double multiplicacion= 20.5* 40.6*78.4* 94.7* 55.3* 22.6* 84.3;
                System.out.println("La multiplicacion es: "+multiplicacion);
                System.out.println("*******************************************");
                break;

            default:
                System.out.println("Bye");
                System.out.println("*******************************************");
                break;
           
        }
         }while(opcion !=3);    
         
}
    
        }

        
    
