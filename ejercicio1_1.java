/*SEGUN LA VELOCIDAD PROMEDIO INGRESADA POR EL USUARIO, SE EVALUA LA VELOCIDAD
 * Y SE IMPRIME UN MENSAJE SEGUN EL CASO.
*/



//se importa la clase de Scanner de Java
import java.util.Scanner;


public class ejercicio1_1 {
     public static void main(String[] args) {
    //se declaran las variables necesarias
        int velocidad =0;
    // se crea el objeto para ingresar con el scanner
        Scanner sc =new Scanner(System.in);
    //se pide la informacion para proceder con los calculos
        System.out.println("INGRESE SU VELOCIDAD PROMEDIO: ");
        velocidad = sc.nextInt();
    //se hace un condicional anidado para los diferentes casos e imprimir según el resultado
        if(velocidad>0&&velocidad<=20) {
            System.out.println("Eres muy lento para manejar, esta es la velocidad solo de la zona escolar.");
          
        } else if(velocidad>20&&velocidad<=40) {
            System.out.println("Eres buen cuidadano, la velocidad de tu trayecto te permite tomar decisiones.");
          
        }else if(velocidad>40&&velocidad<=60) {
            System.out.println("Eres un buen conductor, la velocidad que manejas es correcta para los transitos en ciudad.");
          
        } else if(velocidad>60&&velocidad<=80) {
            System.out.println(" Eres un conductor acelerado, recuerda que los limites de velocidad ayudan a tomar decisiones ante cualquier novedad.");
          
        } else if(velocidad>8&&velocidad<=100) {
            System.out.println("Eres una bestia, ese modo de manejar te puede causar daños irreversibles.");
          
        }  else {
            System.out.println("Eres un irresponsable, ese modo de velocidad es riesgoso para cualquier persona.");
        }
    }
}
