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
public class DsSupplier{
    private ArrayList<Integer> ID_Supplier;
    private ArrayList<String> Nama_Supplier;
    private ArrayList<Integer> No_telp;
    private ArrayList<Integer> Alamat;
    private ArrayList<Integer> Ket;
    
    public DsSupplier() {
        ID_Supplier = new ArrayList<Integer>();
        Nama_Supplier = new ArrayList<String>();
        No_telp = new ArrayList<Integer>();
        Alamat = new ArrayList<Integer>();
        Ket = new ArrayList<Integer>();
    }
    
    public void insertID_Supplier(int isi){
        this.ID_Supplier.add(isi);
    }
    public ArrayList<Integer> getRecordID_Supplier(){
        return this.ID_Supplier;
    }
    
    public void insertNama_Supplier(String isi){
        this.Nama_Supplier.add(isi);
    }
    public ArrayList<String> getRecordNama_Supplier(){
        return this.Nama_Supplier;
    }
    
    public void insertNo_telp(int isi){
        this.No_telp.add(isi);
    }
    public ArrayList<Integer> getRecordNo_telp(){
        return this.No_telp;
    }
    
    public void insertAlamat(int isi){
        this.Alamat.add(isi);
    }
    public ArrayList<Integer> getRecordAlamat(){
        return this.Alamat;
    }
    
    public void insertKet(int isi){
        this.Ket.add(isi);
    }
    public ArrayList<Integer> getRecordKet(){
        return this.Ket;
    }
    
    public void insertBarang(int ID_Supplier, String Nama_Supplier, int No_telp, int Alamat, 
            int Ket){
        this.ID_Supplier.add(ID_Supplier);
        this.Nama_Supplier.add(Nama_Supplier);
        this.No_telp.add(No_telp);
        this.Alamat.add(Alamat);
        this.Ket.add(Ket);
        
    }
}