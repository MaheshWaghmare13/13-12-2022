
public class SumAndAverage {

	
	public static void main(String[] args) {
		
			int sum=0;
			
			for(int i=1;i<=100;i++)
			{
				sum=sum+i;
			}
			
			double avg=(float)sum/100;
			
			System.out.println("The Sum is  "+sum);
			System.out.println("The Average is  "+avg);
	}

}
