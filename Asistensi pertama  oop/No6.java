
import java.util.Scanner;
public class No6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            //input jari-jari
            System.out.print("r = ");
            double r = inp.nextDouble();
            //hitung luas
            double luas = Math.PI*r*r;
            //print output
            System.out.println("Luas = " + String.format("%.2f", luas));
            // % 2f itu membulatkan dua angka di belakang koma
        } catch (Exception e) {
            //inputan bukan angka
            System.out.println("Inputan Bukan Angka");
        }
        inp.close();
    }
}
