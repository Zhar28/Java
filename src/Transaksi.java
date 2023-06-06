import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {
    private ArrayList <Integer> idBarang = new ArrayList <Integer>();
    private ArrayList <Integer> banyak = new ArrayList <Integer>();
    private ArrayList <Integer> idMember = new ArrayList <Integer>();

    public Transaksi (){
        this.idMember.add (0);
        this.idBarang.add (0);
        this.banyak.add (2);

        this.idMember.add (0);
        this.idBarang.add(1);
        this.banyak.add (3);

        this.idMember.add (1);
        this.idBarang.add (0);
        this.banyak.add (1);

        this.idMember.add (1);
        this.idBarang.add (2);
        this.banyak.add (2);
    }

    public void prosesTransaksi (Member member, Transaksi transaksi, Barang barang){
        Scanner myOBJ = new Scanner (System.in);
        String cek = "";

        System.out.println("Mari Berbelanja");
        System.out.print("ID Member : ");
        int idMember = myOBJ.nextInt ();
        if (idMember > 4 || idMember < 0) {
            System.out.println("NOMER YANG ANDA MASUKKAN TIDAK VALID");
        } else {
            System.out.println("Selamat Datang "+member.getNama (idMember));
            ArrayList <Integer> idBarang = new ArrayList <Integer> ();
            ArrayList <Integer> banyak = new ArrayList <Integer> ();
            int limit;
            int i = 0;
            int temp = 0;
            do {
                System.out.print("Kode Barang : ");
                temp = myOBJ.nextInt();
                idBarang.add (temp);
                if (idBarang.get (i) < barang.getJumlahBarang() && idBarang.get (i) >= 0) {
                    do {
                        cek = "";
                        System.out.print(barang.getNamaBarang(idBarang.get (i))+ " sebanyak : ");
                        banyak.add (myOBJ.nextInt());
                        if (banyak.get(i) >= barang.getStok(temp)) {
                            System.out.println("kebanyakan kak");
                            banyak.remove(i);

                            System.out.print("\nApakah ingin mengulang kembali? (Y/N) ");
                            cek = myOBJ.next();
                            if (cek.equalsIgnoreCase("n")) {
                                idBarang.remove(i);
                            }
                        }
                    } while (cek.equalsIgnoreCase("Y"));
                    i++;
                } else {
                    System.out.println("Masukkan angka yang benar bang");
                    idBarang.remove(i);
                }
                cek = "";
                System.out.print("\nApakah ingin menambah barang? (Y/N) ");
                cek = myOBJ.next();
            } while (cek.equalsIgnoreCase("Y"));
            System.out.println("\n\nTransaksi belanja "+ member.getNama(idMember)+ " sebagai berikut ");
            System.out.println("Nama Barang \tQty \tHarga \tJumlah \t");

            int total = 0;
            int x = idBarang.size ();
            for (int j = 0; j < x; j++) {
                int jumlah = banyak.get (j) * barang.getHarga (idBarang.get (j));
                total += jumlah;
                System.out.println(barang.getNamaBarang (idBarang.get (j))+ "\t\t"+ idBarang.get(j)+ "\t"+ barang.getHarga (idBarang.get(j))
                        + "\t"+ jumlah);
                transaksi.setTransaksi (barang, idMember, idBarang.get(j), banyak.get (j));
            }

            System.out.println("Total Belanja : "+total);
            member.editSaldo (idMember, member.getSaldo (idMember)- total);
        }}

    public void setTransaksi(Barang barang, int idMember, int idBarang, int banyak){
        this.idMember.add(idMember);
        this.idBarang.add(idBarang);
        this.banyak.add(banyak);
        barang.editStok(idBarang, barang.getStok(idBarang)-banyak);
    }
    public int getIdBarang(int id){
        return this.idBarang.get(id);
    }
    public int getBanyaknya(int id){
        return this.banyak.get(id);
    }
    public int getIdMember(int id){
        return this.idMember.get(id);
    }
    public int getJmlTransaksi(){
        return this.idMember.size();
    }
}