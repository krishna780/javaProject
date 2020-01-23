package logic;

import java.util.Scanner;

public class LogicsEx {

	public static void main(String[] args) {
		System.out.println("enter a num: ");
		Scanner sc = new Scanner(System.in);
		int num=0;
		int reversed = 0;
		num= sc.nextInt();
		if(num!=0) {
			while(num>0) {
				reversed=reversed*10+num%10;
				num/=10;
				  
		        }				  

		        System.out.println("Reversed Number: " + reversed);
		   
		}

		
		// TODO Auto-generated method stub

	}

}
