# ucak_rezervasyon

Java Projesi/Uçak Rezervasyon Sistemi

Bu projede Java dilinde uçak rezervasyon sistemi modellemesi yaptık. Müşteriler, seyahat edecekleri lokasyon ve seçecekleri tarihe göre uçuşlarını rezerve edebilir ve görebilirler. Projemiz Ucak, Lokasyon, Musteri, MusteriOlusturma, LokasyonOlusturma, Rezervasyon, UcakOlusturma, UcusOlusturma ve Program sınıflarından oluşmaktadır. Uçak Rezervasyon Sistemi Modellemenin konstrüksiyon yapısı şu şekildedir:

1)Ucak sınıfı, uçak ile ilgili bilgileri içerir.

2)UcakOlusturma sınıfı, uçak hakkındaki bilgileri tanımlar. Random bir sayıda uçak bilgilerini verir.

3)Lokasyon sınıfı, ülke,şehir ve havaalanı özelliklerini gösterir.

4)LokasyonOlusturma sınıfı, seyahat edecek konum bilgilerini oluşturur.

5)UcusOlusturma sınıfı, tüm bilgileri alır.

6)Musteri sınıfı, müşteri bilgilerini tutar.

7)MusteriOlusturma sınıfı, müşteri bilgilerini konsola yazdırır.

8)Rezervasyon sınıfı, ücret bilgilerini tutar. Uçuş Lokasyonuna ait bilet ücretini gösterir.

9)Program sınıfı, tüm sınıfları bir araya getirerek çalıştırılmasını ve girdiğimiz tüm bilgileri Console uygulamasına yansıtır.

Bu projeyi çalıştırmak için, klasörde yer alan Program.java dosyasını açabilirsiniz. Ardından uygulamayı çalıştırıp başlatabilirsiniz. Müşteri adı, soyadı, yaşı, kimlik numarası, telefon numarası, cinsiyeti, engel durumu, lokasyon ve tarih bilgilerini girmesini sağlayan arayüz görünür. Müşteri ile ilgili bilgiler girilir ve karşımıza seçmemiz için Uçuş Lokasyonları çıkar. Uçuş Lokasyonlarını Console'da gözükmesi için 'Konum.txt' den veri çekme işlemini uyguladık. Bu sebepten dolayı 'Konum.txt' dosyasını silmemeniz gerekmektedir. Uçuş Lokasyonu seçtikten sonra tarih girilir ve uçuş rezervasyon bilgileri Console üzerinde ekrana yazdırılır.
