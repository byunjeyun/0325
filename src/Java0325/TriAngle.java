package Java0325;

public class TriAngle {

	//»ï°¢Çü °´Ã¼ÀÇ ¼Ó¼º
	int bottom;
	int height;
	String color;
	//»ï°¢Çü °´Ã¼ÀÇ ¼Ó¼º
	
	public TriAngle(int a, int b) {
		bottom = a;
		height = b;
	}
	
	
	double tri_area() {
		double area = bottom * height * 0.5;
				
				return area;
	}
}
