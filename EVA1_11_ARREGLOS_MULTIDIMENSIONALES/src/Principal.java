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
        // TODO code application logic here
        //ARREGLOS DE 2 DIMENSIONES-------> LLAMADO MATRIZ
        int aDatos[][] = new int [3][4];
        System.out.println("Dirreccion del arreglo: " + aDatos);
        System.out.println("Tamaño del arreglo: " + aDatos.length);
        //VER DIRECCION Y TAMAÑO POR POSICIONES
        System.out.println("Dirreccion del arreglo[0]: " + aDatos[0]);
        System.out.println("Tamaño del arreglo [0]: " + aDatos[0].length);
        //COMO COORDENADAS PARA VER LO QUE TIENE EL ARREGLO CON ESAS COORDENADAS.
        System.out.println("Valor del arreglo con posicion[0][0]: " + aDatos[0][0]);
        
    }
    
}
