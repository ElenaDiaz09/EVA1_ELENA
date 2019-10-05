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
        // Manejo de argumentos----->Paso por valor
        int num = 10;
        System.out.println("valor  = " + num);
        incrementa (num);
        System.out.println("valor  =" + num);
        //***************
        Prueba obj = new Prueba();
        obj.val = 10;
        System.out.println("valor  =" + obj.val);
        incrementa (num);
        System.out.println("valor  =" + obj.val);
        
    }
    public static void incrementa(int valor){
        valor++;
    }
    public static void incrementaObj(Prueba obj){
        obj.val++;
    }
}
class Prueba{
    int val;
}
