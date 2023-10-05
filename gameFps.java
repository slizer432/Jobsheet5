import java.util.Scanner;
public class gameFps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak: ");
        int jarak = sc.nextInt();
        String senjata = (jarak<= 5) ? "Menggunakan melee weapon" : "Menggunakan ranged weapon";
        System.out.println(senjata);
    }
}
