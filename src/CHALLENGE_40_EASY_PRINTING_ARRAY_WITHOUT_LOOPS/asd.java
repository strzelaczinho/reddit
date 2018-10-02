/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_40_EASY_PRINTING_ARRAY_WITHOUT_LOOPS;

import java.util.Vector;

/**
 *
 * @author adam
 */
public class asd {
    public static void main(String []args)
	{
		Vector oneLess = new Vector(1000);
                removeElement.removeElement(oneLess,0);	
	}
	private static class removeElement
	{
		public static void removeElement(Vector list,int i)
		{
			try
			{
				System.out.println(1000-(list.capacity()));
				list = new Vector(list.capacity()-1);
				removeElement(list,i+1);
			}
			catch (IllegalArgumentException e)
			{
				System.exit(0);
			}
		}
	}
}
