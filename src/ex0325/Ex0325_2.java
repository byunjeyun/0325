package ex0325;

import java.util.*;
public class Ex0325_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
	int math = scanner.nextInt();
	int science = scanner.nextInt();
	int english = scanner.nextInt();
	Grade me = new Grade(math, science, english);
	System.out.println("평균은"+me.ave());
	
	scanner.close();
	
	}

}
