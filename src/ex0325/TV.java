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
	System.out.print(maker+"���� ����" +year+"���� " +inch+"��ġ TV");	
	}
}
