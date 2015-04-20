/**
 * 
 */
package org.dimigo.oop;

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
public String getcompany(){
	return company;
}
public String getmodel(){
	return model;
}
public String getcolor(){
	return color;
}
public int getmaxSpeed(){
	return maxSpeed;
}
public int getprice(){
	return price;
}
/**
 * @return the color
 */
public String getColor() {
	return color;
}
/**
 * @param color the color to set
 */
public void setColor(String color) {
	this.color = color;
}
}
