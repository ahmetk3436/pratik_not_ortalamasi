package pratik_not_ortalamasi;

import java.util.Scanner;

public class Main {
	static float matematik,fizik,kimya,türkce,tarih,müzik;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Matematik notunu giriniz : ");
		matematik = scan.nextFloat();
		
		System.out.println("Fizik notunu giriniz : ");
		fizik = scan.nextFloat();
		
		System.out.println("Kimya notunu giriniz : ");
		kimya = scan.nextFloat();
		
		System.out.println("Türkçe notunu giriniz : ");
		türkce = scan.nextFloat();
		
		System.out.println("Tarih notunu giriniz : ");
		tarih = scan.nextFloat();
		
		System.out.println("Müzik notunu giriniz : ");
		müzik = scan.nextFloat();
		scan.close();
		
		int sonuc = (int)(matematik + fizik + kimya + türkce + tarih + müzik) / 6;
		System.out.println(sonuc ==  60 ? "Sınıfı geçti" : "Sınıfta kaldı");
	}

}
