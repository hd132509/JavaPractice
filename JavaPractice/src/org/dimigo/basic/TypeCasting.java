package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		long salary=1700000;
		int alba=3;
		int market=1500;
		long yunbong=salary*12*3*1500;
		
		System.out.printf("<<디미베네 연간 인건비>>\n");
		System.out.printf("월 평균 급여 : %,d원\n",salary);
		System.out.printf("점포 내 직원 수 : %d명\n",alba);
		System.out.printf("점포 수 : %,d개\n",market);
		System.out.print("\n");
		System.out.printf("연간 인건비 : %,d원",yunbong);
	}

}
