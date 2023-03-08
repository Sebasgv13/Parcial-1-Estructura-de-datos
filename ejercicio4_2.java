
package Taller1;

import java.util.Scanner;

/*Elaborar un algoritmo que lea una matriz de NF filas y NC columnas y 
calcule la suma de las filas y de las columnas, dejando los resultados en 
dos vectores, hacer un algoritmo que calcule: 
• Total de la suma de las filas 
• Total de la suma de las columnas 
• Total de todos los números almacenados en la matriz 
• Imprima los dos vectores*/
public class ejercicio4_2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Ingresar la cantidad de filas (lineas horizontales)");
        int m=sc.nextInt();
        
        System.out.println("Ingresar la cantidad de columnas (lineas verticales");
        int n=sc.nextInt();
        //m siempre estara acompañada de las filas para que en matrices no cuadradas, no haya un error, asi mismo n estara acompañada de las columnas  
        double [] vectorfilas = new double[m];
        double [] vectorcolumnas = new double[n];
        double[][] matriz = new double[m][n];
        
        //Llenar la matriz
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingresar valor de la posicion ("+(i+1)+","+(j+1)+")");
                matriz[i][j]=sc.nextDouble();
            }
        }
        //Suma de columnas;  organizacion para sumar, fijar una variable en este caso las filas para irnos moviendo con los valores de cada columna, por ultimo se cambia la variable fijada por la sigueinte hasta llegar a su limite
            for (int j = 0; j < n; j++) {
                for ( int i = 0; i < m; i++) {
                    vectorcolumnas[j]+=matriz[i][j];
                }
            }
        //Suma de filas; organizacion para sumar, fijar una variable en este caso las columnas para irnos moviendo con los valores de cada fila, por ultimo se cambia la variable fijada por la sigueinte hasta llegar a su limite
        for ( int i = 0; i < m; i++) {
                for ( int j = 0; j < n; j++) {
                    vectorfilas[i]+=matriz[i][j];
                }
            }
        //Imprimir Matriz
         for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println("  ");
        }
         
         //Imprimir vector filas
         System.out.println("Vector de Filas");
         for (int i = 0; i < m; i++) {
             System.out.print(vectorfilas[i]+"|");
        }
         //Imprimir vector de columnas
         System.out.println("\nVector de columnas");
         for (int i = 0; i < n; i++) {
             System.out.print(vectorcolumnas[i]+"|");
        }
         System.out.println("\n");
    }
}
