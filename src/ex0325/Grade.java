package ex0325;

public class Grade {

	private int math, science, english;
	
	public Grade(int math, int science, int english) {
		this.math=math;
		this.science=science;
		this.english=english;
	}
	
	
	public double ave() {
	return (math+science+english)/3;	
	}
	
}
