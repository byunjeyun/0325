package Java0325;

public class Square {

	//�簢�� ��ü�� �Ӽ�
	int width;
	int height;
	String color;
	//�ﰢ�� ��ü�� �Ӽ�

	public Square(int a, int b) { 
		width=a;
		height=b;
		int area = width*height;
		System.out.println("�簢���� ���̴�"+area);
		
	}
	
	void square_init(int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	
	
 
}