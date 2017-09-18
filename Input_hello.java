import java.io.*;
public class Input_hello {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader cin=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("isminizi giriniz : ");
		 String isim=new String(cin.readLine());
		 System.out.println("Java Sinifina Hos Geldiniz! "+isim);
		 cin.close();
	}

}
