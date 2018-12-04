package TWO_TEST;

class classroom{
	private double wide;
	private double grow;
	Desk desk = new Desk();
	//构造方法-------------------------------------------------
	public classroom(double wide, double grow) {
		super();
		this.wide = wide;
		this.grow = grow;
	}
	public classroom() {}
	//set---get----------------------------------------------
	public double getWide() {
		return wide;
	}
	public void setWide(double wide) {
		this.wide = wide;
	}
	public double getGrow() {
		return grow;
	}
	public void setGrow(double grow) {
		this.grow = grow;
	}
	//内部类---------------------------------------------------
	class Desk{
		private int leg;
		private double high;
		public Desk(int leg, double high) {
			super();
			this.leg = leg;
			this.high = high;
		}
		public Desk() {
			super();
		}
		public int getLeg() {
			return leg;
		}
		public void setLeg(int leg) {
			this.leg = leg;
		}
		public double getHigh() {
			return high;
		}
		public void setHigh(double high) {
			this.high = high;
		}
		@Override
		public String toString() {
			return "桌子 [腿个数=" + leg + ", 高度=" + high + "]";
		}
		
	}
	@Override
	public String toString() {
		return "教室 [教室宽=" + wide + ", 教室长=" + grow + ", " + desk + "]";
	}
	
}

public class Dome6 {
	public static void main(String[] args) {
		classroom room = new classroom(23.7,67.9);
		room.desk.setLeg(4);
		room.desk.setHigh(5.6);
		System.out.println(room.desk);
		System.out.println(room);
	}
}
