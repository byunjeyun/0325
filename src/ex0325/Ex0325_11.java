package ex0325;

import java.util.Scanner;

import Java0325_01.Circle;

public class Ex0325_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		
	
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char operator = scanner.next().charAt(0);
				
		if(operator=='+') {
			Add add1 = new Add(a, b);
			System.out.println(add1.Cal());
		}
		else if(operator=='-') {
			Sub sub1 = new Sub(a, b);
			System.out.println(sub1.Cal());
		}
		else if(operator=='*') {
			Mul mul1 = new Mul(a, b);
			System.out.println(mul1.Cal());
		}
		
		else if(operator=='/') {
			Div div1 = new Div(a, b);
			System.out.println(div1.Cal());
		}
		scanner.close();
	}
	
}


	