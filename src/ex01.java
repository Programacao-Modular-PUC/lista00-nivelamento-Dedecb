/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package liasta00ex1;
import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont, result = 1;

        System.out.printf("Escreva o numero que deseja calcular o fatorial x!: ");
        cont = sc.nextInt();
        for(int y = 1; y <= cont; y++){
            result = result * y;
        }
        System.out.printf("O resultado do fatorial %d! eh = %d", cont, result);

        sc.close();
    }

}