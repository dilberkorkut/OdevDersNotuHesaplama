import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Girilen ders notlari 0-100 arasinda degilse ortalamaya dahil edilmeyecektir.
        Ortalamaya katilan ders sayisi da degismis olacaktir.*/

        int mat, fiz, kim, tur, muz;
        int toplamNot = 0;
        int dersSayisi =0;


        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: " );
        mat = input.nextInt();
        if(mat >= 0 && mat <= 100){
            toplamNot += mat;
            dersSayisi ++;
        }else{
            System.out.println("Gecersiz not! Ortalamaya dahil edilmeyecektir.");
        }

        System.out.print("Fizik notunuzu giriniz: " );
        fiz = input.nextInt();
        if(mat >= 0 && fiz <= 100){
            toplamNot += fiz;
            dersSayisi ++;
        }else{
            System.out.println("Gecersiz not! Ortalamaya dahil edilmeyecektir.");
        }

        System.out.print("Kimya notunuzu giriniz: " );
        kim = input.nextInt();
        if(kim >= 0 && kim <= 100){
            toplamNot += kim;
            dersSayisi ++;
        }else{
            System.out.print("Gecersiz not! Ortalamaya dahil edilmeyecektir.");
        }

        System.out.print("Turkce notunuzu giriniz: " );
        tur = input.nextInt();
        if(tur >= 0 && tur <= 100){
            toplamNot += tur;
            dersSayisi ++;
        }else{
            System.out.println("Gecersiz not! Ortalamaya dahil edilmeyecektir.");
        }

        System.out.print("Muzik notunuzu giriniz: " );
        muz = input.nextInt();
        if(muz >= 0 && muz <= 100){
            toplamNot += muz;
            dersSayisi ++;
        }else{
            System.out.println("Gecersiz not! Ortalamaya dahil edilmeyecektir.");
        }

        double avarage = toplamNot / dersSayisi ;
        if(avarage <= 55) {
            System.out.println("Sinifta kaldiniz! Ortamaniz: " + avarage);
        }else{
            System.out.println(" Tebrikler! Sinifi gectiniz. Ortalamaniz: " + avarage);
        }


    }
}