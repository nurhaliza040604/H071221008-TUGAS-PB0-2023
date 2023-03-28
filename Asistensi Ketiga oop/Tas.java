class Tas{
    String merek;
    int harga;
    int stok;

    public Tas(){}

    public Tas(String merek, int harga, int stok){
        this.merek = merek;
        this.harga = harga;
        this.stok = stok;
    }

    public Tas(String merek, int harga){
        this.merek = merek;
        this.harga = harga;
        this.stok = 0;
    }

String getMerekString(){
    return merek;
}

int getHarga(){
    return harga;
}

int getStok(){
    return stok;
}

public void setHarga(int harga){
    this.harga = harga;
}


    public void tampilkanSpek(){
        System.out.println("Merek tas : " + merek);
        System.out.println("Harga tas : " + harga);
        System.out.println("Stok tas : " + stok);
    }
    
    public void aduTas(Tas tas) {
        if(this.getHarga()>tas.getHarga()){
            this.setHarga(this.getHarga()-tas.getHarga());
            System.out.printf("%s Menang, harganya naik menjadi %d\n", this.getMerekString(), this.getHarga());
        } else if(this.getHarga()==tas.getHarga()){
            System.out.println("Tidak ada yang menang");
        } else {
            System.out.printf("%s Menang, harganya naik menjadi %d\n", tas.getMerekString(), tas.getHarga());
        }
    }

}
