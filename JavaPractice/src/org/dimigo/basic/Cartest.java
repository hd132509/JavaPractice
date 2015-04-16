/**
 * 
 */
package org.dimigo.basic;

import org.dimigo.basic.Car;
import org.dimigo.basic.Car2;

/**
 * <pre>
 *&{package_name}
 *    |_Cartest
 *
 *1. 개요 : 
 *2. 작성일 : 2015. 4. 13.
 *</pre>
 * @author   : 김정수
 * @version  : 1.0
 */
public class Cartest {
	public static void main(String[] args){
		Car3 Car= new Car3("현대자동차","제네시스","검정",225,50000000);
		Car3 Car2=new Car3("기아자동차","K7","흰색",246);
		Car3 Car3=new Car3("삼성자동차","SN7","회색");
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : "+Car.company());
		System.out.println("모델명 : "+Car.model());
		System.out.println("색상 : "+Car.color());
		System.out.println("최대속도 : "+Car.maxSpeed()+"km");
		System.out.println("가격 : "+String.format("%d",Car.price())+"원");
		/*
		Car.setcompany("기아자동차");
		Car.setmodel("K7");
		Car.setcolor("흰색");
		Car.setmaxSpeed(246);
		Car.setprice(40000000);
		*/
		System.out.println("제조사명 : "+Car2.company());
		System.out.println("모델명 : "+Car2.model());
		System.out.println("색상 : "+Car2.color());
		System.out.println("최대속도 : "+Car2.maxSpeed()+"km");
		System.out.println("가격 : "+String.format("%d",Car2.price())+"원");
		/*
		Car.getcompany("삼성자동차");
		Car.getmodel("SN7");
		Car.getcolor("회색");
		Car.getmaxSpeed(200);
		Car.getprice(38000000);
		*/
		System.out.println("제조사명 : "+Car3.company());
		System.out.println("모델명 : "+Car3.model());
		System.out.println("색상 : "+Car3.color());
		System.out.println("최대속도 : "+Car3.maxSpeed()+"km");
		System.out.println("가격 : "+String.format("%d",Car3.price())+"원");
	}
}
