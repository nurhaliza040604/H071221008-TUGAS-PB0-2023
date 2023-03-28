import java.text.DateFormat;
// untuk memformat tanggalnya
import java.text.ParseException;
// pengecualian saat mencoba kode data tanggal
import java.text.SimpleDateFormat;
// untuk menampilkan format tgl hari ini
import java.util.Scanner;
// memasukkan data paket scanner

public class No5 {
    public static void main(String[] args) throws ParseException {
        Scanner inp = new Scanner(System.in);
        // untuk  kita bisa input tanggal di bagian terminal
        String tglLama = inp.nextLine(); 
        // untukk memasukkan tgl dari soal,karena dia string
        DateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy"); 
        // untuk memunculkan format tanggal baru pake pattern d mm-yy sesuai yang diminta pada soal itu 1 april 2003
        DateFormat df=new SimpleDateFormat("d-MM-yy");
        // format itu untuk tgl lama ada d-MM-yy itu ikut pattern input disoak 01-04-03
        String tglBaru=dateFormat.format(df.parse(tglLama));
        System.out.println(tglBaru);;

    }
}