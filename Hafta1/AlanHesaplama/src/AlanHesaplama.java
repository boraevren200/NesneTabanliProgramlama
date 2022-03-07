import java.util.Scanner;

public class AlanHesaplama {
    public static void main(String[] args) {
        System.out.print("Dikdörtgenin Alanını Hesaplama" );
        Scanner userInput = new Scanner(System.in);
        System.out.print("Dikdörtgenin kısa kenarını giriniz : ");
        float num1 = userInput.nextFloat();
        System.out.print("Dikdörtgenin uzun kenarını giriniz : ");
        float num2 = userInput.nextFloat();
        float alan = num1*num2;
        System.out.print("Dikdörtgenin alanı: "+alan);


    }
}
