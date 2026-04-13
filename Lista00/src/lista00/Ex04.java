/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista00;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o espaco do vetor X: ");
        int n = sc.nextInt();
        int[] X = new int [n];
        
        System.out.print("Digite o espaco do vetor Y: ");
        int m = sc.nextInt();
        int[] Y = new int [m];
        
        int[] Z = new int [n + m];
        
        for(int i = 0; i < n; i++){
            System.out.printf("Escreva o valor do espaco %d do vetor X", i);
            X[i] = sc.nextInt();
        }
        
        for(int i = 0; i < m; i++){
            System.out.printf("Escreva o valor do espaco %d do vetor Y", i);
            Y[i] = sc.nextInt();
        }
        
        int k = 0;
        for(int i = 0; i < n; i++){
            Z[i] = X[i];
            k++;
        } 
        
        for(int i = 0; i < m; i++){
            boolean existe = false;
            for(int j = 0; j < k; j++){
                if(Y[i] == Z[j]){
                    existe = true;
                    break;
                }
            }
            if(!existe){
                    Z[k] = Y[i];
                    k++;
                }
        }
        
        System.out.println("Vetor uniao: ");
        for(int i = 0; i < k; i++){
            System.out.print(Z[i] + " ");
        }
        
    }  
}
