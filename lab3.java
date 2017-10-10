package okanh4l1;
import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
		//System.out.println(1.0 - 0.9);
		
		int number1= 1;
		int number2 = 2;
		double average1 = (number1+number2) /2;
		double average2 = (number1+number2) /2.0;
		System.out.println(" averge1 " + average1 + ", average2 "+ average2);


		double senelikfaiz;
		double borcMiktari;
		int kacsene;
		double aylikfaiz;
		double toplamBorc;
		double aylikOdeme;
		
		//Scanner
		Scanner input = new Scanner (System.in);
		System.out.print("Faiz oranini girin ");
		senelikfaiz = input.nextDouble();
		System.out.print("Kac sene borc istersiniz ");
		kacsene = input.nextInt();
		System.out.print("Kac para borc istersiniz ");
		borcMiktari = input.nextDouble();
		
		aylikfaiz = senelikfaiz / 1200;
		
		aylikOdeme = borcMiktari * aylikfaiz / (1 
				- 1 / Math.pow(1 + aylikfaiz, kacsene * 12));
		toplamBorc = aylikOdeme * kacsene *12;

		System.out.println("Aylik odemeniz = " + aylikOdeme);
		System.out.println("Toplam borcunuz = "+ toplamBorc );
	
		System.out.println("Aylik odemeniz = " + String.format("%.2f", aylikOdeme) );
		System.out.println("Toplam borcunuz = "+ String.format("%.2f", toplamBorc) );
		System.out.println("Aylik odemeniz = " + (int) (aylikOdeme * 100)/100.0);
		System.out.println("Toplam borcunuz = "+ (int) (toplamBorc * 100)/100);

		
	}

}
