
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Elena Guadalupe Diaz Lopez #18550623
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAR CLASE PERSONA Y UN ARREGLO
        //ALMACENE 10 PERSONAS
        Persona[] aPersonas = new Persona [10]; //Asigansmos un tamaño  a el arreglo
        Scanner sCaptu = new Scanner(System.in); //El sCaptu es para guardar el nombre que contenga.
        
        for (int i = 0; i <aPersonas.length; i++) {
            aPersonas[i]= new Persona();
            System.out.println("*****************************************");
            System.out.println("Introduce tu nombre: ");
            aPersonas[i].nombre = sCaptu.nextLine(); //El .nextLine ------> es para que el usuario inserte el nombre.
        }
        imprimeArreglo(aPersonas); //Creo el metodo 
        //Hacer un copia del arreglo
        Persona[] aCopias = new Persona[aPersonas.length];
        System.out.println("**********************************************");
        System.out.println("SE HACE LA COPIA OBJETOS");
         for (int i = 0; i < aPersonas.length; i++) {
            aCopias[i] = new Persona();
            aCopias[i].nombre = aPersonas[i].nombre;
        }
    }
    
    public static void imprimeArreglo(Persona[] args){
        System.out.println("*****************************************");
        System.out.println("IMPRESION DE LOS NOMBRES");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Nombre: " + args[i].nombre);
        }
    }
    
}
class Persona { //Cree la clase Persona
  String nombre;
}
