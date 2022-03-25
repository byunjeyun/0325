package Java0325;

public class TriAngle {

	//伙阿屈 按眉狼 加己
	int bottom;
	int height;
	String color;
	//伙阿屈 按眉狼 加己
	
	public TriAngle() {
		System.out.println("秋肺");
	}
	
	
	//积己磊  
	public TriAngle(int a, int b) {
		bottom = a;
		height = b;
		System.out.println(bottom+" "+height);
	}
	//积己磊
	
	double tri_area() {
		double area = bottom * height * 0.5;
				
				return area;
	}
}
