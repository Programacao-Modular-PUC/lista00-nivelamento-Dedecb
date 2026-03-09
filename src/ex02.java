/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        int maior, menor;
        int[] valores = new int[3];

        System.out.print("Escreva valores para x, y e z:\n ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        maior = x;
        menor = x;

        if (y > maior) {
            maior = y;
        }
        if (y < menor) {
            menor = y;
        }

        if (z > maior) {
            maior = z;
        }
        if (z < menor) {
            menor = z;
        }

        if ((x > y && x < z) || (x > z && x < y)) {
            System.out.println("X esta entre ente y e z;");
        } else {
            System.out.println("X nao esta entre y e z; ");
        }

        if (x % y == 0) {
            System.out.println("X eh divisivel por y");
        } else {
            System.out.println("X nao eh divisivel por y");
        }

        if (x % z == 0) {
            System.out.println("X eh divisivel por Z");
        } else {
            System.out.println("X nao eh divisivel por Z");
        }
    }

}
