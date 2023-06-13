package project.java;
import java.util.Scanner;
import java.time.LocalDateTime;


public class proje {
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime tarihveSaat1 = LocalDateTime.of(2024, 11, 8, 10, 30, 0);
        LocalDateTime tarihveSaat2 = LocalDateTime.of(2024, 11, 19, 10, 30, 0);
        LocalDateTime tarihveSaat3 = LocalDateTime.of(2024, 11, 14, 10, 30, 0);
        LocalDateTime tarihveSaat4 = LocalDateTime.of(2024, 11, 25, 10, 30, 0);
        
        Ucak ucak = new Ucak();
        ucak.ucakModel = "yolcu ucagi";
        ucak.seriNo =  "326376" ;
        ucak.yolcuKapasitesi = 250;
        ucak.kackisilik = 200;
        ucak.bakimTarihi = "09, 11, 2023";
        ucak.ucakRengi = "beyaz";

        Musteri musteri1 = new Musteri();
        System.out.println("Musterinin adi soyadi:");
        musteri1.AdSoyad = scanner.nextLine();
        System.out.println("musterinin cinsiyeti)");
        musteri1.Cinsiyet = scanner.nextLine();
        System.out.println("Musterinin yasi:");
        musteri1.yas = scanner.nextInt();
        musteri1.telefonNo = scanner.nextLine();
        

        Lokasyon lokasyon1 = new Lokasyon();
        System.out.println("hangi ulke?");
        lokasyon1.sehir = scanner.nextLine();
        System.out.println("hangi sehir?");
        lokasyon1.sehir = scanner.nextLine();
        System.out.println("hangi havaalani?");
        lokasyon1.havaalani = scanner.nextLine();
        
        
        Rezervasyon rezervasyon1 = new Rezervasyon();
        rezervasyon1.dolukoltuk = 100;
        rezervasyon1.lokasyon = (lokasyon1.ulke + " " + lokasyon1.sehir);
        System.out.println("Sectiginiz Lokasyon: " + rezervasyon1.lokasyon);
        rezervasyon1.musteri = musteri1;
        System.out.println("Musterinin Ad Soyadi: " + rezervasyon1.musteri);
        rezervasyon1.TarihveSaat = tarihveSaat1;
        System.out.println("Tarih: " + rezervasyon1.TarihveSaat);
        rezervasyon1.boskoltuk = ucak.yolcuKapasitesi - rezervasyon1.Ucak.kackisilik;
        System.out.println("Bos koltuk sayisi: " + rezervasyon1.boskoltuk);
            
    }
}

		

			




