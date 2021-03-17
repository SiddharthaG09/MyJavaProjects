import java.util.Arrays;
import java.util.Scanner; 
//© Siddhartha inc. ©2021
public class Dice 
{

	public static void main(String[] args) 
  	{
		int count=0;
		int counttwo=0;
		Scanner input = new Scanner(System.in); 
		System.out.println("How many sides is your dice");
		int diceside = input.nextInt();
		System.out.println("How many numbers do you want to check");
		int amountofnumbers = input.nextInt();
		int[] usernumbers= new int[amountofnumbers];
		while(count<amountofnumbers)
		{
			System.out.println("What is your number");
			int enterusernumber = input.nextInt();
			usernumbers[count] = enterusernumber;
			count++;
		}
		int length=usernumbers.length;
		System.out.println("How many times do you want to role it");
		int roles= input.nextInt();
		float prob= ((float)length)/diceside;
		if(roles==1)
		{
			System.out.println("For numbers " + Arrays.toString(usernumbers) + 
			" rolled " + roles + " times " + "has chance of " + prob*100 + "%");
		}
		else
		{
		while(counttwo<roles-1)
		{
			prob=prob*prob;
			counttwo++;
		}
		System.out.println( "For numbers " + Arrays.toString(usernumbers) + 
			" rolled " + roles + " times " + "has chance of " + prob*100 + "%");
		}

	}

}
