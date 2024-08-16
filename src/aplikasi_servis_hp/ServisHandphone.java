
package aplikasi_servis_hp;

//Inheritence(Pewarisan)
public class ServisHandphone extends Handphone {
    private String namaPelanggan, kerusakan;
    private int biayaServis; 

    // Constructor
    public ServisHandphone(String merk, String model, int penyimpanan, String kerusakan, int biayaServis, String namaPelanggan) {
        super(merk, model, penyimpanan);  // Memanggil constructor kelas induk
        this.namaPelanggan = namaPelanggan;
        this.kerusakan = kerusakan;
        this.biayaServis = biayaServis;
    }

    // Accessor dan Mutator
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }
    
    public String getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }

    public double getBiayaServis() {
        return biayaServis;
    }

    public void setBiayaServis(int biayaServis) {
        this.biayaServis = biayaServis;
    }


    // Polymorphism (Overriding)
    @Override
    public void displayInfo() {
        System.out.println("Nama Pelanggan: " + namaPelanggan); // Tampilkan nama pelanggan
        super.displayInfo(); // Memanggil method displayInfo() dari kelas induk
        System.out.println("Kerusakan: " + kerusakan);
        System.out.println("Biaya Servis: Rp." + biayaServis);
    }
}
