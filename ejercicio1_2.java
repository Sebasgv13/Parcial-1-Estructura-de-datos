package Taller1;

/*Realice un algoritmo que permita realizar el registro de vacunación de una 
EPS en un día, y al final le muestre un mensaje a los administradores las 
siguientes estadisticas:

a. Cantidad de vacunados en un día 
b. Cantidad de niños vacunados menores de 17 años
c. Cantidad de adultos vacunados mujeres
d. Cantidad de adultos vacunados hombres
e. Cantidad de adultos mayores de 60 años se vacunaron 
f.  Vacuna más aplicada 
g. Vacuna que nunca se aplico */
import javax.swing.JOptionPane;
        
public class ejercicio1_2 {
    public static void main(String[] args) {
    //Declaracion de variables
        String Nombre="", Genero="", vacuna_mas="";
        int edad=0, contador_vacuna=0,  vacuna=0, op=0, contador_M=0, contador_P=0, contador_S=0, contador_V=0, contador_Niños=0, contador_AdultosM=0, contador_AdultoH=0, contador_AdultoMayor=0;
        boolean exit=true, exit1=true;
    
    //Inicio del Menu, se puede ingresar una gran cantidad de personas indefinidas. Y asi, salir cuando se desee.PD: En este codigo la varible del nombre no varia en nada entonces puede ser comentada.
    do{
        int menu=Integer.parseInt(JOptionPane.showInputDialog(null, "\nElija una de las siguientes opciones:\n\n1. Registar datos de persona a vacunar.\n2. Ver estadisticas de jornada de Vacunacion.\n3. Salir del sistema\n ","❃❃❃SISTEMA DE VACUNACIÓN❃❃❃",JOptionPane.QUESTION_MESSAGE));
            
            
                switch(menu){
                    case 1://Ingresar para tomar datos de las personas quienes se van a vacunar
                     Nombre= JOptionPane.showInputDialog(null, "Ingresar nombre completo: ","❃❃❃Ingresando datos...❃❃❃",JOptionPane.QUESTION_MESSAGE);
                     op= Integer.parseInt(JOptionPane.showInputDialog(null, "1. Mujer\n2. Hombre.\nIngresar genero: ","❃❃❃Ingresando datos...❃❃❃",JOptionPane.QUESTION_MESSAGE));
                     switch(op){
                         case 1: Genero= "Mujer"; break;
                         case 2: Genero= "Hombre";break;
                     }
                     edad= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar edad: ","❃❃❃Ingresando datos...❃❃❃",JOptionPane.QUESTION_MESSAGE));
                     while (exit1==true){ //Sirve para registrar la vacuna aplicada
                     vacuna= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar Vacunar a aplicar:\n 1: Moderna \n 2: Pfizer\n 3: Sinovac\n 4: Vacine","❃❃❃Ingresando datos...❃❃❃",JOptionPane.QUESTION_MESSAGE));
                        switch(vacuna){
                                case 1: contador_M=+1; exit1=false; break;
                                case 2: contador_P=+1; exit1=false; break;
                                case 3: contador_S=+1; exit1=false; break;
                                case 4: contador_V=+1; exit1=false; break;
                                default: JOptionPane.showMessageDialog(null,"Ingresar una opcion valido","ERROR",JOptionPane.ERROR_MESSAGE);
                            }            
                        }
                     exit1=true;
                     contador_vacuna+=1;
                     
                     //Operaciones edad y genero
                     if (edad<17)
                      {contador_Niños+=1;}
                     
                         else if (edad>=17 && edad<=60){
                             if (Genero == "Mujer")
                             contador_AdultosM+=1;
                             else 
                             contador_AdultoH+=1;
                         }
                            else 
                             {contador_AdultoMayor+=1;}
                    
                     //Operacion de vacuna más aplicada
                     if (contador_M>contador_P && contador_M>contador_S && contador_M>contador_V ){//Si Moderna es mayor
                      vacuna_mas= "La vacuna Moderna es la vacuna mas aplicada el dia de hoy.";
                     }
                        else if(contador_P>contador_S && contador_P>contador_V){
                            vacuna_mas= "La vacuna Pfizer es la vacuna mas aplicada el dia de hoy.";  
                        }
                                    else if(contador_S>contador_V){
                                    vacuna_mas= "La vacuna Sinovac es la vacuna mas aplicada el dia de hoy.";  
                                    }
                                        else if (contador_V>contador_S){
                                        vacuna_mas= "La vacuna Vacine es la vacuna mas aplicada el dia de hoy. ";  
                                        } 
                                        else{
                                        vacuna_mas= "Hay varias dosis que fueron las mas aplicadas ";}
                                    JOptionPane.showMessageDialog(null,"Registro finalizado","REGISTRADO",JOptionPane.INFORMATION_MESSAGE);
                                    
                     break;
                     
                    case 2://Imprimir los datos 
                        boolean bandera=false;
                        JOptionPane.showMessageDialog(null,"El dia de hoy:\n\nSe aplicaron "+contador_vacuna+" dosis.\nDonde:\nFueron "+contador_Niños+" niños vacunados\nFueron "
                                +contador_AdultosM+" mujeres adultas vacunados\nFueron "+contador_AdultoH+" hombres adultos vacunados\nFueron "+contador_AdultoMayor+" adultos mayores vacunados\n"
                                +vacuna_mas,"ESTADISTICAS",JOptionPane.INFORMATION_MESSAGE);
                        
                        JOptionPane.showMessageDialog(null, "VACUNAS NO APLICADAS\n Se mostraran por medio de la consola"," ",JOptionPane.WARNING_MESSAGE);
                         //Operacion vacuna no aplicada
                        System.out.println("Informe de dosis no aplicadas");
                        if (contador_M==0){
                            System.out.println("No se aplicaron vacunas Modernas el dia de hoy"); bandera=true;
                        }
                        if (contador_P==0){
                            System.out.println("No se aplicaron vacunas Pfizer el dia de hoy");bandera=true;
                        }
                        if (contador_S==0){
                                System.out.println("No se aplicaron vacunas Sinovac el dia de hoy");bandera=true;
                            }
                        if (contador_V==0){
                            System.out.println("No se aplicaron vacunas Vacine el dia de hoy");bandera=true;
                        }
                            else if (bandera==false){
                            System.out.println("Todas las dosis fueron aplicadas");}
                        break;
                    
                    case 3: //salida del sistema
                        exit=false;break;
                    default: JOptionPane.showMessageDialog(null,"Ingresar una opcion valido","ERROR",JOptionPane.ERROR_MESSAGE);//Opcion no valida
                        
                }
                
            }while(exit==true);
    
    
    
    }
    
} 
