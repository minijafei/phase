package TWO_TEST;

class classroom{
	private double wide;
	private double grow;
	Desk desk = new Desk();
	//���췽��-------------------------------------------------
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
	//�ڲ���---------------------------------------------------
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
			return "���� [�ȸ���=" + leg + ", �߶�=" + high + "]";
		}
		
	}
	@Override
	public String toString() {
		return "���� [���ҿ�=" + wide + ", ���ҳ�=" + grow + ", " + desk + "]";
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
