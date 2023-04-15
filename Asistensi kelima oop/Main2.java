public class Main2 {
    public static void main(String[] args) {
        PengurusInti pengurusInti = new PengurusInti();
        pengurusInti.setNama("Lina");
        pengurusInti.setUmur(21);
        pengurusInti.setJabatan("ketua");
        pengurusInti.tampilkanInfo();
        pengurusInti.berbicara();
        pengurusInti.mengaturRapat();

        KoordinatorBidang koordinatorBidang = new KoordinatorBidang();
        koordinatorBidang.setNama("wina");
        koordinatorBidang.setUmur(22);
        koordinatorBidang.setJabatan("koordinator bidang konsumsi");
        koordinatorBidang.tampilkanInfo();
        koordinatorBidang.berbicara();
        koordinatorBidang.mengaturTugas();

        Staf staf = new Staf();
        staf.setNama("lisa");
        staf.setUmur(28);
        staf.setJabatan("Sekretaris");
        staf.tampilkanInfo();
        staf.melaksanakanTugas();
    }
}