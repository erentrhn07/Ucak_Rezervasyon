package rezervasyon_sistemi;
import java.util.Scanner;
public class Program
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Ucak Rezervasyon Sistemine Hos Geldiniz.\n");

          MusteriOlusturma musteriOlusturma = new MusteriOlusturma();
          Musteri musteri = musteriOlusturma.musteri();

          UcusOlusturma ucusOlusturma = new UcusOlusturma(musteri.Ad, musteri.Soyad);
          System.out.print(ucusOlusturma.UcusDondur());

          System.out.print("\n\nIyi Yolculuklar Dileriz.");

          input.nextLine();
    }
}