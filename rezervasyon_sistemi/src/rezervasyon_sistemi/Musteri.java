package rezervasyon_sistemi;

public class Musteri 
{
	  public String Ad;
	  public String Soyad;
	  public String Yaş;
	  public String KimlikNo;
	  public String TelNo;
	  public int Cinsiyet;
	  public int Engel;
	  
	  public Musteri(String ad, String soyad, String yas, String kimlikNo, String telNo, int cinsiyet, int engel) 
	  {
		  this.Ad = ad;
	      this.Soyad = soyad;
	      this.Yaş = yas;
	      this.KimlikNo = kimlikNo;
	      this.TelNo = telNo;
	      this.Cinsiyet = cinsiyet;
	      this.Engel = engel;
	  }
}
