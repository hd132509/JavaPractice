/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *&{package_name}
 *    |_SnackTest
 *
 *1. 개요 : 
 *2. 작성일 : 2015. 5. 18.
 *</pre>
 * @author   : 김정수
 * @version  : 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snack[]snack=new Snack[]{
				new Snack("새우깡","농심",1100,2),
				new Snack("콘칩","크라운",1200,1),
				new Snack("허니버터칩","해태",1500,4)
		};
		int sum=0;
		for(int i=0;i<snack.length;i++){
			snack[i].printSnack();
			sum=snack[i].calcPrice();
		}
		System.out.println("총 금액:"+String.format("%,d", sum));
	}

}
