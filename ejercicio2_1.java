/*SE CREAN DOS VECTORES DE N POSICIONES(EN MI CASO LE PUSE UN NUMERO GRANDE 10000)
 * EN ELLOS SE LES PIDE INGRESAR SI SON HOMBRES O MUJERES, SE LES PIDE EL NOMBRE Y LA EDAD
 * Y SE IMPRIMEN UNOS RESUMENES DE LOS DATOS INGRESADOS
*/

//se importa la clase Scanner de Java
import java.util.Scanner;

public class ejercicio2_1 {
    
    
    public static void main(String[] args) {
        //se crean los vectores y las variables necesarias
        String[] nombreH= new String[10000];
        String[] nombreM= new String[10000];
        int[] edadH= new int[10000];
        int[] edadM= new int[10000];
       int i=0,j=0,h=0,m=0, opcion=0,promedio, mayor, menor, n=0;
       //se crea el objeto para ingresar con el scanner
       Scanner sc =new Scanner(System.in);
       //se crea el ciclo para hacer las preguntas
        do {
            //se muestran las opciones
            System.out.println("Ingrese una opcion: ");
            System.out.println("1 si es hombre:  ");
            System.out.println("2 si es mujer:  ");
            System.out.println("0 para mostrar resultados y salir:  ");
            System.out.print("----> ");
            //se lee el dato
            opcion =sc.nextInt();
            //se hace un switche para ir a la opcion escogida
            switch (opcion) {
                case 1:
                //se ingresan los datos de nombre y edad
                    System.out.println("Ingrese su Nombre");
                    nombreH[i]= sc.next();
                    System.out.println("Ingrese su Edad");
                    edadH[i]= sc.nextInt();
                    //se incrementa i como indice y h como contador de hombres registrados
                    ++i;
                    ++h;
                    break;
                case 2:
                //se ingresan los datos de nombre y edad
                System.out.println("Ingrese su Nombre");
                nombreM[j]= sc.next();
                System.out.println("Ingrese su Edad");
                edadM[j]= sc.nextInt();
                //se incrementa j como indice y m como contador de mujeres registradas
                ++j;
                ++m;
                    break;
                case 0:
                //se imprime el contador h y m de las personas registradas
                System.out.println("La cantidad de hombres que se registraron fue de: "+h);
                System.out.println("La cantidad de mujeres que se registraron fue de: "+m);
                promedio=0;
                //se calcula el promedio de edad en ambos generos
                for ( i = 0; i < h; i++) {

                    promedio+=edadH[i];
                }
                /*para imprimir se divide el promedio que es la suma de todas las edades contra la
                 cantidad de personas registradas
                */
                System.out.println("El promedio de edad de los hombres fue: "+(promedio/h));
                promedio=0;
                for ( j = 0; j < m; j++) {
                    promedio+=edadM[j];
                }
                System.out.println("El promedio de edad de las mujeres fue: "+(promedio/m));
                /*para hallar el menor y mayor se crea una variable y se le asigna el primer espacio del vector,
                con un for para recorrer el vector y un if para hacer la comparacion, no se pone else ya que no se 
                requiere para hacer algo.
                se utiliza la variable n para cuando halle una edad menor a n se le asigna el indice para
                llamar al nombre de la persona.
                */
                menor=edadM[0];
                n=0;
                for (i=1; i<m;i++) {
                    if (menor>edadM[i]) {
                        menor=edadM[i];
                        n=i;
                    }
                }
                System.out.println(nombreM[n]+" Es la mujer mas joven con: "+menor+" años.");
                menor=edadH[0];
                n=0;
                for (i=1; i<h;i++) {
                    if (menor>edadH[i]) {
                        menor=edadH[i];
                        n=i;
                    }
                }
                System.out.println(nombreH[n]+" Es el hombre mas joven con: "+menor+" años.");

                mayor=edadM[0];
                n=0;
                for (i=1; i<m;i++) {
                    if (mayor<edadM[i]) {
                        mayor=edadM[i];
                        n=i;
                    }
                }
                System.out.println(nombreM[n]+" Es la mujer mas adulta con: "+mayor+" años.");
                mayor=edadH[0];
                n=0;
                for (i=1; i<h;i++) {
                    if (mayor<edadH[i]) {
                        mayor=edadH[i];
                        n=i;
                    }
                }
                System.out.println(nombreH[n]+" Es el hombre mas adulto con: "+mayor+" años.");
                //y termina el programa al salir.
                    System.out.println("Hasta luego.");
                    break;
                default:
                //cuando no ingrese una opcion permitida, 1, 2 o 0.
                    System.out.println("Opcion invalidad, ingrese de nuevo.");
                    break;
            }
        } while (opcion!=0);
    }
  
}
