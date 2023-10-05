import java.util.Scanner;
public class PemilihanPercobaan223 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        System.out.println("Nilai UAS       :");
        float uas = input23.nextFloat();
        System.out.println("Nilai UTS       :");
        float uts = input23.nextFloat();
        System.out.println("Nilai kuis      :");
        float kuis = input23.nextFloat();
        System.out.println("Nilai tugas     :");
        float tugas = input23.nextFloat();
        float total = (uas*0.4F)+(uts*0.3F)+(kuis*0.1F)+(tugas*0.2F);
        String nilaiHuruf, kualifikasi;
        float nilaiSetara;
        if (80<total && total<=100) {
            nilaiHuruf = "A";
            nilaiSetara = 4.0F;
            kualifikasi = "Sangat baik";
        }
        else if (73<total && total<=80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5F;
            kualifikasi = "Lebih dari baik";
        }
        else if (73<total && total<=80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5F;
            kualifikasi = "Lebih dari baik";
        }
        else if (65<total && total<=73) {
            nilaiHuruf = "B";
            nilaiSetara = 3.0F;
            kualifikasi = "baik";
        }
        else if (60<total && total<=65) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5F;
            kualifikasi = "lebih dari cukup";
        }
        else if (50<total && total<=60) {
            nilaiHuruf = "C";
            nilaiSetara = 2.0F;
            kualifikasi = "cukup";
        }
        else if (39<total && total<=50) {
            nilaiHuruf = "D";
            nilaiSetara = 1.0F;
            kualifikasi = "kurang";
        }
        else if (total<=39) {
            nilaiHuruf = "E";
            nilaiSetara = 0.0F;
            kualifikasi = "gagal";
        }
        else {
            nilaiHuruf ="error";
            nilaiSetara = 0.00F;
            kualifikasi = "error";
        }
        
        System.out.println("Nilai huruf     : "+nilaiHuruf);
        System.out.println("Nilai angka     : "+nilaiSetara);
        System.out.println("Kualifikasi     : "+kualifikasi);
    }
}
