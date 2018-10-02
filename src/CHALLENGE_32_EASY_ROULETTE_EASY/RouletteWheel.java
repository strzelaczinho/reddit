/*
lets simulate a roulette wheel!a program that takes as input your bet, and gives as output how much you won, with the appropriate probability
write a program that will take a players bet and output the resulting spin and payout. try using an american roulette wheel (which has the 00 slot) t
 */
package CHALLENGE_32_EASY_ROULETTE_EASY;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author adam
 */

public class RouletteWheel {

public static int spinTheWheel(String bet){
	
	Random spinner = new Random();
	int spinResult = spinner.nextInt(38);  // 37 = 00
	if(spinResult == 37)
		System.out.println("The number is 00.");
	else
		System.out.println("The number is " + spinResult);
	// check to see if the bet is a number
	if(bet.length() <3)
		if(Integer.parseInt(bet) == spinResult || (bet.equals("00") && spinResult == 37))
			return 35;
	if(bet.equals("Row00") && (spinResult == 0 || spinResult == 37))
		return 17;
	if(bet.equals("Basket") && (spinResult == 0 || spinResult == 37 || spinResult == 2))
		return 11;
	if(bet.equals("TopLine") && (spinResult == 0 || spinResult == 37 || spinResult == 1
			|| spinResult == 2 || spinResult == 3))
		return 6;
	if(bet.equals("FirstColumn"))
		for(int i=1; i<35; i+=3)
			if(i == spinResult)
				return 2;
	if(bet.equals("SecondColumn"))
		for(int i=2; i<36; i+=3)
			if(i == spinResult)
				return 2;
	if(bet.equals("ThirdColumn"))
		for(int i=3; i<37; i+=3)
			if(i == spinResult)
				return 2;
	if(bet.equals("FirstDozen") && spinResult > 0 && spinResult < 13)
		return 2;
	if(bet.equals("SecondDozen") && spinResult > 12 && spinResult < 25)
		return 2;
	if(bet.equals("ThirdDozen") && spinResult > 25 && spinResult < 37)
		return 2;
	if(bet.equals("Odd"))
		for(int i=1; i<37; i+=2)
			if(i == spinResult)
				return 1;
	if(bet.equals("Even"))
		for(int i=2; i<=36; i+=2)
			if(i == spinResult)
				return 1;
	if(bet.equals("1to18") && spinResult > 0 && spinResult < 19)
		return 1;
	if(bet.equals("19to36") && spinResult > 18 && spinResult < 37)
		return 1;
	return 0;
}

public static void main(String [] args){
	System.out.println("Enter the name of your bet.  For a list of bet names, enter 'list':");
	Scanner in = new Scanner(System.in);
	String userBet = in.next();
	System.out.println("Your bet is " + userBet);
	if(userBet.equals("list"))
			System.out.println("I haven't done this part yet.");
    else
    {
                System.out.println("Your bet is " + userBet);
	        System.out.println("Your payout is " + spinTheWheel(userBet));
    }
        
        
}
}