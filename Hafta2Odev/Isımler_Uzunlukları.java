package Hafta2Odev;

public class Isımler_Uzunlukları {
    public static void main(String[] args) {
        String isimler = " Batuhan, Bengisu, Beyza, Bora, Emircan, Emir, İnci, İsmail";
        String soyisimler = " Kaya, Durmus, Aktas, Evren, Aydin, Yilmaz, Cumen, Aytar";
        String birlesik ="";
        isimler.split(" ");
        String[] isimlerDizi = isimler.split(",");
        String[] soyIsımDizi = soyisimler.split(",");
        for(int i = 0; i<isimlerDizi.length;i++) {
           birlesik = isimlerDizi[i].concat(soyIsımDizi[i]);
           System.out.println("İsim Soyisim :" + birlesik + ", " + "Uzunluk : " + birlesik.length());
        }

        }
    }

