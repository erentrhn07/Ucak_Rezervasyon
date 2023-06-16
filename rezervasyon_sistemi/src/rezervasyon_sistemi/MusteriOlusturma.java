package rezervasyon_sistemi;
import java.util.Scanner;

public class MusteriOlusturma {
    public String Ad;
    public String Soyad;
    public String Yaş;
    public String KimlikNo;
    public String TelNo;
    public int Cinsiyet;
    public int Engel;

    public Musteri musteri() {
        Scanner input = new Scanner(System.in);

        System.out.print("Adinizi Giriniz: ");
        Ad = input.nextLine();

        System.out.print("Soyadinizi Giriniz: ");
        Soyad = input.nextLine();

        System.out.print("Yasinizi Giriniz: ");
        Yaş = input.nextLine();

        System.out.print("KimlikNo Giriniz: ");
        KimlikNo = input.nextLine();

        System.out.print("TelNo Giriniz: ");
        TelNo = input.nextLine();

        while (true) {
            String Temp = "";

            System.out.print("Cinsiyetinizi Giriniz (E/K): ");
            Temp = input.nextLine().toLowerCase();

            if (Temp.equals("e")) {
                Cinsiyet = 1;
                break;
            } else if (Temp.equals("k")) {
                Cinsiyet = 2;
                break;
            } else {
                System.out.println("Hatalı Cinsiyet Değeri");
            }
        }

        while (true) {
            String Temp = "";

            System.out.print("Engel Durumunuz Var mı? (E/H): ");
            Temp = input.nextLine().toLowerCase();

            if (Temp.equals("e")) {
                Engel = 1;
                break;
            } else if (Temp.equals("h")) {
                Engel = 2;
                break;
            } else {
                System.out.println("Hatalı Engel Durumu");
            }
        }

        Musteri musteri = new Musteri(Ad, Soyad, Yaş, KimlikNo, TelNo, Cinsiyet, Engel);

        return musteri;
    }
}
