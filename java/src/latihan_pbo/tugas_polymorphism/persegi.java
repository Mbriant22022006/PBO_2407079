package latihan_pbo.tugas_polymorphism;

public class persegi extends bangun_datar {

    public persegi(double sisi) {
        super(sisi);
    }

    @Override
    public double hitungLuas() {
        return getA() * getA();
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi");
        System.out.println("----------------");
        System.out.println("Sisi  : " + getA());
        System.out.println("Luas  : " + hitungLuas());
        System.out.println("----------------");
    }
}
