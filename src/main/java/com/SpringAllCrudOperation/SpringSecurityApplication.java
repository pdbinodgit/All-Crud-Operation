package com.SpringAllCrudOperation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);

		System.out.println("git branch check");
		System.out.println("*********************");
//		int i,size;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter size of array");
//		size=sc.nextInt();
//		int a []=new int[size];
//		System.out.println("enter array element");
//		for (i=0;i<size;i++){
//			a[i]=sc.nextInt();
//		}
//		System.out.println("enter element are :");
//		for(i=0;i<size;i++){
//			System.out.println(a[i]);
		System.out.println("**************");
		//Array list
		/*
		ArrayList ma memory non continuous allocation hunx tar array ma continuous
		arrayList varible size hunx bhane array fixed size
		 */
		ArrayList<Integer> list=new ArrayList<>();
		//add element
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		System.out.println(list);
		//remove element
		list.remove(2);
		System.out.println(list);
		//element get by index
		int a=list.get(1);
		System.out.println(a);
		//add element in between
		list.add(1,4);
		System.out.println(list);
		//modify or set element
		list.set(3,2);
		System.out.println(list);
		//size of Arraylist
		int b=list.size();
		System.out.println(b);
		//loop
		for (int i=0;i< list.size();i++)
			System.out.println(list.get(i));

     //sorting
		Collections.sort(list);
		System.out.println(list);
		System.out.println("**************");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		Double d=scan.nextDouble();
		String s=scan.nextLine();

		// Write your code here.

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		System.out.println("*****************");


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
