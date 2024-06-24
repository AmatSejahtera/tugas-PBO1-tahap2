/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Batu_batu;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class batu extends batucari{
    
    String namaBatu;
    
    ArrayList<String> jenisArray = new ArrayList<>();// nambah data pakai arraylist --import dlu diatas--
    
    public batu(){}
    public batu(String namaBatu){ //, String namaBatu, String gambar, String keterangan)
//        this.idBatu=idBatu;
        this.namaBatu=namaBatu;
//        this.gambar=gambar;
//        this.keterangan=keterangan;
    }
    
    public void isiJenis (String jenis){ // diintens dari atas
        jenisArray.add(jenis);
    } 
    public ArrayList<String> getJenisBatu(){
        return this.jenisArray;
    }
    
    public void inputNamaBatu (String idBatu){
        this.namaBatu=namaBatu;
    }
    public String ambilNamaBatu(){
        return this.namaBatu;
    }
}
