/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Batu_batu;

/**
 *
 * @author ASUS
 */
public class batucari {
    
    String jenisbatu;
    
    public batucari(){}; //construktor 1
    
    public batucari(String jenbatu){
        this.jenisbatu = jenbatu;
    }
    
    public void inputjenisBatu(String batucari){
        this.jenisbatu = batucari;
    }
    public String ambilBatu(){
        
        if (this.jenisbatu.equals("1")){
            System.out.println("Keterangan        : Granit adalah jenis batuan beku yang terbentuk dari proses pendinginan magma di dalam kerak bumi. Batuan ini terdiri dari mineral-mineral");
            System.out.println("                    seperti kuarsa, feldspar, dan mika, yang memberikan granit warna, pola, dan tekstur yang beragam.");
            System.out.println("                    Granit biasanya memiliki tekstur butir yang kasar hingga sedang.");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("        ** Warna **       : Abu-abu, putih, merah muda");
            System.out.println("        **Tekstur**       : Kasar");
            System.out.println("        **Struktur**      : Holokristalin");
            System.out.println("      **Ukuran Butir**    : Menengah hingga kasar");
            System.out.println("      **Granularitas**    : Granular");
            System.out.println("         **Jenis**        : Igneous (Intrusif)");
            System.out.println("    **Bentuk Kristal**    : Bervariasi, umumnya kubik atau heksagonal");
            System.out.println("  **Derajat Pembundaran** : Anguler hingga sub-anguler");
            System.out.println("  **Derajat Kristalisasi**: Tinggi");
            
        }else if(this.jenisbatu.equals("2")){
            System.out.println("Keterangan        : Basalt adalah jenis batuan beku yang terbentuk dari magma yang mendingin di permukaan Bumi.");
            System.out.println("                    Ini adalah salah satu jenis batuan yang paling umum di kerak Bumi.");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("        ** Warna **       : Hitam, abu-abu gelap");
            System.out.println("        **Tekstur**       : Halus hingga sangat halus");
            System.out.println("        **Struktur**      : Aphanitic");
            System.out.println("      **Ukuran Butir**    : Sangat halus");
            System.out.println("      **Granularitas**    : Non-Granular");
            System.out.println("         **Jenis**        : Igneous (Ekstrusif)");
            System.out.println("    **Bentuk Kristal**    : Prismatik atau tabular");
            System.out.println("  **Derajat Pembundaran** : Anguler");
            System.out.println("  **Derajat Kristalisasi**: Rendah hingga menengah");
        }else if (this.jenisbatu.equals("3")){
            System.out.println("Keterangan        : Sandstone adalah jenis batuan sedimen yang terbentuk dari partikel pasir yang diikat bersama oleh tekanan dan adhesi.");
            System.out.println("                    Proses pembentukan sandstone melibatkan pengendapan partikel pasir di bawah tekanan dan perubahan kimia atau fisik ");
            System.out.println("                    yang mengikat partikel tersebut bersama-sama menjadi batuan padat. Sandstone memiliki berbagai warna, tekstur ");
            System.out.println("                    dan pola tergantung pada sumber pasir, kondisi pengendapan, dan proses metamorfosis.");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("        ** Warna **       : Beragam (merah, kuning, coklat, putih)");
            System.out.println("        **Tekstur**       : Medium");
            System.out.println("        **Struktur**      : Klastic");
            System.out.println("      **Ukuran Butir**    : Menengah");
            System.out.println("      **Granularitas**    : Granular");
            System.out.println("         **Jenis**        : Sedimentary");
            System.out.println("    **Bentuk Kristal**    : Tidak ada (klastik)");
            System.out.println("  **Derajat Pembundaran** : Bulat hingga sub-bulat");
            System.out.println("  **Derajat Kristalisasi**: Tidak ada");
        }else if (this.jenisbatu.equals("4")){
            System.out.println("Keterangan        : Gneiss adalah jenis batuan metamorfik yang terbentuk dari batuan asal seperti granit atau batu beku lainnya yang mengalami proses metamorfosis. ");
            System.out.println("                    Proses metamorfosis ini terjadi karena tekanan tinggi, suhu tinggi, dan kadang-kadang paparan zat kimia tertentu dalam kerak bumi.");
            System.out.println("                    Akibatnya, struktur mineral dan tekstur batuan asal mengalami perubahan, menghasilkan batuan metamorfik yang memiliki pola dan lapisan yang khas.");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("        ** Warna **       : Beragam (putih, abu-abu, merah muda, hitam)");
            System.out.println("        **Tekstur**       : Kasar");
            System.out.println("        **Struktur**      : Berlapis (foliasi)");
            System.out.println("      **Ukuran Butir**    : Menengah hingga kasar");
            System.out.println("      **Granularitas**    : Granular");
            System.out.println("         **Jenis**        : Metamorphic");
            System.out.println("    **Bentuk Kristal**    : Bervariasi, umumnya prismatik");
            System.out.println("  **Derajat Pembundaran** : Anguler hingga sub-anguler");
            System.out.println("  **Derajat Kristalisasi**: Tinggi");
        }else if (this.jenisbatu.equals("5")){
            System.out.println("Keterangan        : Marmer adalah jenis batuan metamorfik yang terbentuk dari proses metamorfosis batuan kapur.");
            System.out.println("                    Batuan ini terbentuk ketika batuan kapur (yang awalnya terbentuk dari endapan kerang, cangkang, dan fragmen organik lainnya di dasar laut");
            System.out.println("                    mengalami tekanan tinggi dan suhu tinggi dalam proses metamorfosis. Proses ini mengubah struktur kimia dan kristal batuan kapur, ");
            System.out.println("                    menghasilkan marmer yang memiliki tekstur dan pola unik. ");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("        ** Warna **       : Putih, merah muda, abu-abu, hijau");
            System.out.println("        **Tekstur**       : Halus");
            System.out.println("        **Struktur**      : Non-foliated");
            System.out.println("      **Ukuran Butir**    : Menengah hingga kasar");
            System.out.println("      **Granularitas**    : Granular");
            System.out.println("         **Jenis**        : Metamorphic");
            System.out.println("    **Bentuk Kristal**    : Bervariasi, umumnya rhombohedral");
            System.out.println("  **Derajat Pembundaran** : Anguler hingga sub-anguler");
            System.out.println("  **Derajat Kristalisasi**: Tinggi");
        }else{
            System.out.println("Maaf batu yang anda cari tidak teridentifikasi");
        } this.jenisbatu="";
        return this.jenisbatu;
    }
}
