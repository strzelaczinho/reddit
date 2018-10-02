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
public class GFG_26_Print1ToNRecursion {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		while(tc-->0){
			//enter n
			int n = sc.nextInt();
			
			//print from 1 to n using recursion
			print(1,n);
			
			if(tc>0)
				System.out.println();
		}
		
	}
	
	static int print(int current, int max){
		System.out.printf("%d",current);
		if(current < max){
			System.out.print(" ");
			current++;
			return print(current,max);
		}else{
			return current;
		}
	}
	
}