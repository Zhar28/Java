import java.util.ArrayList;
public class Karyawan implements User{

    private ArrayList <String> namaKaryawan = new ArrayList <String> ();
    private ArrayList <String> alamat = new ArrayList <String> ();
    private ArrayList <String> telepon = new ArrayList <String> ();
    private ArrayList <Integer> jabatan = new ArrayList <Integer> ();

    public Karyawan (){
        this.namaKaryawan.add ("Brian O'Connor");
        this.alamat.add ("Nganjuk");
        this.telepon.add ("08173647222");
        this.jabatan.add(0);
    }

    public void setJabatan (int saldo){
        this.jabatan.add (saldo);
    }
    public int getJabatan (int idMember){
        return this.jabatan.get (idMember);
    }
    public void editJabatan (int idMember, int saldo){
        this.jabatan.set (idMember, saldo);
    }
    public int getJumlahJabatan (){
        return this.jabatan.size ();
    }

    public void setNama (String namaKaryawan){
        this.namaKaryawan.add (namaKaryawan);
    }

    @Override
    public void setAlamat (String alamat){
        this.alamat.add (alamat);
    }

    @Override
    public void setTelepon (String telepon){
        this.telepon.add (telepon);
    }

    @Override
    public String getNama (int idKaryawan){
        return this.namaKaryawan.get (idKaryawan);
    }

    @Override
    public String getAlamat (int idKaryawan){
        return this.alamat.get (idKaryawan);
    }

    @Override
    public String getTelepon (int idKaryawan){
        return this.telepon.get (idKaryawan);
    }
}