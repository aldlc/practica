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
        Scanner sc = new Scanner(System.in);
        
        int num, numArray;
        boolean repetido;
        
        do{
            System.out.println("Anota la cantidad de números que quieres leer");
            numArray=sc.nextInt();
            if (numArray<1||numArray>10)
                System.out.println("Tiene que ser entre 1 y 10");
        }while (numArray<1||numArray>10);
        
        int numeros[] = new int[numArray];

        for (int i = 0; i < numeros.length; i++) {
            do {
                System.out.println("Anota un número");
                num=sc.nextInt();
                repetido=repetido(numeros,num);
                if (repetido==true)
                    System.out.println("Número repetido, anota otro");
            }while (repetido== true);
            numeros[i]=num;
        }

        burbuja(numeros);

        System.out.println("Los números ordenados de menor a mayor son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
      
        boolean tam=validarTam(numeros, numArray);
        
        if (tam)
            System.out.println("El tamaño del array es el correcto");
        else
            System.out.println("El tamaño del array es incorrecto");

      
      
        System.out.println("Introduce el número que quieres buscar en el array");
        int n=sc.nextInt();
        boolean numEncontrado = buscarNum(numeros, n);
        if (numEncontrado)
            System.out.println("El número "+n+" está en el array");
        else 
            System.out.println("El número "+n+" no está.");

      
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

    public static boolean repetido(int[] array, int valor) {
        boolean repetido = false;
        for (int i = 0; i < array.length && !repetido; i++) {
            if (array[i] == valor) {
                repetido = true;
            }
        }
        return repetido;
    }
    
  

    public static boolean validarTam (int num[], int numA) {
        if (num.length == numA) {
            return true;
        } else {
            return false;
        }
    }
        
      
    public static boolean buscarNum (int num[], int n) {
        for (int i=0;i<num.length;i++){
            if (n==num[i])
                return true; 
        }
        return false;
    }

}
