import java.util.Scanner;

class BelanjaSebelumRefactoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Harga barang
        int hargaSabun = 5000;
        int hargaShampoo = 15000;
        int hargaPastaGigi = 8000;
        int hargaSikatGigi = 7000;
        int hargaSabunCuci = 6000;

        // Input jumlah barang yang dibeli
        System.out.print("Masukkan jumlah sabun yang dibeli: ");
        int jumlahSabun = scanner.nextInt();

        System.out.print("Masukkan jumlah shampoo yang dibeli: ");
        int jumlahShampoo = scanner.nextInt();

        System.out.print("Masukkan jumlah pasta gigi yang dibeli: ");
        int jumlahPastaGigi = scanner.nextInt();

        System.out.print("Masukkan jumlah sikat gigi yang dibeli: ");
        int jumlahSikatGigi = scanner.nextInt();

        System.out.print("Masukkan jumlah sabun cuci yang dibeli: ");
        int jumlahSabunCuci = scanner.nextInt();

        // Menghitung total belanja
        int totalBelanja = (hargaSabun * jumlahSabun) + (hargaShampoo * jumlahShampoo) + (hargaPastaGigi * jumlahPastaGigi) + (hargaSikatGigi * jumlahSikatGigi) + (hargaSabunCuci * jumlahSabunCuci);

        // Menampilkan total belanja
        System.out.println("Total belanja anda adalah: " + totalBelanja);

        scanner.close();
    }
}
