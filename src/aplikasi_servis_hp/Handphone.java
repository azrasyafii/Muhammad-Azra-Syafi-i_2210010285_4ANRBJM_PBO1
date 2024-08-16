
package aplikasi_servis_hp;

//Class
public class Handphone {
    // Atribut (Encapsulation dengan akses private)
    private String merk;
    private String model;
    private int penyimpanan;

    // Constructor
    public Handphone(String merk, String model, int penyimpanan) {
        this.merk = merk;
        this.model = model;
        this.penyimpanan = penyimpanan;
    }

    // Accessor (Getter)
    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public int getPenyimpanan() {
        return penyimpanan;
    }

    // Mutator (Setter)
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPenyimpanan(int penyimpanan) {
        this.penyimpanan = penyimpanan;
    }

    // Polymorphism (Method Overriding)
    public void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Penyimpanan: " + penyimpanan+"GB");
    }
}

