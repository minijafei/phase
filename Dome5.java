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
		System.out.print("饮料1==使用水->");
	}
	public void buffer(){
		System.out.print("缓冲->");
	}
	public void filter() {
		System.out.print("过滤->");
	}
	public void finish() {
		System.out.println("完成");
	}
	public void making() {
		water();filter();buffer();finish();
	}
}
class Drinks2 extends Water implements Buffer,Heating{
	public void water() {
		System.out.print("饮料2==使用水->");
	}
	public void heating() {
		System.out.print("加热->");
	}
	public void buffer(){
		System.out.print("缓冲->");
	}
	public void finish() {
		System.out.println("完成");
	}
	public void making() {
		water();heating();buffer();finish();
	}
}
class Drinks3 extends Water implements Filter,sugar{
	public void water() {
		System.out.print("饮料2==使用水->");
	}
	public void filter() {
		System.out.print("过滤->");
	}
	public void suger() {
		System.out.print("放糖->");
	}
	public void finish() {
		System.out.println("完成");
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
