import java.util.Scanner;

// Main class
class BelanjaSetelahRefactoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Main.Barang[] daftarBarang = {
                new Main.Barang("Sabun", 5000),
                new Main.Barang("Shampoo", 15000),
                new Main.Barang("Pasta Gigi", 8000),
                new Main.Barang("Sikat Gigi", 7000),
                new Main.Barang("Sabun Cuci", 6000)
        };

        for (Main.Barang barang : daftarBarang) {
            System.out.print("Masukkan jumlah " + barang.getNama() + " yang dibeli: ");
            barang.setJumlah(scanner.nextInt());
        }

        int totalBelanja = hitungTotalBelanja(daftarBarang);

        System.out.println("Total belanja anda adalah: " + totalBelanja);

        scanner.close();
    }

    // Extra method
    private static int hitungTotalBelanja(Main.Barang[] daftarBarang) {
        int total = 0;
        for (Main.Barang barang : daftarBarang) {
            total += barang.getHarga() * barang.getJumlah();
        }
        return total;
    }
}

// Extract interface
interface IBarang {
    String getNama();
    int getHarga();
    int getJumlah();
    void setJumlah(int jumlah);
}

