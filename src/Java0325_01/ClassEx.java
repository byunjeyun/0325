package Java0325_01;

public class ClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle cir1 = new Circle();
		cir1.radius = 15;
		cir1.name = "�׽�Ʈ����";
		double area=cir1.getArea();
		System.out.println(cir1.name+"�� ���̴�" +area);
		
		
		Circle cir2 = new Circle();
		cir2.name = "500�� ����";
		cir2.radius = 2;
		double area2=cir2.getArea();
		System.out.println(cir2.name+"�� ���̴�" +area2);
	}

}
