/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 *&{package_name}
 *    |_Figure
 *
 *1. 개요 : 
 *2. 작성일 : 2015. 8. 12.
 *</pre>
 * @author   : 김정수
 * @version  : 1.0
 */
public class Figure {
	private int centerX;
	private int centerY;
	
	
	public Figure(int centerX,int centerY){
		this.centerX=centerX;
		this.centerY=centerY;
	}
	protected double calcArea(){
		return 0.0;
	}
	protected void printCenter(){
		System.out.println("중심좌표 : "+centerX+"."+centerY);
	}
	public void moveFigure(int x,int y){
		centerX=centerX+x;
		centerY=centerY+y;
	}
}
