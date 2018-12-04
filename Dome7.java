package TWO_TEST;

interface Fly{
	void fly();
}

abstract class Tra_tools{
	private int weight;
	//���췽��------------------------------
	public Tra_tools(int weight) {
		super();
		this.weight = weight;
	}
	public Tra_tools() {
		super();
	}
	//get--set----------------------------
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	//------------------------------------
	abstract void run();
}
abstract class Car extends Tra_tools{
	private int wheel;
	//���췽��--------------------------------------------
	public Car(int weight, int wheel) {
		super(weight);
		this.wheel = wheel;
	}
	public Car() {
		super();
	}
	//set  get------------------------------------------
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	//--------------------------------------------------
	abstract void brake();
}

class Tuck extends Car{
	private int cabin;
	//���췽��---------------------------------------------
	public Tuck(int weight, int wheel, int cabin) {
		super(weight, wheel);
		this.cabin = cabin;
	}
	public Tuck() {
		super();
	}
	//get-set--------------------------------------------
	public int getCabin() {
		return cabin;
	}
	public void setCabin(int cabin) {
		this.cabin = cabin;
	}
	//----------------------------------------------------
	public void run(){
		System.out.println("����"+super.getWheel()+"������,"+"���䣺"+cabin+",���أ�"+super.getWeight());
	}
	public void brake(){
		System.out.println("--ɲ��--");
	}
}

class Plane extends Tra_tools{
	Fly fly = ()->{System.out.println("���Է��У�");};
	public Plane(int weight) {
		super(weight);
	}
	public void run() {
		System.out.println("��ͨ���ߣ��ɻ����ؿ�����"+super.getWeight());
	}
	public void plane(Fly fly) {
		fly.fly();
	}
	public void fly(){
		plane(fly);
	}
	
}

public class Dome7 {
	public static void main(String[] args) {
		Tuck t = new Tuck(30,4,5);
		t.run();
		t.brake();
		Plane p = new Plane(30);
		p.run();
		p.fly();
	}
}
