import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenin tanımlanması.

        int n;

        //"n" değerinin girilmesi.

        Scanner input = new Scanner(System.in);
        System.out.print("Sınır değerini giriniz: ");
        n=input.nextInt();

        //İkinin kuvvetlerinin bulunması ve ekrana yazdırılması.

        for (int i=1; i<=n; i*=2){

            System.out.println(i);

        }
    }
}