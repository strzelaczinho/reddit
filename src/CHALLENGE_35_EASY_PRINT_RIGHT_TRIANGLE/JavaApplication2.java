/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_35_EASY_PRINT_RIGHT_TRIANGLE;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class JavaApplication2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();        
        countDown(num);
        scan.close();
    }

    static void countDown(int num) {
        for(int height = num; height > 0; height--){
            for(int index = height; index > 0; index--) {
                System.out.print(index);
            }
            System.out.println();
        }
    }
}