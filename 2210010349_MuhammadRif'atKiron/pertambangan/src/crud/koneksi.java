/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection; //utk membuat variabel koneksi
import java.sql.DriverManager;//utk mengkoneksikan ke dalam database
import java.sql.PreparedStatement;// utk perintah simpan ubah hapus
import java.sql.ResultSet;//utk menangkap record di tabel mysql
import java.sql.Statement;//utk menangkap keseluruhan data record
/**
 *
 * @author ASUS
 */
public class koneksi {
    private String databaseName="2210010349"; //variabel global sifatnya private
    private String username="root";// username mysqlnya
    private String password="";// passnya mysql
    private String lokasi="jdbc:mysql://localhost/"+databaseName;//lokasi utk menghubungkan kedlm database
    public static Connection koneksiDB;// utk menampung data koneksinya
    //static artinya lgsg menampung 'koneksidb' tanpa harus melakukan entends new
    
    public koneksi(){// konstruktor utk memnghubgkan ke dalam database
        try {// utk transaksi simpan ubah hapus
            Class.forName("com.mysql.cj.jdbc.Driver");// meregistrasikan yg koneksi jar 'd libararies'
            koneksiDB=DriverManager.getConnection(lokasi,username,password);// menghubungkan koneksi
            System.out.println("Database Terkoneksi");
        } catch (Exception e) {// utk jenis2 kesalahan ditampung di 'e'
            System.err.println(e.toString());
        }
    }

//------------------tabel batu--------------------------    
    public void simpanBatu (int paramIdBatu, String paramNamaBatu, //methodnya datanya namanya variabel parameter
            String paramGambar, String paramKeterangan){ //param parameter
    
        try {
           String SQL="INSERT INTO batu (id_batu,nama_batu,gambar,keterangan)" + "VALUE(?,?,?,?)";//parameternya diatas
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);// koding simpanya dgn perintah preparedstatement 
           // objeknya perintah dari koneksi jdi di new/intens akan menampung/manggil
           perintah.setInt(1, paramIdBatu); // sesuaikan nomornya dengan di atas parameter
           perintah.setString(2, paramNamaBatu);
           perintah.setString(3, paramGambar);
           perintah.setString(4, paramKeterangan);
           perintah.executeUpdate();//utk melakukan perintah simpan ubah hapus
            System.out.println("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
   
    }
    
    public void ubahBatu (int paramIdBatu, String paramNamaBatu,
            String paramGambar, String paramKeterangan){ //param parameter
    
        try {
           String SQL="UPDATE batu SET nama_batu = ?, gambar=?, keterangan=? WHERE id_batu=?";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1, paramNamaBatu);
           perintah.setString(2, paramGambar);
           perintah.setString(3, paramKeterangan);
           perintah.setInt(4, paramIdBatu); // urutan "update" id(primarykeynya) yang terakhir
           perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }  
        public void hapusBatu(int paramIdBatu){ // utk delete hanya primarykeynya saja
            try {
                String SQL="DELETE FROM batu WHERE id_batu=?";
                PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
                perintah.setInt(1,paramIdBatu);
                perintah.executeUpdate();
                    System.out.println("Data Berhasil Dihapus");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
  
        }
        
//----------------- untuk pencarian select satu record -----------------------------        
        public void cariBatu(int paramIdBatu) { //pencarian utk satu record
            try {
              String  SQL = "SELECT * FROM batu WHERE id_batu=?";
              PreparedStatement perintah = koneksiDB.prepareStatement(SQL); //pencarian
              perintah.setInt (1,paramIdBatu);// utk pencarian
              ResultSet data = perintah.executeQuery();//--perhatikan importnya dlu---
// utk menangkap menangkap, data dari perintah executequery karna mengembalikan resultsetnya
              while(data.next()){ // utk menampilkannya
                  System.out.println("ID Batu    : "+data.getInt("id_batu"));
                  System.out.println("Nama Batu  : "+data.getString("nama_batu"));
                  System.out.println("Gambar     : "+data.getString("gambar"));
                  System.out.println("Keterangan : "+data.getString("keterangan"));
              }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        
        public void dataBatu(){ // semua data --perhatikan importnya dlu--
            try {
                Statement stmt = koneksiDB.createStatement(); // utk mengambil keseluruhan data
                ResultSet baris = stmt.executeQuery("SELECT*FROM batu ORDER BY id_batu ASC"); //baris didapatkan dari stmt.executequey 
                while(baris.next()){ // menampilkan
                    System.out.println(baris.getInt("id_batu")+" | "+
                            baris.getString("nama_batu")+" | "+
                            baris.getString("gambar")+" | "+
                            baris.getString("keterangan"));
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
   
//---------------batu batu detail----------------        
        public void simpanBatuDetail (int paramIdCari,int paramIdBatu ,String paramWarna, String paramTekstur, String paramStruktur, String paramUkuran, String paramGranu, String paramJenis, String paramBentuk,//methodnya datanya namanya variabel parameter
            String paramPembundaran, String paramKristalisasi){ //param parameter
    
        try {
           String SQL="INSERT INTO batu_cari (id_cari,id_batu,warna,tekstur,struktur,ukuran_butir,granularitas,jenis,bentuk_cristal,drajat_pembundaran,drajat_kristalisasi)" + "VALUE(?,?,?,?,?,?,?,?,?,?,?)";//parameternya diatas
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);// koding simpanya dgn perintah preparedstatement 
           // objeknya perintah dari koneksi jdi di new/intens akan menampung/manggil
           perintah.setInt(1, paramIdCari); // sesuaikan nomornya dengan di atas parameter
           perintah.setInt(2, paramIdBatu);
           perintah.setString(3, paramWarna);
           perintah.setString(4, paramTekstur);
           perintah.setString(5, paramStruktur);
           perintah.setString(6, paramUkuran);
           perintah.setString(7, paramGranu);
           perintah.setString(8, paramJenis);
           perintah.setString(9, paramBentuk);
           perintah.setString(10, paramPembundaran);
           perintah.setString(11, paramKristalisasi);
           perintah.executeUpdate();//utk melakukan perintah simpan ubah hapus
            System.out.println("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
   
    }
        
        public void ubahBatuDetail (int paramIdCari,int paramIdBatu ,String paramWarna, String paramTekstur, String paramStruktur, String paramUkuran, String paramGranu, String paramJenis, String paramBentuk,//methodnya datanya namanya variabel parameter
            String paramPembundaran, String paramKristalisasi){ //param parameter
    
        try {
           String SQL="UPDATE batu_cari SET id_batu=?,warna=?,tekstur=?,struktur=?,ukuran_butir=?,granularitas=?,jenis=?,bentuk_cristal=?,drajat_pembundaran=?,drajat_kristalisasi=? WHERE id_cari=?";//parameternya diatas
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);// koding simpanya dgn perintah preparedstatement 
           // objeknya perintah dari koneksi jdi di new/intens akan menampung/manggil
           perintah.setInt(1, paramIdBatu); // sesuaikan nomornya dengan di atas parameter
           perintah.setString(2, paramWarna);
           perintah.setString(3, paramTekstur);
           perintah.setString(4, paramStruktur);
           perintah.setString(5, paramUkuran);
           perintah.setString(6, paramGranu);
           perintah.setString(7, paramJenis);
           perintah.setString(8, paramBentuk);
           perintah.setString(9, paramPembundaran);
           perintah.setString(10, paramKristalisasi);
           perintah.setInt(11, paramIdCari);
           perintah.executeUpdate();//utk melakukan perintah simpan ubah hapus
            System.out.println("Data Berhasil Diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
        public void hapusBatuDetail(int paramIdCari){ // utk delete hanya primarykeynya saja
            try {
                String SQL="DELETE FROM batu_cari WHERE id_cari=?";
                PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
                perintah.setInt(1,paramIdCari);
                perintah.executeUpdate();
                    System.out.println("Data Berhasil Dihapus");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }     
//----------------tabel mineral-------------------
         public void simpanMineral (int paramIdMineral, String paramNamaMineral, //methodnya datanya namanya variabel parameter
            String paramGambar, String paramKeterangan){ //param parameter
    
        try {
           String SQL="INSERT INTO mineral (id_mineral,mineral,gambar,keterangan)" + "VALUE(?,?,?,?)";//parameternya diatas
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);// koding simpanya dgn perintah preparedstatement 
           // objeknya perintah dari koneksi jdi di new/intens akan menampung/manggil
           perintah.setInt(1, paramIdMineral); // sesuaikan nomornya dengan di atas parameter
           perintah.setString(2, paramNamaMineral);
           perintah.setString(3, paramGambar);
           perintah.setString(4, paramKeterangan);
           perintah.executeUpdate();//utk melakukan perintah simpan ubah hapus
            System.out.println("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
   
    }
         
          public void ubahMineral (int paramIdMineral, String paramNamaMineral, //methodnya datanya namanya variabel parameter
            String paramGambar, String paramKeterangan){ //param parameter
    
        try {
           String SQL="UPDATE mineral SET mineral = ?, gambar=?, keterangan=? WHERE id_mineral=?";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1, paramNamaMineral); // sesuaikan nomornya dengan di atas parameter
           perintah.setString(2, paramGambar);
           perintah.setString(3, paramKeterangan);
           perintah.setInt(4, paramIdMineral);
           perintah.executeUpdate();//utk melakukan perintah simpan ubah hapus
            System.out.println("Data Berhasil Diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
  
          public void hapusMineral(int paramIdMineral){ // utk delete hanya primarykeynya saja
            try {
                String SQL="DELETE FROM mineral WHERE id_mineral=?";
                PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
                perintah.setInt(1,paramIdMineral);
                perintah.executeUpdate();
                    System.out.println("Data Berhasil Dihapus");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
          
//------------------tabel mineral detail-------------------
           public void simpanMineralDetail (int paramIdDetail,int paramIdMineral ,String paramWarna, String paramBentuk, String paramTekstur, String paramKilap, String paramKekerasan, String paramGores, String paramBelahan,//methodnya datanya namanya variabel parameter
            String paramPecahan, String paramTenaciti,String paramBerat,String paramMagnet){ //param parameter
    
        try {
           String SQL="INSERT INTO mineral_cari (id_min_cari,id_mineral,warna,bentuk_kristal,tekstur,kilap,kekerasan,gores,belahan,pecahan,tenaciti,berat_jenis,derajat_kemagnetan)" + "VALUE(?,?,?,?,?,?,?,?,?,?,?,?,?)";//parameternya diatas
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);// koding simpanya dgn perintah preparedstatement 
           // objeknya perintah dari koneksi jdi di new/intens akan menampung/manggil
           perintah.setInt(1, paramIdDetail); // sesuaikan nomornya dengan di atas parameter
           perintah.setInt(2, paramIdMineral);
           perintah.setString(3, paramWarna);
           perintah.setString(4, paramBentuk);
           perintah.setString(5, paramTekstur);
           perintah.setString(6, paramKilap);
           perintah.setString(7, paramKekerasan);
           perintah.setString(8, paramGores);
           perintah.setString(9, paramBelahan);
           perintah.setString(10, paramPecahan);
           perintah.setString(11, paramTenaciti);
           perintah.setString(12, paramBerat);
           perintah.setString(13, paramMagnet);
           perintah.executeUpdate();//utk melakukan perintah simpan ubah hapus
            System.out.println("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
   
    }
           public void ubahMineralDetail (int paramIdDetail,int paramIdMineral ,String paramWarna, String paramBentuk, String paramTekstur, String paramKilap, String paramKekerasan, String paramGores, String paramBelahan,//methodnya datanya namanya variabel parameter
            String paramPecahan, String paramTenaciti,String paramBerat,String paramMagnet){ //param parameter
    
        try {
           String SQL="UPDATE mineral_cari SET id_mineral=?,warna=?,bentuk_kristal=?,tekstur=?,kilap=?,kekerasan=?,gores=?,belahan=?,pecahan=?,tenaciti=?,berat_jenis=?,derajat_kemagnetan=? WHERE id_min_cari=?";//parameternya diatas
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);// koding simpanya dgn perintah preparedstatement 
           // objeknya perintah dari koneksi jdi di new/intens akan menampung/manggil
           perintah.setInt(1, paramIdMineral); // sesuaikan nomornya dengan di atas parameter
           perintah.setString(2, paramWarna);
           perintah.setString(3, paramWarna);
           perintah.setString(4, paramTekstur);
           perintah.setString(5, paramKilap);
           perintah.setString(6, paramKekerasan);
           perintah.setString(7, paramGores);
           perintah.setString(8, paramBelahan);
           perintah.setString(9, paramPecahan);
           perintah.setString(10, paramTenaciti);
           perintah.setString(11, paramBerat);
           perintah.setString(12, paramMagnet);
           perintah.setInt(13, paramIdDetail);
           perintah.executeUpdate();//utk melakukan perintah simpan ubah hapus
            System.out.println("Data Berhasil Diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
           public void hapusMineralDetail(int paramIdDetail){ // utk delete hanya primarykeynya saja
            try {
                String SQL="DELETE FROM mineral_cari WHERE id_min_cari=?";
                PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
                perintah.setInt(1,paramIdDetail);
                perintah.executeUpdate();
                    System.out.println("Data Berhasil Dihapus");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
           
}
    

