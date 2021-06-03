/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocalculos;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjercicioCalculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        double d;
        double t;
        double v;
        
        Scanner n = new Scanner(System.in);
        
        do{
            System.out.println("BIENVENIDO/A");
            System.out.println("Por favor escoger una de las siguientes opciones:");
            System.out.println("1 - VELOCIDAD (K/H)");
            System.out.println("2 - TIEMPO (HORAS)");
            System.out.println("3 - DISTANCIA (KILOMETROS)");
            System.out.println("4 - SALIR");

            op = n.nextInt();

            switch(op){

                case 1:
                    System.out.println("Ingresar Distancia y Tiempo");
                    d = n.nextDouble();
                    t = n.nextDouble();
                    v = d/t;
                    System.out.println("La velocidad es de: "+v+" Kilometros por hora.");
                    break;

                case 2:
                    System.out.println("Ingresar Distancia y Velocidad");
                    d = n.nextDouble();
                    v = n.nextDouble();
                    t = d/v;
                    System.out.println("El tiempo transcurrido es de: "+t+" horas.");
                    break;

                case 3:
                    System.out.println("Ingresar Velocidad y Tiempo");
                    v = n.nextDouble();
                    t = n.nextDouble();
                    d = v*t;
                    System.out.println("La distancia recorrida es de: "+d+" kilometros");
                    break;

                case 4:     
                    System.out.println("Salir");
                    exit(0);
                    break;

                default:
                    System.out.println("Opcion Inválida!");
                
            }
        }while(op != 4);
    }
}
     
