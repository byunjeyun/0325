package ex0325;

import java.util.*;
public class Ex0325_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
	int math = scanner.nextInt();
	int science = scanner.nextInt();
	int english = scanner.nextInt();
	Grade me = new Grade(math, science, english);
	System.out.println("�����"+me.ave());
	
	scanner.close();
	
	}

}
