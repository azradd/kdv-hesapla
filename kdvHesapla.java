package examples.patika;/*
kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;

Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */

import java.util.Scanner;

public class kdvHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tutar giriniz:");
        double tutar = input.nextInt();

        double kdvli = 0;               // KÜSÜRATI DOĞRU HESAPLAYABİLMEK İCİN DOUBLE CİNSİNDEN*
        double kdv = 0;

        if ((tutar > 0)&&(tutar < 1000)){
            kdv = tutar * 18 / 100;
            kdvli = tutar + kdv;
        }else{
            kdv = tutar * 8 / 100;
            kdvli = tutar + kdv;
        }

        System.out.println("KDVsiz fiyat: " + tutar);
        System.out.println("KDVli fiyat: " + kdvli);
        System.out.println("KDV tutarı: " + kdv);
    }
}

