/**
 * 
 */
package org.dimigo.thread;

import java.util.Random;

/**
 * <pre>
 *&{package_name}
 *    |_Runner
 *
 *1. 개요 : 
 *2. 작성일 : 2015. 11. 4.
 *</pre>
 * @author   : 김정수
 * @version  : 1.0
 */
public class Runner2 extends Thread{
	private String name;
	
	public Runner2(String name){
		this.name=name;
	}
	public void run(){
		System.out.println(name+"출발");
	for(int i=100;i>0;i-=10){
		System.out.println(name+i+"미터");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}System.out.println(name+"도착");
	}
}
