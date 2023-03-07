/*UNA MTRIZ 20*20 DONDE LOS LATERALES DERECHO E IZQUIERDO, CON LOS LATERALES
 * IZQUIERDO Y DERECHO LLENARLOS DE 1, Y EL CENTROI DE 0.
*/
public class ejercicio4_1 {
    public static void main(String[] args) {
        //se crea la matriz que se necesita, en este caso 20*20
        int [][] matriz=new int[20][20];
        /*se hace un for con i j para recorrer la matriz y llenarla
        se crean las variables i j dentro de los for
        */
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //se hace un condicional donde los bordes se llenan de 1 y el resto 0
                if (i==0||i==19||j==0||j==19) {
                    matriz[i][j]=1;
                }
            }
        }
        //se imprime la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
                    
                }
                System.out.println();
            }
        }
    }

