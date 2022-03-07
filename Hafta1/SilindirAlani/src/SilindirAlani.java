import java.util.Scanner;

public class SilindirAlani {
    public static void main(String[] args) {
        System.out.print("Silindir Alanı Hesaplama");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Silindirin taban yarıçapını giriniz : ");
        float yaricap = userInput.nextFloat();
        System.out.print("Silindirin yüksekliğini giriniz : ");
        float yukseklik = userInput.nextFloat();
        float silindirAlan = (float)(2*Math.PI*yaricap*(yaricap+yukseklik));
        System.out.print(silindirAlan);

    }
}
