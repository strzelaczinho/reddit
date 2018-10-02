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
public class NewClass {


public static void main (String[]args)
{
	int NUM = 0, TEMP = 0;
        Scanner sc = new Scanner(System.in);
	   System.err.println("Enter a positive number"); 
	 NUM = sc.nextInt();

	int ROWS = 0, Y = 1;
	for( ; Y <= NUM; Y++, Y+=ROWS )
	{
		ROWS++;
	}

	Y -= ROWS + 1;
	TEMP = Y - (ROWS - 1);

	for( int UNT = TEMP; ROWS != 1; UNT++ )
	{
		          System.err.print(UNT+" ");  
		if( UNT == Y )
    	{
			         System.err.println();
			Y -= ROWS;
			TEMP = Y - ROWS;
			UNT = TEMP + 1;
			ROWS--;
		}
	}
	   System.err.println("1"); 
	
	
}
}
