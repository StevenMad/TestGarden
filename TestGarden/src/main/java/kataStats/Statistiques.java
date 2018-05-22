package kataStats;

/*
 * Objectif : ecrire les tests apres avoir écrit le code prod
 * en utilisant les bonnes pratiques de nommage et d'utilisation
 */
public class Statistiques {
	
	public int minimum(int... numbers)
	{
		if(numbers.length==0)
			return 0;
		int minVal = numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]<minVal)
				minVal = numbers[i];
		}
		return minVal;
	}
	
	public int maximum(int... numbers)
	{
		if(numbers.length==0)
			return 0;
		int maxVal = numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>maxVal)
				maxVal = numbers[i];
		}
		return maxVal;
	}
	
	public int sequenceLength(int... numbers)
	{
		return numbers.length;
	}
	
	public double mean(int... numbers)
	{
		if(numbers.length==0)
			return 0;
		int sum = numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
			sum+=numbers[i];
		}
		return sum/numbers.length;
	}
}
