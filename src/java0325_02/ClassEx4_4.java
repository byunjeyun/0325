package java0325_02;

import java.util.*;
public class ClassEx4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadTest over1 = new OverloadTest(); 
		int sum1 = over1.sum();
		System.out.println(sum1);
		
		
		OverloadTest over2 = new OverloadTest(); 
		int sum2 = over2.sum(10, 20);
		System.out.println(sum2);
		
	}
}
		
		//		Book Hong = new Book("ȫ�浿��");
//		System.out.println(Hong.title+", "+Hong.author);

	
//	Book arr[]= new Book[3];
//	
//	Scanner scanner = new Scanner(System.in);
//	for(int i=0; i<arr.length; i++) {
//		System.out.print("å ������ �Է��ϼ���: ");
//		String title = scanner.nextLine();
//		System.out.print("å ���ڸ� �Է��ϼ���: ");
//		String author = scanner.nextLine();
//		arr[i]= new Book(title, author);		
//	}
//	String a = arr[1].author;
//	String b = arr[1].title;
//	
//	System.out.println(a);
//	System.out.println(b);
//	}


