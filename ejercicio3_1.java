/*SE CREAN 3 VECTORES DE 5 POSICIONES, DONDE SE PEDIRAN LOS DATOS PARA LAS 
 * PRIMERAS DOS MATRICES, CON ESTAS SE REALIZARA LA SUMA Y SE CREA EL TERCER VECTOR
*/
import java.util.Scanner;

public class ejercicio3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vector1=new int[5];
        int [] vector2=new int[5];
        int [] vector3=new int[5];
        System.out.println("Numeros para el vector 1.");
        for (int i = 0; i < 5; i++) {
            System.out.print("ingrese un numero: ");
            vector1[i]= sc.nextInt();
            System.out.println();
        }
        System.out.println("Numeros para el vector 2.");
        for (int i = 0; i < 5; i++) {
            System.out.print("ingrese un numero: ");
            vector2[i]= sc.nextInt();
            System.out.println();
        }
        System.out.println("El vector 3 tiene los siguientes numeros: ");
        for (int i = 0; i < 5; i++) {
            vector3[i]= vector1[i]+vector2[i];
            System.out.print(vector3[i]+" ");
        }
        
    }
}
