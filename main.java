package uts;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s;
		Scanner ma= new Scanner (System.in);
		
		try{
			System.out.print("isikan suhu dalam celcius= ");
			s=ma.nextDouble();
			suhu sh = new suhu(s);
			System.out.println("Kelvin ="+sh.kelvin()+"K");
			System.out.println("Farenhet ="+sh.farenhet()+"F");
			
		
			
		}catch(Exception e){
			System.out.println("salah");
		}
	}
}
		
		

