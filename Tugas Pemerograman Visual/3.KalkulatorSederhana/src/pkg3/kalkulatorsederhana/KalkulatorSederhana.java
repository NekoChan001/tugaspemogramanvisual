
package pkg3.kalkulatorsederhana;
import java.util.Scanner;


/**
 *
 * VALERIAN PERMANA SUKMA
 * C2183207050
 * PTI B
 */
public class KalkulatorSederhana {
public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

   
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

   
        int hasilPenjumlahan = angka1 + angka2;
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);

        int hasilPengurangan = angka1 - angka2;
        System.out.println("Hasil pengurangan: " + hasilPengurangan);


        int hasilPerkalian = angka1 * angka2;
        System.out.println("Hasil perkalian: " + hasilPerkalian);

        
        double hasilPembagian = (double) angka1 / angka2;
        System.out.println("Hasil pembagian: " + hasilPembagian);


        input.close();
    }
    
}
