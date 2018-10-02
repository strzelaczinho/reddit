package CHALLENGE_37_EASY_WORD_COUTING;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;


public class Program {
    
    public static void main(String[] args) throws FileNotFoundException
    {
        
    //PrintWriter writer = new PrintWriter(new File("adam.txt"));
    Scanner sc = new Scanner(new File("C:\\Users\\adam\\Documents\\NetBeansProjects\\REEDIT\\src\\CHALLENGE_37_WORD_COUTING_EASY\\adam.txt"));
    {
    int count=0;
    int count2 = 0; 
    while(sc.hasNext())
    {
        
        sc.next();
        count++;
       
    }
    sc.close();
   
    sc = new Scanner(new File("C:\\Users\\adam\\Documents\\NetBeansProjects\\REEDIT\\src\\CHALLENGE_37_WORD_COUTING_EASY\\adam.txt"));
    while(sc.hasNextLine())
    {
        sc.nextLine();
        count2++;
    }
System.out.println("Number of words: " + count+" and lines "+count2);
}
    }
}
