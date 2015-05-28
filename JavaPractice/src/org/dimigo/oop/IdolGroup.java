/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *&{package_name}
 *    |_IdolGroup
 *
 *1. 개요 : 
 *2. 작성일 : 2015. 5. 28.
 *</pre>
 * @author   : 김정수
 * @version  : 1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[]idolGroup={"빅뱅","2NE1","걸스데이"};
		String[][]members={
				{"GD","태양","대성","탑","승리"},
				{"CL","산다라박","박봄","민지"},
				{"유라","해리","소진","민아"}
				};
		for(int i=0;i<3;i++){
			System.out.println("<<"+idolGroup[i]+"멤버>>");
			for(String arr : members[i]){
				System.out.println(arr);
			}
			System.out.println();
		}
		System.out.println();
		}
	}
