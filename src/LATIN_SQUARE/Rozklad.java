package LATIN_SQUARE;


import java.util.Scanner;
import sun.security.util.Length;


public class Rozklad {

    public static void main(String[] args) {
      int []tablica1 = new int []{1,2 ,3 ,4 ,5 ,5 ,1 ,2 ,3 ,4 ,4 ,5 ,1 ,2 ,3 ,3 ,4 ,5 ,1 ,2 ,2 ,3 ,4 ,5 ,1};
       Scanner sc = new Scanner(System.in);
        sprawdz(tablica1, sc);
     }
    public static void sprawdz (int[] tablica,Scanner sc)
    {
     System.out.println("Podaj ile wierszy");
     int n = sc.nextInt();
    
    
     if (n != Math.sqrt(tablica.length))
     {  
         System.out.println("It is not Latin square");
         System.exit(0);
     }
     for (int i=0;i<tablica.length;i++)
     {
         
         System.out.print(tablica[i]+" ");
         if ((i+1)%n==0 )
         {
             System.out.println();
         }
         else if (tablica[i]>n || tablica[i]<0)
         {
            System.out.println("It is not Latin square");
            System.exit(0);
         }
    }
     int l=0;
    int [][] tablica_wyjsciowa   = new int[n][n];
    for (int i=0;i<tablica_wyjsciowa.length;i++)
    for (int j=0;j<tablica_wyjsciowa[i].length;j++)
            {
                tablica_wyjsciowa[i][j] = tablica[l];
                l++;
            
            }
    l = 0;
        for (int i=0;i<tablica_wyjsciowa.length;i++)
    {        
       for (int j =0;j<tablica_wyjsciowa[i].length;j++)
       {
         if (n<tablica_wyjsciowa.length)
         {
         if (tablica_wyjsciowa[l][j] == tablica_wyjsciowa[l][(j+1)])
         {
             System.out.println("It is not Latin square");
             System.exit(0);
         }
         }                            
       }
       l++;
    }
     l = 0;
        
        for (int j=0;j<tablica_wyjsciowa[j].length;j++) 
        {
        for (int i=0;i<tablica_wyjsciowa.length;i++)   
        {
          if (tablica_wyjsciowa.length< n || tablica_wyjsciowa[j].length<n)
         {
        if (tablica_wyjsciowa[j][l] == tablica_wyjsciowa[j+1][l])
         {
             System.out.println("It is not Latin square");
             System.exit(0);
         }
        l++;
         }
         }
        }      
       
        
        
      
    
    }
    
}

