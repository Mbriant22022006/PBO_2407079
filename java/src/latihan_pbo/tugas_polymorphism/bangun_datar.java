package latihan_pbo.tugas_polymorphism;

public class bangun_datar {
  
       private double varA;
    private double varB;

  
    public bangun_datar(double a, double b) {
        varA = a;
        varB = b;
    }

    
    public bangun_datar(double a) {
        varA = a;
        varB = 0;
    }

   
    public double hitungLuas() {
        return 0;
    }

    
    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("--------------------");
        System.out.println("varA : " + varA);
        System.out.println("varB : " + varB);
        System.out.println("--------------------");
    }

    public double getA() {
        return varA;
    }

    public double getB() {
        return varB;
    }
}
