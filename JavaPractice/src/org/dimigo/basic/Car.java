/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 *&{package_name}
 *    |_Car
 *
 *1. 개요 : 
 *2. 작성일 : 2015. 4. 6.
 *</pre>
 * @author   : 김정수
 * @version  : 1.0
 */
public class Car {
		private String company="현대자동차";
		private String model="제네시스";
		private String color="검정색";
		private int maxSpeed=225;
		private int price=50000000;
public String company(){
	return company;
}
public String  model(){
	return model;
}
public String color(){
	return color;
}
public int maxSpeed(){
	return maxSpeed;
}
public int price(){
	return price;
}
public void setcompany(String newcompany){
	company=newcompany;
}
public void setmodel(String newmodel){
	model=newmodel;
}
public void setcolor(String newcolor){
	color=newcolor;
}
public void setmaxSpeed(int newmaxSpeed){
	maxSpeed=newmaxSpeed;
}
public void setprice(int newprice){
	price=newprice;
}
public void getcompany(String newcompany){
	company=newcompany;
}
public void getmodel(String newmodel){
	model=newmodel;
}
public void getcolor(String newcolor){
	color=newcolor;
}
public void getmaxSpeed(int newmaxSpeed){
	maxSpeed=newmaxSpeed;
}
public void getprice(int newprice){
	price=newprice;
}
}
