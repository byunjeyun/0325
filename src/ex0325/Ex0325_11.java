package ex0325;

import java.util.Scanner;

public class Ex0325_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char operator = scanner.next().charAt(0);
		
		if(operator=="+") {
		Add add1 = new Add();
		}
		else if(c=="-") {
			Sub sub1 = new Sub();
		}
		else if(c=="*") {
			Mul mul1 = new Mul();
		}
		else if(c=="/") {
			Div div1 = new Div();
		}
		
		scanner.close();
	}
	
}


