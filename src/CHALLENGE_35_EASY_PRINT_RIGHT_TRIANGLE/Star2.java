/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_35_EASY_PRINT_RIGHT_TRIANGLE;

/**
 *
 * @author adam
 */
import java.io.*;
public class Star2 {

    public static void main(String[] args)throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int i,j,n=0,k;
        System.out.print("How many stars you want to print in first row ? ");
        n=Integer.parseInt(in.readLine());
        for (i = 0; i<n; i=i+2)
        {
            for (j=i; j<n;j++)
            System.out.print ("*");
            System.out.println();
        }
    }

}