package ex0325;

public class TV {

	public String maker;
	public int year;
	public int inch;
	
	
	public TV(String maker, int year, int inch) {
	this.maker=maker;
	this.year=year;
	this.inch=inch;
	}
	
	public void show(){
	System.out.print(maker+"에서 만든" +year+"년형 " +inch+"인치 TV");	
	}
}
