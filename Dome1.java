package TWO_TEST;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Dome1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����λ����");
//		int num = input.nextInt();
//		String s = num+"";
		Integer i = input.nextInt();
		StringBuffer s = new StringBuffer(i.toString());
		System.out.println("λ����"+s.length());
		System.out.println("��ת��"+s.reverse());
	}
}
