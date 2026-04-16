package latihan_pbo.tugas_polymorphism;

public class main {
    
    public static void main(String[] args) {

        bangun_datar bd;

        bd = new persegi(5);
        bd.tampilkan();

        bd = new PersegiPanjang(6, 4);
        bd.tampilkan();

        bd = new segitiga(8, 5);
        bd.tampilkan();
    }
}
