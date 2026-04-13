/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista00;

import java.util.Scanner;


public class Ex03 {
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Digite a quantidade de alunos: ");
            
        int n = sc.nextInt();
    
        int[] P = new int[n];
        int[] M = new int[n];
        
        System.out.print("Digite as matriculas dos alunos de Programacao: ");
        for(int i = 0; i < n; i++){
            P[i] = sc.nextInt();
        }
        System.out.print("Digite as matriculas dos alunos de Modelagem: ");
        for(int i = 0; i < n; i++){
            M[i] = sc.nextInt();
        }
    
        System.out.print("Alunos matriculados nas duas disciplinas: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(P[i] == M[j]){
                    System.out.println(P[i]);
                    break;
                }
            }
        }
    
        sc.close();
    }
}