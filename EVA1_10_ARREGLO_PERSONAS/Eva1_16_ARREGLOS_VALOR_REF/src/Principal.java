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
        // Crear un arreglo
        int arreglo [] = new int[10]; 
        System.out.println("Original: " + arreglo);
        llenarArreglo(arreglo);
        madrearArreglo(arreglo);
        System.out.println(arreglo);
        imprimirArreglo(arreglo);
    }
   public static void llenarArreglo(int[] arre){ //METODO PARA LLENAR EL ARREGLO
       for (int i = 0; i < arre.length; i++) {
           arre[i] = (int)(Math.random() * 100);
       }
       System.out.println("Copia: " + arre);
       }
   public static void madrearArreglo(int[] arre){
       arre = new int[1000];
       System.out.println(arre);
   }
   public static void imprimirArreglo(int[] arre){ //METODO PARA IMPRIMIR ARREGLO
       for (int i = 0; i < arre.length; i++) {
           System.out.print("[" + arre[i] + "]");
   }
         System.out.println("");
   }
}
