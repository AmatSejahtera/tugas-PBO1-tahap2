/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mineral;

/**
 *
 * @author ASUS
 */
public class mineral extends mineralCari {
  String namaMineral;

    public mineral (){}
    
    public void inputNamaMineral (String nama){
        this.namaMineral=nama;
    }
    public String ambilNamaMineral(){
        return this.namaMineral;
    }
 
}
