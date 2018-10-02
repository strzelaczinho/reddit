/* 
The array duplicates problem is when one integer is in an array for more than once.
If you are given an array with integers between 1 and 1,000,000 or in some other interval and one integer is in the array twice. How can you determine which one?
Your task is to write code to solve the challenge.
Note: try to find the most efficient way to solve this challenge.
*/
package CHALLENGE_28_EASY_ARRAY_DUPLICATE_SORTED_EASY;

import java.util.Random;

public class FindDuplicate {

public static void sort(int[] toSort){
	quickSort(toSort, 0, toSort.length - 1);
}

public static void quickSort(int[] listToSort, int leftIndex, int rightIndex){
	int pivot = listToSort[(leftIndex + rightIndex) / 2];
	int i = leftIndex;
	int j = rightIndex;
	
	while(i < j){
		while(listToSort[i] < pivot)
			i++;
		while(listToSort[j] > pivot)
			j--;
		if(i <= j){
			int temp = listToSort[i];
			listToSort[i] = listToSort[j];
			listToSort[j] = temp;
			i++;
			j--;
		}
	}
	
	if(leftIndex < j)
		quickSort(listToSort, leftIndex, j);
	if(i < rightIndex)
		quickSort(listToSort, i, rightIndex);
}

public static int findDuplicate(int[] sorted){
	for(int i=0, j=1; i<sorted.length-1; i++, j++)
		if(sorted[i] == sorted[j])  
                        
			return sorted[i]; // po posrtowaniu wskaz liczbe ktorej poszukujemy 1 2 3 4 5 5 6 7 . 5 jest podwojnie i=0,1,2,3 j = 1,2,3,4 
	return -1; // this shouldn't happen
}



  public static void main(String [] args){
	
	// first, create the array
	int arraySize = 100;
	int[] permuted = new int[arraySize];
	for(int i=0; i<arraySize; i++)
        {
		permuted[i] = i+1;
        System.out.println(permuted[i]);
        }
	// next, permute it
	Random rand = new Random();
	for(int i=0; i<permuted.length; i++){
		int randIndex = rand.nextInt(permuted.length);
		int temp = permuted[i];
		permuted[i] = permuted[randIndex];
		permuted[randIndex] = temp;
	}
	//System.out.println("perumted sub zero is " + permuted[0] + ", and permuted sub 999999 is " + permuted[999999]);
	
	// finally, choose a random value and duplicate it
	int replacor = 0;
	int replacee = 0;
	while(replacor == replacee){
		int randIndex = rand.nextInt(permuted.length); // losuje liczbe od 1 - 100
		replacor = permuted[randIndex];                 // replacor = permuted[wylosowana] np 74
		randIndex = rand.nextInt(permuted.length);      // randIndex = od 1 - 100 liczba 
		replacee = permuted[randIndex];                 // replacee = od 1 do 100 
		if(replacor != replacee)
			permuted[randIndex] = replacor;     // przypisz randowmowa liczbe o wartosci permuted[1-100] = od 1 do 100;
	}
	replacee = replacor;  // przypisz replace wartosc wylsowana
	System.out.println("The duplicate is " + replacor); // co to za duplicate 
	
	// sort the list that we just unsorted =/
	sort(permuted);     // sortowanie 
	
	// find the freakin' duplicate
	System.out.println("The duplicate we found was " + findDuplicate(permuted)); // wskaz liczbe w tablicy
}

}