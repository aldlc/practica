/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornosgit;
import java.util.*;
/**
 *
 * @author Alix
 */
public class Entornosgit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int numeros[]=new int [5];
        
        for (int i=0;i<numeros.length;i++){
            System.out.println("Anota un número");
            numeros[i]=sc.nextInt();
        }
        
        burbuja(numeros);
        
        System.out.println("Los números ordenados de menor a mayor son:");
        for (int i=0;i<numeros.length;i++) {
            System.out.println(numeros[i]);
        }        
    }
    
      
    public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
}    
}
