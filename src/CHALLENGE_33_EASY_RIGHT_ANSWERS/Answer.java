/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_33_EASY_RIGHT_ANSWERS;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author adam
 */
public class Answer {
   
   
   public static void main (String[] args)
   {
       Scanner sc = new Scanner(System.in);
       HashMap<Integer,String> pytania=new HashMap<Integer,String>();
       HashMap<Integer,String> odpowiedzi=new HashMap<Integer,String>();  
       
       pytania.put(1,"Jak mam na imie?");
       odpowiedzi.put(1,"adam");
       
       pytania.put(2,"Ile mam lat?");
       odpowiedzi.put(2,"30");
       
       pytania.put(3,"Gdzie mieszkam?Podaj miasto...");
       odpowiedzi.put(3,"bialystok");
       
       Random rand = new Random();
       boolean k = true;
       do {
        int liczba = rand.nextInt(3)+1;  
        String s = pytania.get(liczba);
        System.err.println(s);
        String odpowiedz = sc.nextLine();
        String odpowiedz2 = odpowiedzi.get(liczba);
        
        if (odpowiedz.equalsIgnoreCase(odpowiedz2))
        {
           k = true;
        }
        else {
            k = false;
            System.out.println("Koniec");
        }
       
        
       
       }while(k);
   }
}
/*
  Map<Integer,Book> map=new HashMap<Integer,Book>();    
 for(Map.Entry<Integer, Book> entry:map.entrySet()){    
        int key=entry.getKey();  
        Book b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   


 HashMap<Integer,String> hm=new HashMap<Integer,String>();  
 for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
*/
