/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_arreglos;

/**
 *
 * Elena Guadalupe Diaz Lopez #18550623
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DECLARACION DE ARREGLOS
        int aiDatos [], a, b;
        int[] aiDatos2, x, y;
        //
        int aiCopia[];
        //INICIALIZACION DEL ARREGLO
        aiDatos = new int [100];
        //System.out.println(aiDatos);
        
       //LLENAR CON VALORES ALEATORIOS
       for (int i = 0; i < aiDatos.length; i++) {
            //CANTIDAD DEDATOS QUE ESTAN EN EL ARREGLO-----> length
            aiDatos[i] = (int)(Math.random() * 100) + 1; 
            //System.out.println(aiDatos[i]);
        }
       //LOS ARREGLOS SON OBJETOS
       //LA MEMORIA DE LOS ARREGLOS ES CONSECUTIVA
       //SON DE ACCESO ALETAORIO 
       //SON MUY RAPIDOS 
       //SON INMUTABLES
       
    }
    
}
