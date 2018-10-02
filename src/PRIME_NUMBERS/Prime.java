import java.math.BigInteger;
import java.util.Scanner;
 public class Prime {


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Prime prime = new Prime();
      long liczba = sc.nextLong();
      if (liczba <=2 && liczba >0)
      {
          System.out.println(liczba+"is a prime ");
          System.exit(0);
      }
      else if (liczba < 0)
      {
          liczba = Math.abs(liczba);
      }
      boolean b = isPrime(liczba);

      if (b == true)
      {
          System.out.println(liczba+" is a prime");
      }

      else if (b == false)
      {
          long wyzsza = prime.uppPrime(liczba);
          long nizsza = prime.DownPrime(liczba);
          System.out.println(nizsza+" < "+liczba+" < "+wyzsza);          
      }            

    }

 public static boolean isPrime(long liczba)
{


  if(liczba<2)
  {
    return false;
  }
  for(int i=2;i*i<=liczba;i++)
  {
    if(liczba%i==0)        
     return false; 
  }     return true;
}

 public static  long uppPrime (long liczba)
{
      boolean b = true;
      long i = liczba;
       while(b)
       {
         ++i;
       if (b == isPrime(i))           
       break;
       }
      return i;       
}


public  static long DownPrime(long liczba)
{
       boolean b = true;
       long k = liczba;
       while(b)  
       {
          --k;
         if (b == isPrime(k))         
           break;
       }
   return k;

}
public static boolean isPrime (int prime){
    for(int i=2;i<prime;i++) {
        if(prime%i==0)
            return false;
    }
    return true;
}

}


