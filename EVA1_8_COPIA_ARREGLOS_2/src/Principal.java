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
        int aiDatos[] = new int [10];
        int aiCopia[] = new int [10];
        
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos [i] = (int)(Math.random()*100) + 1;
        }
       //aiCopia = aiDatos;// AQUI COPIAMOS LAS DIRRECCIONES
       //ELEMENTO POR ELEMENTO
        for (int i = 0; i < aiDatos.length; i++) {
            aiCopia [i] = aiDatos[i];
        }
      imprimirArreglo(aiDatos);
      imprimirArreglo(aiCopia);
        
      //COMPROBAMOS AQUI QUE SEA ARCHIVOS INDEPENDIENETES CON DISTINTAS DIRRECCIONES
      //IRPIMIMOS LAS DIRECCIONES
        System.out.println(aiDatos);
        System.out.println(aiCopia);
     
    }
    public static void imprimirArreglo(int[] args){
        System.out.println("");
         for (int i = 0; i < args.length; i++) {
             System.out.println("[" + args[i] + "]");
        }
         System.out.println("");
    }
}