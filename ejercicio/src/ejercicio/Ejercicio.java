/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;
import java.util.*;

/**
 *
 * @author TitoRichar
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int num;
        int numeros[] = new int [4];
        boolean comprobar;
        for(int i=0;i<numeros.length;i++){
            do{
            System.out.println("Dime un numero");
            num=sc.nextInt();
            comprobar=comnumero(num,numeros);
            }while(comprobar==false);
            numeros[i]=num;
        }
        Arrays.sort(numeros);
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
    }
    public static boolean comnumero (int num,int numeros[]){
        for(int i=1;i<numeros.length;i++){
            if(numeros[i]==num){
                return false;
            }        
        }
        return true;
    }
}
