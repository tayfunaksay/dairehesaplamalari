import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi=3.14;
        int r,a;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz(cm): ");
        r= inp.nextInt();
        System.out.print("Merkez Açıyı Giriniz: ");
        a= inp.nextInt();

        double alan= pi*r*r*a/360;
        System.out.print("Alan: " + alan+" santimetrekaredir");

    }
}
