import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
    public static void main(String args[]) {
        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);
        
        // Menampilkan judul program
        System.out.println("=====KALKULATOR SEDERHANA===== ");
        
        // Meminta pengguna memasukkan angka pertama
        System.out.print("Masukkan angka pertama Anda : ");
        
        // Inisialisasi variabel angkaPertama dan angkaKedua
        int angkaPertama = 0;
        int angkaKedua = 0;
        
        try {
            // Membaca input angka pertama dari pengguna
            angkaPertama = input.nextInt();
            
            // Menampilkan angka pertama yang telah diinput
            System.out.println("Angka pertama : " + angkaPertama);
            
            // Meminta pengguna memasukkan angka kedua
            System.out.print("Masukkan angka kedua Anda : ");
            
            // Membaca input angka kedua dari pengguna
            angkaKedua = input.nextInt();
            
            // Menampilkan angka kedua yang telah diinput
            System.out.println("Angka kedua : " + angkaKedua);
            
            // Meminta pengguna memasukkan operasi matematika (+, -, *, /)
            System.out.print("Masukkan operasi (+, -, *, /) : ");
            
            // Membaca input operasi yang diinginkan dari pengguna
            char operasi = input.next().charAt(0);
            
            // Inisialisasi variabel hasil untuk menyimpan hasil perhitungan
            int hasil = 0;
            
            // Melakukan perhitungan sesuai dengan operasi yang dipilih
            switch(operasi) {
                case '+':
                    hasil = angkaPertama + angkaKedua;
                    break;
                case '-':
                    hasil = angkaPertama - angkaKedua;
                    break;
                case '*':
                    hasil = angkaPertama * angkaKedua;
                    break;
                case '/':
                    hasil = angkaPertama / angkaKedua;
                    break;
                default:
                    System.out.println("Maaf operasi tidak valid.");
                    break;
            }
            
            // Menampilkan hasil perhitungan
            System.out.println("Hasil : " + hasil);
        } catch (InputMismatchException e) {
            // Menangani pengecualian jika input tidak valid
            System.out.println("Input tidak valid. Anda harus memasukkan angka.");
            input.next(); // Membuang input yang tidak valid
        }
        
        // Menutup objek Scanner
        input.close();
    }
}
