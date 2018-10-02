/*
Your task today is show the implementation of two sorting algorithms Stooge sort and Bogosort in anyway you like!
 */
package CHALLENGE_34_INTERMEDIATE_SORTING_STOOGE_BOGO;

import java.util.Random;

/**
 *
 * @author adam
 */
public class asd {
public static void stooge(int[] toSort, int leftIndex, int rightIndex){
	if(toSort[leftIndex] > toSort[rightIndex-1]){
		int temp = toSort[leftIndex];
		toSort[leftIndex] = toSort[rightIndex-1];
		toSort[rightIndex-1] = temp;
	}
	if((rightIndex - leftIndex) >= 3){
		int oneThird = (rightIndex - leftIndex) / 3;
		stooge(toSort, leftIndex, rightIndex-oneThird);
		stooge(toSort, leftIndex+oneThird, rightIndex);
		stooge(toSort, leftIndex, rightIndex-oneThird);
	}
}

public static void bogo(int[] toSort, int size){
	Random rand = new Random();
	
	for(int i=0; i<size-1; i++){
		int randIndex = rand.nextInt(size);
		int temp = toSort[i];
		toSort[i] = toSort[randIndex];
		toSort[randIndex] = temp;
	}
	for(int i=0; i<=size-2; i++)
		for(int j=i+1; j<=size-1; j++)
			if(toSort[i] > toSort[j])
				bogo(toSort, size);
}
public static void main(String []args)
{
    Random rand = new Random();
        int[] tablica = new int[30];
        for (int i = 0;i< tablica.length;i++)
        {
            tablica[i] = rand.nextInt(100);
        }
        wypisz(tablica);
        stooge(tablica,0,30);
        wypisz(tablica);
        
}
public static void wypisz(int[] abla)
{
    for (int i = 0;i<abla.length;i++)
    {
        System.err.print(abla[i]+" ");
    }
    System.out.println();
}

}