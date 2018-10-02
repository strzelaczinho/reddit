/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_29_EASY_PALINDROME_EASY;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChallengeTwentyNine{
private static String test;	//Test this string to see if it's a palindrome
private static String reverse;

public static void main(String[] args){
	test = getString();
	test = convertString(test);
	reverse = reverseString(test);
	
	System.out.println(test.equals(reverse));
}

private static String getString(){
	Scanner scanner = new Scanner(System.in);
	String str = "";
	try {
		scanner = new Scanner(new File("C:\\Users\\adam\\Documents\\NetBeansProjects\\REEDIT\\src\\CHALLENGE_29_PALINDROME_EASY\\text.txt"));
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	while(scanner.hasNextLine()){
		str += scanner.nextLine();
	}
	return str;
}

private static String convertString(String str){
	String output = "";
	for(int i = 0; i < str.length(); i++){
		char lc = Character.toLowerCase(str.charAt(i));
		if(Character.isLetter(lc) || Character.isDigit(lc)){
			output += lc;
		}
	}
	return output;
}

private static String reverseString(String str){
	String output = "";
	for(int i = str.length()-1; i >=0; i--){
		output += str.charAt(i);
                
	}
	return output;
}

}