package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name="아이유";
		boolean gender=true;
		int age=23;
		double height=161.8;
		float weight=44.3f;
		char blood='A';
		System.out.println("<<아이유프로필>>");
		if(gender){
			System.out.println("여자");
		}else{
			System.out.println("남자");
		}
		System.out.println(name);
		System.out.printf("%d세\n",age);
		System.out.printf("%.1fcm\n",height);
		System.out.printf("%.1fkg\n",weight);
		System.out.printf("%c형\n",blood);	
	}
}
