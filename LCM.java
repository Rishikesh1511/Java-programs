package DSApractice;

		/* find LCM */
import java.util.Scanner;
public class LCM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int low,lcm;
		if(num1<num2)
			low=num1;
		else
			low=num2;
		
		while(true)
		{
			if(low%num1==0 && low%num2==0)
			{
				lcm = low;
			    break;
			}
			low++;
		}
		System.out.println(lcm);
		
	}

}
