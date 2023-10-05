import java.util.Scanner;
public class logInTugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String username = sc.nextLine();
        System.out.print("Masukkan password: ");
        String password = sc.nextLine();
        String logIn = (username.equals("admin") && password.equals("12345678")) ? "Log in berhasil" : "Log in gagal";
        System.out.println(logIn);
    }
}
