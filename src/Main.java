import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int rng = rand.nextInt(100);
        int[] wrongs =new int[5];
        int j=0;
        Scanner scn = new Scanner(System.in);
        int tries = 4;
        System.out.println("1 -- 100 arası bir sayı tahmin etmelisiniz.");
        for(int i=1;i<=5;i++){
            System.out.println(i+ ".tahmininizi girin: ");
            int guess = scn.nextInt();
            if(guess == rng){
                System.out.println("Tebrikler doğru tahmin ettiniz.");
            }else{
                if(tries!=0){
                System.out.println("Yanlış cevap " +tries--+ " hakkınız kaldı.");}
                else{
                    System.out.println("Tahmin hakkınız kalmadı.");
                    System.out.println("************************");
                }
                wrongs[j++]=guess;
            }
        }
        System.out.println("Sayıyı tahmin edemediniz. Doğru sayı: " +rng+ "\n"+
                "Sizin tahminleriniz: "+Arrays.toString(wrongs));
    }
}
