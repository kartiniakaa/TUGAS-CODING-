import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print(
                    " Silahkan" +
                            " Masukkan angka  ");
            int angka = scanner.nextInt();

            int i = 1;
            while (i <= angka) {
                if (i % 2 == 0) {
                    System.out.println(i + " genap");
                } else {
                    System.out.println(i + " ganjil");
                }
                i++;
            }
            System.out.println("Terimakasih telah mencoba:)");
        }
    }
}