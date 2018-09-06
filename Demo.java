package cn.xh.demo01;

public class Demo {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 5;
		System.out.println("交换前：num1="+num1+"\tnum2="+num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("交换后：num1="+num1+"\tnum2="+num2);
	}
}
