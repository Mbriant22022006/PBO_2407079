package latihan_pbo.tugas_polymorphism;

public class segitiga extends bangun_datar {

    // constructor
    public segitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    public double hitungLuas() {
        return 0.5 * getA() * getB();
    }

    @Override
    public void tampilkan() {
        System.out.println("Segitiga");
        System.out.println("----------------");
        System.out.println("Alas   : " + getA());
        System.out.println("Tinggi : " + getB());
        System.out.println("Luas   : " + hitungLuas());
        System.out.println("----------------");
    }
}
