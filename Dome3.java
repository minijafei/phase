package TWO_TEST;
//���εĿ�width�����εĸ�height��

class Rect{
	protected double width;
	protected double height;
	//����--------------------
	public Rect(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	public Rect() {
		width = 10;
		height = 10;
	}
	//����--------------------
	public double area() {
		return width*height;
	}
	public double perimeter() {
		return (width+height)*2;
	}
}

public class Dome3 {
	public static void main(String[] args) {
		Rect rect = new Rect();
		System.out.println("�����"+rect.area());
		System.out.println("�ܳ���"+rect.perimeter());
	}
}
