package org.dimigo.basic;

public class Operater {

	public static void main(String[] args) {
		int a=9;
		int b=10;
		double h=5.8;
		int a1=9;
		double h1=5.4;
		double s1=((a+b)*h)/2;
		double s2=a1*h1;
		
		System.out.println("<<도형의 넓이 비교>>");
		System.out.println("사다리꼴 넓이 : "+s1);
		System.out.println("평행사변형 넓이 : "+s2);
		if(s1>s2){
			System.out.printf("사다리꼴이 평행사변형 보다%.1f더큽니다.\n",s1-s2);
		}else if(s1<s2){
			System.out.printf("평행사변형이 사다리꼴 보다 %.1f더큽니다.\n",s2-s1);
		}else {
			System.out.println("사다리꼴과 평행사변형의 넓이는 같습니다.");
		}
	}

}
