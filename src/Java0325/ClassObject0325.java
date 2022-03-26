package Java0325;
public class ClassObject0325 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TriAngle 클래스로 tri1이라는 이름의 객체를 선언
		
		int a[] = {1,2,3,4,5};
		double b[] = {1.1,3.2,4.5};
		
		TriAngle tri[] = new TriAngle[5];//객체 배열 선언 
				
		for(int i=0; i<tri.length; i++) {
			tri[i] = new TriAngle(i+10, i+20);
			tri[i].bottom = i;
//			System.out.println(tri[i].bottom);
		}
		
		double area = tri[2].tri_area();
		System.out.println(area);
		
		TriAngle tri1 = new TriAngle(10, 5);
//		tri1.bottom = 10;
//		tri1.height = 5;
		tri1.color = "red";
		double s = tri1.tri_area();
		System.out.println(s);
	
		//TriAngle클래스로부터 tri2 이름의 객체 선언
		//인수 없는 생성자로 부터
		TriAngle tri2 = new TriAngle();
		tri2.bottom = 10;
		tri2.height = 5;
		tri2.color = "red";
		double s2 = tri2.tri_area();
		System.out.println(s2);
				
		Square squ = new Square(4, 4);
//		squ.width = 4;
//		squ.height = 4;
		squ.color = "blue";	
		System.out.println(squ.width);
		System.out.println(squ.height);
		
		
		Square squ2 = new Square(3, 6);
//		squ2.width = 4;
//		squ2.height = 4;
		squ2.color = "blue";
		System.out.println(squ2.width);
		System.out.println(squ2.height);
	}

}
