import java.util.Scanner;
public class tugasDiskusi {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while (true) {
        System.out.println("Masukkan username");
        String username = input.nextLine();
        System.out.println("Masukkan password");
        String password = input.nextLine(); 
        if (username.equals("Admin") && password.equals("12345")) {
            System.out.println("Log in berhasil");
            break;
        }else {
            System.out.println("Log in gagal");     
        }
    }
    }
}