package TWO_TEST;

import java.util.Arrays;
import java.util.Scanner;

public class Dome2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] in = new int[7];
		int[] nums = new int[7];
		int random,count=0;
		while(nums[nums.length-1]==0)
		{
			random = (int)(Math.random()*30+1);
			for(int i=0;i<nums.length;i++) {
				if(nums[i]==random)
					break;
				if(nums[i]==0) {
					nums[i] = random;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		for(int i=1;i<=in.length;i++) {
			System.out.print("请输入第"+i+"位数：");
			in[i-1] = input.nextInt();
		}
		for(int a:in) {
			for(int b:nums) {
				if(a==b)
					count++;
			}
		}
		switch(count) {
			case 7:System.out.println("你中了"+count+"个号\n获得了一等奖");break;
			case 6:System.out.println("你中了"+count+"个号\n获得了二等奖");break;
			case 5:System.out.println("你中了"+count+"个号\n获得了三等奖");break;
			default:System.out.println("谢谢参与！");
		}
		input.close();
	}
}
