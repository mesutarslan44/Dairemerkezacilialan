import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int r, merkezAci;
        double pi=3.14;

        Scanner inp = new Scanner (System.in);
        System.out.println("Dairenin Yarı çapını Giriniz : " );
        r= inp.nextInt();

        System.out.println("Dairenin Açısını Giriniz : " );
        merkezAci= inp.nextInt();

        double alan = ((pi * (r* r) * merkezAci) / 360) ;

        System.out.println("Dairenin Alanı: " + alan);




    }
}
