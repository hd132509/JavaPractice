/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 *&{package_name}
 *    |_Question
 *
 *1. 개요 : 
 *2. 작성일 : 2015. 5. 11.
 *</pre>
 * @author   : 김정수
 * @version  : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String singer="아이유";
		String actor="박수진";
		String subject="자바";
		Scanner scanner=new Scanner(System.in);
		System.out.println("가장 좋아하는 가수는?");
		String answer=scanner.nextLine();
		if(answer.equals(singer)){
			System.out.println("정답입니다.");
		}else System.out.println("틀렸습니다.");
		System.out.println("가장 좋아하는 배우는?");
		String answer1=scanner.nextLine();
		if(answer1.equals(actor)){
			System.out.println("정답입니다.");
		}else System.out.println("틀렸습니다.");
		System.out.println("가장 좋아하는 과목은?");
		String answer2=scanner.nextLine();
		if(answer2.equals(subject)){
			System.out.println("정답입니다.");
		}else System.out.println("틀렸습니다.");
	}

}
