/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 *&{package_name}
 *    |_FigureTest
 *
 *1. 개요 : 
 *2. 작성일 : 2015. 8. 17.
 *</pre>
 * @author   : 김정수
 * @version  : 1.0
 */
public class FigureTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle c=new Circle(5);
		Triangle t=new Triangle(10,10,5,8);
		Rectangle r=new Rectangle(20,20,5,8);
		
		System.out.println("원의 넓이"+c.calcArea());
		System.out.println("삼각형의 넓이"+t.calcArea());
		System.out.println("사각형의 넓이"+r.calcArea());
		c.printCenter();
		t.printCenter();
		r.printCenter();
		c.moveFigure(5, 5);
		t.moveFigure(5, 5);
		r.moveFigure(5, 5);
		System.out.println("--중심좌표 이동(x,y축5씩)");
		c.printCenter();
		t.printCenter();
		r.printCenter();
	}

}
