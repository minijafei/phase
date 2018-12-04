package TWO_TEST;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Dome1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个五位数：");
//		int num = input.nextInt();
//		String s = num+"";
		Integer i = input.nextInt();
		StringBuffer s = new StringBuffer(i.toString());
		System.out.println("位数："+s.length());
		System.out.println("反转："+s.reverse());
	}
}
