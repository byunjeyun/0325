package Java0325;

public class TriAngle {

	//�ﰢ�� ��ü�� �Ӽ�
	int bottom;
	int height;
	String color;
	//�ﰢ�� ��ü�� �Ӽ�
	
	public TriAngle() {
		System.out.println("���");
	}
	
	
	//������  
	public TriAngle(int a, int b) {
		bottom = a;
		height = b;
		System.out.println(bottom+" "+height);
	}
	//������
	
	double tri_area() {
		double area = bottom * height * 0.5;
				
				return area;
	}
}
