/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 *&{package_name}
 *    |_Race
 *
 *1. 개요 : 
 *2. 작성일 : 2015. 11. 4.
 *</pre>
 * @author   : 김정수
 * @version  : 1.0
 */
public class Race {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("main thread start");
		Thread t1=new Runner("a");
		Thread t2=new Runner("b");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");
	}

}
