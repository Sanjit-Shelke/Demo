package com.practise;

public class LargestNo {

	public static void main(String[] args) {
		
		int noArray[] = {80,30,50,90,02,40,10,5,65};
		int num = 0;
		
		for(int i=0; i< noArray.length; i++)
		{
			if(noArray[i] > num)
			{
				num = noArray[i];
			}
		}
		
		System.out.println("Largest no is = "+ num);
	}

}
