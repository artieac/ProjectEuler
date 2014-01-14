
public class ProblemOneApp {

	public static void main(String[] args)
	{
		int sumValue = 0;
		
		for(int i = 0; i < 1000; i++)
		{
			if(i % 3 == 0)
			{
				sumValue += i;
			}
			else
			{
				if(i % 5 == 0)
				{
					sumValue += i;
				}
			}
		}
		
		System.out.println(sumValue);
	}
}
