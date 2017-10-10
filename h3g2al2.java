package h3g2al2;
import java.util.Scanner;

public class h3g2al2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner benimokuyucum = new Scanner(System.in);
		
		 System.out.print("lutfen a sayisini giriniz : ");
		 int a_sayisi = benimokuyucum.nextInt ();
		 System.out.println("a sayisi = " + a_sayisi);
		 System.out.print("lutfen b sayisini giriniz : ");
		 int b_sayisi;
		 b_sayisi = benimokuyucum.nextInt();
		 System.out.println("b sayisi = " + b_sayisi);
		 
		 // asagidaki satir run time hatasina ornektir
		 //System.out.println("sonuc sudur " + 1/0);

		 /*
		 System.out.println("bir Celcius derecesi girin: " );
		 int celc = benimokuyucum.nextInt ();
		 double fah = ((9.0/5) * celc + 32);
		 System.out.println("fah degeri sudur : "+ fah);
		 */
	}

}
