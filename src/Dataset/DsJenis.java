/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class DsJenis {
    private ArrayList<Integer> ID_Jenis;
    private ArrayList<String> Nama_Jenis;
    
    public DsJenis() {
        ID_Jenis = new ArrayList<Integer>();
        Nama_Jenis = new ArrayList<String>();
    }
    
    public void insertID_Jenis(int isi){
        this.ID_Jenis.add(isi);
    }
    public ArrayList<Integer> getRecordID_Jenis(){
        return this.ID_Jenis;
    }
    
    public void insertNama_Jenis(String isi){
        this.Nama_Jenis.add(isi);
    }
    public ArrayList<String> getRecordNama_Jenis(){
        return this.Nama_Jenis;
    }
     
    public void insertJenis(int ID_Jenis , String Nama_Jenis){
        this.ID_Jenis.add(ID_Jenis);
        this.Nama_Jenis.add(Nama_Jenis);   
    }
}