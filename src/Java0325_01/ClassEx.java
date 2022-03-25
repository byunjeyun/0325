package Java0325_01;

public class ClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle cir1 = new Circle();
		cir1.radius = 15;
		cir1.name = "테스트피자";
		double area=cir1.getArea();
		System.out.println(cir1.name+"의 넓이는" +area);
		
		
		Circle cir2 = new Circle();
		cir2.name = "500원 동전";
		cir2.radius = 2;
		double area2=cir2.getArea();
		System.out.println(cir2.name+"의 넓이는" +area2);
	}

}
