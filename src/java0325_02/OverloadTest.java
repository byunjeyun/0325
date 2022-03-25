package java0325_02;

public class OverloadTest {

	int a;
	int b;
	
	public int sum() {
		int sum = a+b;
		return sum;
	}
	
	public int sum(int a, int b) {
		int sum = a*b;
		return sum;
	}
	
	public int sum(int a) {
		int sum = a+0;
		return sum;
	}
	
}
