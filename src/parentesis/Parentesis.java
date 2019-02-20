/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parentesis;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author mariajose
 */
public class Parentesis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner pedir=new Scanner(System.in);
        System.out.println("Ingrese una cadena:");
        String cadena=pedir.nextLine();
        
        if(verificar(cadena)==true)
        {
         System.out.println("Esta Balanceada");   
        }
        else{
            System.out.println("No lo esta");
        }
    }
    
    public static boolean verificar(String sentence){
        Stack <String> pila = new Stack();
        boolean b = true;
        int Par=0;
        int Lla=0;
        int Cor=0;
          Stack <String> pilallave = new Stack();
        boolean bLL = true;
        Stack <String> pilacorchete = new Stack();
        boolean bC = true;

             
      for(int a=0;a<sentence.length();a++)
      {
        if(sentence.charAt(a)=='(')
        {
            pila.push(sentence);
            Par++;
        }
        else if(sentence.charAt(a)==')'){
            if (pila.isEmpty()){
                b = false;
                        }
            else{
                pila.removeElementAt(Par-1);
                }
      
        }
        else if(sentence.charAt(a)=='{' )
        {
               pilallave.push(sentence);
               Lla++;
        }
         else if(sentence.charAt(a)=='}'){
            if (pilallave.isEmpty()){
                bLL = false;
                        }
            else{
                pilallave.removeElementAt(Lla-1);
                }
      
        }
        else if(sentence.charAt(a)=='[' )
        {
               pilacorchete.push(sentence);
               Cor++;
        }
         else if(sentence.charAt(a)==']' ){
            if (pilacorchete.isEmpty()){
                bC = false;
                        }
            else{
                pilacorchete.removeElementAt(Cor-1);
                }  
        }
        
        
      }
      
      if(b ==true && pila.isEmpty() && bC ==true && pilacorchete.isEmpty() && bLL ==true && pilallave.isEmpty()){
      return true;
      }
      else{return false;}     
    }
    
}
