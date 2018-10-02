/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_35_EASY_PRINT_RIGHT_TRIANGLE;

/**
 *
 * @author adam
 */
class TriBR3
{
 // Print a bottom-right right-angled triangle of stars, of size SIZE

 static final int SIZE=5;
 
 public static void main(String[] args)
 {
  printShiftedBRTri(0,SIZE);
 }

 private static void printShiftedBRTri(int shift,int size)
 {
  if(size>0)
     {
      printShiftedBRTri(shift+1,size-1);
      System.out.println(repeat(shift,' ')+repeat(size,'*'));
     }
 }

 private static String repeat(int n,char ch)
 {
  if(n==0)
     return "";
  else
     return repeat(n-1,ch)+ch;
 }

}