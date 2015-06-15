/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *&{package_name}
 *    |_PiggyBank
 *
 *1. 개요 : 
 *2. 작성일 : 2015. 6. 12.
 *</pre>
 * @author   : 김정수
 * @version  : 1.0
 */
public class PiggyBank {
	private static int balance;
	
	public static void putMoney(FamilyMember member,int amount){
		System.out.println(member.getMemberName() + " " + amount + "원 넣음");
		balance += amount;
	}
	public static void printBalnce(){
		System.out.println("총금액 : "+balance+"원");
	}
}
