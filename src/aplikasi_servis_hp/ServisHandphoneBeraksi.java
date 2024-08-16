
package aplikasi_servis_hp;

import java.util.Scanner;

public class ServisHandphoneBeraksi {
  public static void main(String[] args) {
      
      //IO Sederhana
      try (Scanner input = new Scanner(System.in)) {
          
          // Membuat array untuk menyimpan data servis
          ServisHandphone[] daftarServis = new ServisHandphone[5];
          int index = 0;
          
          while (true) {
              //Error Handling
              try {
                  // Input data pelanggan
                  System.out.print("Masukkan nama pelanggan: ");
                  String namaPelanggan = input.nextLine();
                  
                  // Input data handphone
                  System.out.print("Masukkan merk handphone: ");
                  String merk = input.nextLine();
                  
                  System.out.print("Masukkan model handphone: ");
                  String model = input.nextLine();
                  
                  System.out.print("Masukkan penyimpanan handphone: ");
                  int penyimpanan = Integer.parseInt(input.nextLine());
                  
                  System.out.print("Masukkan jenis kerusakan: ");
                  String kerusakan = input.nextLine();
                  
                  System.out.print("Masukkan biaya servis: ");
                  int biayaServis = Integer.parseInt(input.nextLine());
                  
                  // Objek (Menambah data ke array)
                  daftarServis[index] = new ServisHandphone(merk, model, penyimpanan, kerusakan, biayaServis, namaPelanggan);
                  index++;
                  
                  // Seleksi
                  System.out.print("Apakah ingin menambah data lagi? (y/n): ");
                  String lagi = input.nextLine();
                  if (lagi.equalsIgnoreCase("n")) {
                      break;
                  }
              } catch (NumberFormatException e) {
                  System.out.println("Terjadi kesalahan: " + e.getMessage());
              }
              
              if (index >= daftarServis.length) {
                  System.out.println("Kapasitas penuh!");
                  break;
              }
          }
          
          // Menampilkan data servis handphone
          System.out.println("\nData Servis Handphone:");
          
          //Perulangan
          for (int i = 0; i < index; i++) {
              System.out.println("\nHandphone " + (i + 1));
              daftarServis[i].displayInfo();
          }
      }
    }
}
