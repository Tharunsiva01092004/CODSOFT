package package1;
import java.util.Scanner;
import java.util.Random;
public class Numgame{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int initiate=1;
		do
		{
			System.out.println("Number defaulty selected: ");
			int compnum=rand.nextInt(100);
			//System.out.println(compnum);
		for(int a=1;a<=10;a+=1)
		{
			System.out.println("Enter your Number:");
			int i=sc.nextInt();
			if(i<compnum) 
			{
				System.out.println("Too Low");
			}
			else if(i>compnum)
			{
				System.out.println("Too High");
			}
			else if(i==compnum)
			{
				System.out.println("Correct Number is Guessed!");
				System.out.println("Your score is "+(10-a+1)+" out of 10");
				break;
			}			
		}
		System.out.println("Do you want to try again? 1/0");
		initiate=sc.nextInt();
		}while(initiate==1);
		System.out.println("Thank you");
	}
}