public class Staf extends SistemInformasi{
    
    public void tampilkanInfo(){
        System.out.println("\n" + "=".repeat(40));
        System.out.println(" ".repeat(18) + "Staf" + " ".repeat(16));
        System.out.println("=".repeat(40));
        System.out.println("nama \t: " + getNama() + "\numur \t: " + getUmur() + " tahun" + "\njabatan : " + getJabatan());
    }

    public void melaksanakanTugas(){
        System.out.printf("%s sedang melaksanakan tugasnya...", super.getNama());
        System.out.println("\n");
    }
}