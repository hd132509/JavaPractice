/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *&{package_name}
 *    |_FamilyMember
 *
 *1. 개요 : 
 *2. 작성일 : 2015. 6. 12.
 *</pre>
 * @author   : 김정수
 * @version  : 1.0
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember(String memberName){
		this.memberName=memberName;
		memberCnt++;
	}
	public String getMemberName(){
		return memberName;
	}
	public static void printMemberCnt(){
		System.out.println("가족 총 인원수 : " + memberCnt);
	}
}
