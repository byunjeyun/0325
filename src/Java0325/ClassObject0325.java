package Java0325;

public class ClassObject0325 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TriAngle Ŭ������ tri1�̶�� �̸��� ��ü�� ����
		TriAngle tri1 = new TriAngle(10, 5);
		
//		tri1.bottom = 10;
//		tri1.height = 5;
		tri1.color = "red";
		double s = tri1.tri_area();
		System.out.println(s);
		
		Square squ = new Square();
		squ.width = 4;
		squ.height = 4;
		squ.color = "blue";	
		double s1 = squ.square_area();
		System.out.println(s1);
		
	}

}
