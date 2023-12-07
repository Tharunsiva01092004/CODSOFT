package package1;
import java.util.Scanner;

public class Gradecal {
	public static void main(String[] args)
	{
		System.out.println("The Student Grade Calculator");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student name:");
		String name=sc.nextLine();
		System.out.println("Enter the marks scored by the student in 5 subjects out of 100 \n");
		System.out.println("The mark in subject1:");
		float m1=sc.nextInt();
		System.out.println("The mark in subject2:");
		float m2=sc.nextInt();
		System.out.println("The marks in subject3:");
		float m3=sc.nextInt();
		System.out.println("The marks in subject4:");
		float m4=sc.nextInt();
		System.out.println("The marks in subject5:");
		float m5=sc.nextInt();
		float total=m1+m2+m3+m4+m5;
		System.out.println("The total marks obtained by the Student is:"+total+"/500");
		float avg=total/5;
		System.out.println("The average is "+avg);
		float percent=avg;
		System.out.println("The percentage is "+percent+"%");
		System.out.println("The Grade is");
		if(percent>90 && percent<=100)
			System.out.println("O");
		else if(percent>80 && percent<=90)
			System.out.println("A");
		else if(percent>70 && percent<=80)
			System.out.println("B");
		else if(percent>60 && percent<=70)
			System.out.println("C");
		else if(percent>50 && percent<=60)
			System.out.println("D");
		else
			System.out.println("F");
		System.out.println("Grades Calculated Successfully");
		
	}
}
