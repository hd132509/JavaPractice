/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 *&{package_name}
 *    |_SmartPhoneTest
 *
 *1. 개요 : 
 *2. 작성일 : 2015. 8. 31.
 *</pre>
 * @author   : 김정수
 * @version  : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	SmartPhone[] phonelist = {new iPhone("iPhone 6","애플",700000),new Galaxy("GalaxyS6","삼성",650000)};
		for(SmartPhone phone : phonelist){
			System.out.println(phone.toString());
			phone.turnOn();
			phone.pay();
			phone.useSpecialFunction();
			phone.turnOff();
		}
	}
}
