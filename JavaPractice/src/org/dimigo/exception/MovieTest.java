/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 *&{package_name}
 *    |_MovieTest
 *
 *1. 개요 : 
 *2. 작성일 : 2015. 9. 21.
 *</pre>
 * @author   : 김정수
 * @version  : 1.0
 */
public class MovieTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			Movie[]movies={
					new Movie("앤트맨",12),new Movie("사도",12),new Movie("베테랑",15)
			};
			int age=13;
			for(Movie movie : movies){
				buyTicket(movie,age);
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void buyTicket(Movie movie,int age) throws Exception{
		if(movie.getLimitAge()<age){
			System.out.println(movie.getTitle()+"즐감여");
		}else throw new AgeCheckException(movie);
	}
}
