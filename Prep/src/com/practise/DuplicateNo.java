package com.practise;

public class DuplicateNo {

	public static void main(String[] args) {
		
		int dupArr[] = {10,30,20,30,50,80,10};
		
		for(int i=0; i < dupArr.length; i++)
		{
			for(int j= i+1 ; j <dupArr.length ;j++)
			{
				if(dupArr[j] == dupArr[i])
				{
					System.out.println("Duplicate No."+ dupArr[i]);
				}
			}
		}
		
			

	}

}
