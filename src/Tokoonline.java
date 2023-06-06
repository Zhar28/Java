public class Tokoonline {
    public static void main(String[] args) {
        Member member = new Member ();
        Barang barang = new Barang ();
        Transaksi transaksi = new Transaksi ();
        Laporan laporan = new Laporan ();

        laporan.laporan (barang);
        transaksi.prosesTransaksi (member, transaksi, barang);
        laporan.laporan (barang);
        laporan.laporan (member);
        laporan.laporan (transaksi, barang);
    }
}