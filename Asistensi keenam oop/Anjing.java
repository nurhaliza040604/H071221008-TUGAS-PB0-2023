abstract class Anjing {
    protected int position;
    protected int averageLength;

    public Anjing(Integer position, Integer averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    abstract void move();
    abstract void describe();
}

class Pitbull extends Anjing {
    public Pitbull(Integer position, Integer averageLength) {
        super(position,  averageLength);
    }

    public void move() {
        position += 3;
        System.out.println("Pitbull berpindah ke garis "+ position);
    }

    public void describe() {
        System.out.println("Anjing Pitbull itu seperti Donatello, terlihat menakutkan tetapi sebenarnya mereka penuh kasih sayang.");
    }
}

class SiberianHusky extends Anjing {
    public SiberianHusky(Integer position, Integer averageLength) {
        super(position,  averageLength);
    }

    public void move() {
        position += 2;
        System.out.println("Siberian Husky berpindah ke garis "+ position);
    }

    public void describe() {
        System.out.println("Siberian Husky itu seperti atlet lari marathon, mereka senang berlari jauh dan cepat, bahkan jika itu hanya untuk mengambil tong sampah Anda.");
    }
}

class Bulldog extends Anjing {
    public Bulldog(Integer position, Integer averageLength) {
        super(position,  averageLength);
    }

    public void move() {
        position += 1;
        System.out.println("Bulldog berpindah ke garis "+ position);
    }

    public void describe() {
        System.out.println("Bulldog itu seperti kulkas berjalan, mereka mungkin terlihat pendek dan gemuk tetapi mereka memiliki hati yang besar dan selalu siap melindungi Anda.");
    }
}

class GermanShepherd extends Anjing {
    public GermanShepherd(Integer position, Integer averageLength) {
        super(position,  averageLength);
    }

    public void move() {
        position += 2;
        System.out.println("German Shepherd berpindah ke garis + "+ position);
    }

    public void describe() {
        System.out.println("German Shepherd itu seperti supermodel, selalu tampil elegan dan menawan tetapi mereka juga memiliki sisi pelindung yang kuat.");
    }
}