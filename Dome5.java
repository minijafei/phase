package TWO_TEST;


abstract class Water{
	abstract void water();
}

interface Filter{
	void filter();
}
interface Buffer {
	void buffer();
}
interface Heating {
	void heating();
} 
interface sugar {
	void suger();
}

class Drinks1 extends Water implements Filter,Buffer{
	public void water() {
		System.out.print("����1==ʹ��ˮ->");
	}
	public void buffer(){
		System.out.print("����->");
	}
	public void filter() {
		System.out.print("����->");
	}
	public void finish() {
		System.out.println("���");
	}
	public void making() {
		water();filter();buffer();finish();
	}
}
class Drinks2 extends Water implements Buffer,Heating{
	public void water() {
		System.out.print("����2==ʹ��ˮ->");
	}
	public void heating() {
		System.out.print("����->");
	}
	public void buffer(){
		System.out.print("����->");
	}
	public void finish() {
		System.out.println("���");
	}
	public void making() {
		water();heating();buffer();finish();
	}
}
class Drinks3 extends Water implements Filter,sugar{
	public void water() {
		System.out.print("����2==ʹ��ˮ->");
	}
	public void filter() {
		System.out.print("����->");
	}
	public void suger() {
		System.out.print("����->");
	}
	public void finish() {
		System.out.println("���");
	}
	public void making() {
		water();filter();suger();finish();
	}
}

public class Dome5 {
	public static void main(String[] args) {
		Drinks1 d1 = new Drinks1();
		Drinks2 d2 = new Drinks2();
		Drinks3 d3 = new Drinks3();
		d1.making();
		d2.making();
		d3.making();

	}
}
