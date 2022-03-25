package Java0325;

public class Square {

	//사각형 객체의 속성
	int width;
	int height;
	String color;
	//삼각형 객체의 속성

	public Square(int a, int b) { 
		width=a;
		height=b;
		int area = width*height;
		System.out.println("사각형의 넓이는"+area);
		
	}
	
	void square_init(int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	
	
 
}