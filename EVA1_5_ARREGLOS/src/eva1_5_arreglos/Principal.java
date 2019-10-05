/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_arreglos;

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
        int aiDatos[] = new int [10];
        System.out.println(aiDatos);
        //N-----> # DE ELEMENTOS EN UN ARREGLO, LISTA, PILA, ETC....
        //0-----> Primer lugar
        //N -1 -----> Ultimo elemento
        for (int i = 0; i < aiDatos.length; i++) {
            //CANTIDAD DEDATOS QUE ESTAN EN EL ARREGLO-----> length
            aiDatos[i] = (int)(Math.random() * 100) + 1; 
        }
        System.out.println("FOR NORMAL");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println(aiDatos[i]);
        }
        System.out.println("FOR EACH");
        //FOR-EACH
        for (int aiDato : aiDatos) {
            System.out.println(aiDato);
        }
        
    }
    
}
