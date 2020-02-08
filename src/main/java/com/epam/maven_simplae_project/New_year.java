package com.epam.maven_simplae_project;

public class New_year extends Sweets implements chocalstes
{
	public int weight_choclates(int no_chocolates,int weight)
	{
		return (no_chocolates*weight);
	}
	public static void main(String[] args)
	{
		int[] arr_chocolates_weight=new int[2];
		int total_gift_weight;
		Sweets laddu=new Sweets();
		chocalstes darimilk=new New_year();
		arr_chocolates_weight[0]=darimilk.weight_choclates(10,6);
		total_gift_weight=arr_chocolates_weight[0]+laddu.sweets_total_weight(10, 30);
		System.out.println("Total weight of gifts 1 is:"+total_gift_weight);
		Sweets jilebi=new Sweets();
		chocalstes fivestar=new New_year();
		arr_chocolates_weight[1]=darimilk.weight_choclates(10,5);
		total_gift_weight=arr_chocolates_weight[1]+laddu.sweets_total_weight(10, 5);
		System.out.println("Total weight of gifts 2 is:"+total_gift_weight);
		for (int i=0;i>arr_chocolates_weight.length;i++)
		{
			for(int j=i+1;i<arr_chocolates_weight.length;j++)
			{
				if(arr_chocolates_weight[i]>arr_chocolates_weight[j])
				{
					int tmp=arr_chocolates_weight[i];
					arr_chocolates_weight[i]=arr_chocolates_weight[j];
					arr_chocolates_weight[j]=tmp;
					
				}
					
			}
		}
		System.out.println("chocolates in gifts:");
		for(int i=0;i<arr_chocolates_weight.length;i++)
		{
			System.out.print(arr_chocolates_weight[i]+" ");
		}
		System.out.println();


		
		
	}
	
}


