package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int type = 1;
		int distance = 10;
		int money=(distance-1)/10;
		System.out.println("<<고속도로통행료계산>>");
		System.out.println("거리 : "+distance+"km");
		if(type==1){
			System.out.println("차량 : 고속버스");
			System.out.println("통행료 : "+(850+300*money)+"원");
		}if(type==2){
		    System.out.println("차량 : 경차");
			System.out.println("통행료 : "+(300+200*money)+"원");
		}if(type==3){
			System.out.println("차량 : 그외");
			System.out.println("통행료 : "+(600+200*money)+"원");
		}
	}
	}
