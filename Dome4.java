package TWO_TEST;

interface Vehicle{
	void strat(int a);
	void stop(int a);
}

class Bike implements Vehicle{
	public void strat(int a) {
		System.out.println("Bike(start)----------"+a+"-----------");
	}
	public void stop(int a) {
		System.out.println("Bike(stop)----------"+a+"-----------");
	}
}
class Bus implements Vehicle{
	public void strat(int a) {
		System.out.println("Bus(start)----------"+a+"-----------");
	}
	public void stop(int a) {
		System.out.println("Bus(stop)----------"+a+"-----------");
	}
}

public class Dome4 {
	public static void main(String[] args) {
		Bike bike = new Bike();
		Bus bus = new Bus();
		bike.strat(20);
		bike.stop(10);
		bus.strat(20);
		bus.stop(10);
	}
}
