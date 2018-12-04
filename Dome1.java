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
		System.out.println("------------------");
		System.out.println("   ,--.       <__)");
		System.out.println("   `- |________7");
		System.out.println("      |`.      |\\");
		System.out.println("   .--|. \\     |.\\--.");
		System.out.println("  /   j \\ `.7__j__\\  \\");
		System.out.println(" |    o  | (o)____o)  |");
		System.out.println("  \\     /   j  \\     /");
		System.out.println("   `---'        `---'");
		System.out.println("---------------------");
	}
}
