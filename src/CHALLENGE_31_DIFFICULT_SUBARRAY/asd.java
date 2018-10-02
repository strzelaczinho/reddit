
package CHALLENGE_31_DIFFICULT_SUBARRAY;
/*
[3/27/2012] Challenge #31 [difficult]
In this challenge, given an array of integers, the goal is to efficiently find the subarray that has the greatest 
value when all of its elements are summed together. Note that because some elements of the array may be negative,
the problem is not solved by simply picking the start and end elements of the array to be the subarrray, and summing the entire array.
For example, given the array
{1, 2, -5, 4, -3, 2}
The maximum sum of a subarray is 4. It is possible for the subarray to be zero elements in length (if every element of the array were negative).
Try to come up with an efficient algorithm!
*/

public class asd {
    
    
   public static int [] zamiana(int[] array) {
	int  suma = 0;
	int  prevMax = 0;
	int  prevMaxLoc = -1;
	int  prevMin = 0;
	int  prevMinLoc = -1;
	int  wartoscMinusowa = 0;
	int lokalizacjaMinusa = -1;
	
	for (int i=0;i<array.length;i++) {
		suma += array[i];
		if (suma < wartoscMinusowa) {
			wartoscMinusowa = suma;
			lokalizacjaMinusa = i;
		}
		if (suma - wartoscMinusowa > prevMax - prevMin) {
			prevMax = suma;
			prevMaxLoc = i;
			prevMin = wartoscMinusowa;
			prevMinLoc = lokalizacjaMinusa;
		}
	}
       int[] array2 = new int[prevMaxLoc-prevMinLoc];
       int z = 0;
       for (int i = prevMinLoc+1;i<prevMaxLoc+1;i++,z++)
       {
           array2[z] = array[i];
          
       }
	
	return array2;
}
   
   
   public static void main(String[]args)
   {
       int[] tablica = {1, 2, -5, 4, -3, 2};      
       int[] tablica2 = zamiana(tablica);
       for(int m:tablica2)
       {
           System.err.print(m+" ");
       }
      
         
   }
}
