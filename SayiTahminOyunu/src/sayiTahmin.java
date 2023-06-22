import java.util.Random;
import java.util.Scanner;

public class sayiTahmin {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	Random random = new Random();
	//0 ile 100 arasında rastgele olan sayıyı bulmaya çalışacak
	int deger = random.nextInt(0,100); 
	
	
	
	
	for(int i=0; i<99;i++) {
		System.out.println("Lütfen Bir Sayı Giriniz : ");
		int sayi = scanner.nextInt();
		if(deger == sayi) {
			System.out.println("Tebrikler Bildiniz..");
			System.out.println("Deneme Sayınız:" + (i+1));
			break;
			
		}
		else if(sayi<deger) {
			System.out.println("Sayınızı Arttırın..");
			System.out.println("Deneme Sayınız:" + (i+1));
		}
		
		else if(sayi>deger) {
			System.out.println("Sayınızı Azaltın..");
			System.out.println("Deneme Sayınız:" + (i+1));
	}
		else {
			System.out.println("Oyunu Kaybettiniz..");
		}
	
	
	
	
}
}
}
