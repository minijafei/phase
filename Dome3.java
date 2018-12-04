package TWO_TEST;
//矩形的宽width；矩形的高height。

class Rect{
	protected double width;
	protected double height;
	//构造--------------------
	public Rect(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	public Rect() {
		width = 10;
		height = 10;
	}
	//方法--------------------
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
		System.out.println("面积："+rect.area());
		System.out.println("周长："+rect.perimeter());
	}
}
