/**
 * 
 */
package org.dimigo.oop;

import org.dimigo.basic.Car;


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
		Car Car= new Car();
		Car Car2=new Car();
		Car Car3=new Car();
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : "+Car.company());
		System.out.println("모델명 : "+Car.model());
		System.out.println("색상 : "+Car.color());
		System.out.println("최대속도 : "+Car.maxSpeed()+"km");
		System.out.println("가격 : "+String.format("%d",Car.price())+"원");
		Car.setcompany("기아자동차");
		Car.setmodel("K7");
		Car.setcolor("흰색");
		Car.setmaxSpeed(246);
		Car.setprice(40000000);
		System.out.println("제조사명 : "+Car2.getcompany());
		System.out.println("모델명 : "+Car2.getmodel());
		System.out.println("색상 : "+Car2.getcolor());
		System.out.println("최대속도 : "+Car2.getmaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%d",Car2.getprice())+"원");
		Car.setcompany("삼성자동차");
		Car.setmodel("SN7");
		Car.setcolor("회색");
		Car.setmaxSpeed(200);
		Car.setprice(38000000);
		System.out.println("제조사명 : "+Car3.company());
		System.out.println("모델명 : "+Car3.model());
		System.out.println("색상 : "+Car3.color());
		System.out.println("최대속도 : "+Car3.maxSpeed()+"km");
		System.out.println("가격 : "+String.format("%d",Car3.price())+"원");
	}
}
