import java.util.ArrayList;
public class Member implements User{

        private ArrayList <String> namaMember = new ArrayList <String> ();
        private ArrayList <String> alamat = new ArrayList <String> ();
        private ArrayList <String> telepon = new ArrayList <String> ();
        private ArrayList <Integer> saldo = new ArrayList <Integer> ();

        public Member (){

            this.namaMember.add ("Verstappen");
            this.alamat.add ("Malang");
            this.telepon.add ("0813872624");
            this.saldo.add (3000000);

            this.namaMember.add ("Checo");
            this.alamat.add ("Bekasi");
            this.telepon.add ("0818727366");
            this.saldo.add (1500000);

            this.namaMember.add ("Hamilton");
            this.alamat.add ("Jakarta");
            this.telepon.add ("0817264367");
            this.saldo.add (2500000);
        }
        public void setSaldo (int saldo){
            this.saldo.add (saldo);
        }
        public int getSaldo (int idMember){
            return this.saldo.get (idMember);
        }
        public void editSaldo (int idMember, int saldo){
            this.saldo.set (idMember, saldo);
        }
        public int getJumlahMember (){
            return this.saldo.size ();
        }

        public void setNama (String namaMember){
            this.namaMember.add (namaMember);
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
        public String getNama (int idMember){
            return this.namaMember.get (idMember);
        }
        @Override
        public String getAlamat (int idMember){
            return this.alamat.get (idMember);
        }
        @Override
        public String getTelepon (int idMember){
            return this.telepon.get (idMember);
        }
    }