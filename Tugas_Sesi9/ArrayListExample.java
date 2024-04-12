package Tugas_Pbo_Sesi9;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Membuat sebuah ArrayList untuk menyimpan data string
        ArrayList<String> daftarNama = new ArrayList<>();

        // Menambahkan elemen ke ArrayList
        daftarNama.add("Ihsan");
        daftarNama.add("Aden");
        daftarNama.add("Dede");

        // Menampilkan isi ArrayList
        System.out.println("Isi ArrayList daftarNama:");
        for (String nama : daftarNama) {
            System.out.println(nama);
        }
    }
}
