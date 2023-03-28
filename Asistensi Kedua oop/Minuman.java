
public class Minuman {
    String jenis;
    String rasa;
    int stok;

    public void jenisMinuman(String jenisMinuman){
        jenis = jenisMinuman;
    } 
    public void rasaMinuman(String rasaMinuman){
        rasa = rasaMinuman;
    } 
    public void stokMinuman(int stokMinuman){
        stok = stokMinuman;
    } 
    public void cetakMinuman() {
        System.out.println("Nama Minuman : " + jenis);
        System.out.println("Rasa Minuman: " + rasa);
        System.out.println("Stok Minuman: " + stok);
    }
    public static void main(String[] args) {
    Minuman minuman  = new Minuman();
    minuman.jenisMinuman("coklat"); 
    minuman.rasaMinuman("Manis");
    minuman.stokMinuman(10);
    minuman.cetakMinuman();
}
}
