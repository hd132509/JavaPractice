/**
 * 
 */
package org.dimigo.oop;
import java.util.Scanner;
/**
 * <pre>
 *&{package_name}
 *    |_Score
 *
 *1. 개요 : 
 *2. 작성일 : 2015. 5. 14.
 *</pre>
 * @author   : 김정수
 * @version  : 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("국어 점수 입력 =>");
		int kor=scanner.nextInt();
		System.out.println("수학 점수 입력 =>");
		int mat=scanner.nextInt();
		System.out.println("영어 점수 입력 =>");
		int eng=scanner.nextInt();
		StringBuilder a=new StringBuilder();
		a.append("<<점수출력>>\n")
		.append("국어점수 : "+kor+"\n")
		.append("수학점수 : "+mat+"\n")
		.append("영어점수 : "+eng+"\n")
		.append("총점 : "+(kor+mat+eng)+"점\n")
		.append("평균 : "+String.format("%.1f",(kor+mat+eng)/3.0)+"점\n");
		
	    System.out.println(a.toString());
		

	}

}
