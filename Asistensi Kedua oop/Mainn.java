//NOMOR 4
// nama kelas semacam kubus
class Cuboid {
    // atribut
    double height ;
    double widht;
    double length;
// method yg dimana get mengembalikan/mengambil nilai
    double getVolume () {
        return height * widht * length;
    }
}

public class Mainn {
    public static void main(String[] args) {
        // objek cuboid untuk memasukkan nilai dari atribut
        Cuboid cuboid = new Cuboid();
        cuboid.height = 15.0 ;
        cuboid.widht = 20.00;
        cuboid.length = 15.0;
        System.out.printf("Volume = %.2f", cuboid.getVolume());

    }
}
