/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertambangan;
import Batu_batu.*; // package ,bintang artinya semua class 
import mineral.*;
import java.util.Scanner;// utk menginput saat dirun
import crud.koneksi; // package crud,manggil class koneksi
import gui.frameUtama; //manggil package gui frame
/**
 *
 * @author ASUS
 */
public class Pertambangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {// anggapannya ini klo di html index utama lgsg
    
     new frameUtama().setVisible(true); // memnggil contruktor frame dan menjalakn formnya
       
    
    
//----------------Database utk tambah hapus ubah show----------- 
       // koneksi db = new koneksi();// tipe kelasnya.objeknya = intens'new'.dari konstroktornya. menjalankan koneksi
      /*tambah dan ubah*/ //db.ubahBatu(2, "Pasir", "-", "Granit adalah jenis batuan beku yang terbentuk dari proses pendinginan magma di dalam kerak bumi. Batuan ini terdiri dari mineral-mineral seperti kuarsa, feldspar, dan mika, yang memberikan granit warna, pola, dan tekstur yang beragam. Granit biasanya memiliki tekstur butir yang kasar hingga sedang.");
     //hapus--> db.hapusBatu(1);
/*    db.cariBatu(2);
    db.dataBatu();
    }*/ 
   
   // penginputan pakai array
/*  batu saya = new batu(); //manggil array
   saya.isiJenis("1");
   saya.isiJenis("2");
   saya.isiJenis("3");
   saya.isiJenis("4");
   saya.isiJenis("5");
  
   System.err.println(saya.getJenisBatu());//otuput biasa ke samping 1,2,3,4,5
for  (int i=0; i<saya.getJenisBatu().size(); i++) {
      System.out.println("NIK "+saya.getJenisBatu().get(i));
    }
}   */ 
    
/*----- penginputan batu----
        batu saya = new batu(); // manggil class batu
        Scanner input = new Scanner(System.in);//aktifkan ini bila inign menginput
                                               // matikan ini bila menggunakn contrakstor
        
        batu saya = new batu ("Gneiss");
        saya.inputjenisBatu("4");
        System.out.println("Nama Batu         : "+saya.ambilNamaBatu());
        System.out.println(""+saya.ambiljenisbatu());
        
        
        System.out.print("Masukkan Nama Batu: ");
        saya.inputNamaBatu(input.nextLine());
        System.out.println("============================");
        System.out.println("-> 1. Granit");
        System.out.println("-> 2. Basalt");
        System.out.println("-> 3. Batu Pasir (Sandstone)");
        System.out.println("-> 4. Gneiss");
        System.out.println("-> 5. Marmer");
        System.out.print("Masukkan Nomor Jenis Batu : ");
        saya.inputjenisBatu(input.nextLine());
        System.out.println("Gambar            : - ");
        System.out.println(saya.ambilBatu());
    } */
    
    /*----- penginputan mineral----
        //mineral saya = new mineral(); // manggil class mineral
        Scanner input = new Scanner(System.in);//aktifkan ini bila inign menginput
                                               // matikan ini bila menggunakn contrakstor
        
        mineral saya = new mineral ();
        saya.inputNamaMineral("hematit");
        saya.inputjenisMineral("5");
        System.out.println("Nama Batu         : "+saya.ambilNamaMineral());
        System.out.println(""+saya.ambilJenisMineral());
        
        
        /*System.out.print("Masukkan Nama Mineral: ");
        saya.inputNamaMineral(input.nextLine());
        System.out.println("============================");
        System.out.println("-> 1. Kuarsa (Quartz)");
        System.out.println("-> 2. Pirit (Pyrite)");
        System.out.println("-> 3. Mika (Mica)");
        System.out.println("-> 4. Galena");
        System.out.println("-> 5. Hematit (Hematite)");
        System.out.print("Masukkan Nomor Jenis Mineral : ");
        saya.inputjenisMineral(input.nextLine());
        System.out.println("Gambar            : - ");
        System.out.println(saya.ambilJenisMineral());*/
    } 
}
