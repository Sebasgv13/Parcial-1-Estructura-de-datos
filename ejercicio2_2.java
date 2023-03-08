package Taller1;

/*Queremos guardar la temperatura mínima y máxima de 5 días consecutivos.
Realice un algoritmo que muestre la siguiente información: 
a. La temperatura promedio de cada día
b. El días con menos temperatura
Debe lee una temperatura por teclado y se mostrar los días cuya temperatura 
máxima coincide con ella. Si no existe ningún día se muestra un mensaje de 
información negativa para el dato.*/

import java.util.Scanner;

public class ejercicio2_2 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main (String[]args){
    //Crear dos vectores para guardas las temperaturas de cada dia 
     double TemMax[]=new double[5];   
     double TemMin[]=new double[5];
     double promedio=0, menortem=1000;
     int i = 0, dia=0; String linea="__________________________________________________";
     //Llenar los vectores en los cuales se ingresaran las temperaturas deseadas
     for(i=0; i<5;i++){
         System.out.print("Ingresar datos del dia"+ (i+1)+"\nTemperatura maxima: ");
         TemMax[i]=sc.nextDouble();
         System.out.print("Temperatura minima: ");
         TemMin[i]=sc.nextDouble();
         System.out.println(linea);
        
         //Verificacion de que las temperaturas si sean maxima y minima respectivamente
         if (TemMax[i]<TemMin[i]){
         double tp=0; //Variable temporal para hacer el cambio de posicion
         tp=TemMax[i];
         TemMax[i]=TemMin[i];
         TemMin[i]= tp;
          }
     }
         //Calculo del promedio por dia
         for ( i = 0; i <5; i++) {
             promedio = (TemMax[i]+TemMin[i])/2;
             System.out.println("La temperatura promedio del dia"+(i+1)+" es de: "+promedio+"°");
         }
         //Dia con menor temperatura, se hara una busquedad con la variable auxiliar "menortem" que guarde y modifique la temperatura menor en la base de datos
         for (i = 0;  i< 5; i++) {
             if(TemMin[i]<menortem){
             menortem= TemMin[i];
             dia=i;
             }
           }
            System.out.println(linea); 
            System.out.println("LA temperatura menor en la base de datos se dio en el dia"+(dia+1));
            
         //Busquedad de temperatura
        int cont=0; boolean bandera=false; double TemB=0;
        System.out.println(linea);
        System.out.print("Ingresar temperatura a buscar: ");
        TemB=sc.nextDouble();
        for ( i = 0; i <5; i++) {
             if (TemMax[i]==TemB){
              bandera = true; cont+=1;
              System.out.println("Se encontro la temperatura buscada en el dia"+(i+1));
             }
            }
            //Se busca la manera de decir cuantas veces se encontro la temperatura buscada, por si hya varios dias que hayan sido registrada igual 
             if (cont>0&&cont<=1){
                 System.out.println("La temperatura ingresada coincide "+cont+" vez en la base de datos");}
             else if(cont>1){
                 System.out.println("La temperatura ingresada coincide "+cont+" veces en la base de datos");}
                 
             if(bandera == false){
                 System.out.println("No se encontro la temperatura ingresada");}
        System.out.println(linea);
        
//Imprimir matriz para confirmar que esta pasand: Este proceso es opcional, por si quieres tener un seguimiento de como se guardaron las temperaturas
        /*System.out.print("                    ");
        for (i = 0; i < 5; i++) {
            System.out.print("D"+(i+1)+"  |");
        }
        
        System.out.print("\nTemperatura Maxima: ");
        for (i = 0; i < 5; i++) {
            System.out.print(TemMax[i]+"|");
        }
        System.out.print("\nTemperatura Minima: ");
        for (i = 0; i < 5; i++) {
            System.out.print(TemMin[i]+"|");
        }*/
        System.out.println(" ");
     }
  } 

