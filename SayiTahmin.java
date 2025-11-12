import java.util.Random;
import java.util.Scanner;

public class SayiTahmin{
    public static void main(String[] args){
        System.out.println("Sayi Tahmin Oyununa Hosgeldin!");
        Scanner input= new Scanner(System.in);
        Random randSay=new Random();
        int plSay,rand,tSayisi=0;
        String hint;

        rand=randSay.nextInt(100);
        do{
            System.out.print("Tahmininizi giriniz(0-99): ");
            plSay=input.nextInt();
            tSayisi++;

            if(rand==plSay) break;
            hint= (plSay>rand)?"Yanlis! Daha küçük bir değer deneyin.":"Yanlis! Daha büyük bir değer deneyin.";
            System.out.println(hint);

        }while(rand!=plSay);

        System.out.printf("\nTebrikler! Dogru cevap %d'idi",rand);
        System.out.printf("\n%d.denemede buldunuz.",tSayisi);

    }
}
