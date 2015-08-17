/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 *&{package_name}
 *    |_Rectangle
 *
 *1. 개요 : 
 *2. 작성일 : 2015. 8. 12.
 *</pre>
 * @author   : 김정수
 * @version  : 1.0
 */
public class Rectangle extends Figure {
	private int width;
	private int height;

	public Rectangle (int width,int heigh){
		super(0,0);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int centerX,int centerY,int width,int height){
		super(centerX,centerY);
		this.width=width;
		this.height=height;
	}
	
	protected double calcArea(){
		return width*height;
	}
}
