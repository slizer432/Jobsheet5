import java.util.Scanner;
public class PemilihanPercobaan123 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = input23.nextInt();
        String hasil = (angka % 2 == 0) ? "Angka "+angka+" bilangan genap" : "angka "+" bilangan ganjil";
        System.out.println(hasil);

    }
    
}
