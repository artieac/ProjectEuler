
public class ProblemTwoApp {
	public static void main(String[] args)
	{
		int sumValue = 0;
		int fibonnaciOne = 0;
		int fibonnaciTwo = 1;

		while(fibonnaciTwo < 4000000)
		{
			int fibonnaciSum = fibonnaciOne + fibonnaciTwo;
		
			System.out.println(fibonnaciSum);
			
			if(fibonnaciSum % 2 == 0)
			{
				sumValue += fibonnaciSum;
			}
			
			fibonnaciOne = fibonnaciTwo;
			fibonnaciTwo = fibonnaciSum;
		}
		
		System.out.println(sumValue);
	}
}
