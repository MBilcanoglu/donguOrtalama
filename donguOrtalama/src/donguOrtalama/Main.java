package donguOrtalama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int deger,topla=0,adet=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Değer giriniz: ");
		deger=scan.nextInt();
		
		for(int i=0; i<=deger; i++) {
			if(i%3==0&&i%4==0) {
				topla+=i;
				adet++;
			}
		}
		
		System.out.println("Ortalama: "+(topla/adet));
	}

}
