# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi servis handphone menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, merk, model, penyimpanan, kerusakan dan biaya servis handphone pelanggan, dan memberikan output berupa informasi detail dari Data Servis Handphone tersebut.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Handphone`, `ServisHandphone`, dan `ServisHandphoneBeraksi` adalah contoh dari class.

```bash
public class Handphone {
    ...
}

public class ServisHandphone extends Handphone {
    ...
}

public class ServisHandphoneBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `ServisHandphone[] daftarServis = new ServisHandphone[5];` adalah contoh pembuatan object.

```bash
ServisHandphone[] daftarServis = new ServisHandphone[5];
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaPelanggan`, `merk`, `model`, `penyimpanan`, `kerusakan`  dan `biayaServis` adalah contoh atribut.

```bash
String namaPelanggan;
String merk;
String model;
int penyimpanan;
String kerusakan;
String biayaServis;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Handphone` dan `ServisHandphone`.

```bash
public Handphone(String merk, String model, int penyimpanan) {
        this.merk = merk;
        this.model = model;
        this.penyimpanan = penyimpanan;
}

public ServisHandphone(String merk, String model, int penyimpanan, String kerusakan, int biayaServis, String namaPelanggan) {
        super(merk, model, penyimpanan);  // Memanggil constructor kelas induk
        this.namaPelanggan = namaPelanggan;
        this.kerusakan = kerusakan;
        this.biayaServis = biayaServis;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaPelanggan`, `setMerk`, `setModel`, `setPenyimpanan`, `setKerusakan` dan `setBiayaServis` adalah contoh method mutator.

```bash
public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
}

public void setMerk(String merk) {
        this.merk = merk;
}

public void setModel(String model) {
        this.model = model;
}

public void setPenyimpanan(int penyimpanan) {
        this.penyimpanan = penyimpanan;
}

public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
}

public void setBiayaServis(int biayaServis) {
        this.biayaServis = biayaServis;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaPelanggan`, `getMerk`, `getModel`, `getPenyimpanan`, `getKerusakan` dan `getBiayaServis` adalah contoh method accessor.

```bash
public String getNamaPelanggan() {
        return namaPelanggan;
}

public String getMerk() {
        return merk;
}

public String getModel() {
        return model;
}

public int getPenyimpanan() {
        return penyimpanan;
}

public String getKerusakan() {
        return kerusakan;
}

public double getBiayaServis() {
        return biayaServis;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaPelanggan`, `merk`, `model`, `penyimpanan`, `kerusakan`  dan `biayaServis` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namaPelanggan,
private String merk;
private String model;
private int penyimpanan;
private String kerusakan;
private int biayaServis;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `ServisHandphone` mewarisi `Handphone` dengan sintaks `extends`.

```bash
public class ServisHandphone extends Handphone {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo` di `ServisHandphone` merupakan override dari method `displayInfo` di `Handphone`.

```bash
@Override
    public void displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam class `ServisHandphoneBeraksi`.

```bash
System.out.print("Apakah ingin menambah data lagi? (y/n): ");
  String lagi = input.nextLine();
  if (lagi.equalsIgnoreCase("n")) {
  break;
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < index; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan nama pelanggan: ");
String namaPelanggan = input.nextLine();

System.out.println("\nData Servis Handphone:");
System.out.println("\nHandphone " + (i + 1));
daftarServis[i].displayInfo();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `ServisHandphone[] daftarServis = new ServisHandphone[5];` adalah contoh penggunaan array.

```bash
ServisHandphone[] daftarServis = new ServisHandphone[5];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (NumberFormatException e) {
  System.out.println("Terjadi kesalahan: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Azra Syafi'i
NPM: 2210010285
