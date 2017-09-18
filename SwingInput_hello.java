import javax.swing.JOptionPane;
public class SwingInput_hello {
	public static void main (String args[])
	{
		 String isim=JOptionPane.showInputDialog("Lutfen isminizi giriniz :");
		 //Information window
		 JOptionPane.showMessageDialog(null,"Java Sinifina Hos Geldiniz! "+isim,
		 "Hosgeldiniz1SW programi",JOptionPane.INFORMATION_MESSAGE);
		 // error window
		 JOptionPane.showMessageDialog(null,"Java Sinifina Hos Geldiniz! "+isim,
				 "Hosgeldiniz1SW programi",JOptionPane.ERROR_MESSAGE);
		// warning window
		 JOptionPane.showMessageDialog(null,"Java Sinifina Hos Geldiniz! "+isim,
				 "Hosgeldiniz1SW programi",JOptionPane.WARNING_MESSAGE);
		// plain window
				 JOptionPane.showMessageDialog(null,"Java Sinifina Hos Geldiniz! "+isim,
						 "Hosgeldiniz1SW programi",JOptionPane.PLAIN_MESSAGE);
		 
		 
		 System.exit(0);
	 }
}
