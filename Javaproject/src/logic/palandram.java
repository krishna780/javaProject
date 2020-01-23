package logic;

import java.util.Scanner;

public class palandram {
 public static void main(String[] args) {
	int n=0, pal = 0, r;
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	while(n>0) {
		r=n%10;
       pal=pal*10+r;
       n/=10;
}System.out.println(pal);
 }
}
