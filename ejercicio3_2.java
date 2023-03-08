package Taller1;

/*Realice un algoritmo que lea por teclado las 5 notas obtenidas por un estudiantes (comprendidas entre 0 y 5). 
  A continuación debe mostrar los siguiente:
a. Todas las notas
b. La nota promedio del curso
c. La nota más alta que ha sacado y 
d. La nota más baja que ha sacado*/

import java.util.Scanner;
public class ejercicio3_2 {
    static Scanner sc=new Scanner (System.in);
    
  public static void main(String[] args) {



//Declarar variables 
  String nombre;
  double promedio=0, NotaMasAlta=0, NotaMasBaja=5;
  double vector[]=new double[5];   

  //Nombre del estudiante   
  System.out.print("Ingresar nombre del estudiante: ");
  nombre=sc.nextLine();

  //Llenado del vector
  for(int i=0;i<vector.length;i++)
    {
        do{
        System.out.println("\nIngresar nota "+(i+1)+"[Entre 0-5]");
        vector[i]=sc.nextDouble(); 
        }while(vector[i]<0 || vector[i]>5);
    }
    System.out.println("\n");
   //Promedio
  for(int i=0;i<vector.length;i++)
    {
      promedio+=vector[i];
    }
    promedio=promedio/vector.length;
    //Nota mas alta
  for(int i=0;i<vector.length;i++)
    {
      if(vector[i]>NotaMasAlta)
        {
        NotaMasAlta=vector[i];
        }
    }
    //Nota mas baja
  for(int i=0;i<vector.length;i++)
    {
      if(vector[i]<NotaMasBaja)
        {
        NotaMasBaja=vector[i];
        }
    }
   //Imprimir Datos 
  
    System.out.println("Notas del estudiante: "+nombre);

   for(int i=0;i<vector.length;i++)
     {
      System.out.print("Nota"+(i+1)+"|"); 
     }
      System.out.println("");
   for(int i=0;i<vector.length;i++)
     {
      System.out.print( " "+vector[i]+" |");    
     }
      System.out.println("\n");
    System.out.println("Promedio actual: "+promedio);
    System.out.println("Nota más alta: "+NotaMasAlta);
    System.out.println("Nota más baja: "+NotaMasBaja);
  }
}

    
    

