/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_1_examen_diagnostico;

/**
 *
 * Elena Guadalupe Diaz Lopez #18550623
 */
public class EVA1_1_EXAMEN_DIAGNOSTICO{//En el cuerpo de la clase solo es para declarar.
                                       //Scope----Limita o fija el alcance de algo con las  {}.
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Todo programa empieza del main.
        //generaClave();------ Es static y por lo tanto se puede utilizar.
        //Un metodo no static no se puede utilizar en una classe static.
        System.out.println(generaClave());
        
    }
 //Modificador de acceso//USUALMENTE STATIC VALOR DE RETORNO//NOMBRE DEL METODO.
    public static String generaClave(){
           int iVal;
           iVal = (int)(Math.random() * 10000);
           String resu = "";
           if(iVal < 10){ 
            //NECESITA 3 CEROS   
             resu = "000" + iVal;
           }else if(iVal<100){
               //NECESITA 2 CEROS
               resu = "00" + iVal;
           }else if(iVal < 1000){
               //NECESITA 1 CERO
               resu = "0" + iVal;
           }else {
               //CUATRO DIGITOS NO NECESITA 0´s.
               resu = "" + iVal;
           }
 
           return resu;
           
           
    }
    
}
 