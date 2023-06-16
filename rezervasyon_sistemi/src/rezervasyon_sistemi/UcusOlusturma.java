package rezervasyon_sistemi;
import java.util.*;
public class UcusOlusturma
{
	public String Musteri;
	public String Ucak;
	public String Lokasyon;
    public String Tarih;

	public UcusOlusturma(String Ad, String Soyad)
	{
	    Musteri = Ad + " " + Soyad;

	    UcakOlusturma ucakOlustur = new UcakOlusturma();
	    Ucak = ucakOlustur.Model;

	    System.out.println("\nEtkin Ucuslar: ");
	    LokasyonOlusturma lokasyonOlusturma = new LokasyonOlusturma();

	    int lSayac = 1;
	    for (String item : lokasyonOlusturma.LokasyonList)
	    {
	        System.out.println(lSayac + ". Lokasyon => " + item);
	        lSayac++;
	    }

	    while (true)
	    {
	        System.out.print("Ucus Lokasyon Seciniz: ");
	        Scanner input = new Scanner(System.in);
			int secim = input.nextInt();

			if (secim >= 1 && secim <= lSayac - 1)
			{
			    Lokasyon = lokasyonOlusturma.LokasyonList.get(secim - 1);
			    break;
			}
	    }
	    
	    System.out.println("\nTarih Giriniz (gün/ay/yil): ");
        Scanner scanner = new Scanner(System.in);
        Tarih = scanner.nextLine();
	}
	
	  public String UcusDondur()
	    {
	        Rezervasyon rezervasyon = new Rezervasyon();

	        String Temp = "\nSayin: " + Musteri + "\nUçaginiz: " + Ucak + "\nLokasyonunuz: " + Lokasyon + "\nUçuş Tarihiniz: " + Tarih + "\nBilet Tutariniz: " + rezervasyon.ucret;
	        return Temp;
	    }
}	