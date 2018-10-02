/*
A very basic challenge:
In this challenge, the
input is are : 3 numbers as arguments
output: the sum of the squares of the two larger numbers.
Your task is to write the indicated challenge.
 */
package CHALLENGE_34_EASY_SQUARE;

import java.util.Scanner;

public class square {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(addLargestSquares(sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
    }
    public static double addLargestSquares(double a, double b, double c)
{
    return a > b ? a*a + (b > c ? b*b : c*c) : b*b + (a > c ? a*a : c*c);
} 
}
