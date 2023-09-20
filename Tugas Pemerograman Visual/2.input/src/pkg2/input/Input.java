
package pkg2.input;
import java.util.Scanner;
/**
 *
 * VALERIAN PERMANA SUKMA
 * C21832070
 * PTI B
 */
public class Input {


    public static void main(String[] args) {
 // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan usia Anda: ");
        int usia = input.nextInt();

        // Meminta pengguna untuk memasukkan tinggi badan
        System.out.print("Masukkan tinggi badan Anda (CM): ");
        double tinggi = input.nextDouble();

        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Tinggi Badan: " + tinggi + " CM");

        input.close();
    }
    
}
