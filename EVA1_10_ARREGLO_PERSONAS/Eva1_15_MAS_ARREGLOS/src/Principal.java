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
        int iNume = 10;
        System.out.println("Valor sin incrementar: " + iNume);
        incrementa(iNume);
        System.out.println("Valor con incremento: " + iNume);
        //******
        Prueba obj = new Prueba();
        obj.iVal =10;
        System.out.println("Valor PRUEBA sin incrementar: " + obj.iVal);
        incrementaObj(obj);
        System.out.println("Valor PRUEBAcon incremento: " + obj.iVal);
    }
    public static void incrementa(int iVal){
     iVal++;
        System.out.println("Incremento: " + iVal);
    }
    public static void incrementaObj(Prueba obj){//incrementar la prueba
      obj.iVal++;
        
    }
}
class Prueba{
   int iVal;
}