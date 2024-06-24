/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mineral;

/**
 *
 * @author ASUS
 */
public class mineralCari {
    
    String jenisMineral;
    
    public mineralCari(){}
    
    public void inputjenisMineral(String mineralCari){
        this.jenisMineral = mineralCari;
    }
    
    public String ambilJenisMineral(){
       if (this.jenisMineral.equals("1")){
            System.out.println("Keterangan        : Mineral umum yang terdapat di banyak jenis batuan.");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("        ** Warna **       : Tidak berwarna hingga berbagai warna");
            System.out.println("     **Bentuk Kristal**   : Heksagonal");
            System.out.println("        **Tekstur**       : Halus");
            System.out.println("         **Kilap**        : Kaca");
            System.out.println("       **Kekerasan**      : 7 (Skala Mohs)");
            System.out.println("         **Gores**        : Putih");
            System.out.println("        **Belahan**       : -");
            System.out.println("        **Pecahan**       : Konkoidal");
            System.out.println("        **Tenaciti**      : Rapuh");
            System.out.println("       **Berat Jenis**    : 2.65");
            System.out.println("     **Derajat Magnet**   : -");
            
        }else if(this.jenisMineral.equals("2")){
            System.out.println("Keterangan        : Sering disebut (emas bodoh) karena kemiripannya dengan emas");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("        ** Warna **       : Kuning keemasan");
            System.out.println("     **Bentuk Kristal**   : Kubus");
            System.out.println("        **Tekstur**       : Kasar");
            System.out.println("         **Kilap**        : Logam");
            System.out.println("       **Kekerasan**      : 6-6.5 (Skala Mohs)");
            System.out.println("         **Gores**        : Hitam kehijauan");
            System.out.println("        **Belahan**       : Tidak sempurna");
            System.out.println("        **Pecahan**       : Tidak rata");
            System.out.println("        **Tenaciti**      : Rapuh");
            System.out.println("       **Berat Jenis**    : 4.9-5.2");
            System.out.println("     **Derajat Magnet**   : Sedikit magnetik jika mengandung besi");
            
        }else if (this.jenisMineral.equals("3")){
            System.out.println("Keterangan        : Mineral yang mudah terbelah menjadi lembaran tipis");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("        ** Warna **       : Berbagai warna, biasanya tidak berwarna atau coklat");
            System.out.println("     **Bentuk Kristal**   : Monoklinik");
            System.out.println("        **Tekstur**       : Halus");
            System.out.println("         **Kilap**        : Kaca hingga mutiara");
            System.out.println("       **Kekerasan**      : 2.5-3 (Skala Mohs)");
            System.out.println("         **Gores**        : Putih");
            System.out.println("        **Belahan**       : Sempurna satu arah");
            System.out.println("        **Pecahan**       : Tidak rata");
            System.out.println("        **Tenaciti**      : Fleksibel tapi tidak elastis");
            System.out.println("       **Berat Jenis**    : 2.7-3.1");
            System.out.println("     **Derajat Magnet**   : -");
            
        }else if (this.jenisMineral.equals("4")){
            System.out.println("Keterangan        : Sumber utama timah hitam");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("        ** Warna **       : Abu-abu keperakan");
            System.out.println("     **Bentuk Kristal**   : Kubus");
            System.out.println("        **Tekstur**       : Kasar");
            System.out.println("         **Kilap**        : Logam");
            System.out.println("       **Kekerasan**      : 2.5-2.75 (Skala Mohs)");
            System.out.println("         **Gores**        : Hitam keabu-abuan");
            System.out.println("        **Belahan**       : Sempurna tiga arah");
            System.out.println("        **Pecahan**       : Sub-konkoidal");
            System.out.println("        **Tenaciti**      : Rapuh");
            System.out.println("       **Berat Jenis**    : 7.4-7.6");
            System.out.println("     **Derajat Magnet**   : -");
            
        }else if (this.jenisMineral.equals("5")){
            System.out.println("Keterangan        : Sumber utama besi");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("        ** Warna **       : Merah kehitaman");
            System.out.println("     **Bentuk Kristal**   : Trigonal");
            System.out.println("        **Tekstur**       : Halus hingga kasar");
            System.out.println("         **Kilap**        : Logam hingga sub-logam");
            System.out.println("       **Kekerasan**      : 5.5-6.5 (Skala Mohs)");
            System.out.println("         **Gores**        : Merah");
            System.out.println("        **Belahan**       : -");
            System.out.println("        **Pecahan**       : Tidak rata");
            System.out.println("        **Tenaciti**      : Rapuh");
            System.out.println("       **Berat Jenis**    : 5.3");
            System.out.println("     **Derajat Magnet**   : Sedikit magnetik");
        }else{
            System.out.println("Maaf mineral yang anda cari tidak teridentifikasi");
        } this.jenisMineral="";
        return this.jenisMineral;
    }
 
    
}
