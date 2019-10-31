package Medipol.Medipol2;
import java.util.*;
import java.math.*;

public class selen {
	public static String topla (String sayi1, String sayi2) {
		return new BigDecimal(sayi1)
				.add(new BigDecimal(sayi2))
				.toPlainString();
	}
	public static void main(String[]args) {
		Scanner konsolOku= new Scanner(System.in);
		System.out.print("Sayi 1 giriniz:");
		String sayi1 = konsolOku.nextLine();
		System.out.print("Sayi 2 giriniz:");
		String sayi2 = konsolOku.nextLine();
		String sonuc = selen.topla(sayi1, sayi2);
		System.out.printf("%s + %s = %s", sayi1, sayi2, sonuc);
	}

}
