/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_41_EASY_STRING_BANNER;

/**
 *
 * @author adam
 */
import java.util.*;

public class TextBanner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What would you like Bannerized? ");
		String bannerText = keyboard.nextLine(); //gets text input
		int bannerLength = bannerText.length(); //length of text
		topAndBottom(bannerLength);  //prints out top line of *s
		System.out.println("* "+ bannerText +" *");  //prints out text
		topAndBottom(bannerLength);  //prints out bottom line of *s
	}

	public static void topAndBottom(int bannerLength)  //prints out *s for top and bottom of banner
	{
		for (int i=0; i<bannerLength+4; i++)
		{
			System.out.print("*");
		}

		System.out.println();
	}
}