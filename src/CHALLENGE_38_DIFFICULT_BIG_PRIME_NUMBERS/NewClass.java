/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_38_DIFFICULT_BIG_PRIME_NUMBERS;



import java.math.*;
import java.util.*;

public class NewClass {

    
    
    
    
   public static void main(String[] args) {

      // create a BigInteger object
      BigInteger bi;

      // create and assign value to bitLength
      int bitLength = 330;

      // create a random object
      Random rnd = new Random();

      // assign probablePrime result to bi using bitLength and rnd
      // static method is called using class name
      bi = BigInteger.probablePrime(bitLength, rnd);

      String str = "ProbablePrime of bitlength " + bitLength + " is " +bi;
      System.out.println(str);
      // print bi value
      String s = bi.toString();
      System.out.println("Długosc slowa to  "+s.length()+" cyfr ");
      
      BigInteger val = new BigInteger(s);
     Integer certainty = Integer.parseInt("5");
     boolean result = val.isProbablePrime(certainty);
       System.err.println(result);
       
   }
   
   
  
}