/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_40_EASY_PRINTING_ARRAY_WITHOUT_LOOPS;

import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
		    recursion(sc.nextInt(),1);
		    System.out.println();
		}
	}
	
	static void recursion(int num, int i) {
	    System.out.print(i+" ");
	    if (num==i)
	        return;
            else
	    recursion(num,i+1);
	}
}