public class Main {
    // Move class and encapsulated fields
    static class Barang implements IBarang {
        private String nama;
        private int harga;
        private int jumlah;

        public Barang(String nama, int harga) {
            this.nama = nama;
            this.harga = harga;
        }

        @Override
        public String getNama() {
            return nama;
        }

        @Override
        public int getHarga() {
            return harga;
        }

        @Override
        public int getJumlah() {
            return jumlah;
        }

        @Override
        public void setJumlah(int jumlah) {
            this.jumlah = jumlah;
        }
    }
}
