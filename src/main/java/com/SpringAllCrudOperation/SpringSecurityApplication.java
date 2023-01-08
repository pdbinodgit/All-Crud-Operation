package com.SpringAllCrudOperation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Scanner;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);

		System.out.println("git branch check");
/*
//Program for Paliandrome number;
	int n,s=0,r,c;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		n= sc.nextInt();
		c=n;
		while(n>0){
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(c==s) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not palidrome");
		}
	}
*/








	/*
	//program for recursion

	public int sum(int b) {
		if(b>0){
			return b+sum(b-1);
		}
		else {
			return 0;
		}
		public static void main(String[] args) {
		SpringSecurityApplication abc=new SpringSecurityApplication();
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int q=abc.sum(s);
		System.out.println(q);
		}
	 */

		SpringSecurityApplication abc=new SpringSecurityApplication();
		abc.number(1);

	}
	public void number(int a){
		if(a>5){
			return;

		}

		System.out.println(a);
		number(a+1);
	}

}
