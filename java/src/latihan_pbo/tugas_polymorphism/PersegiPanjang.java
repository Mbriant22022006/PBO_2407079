package latihan_pbo.tugas_polymorphism;

public class PersegiPanjang extends bangun_datar {

    // constructor
    public PersegiPanjang(double panjang, double lebar) {
        super(panjang, lebar);
    }

    @Override
    public double hitungLuas() {
        return getA() * getB();
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi Panjang");
        System.out.println("----------------");
        System.out.println("Panjang : " + getA());
        System.out.println("Lebar   : " + getB());
        System.out.println("Luas    : " + hitungLuas());
        System.out.println("----------------");
    }
}
