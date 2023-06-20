/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hash;

import java.util.Scanner;

/**
 *
 * @author Ignacio Gaynor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer=new Scanner (System.in); 
        int id, i;
        int primo ;
        int op;
        
        
        System.out.println("ingrese un numero primo");
         primo=Leer.nextInt();
        Tabla tablaHash=new Tabla(primo);
        

                  
         do{
             System.out.println("1:Metodo de Arimetrica Modular");
             System.out.println("2:Metodo de Plegamiento");
             System.out.println("3:Metodo de Multiplicacion");
             System.out.println("0:Salir");
             op=Leer.nextInt();
             switch(op){
                 case 1:
                    System.out.println("ingrese la id");
                    id=Leer.nextInt();
                    tablaHash.insertModular(id);
                    System.out.println("Su numero se guardo en la posicion N:" +tablaHash.aModular(id));
                     break;
                 case 2:
                   System.out.println("ingrese la id");
                   id=Leer.nextInt();
                   tablaHash.insertPlegamiento(id);
                   System.out.println("Su numero se guardo en la posicion N:" +tablaHash.aPlegamiento(id));
                    break;
                 case 3:
                   System.out.println("ingrese la id");
                   id=Leer.nextInt();
                   tablaHash.insertMultiplicacion(id);
                   System.out.println("Su numero se guardo en la posicion N:" +tablaHash.aMultiplicacion(id));
                   break;
             }
         }while(op!=0);
         
         
         
         
         
         
         
         
         
    }
    }
    

