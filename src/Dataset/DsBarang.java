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
public class DsBarang {
    private ArrayList<String>ID_Jenis;
    private ArrayList<String>ID_Barang;
    private ArrayList<String>Nama_Barang;
    private ArrayList<String>Stok;
    private ArrayList<String>Harga_Barang;
    
    public DsBarang() {
        ID_Jenis= new ArrayList<String>();
        ID_Barang = new ArrayList<String>();
        Nama_Barang = new ArrayList<String>();
        Stok= new ArrayList<String>();
        Harga_Barang = new ArrayList<String>();
    }
    
    public void insertID_Jenis(String isi){
        this. ID_Jenis.add(isi);
    }
    public ArrayList<String> getRecordID_Jenis(){
        return this.ID_Jenis;
    }
    
    public void insertID_Barang(String isi){
        this.ID_Barang.add(isi);
    }
    public ArrayList<String> getRecordID_Barang(){
        return this.ID_Barang;
    }
    
    public void insertNama_Barang(String isi){
        this.Nama_Barang.add(isi);
    }
    public ArrayList<String> getRecordNama_Barang(){
        return this. Nama_Barang;
    }
    
    public void insertStok(String isi){
        this.Stok.add(isi);
    }
    public ArrayList<String> getRecordStok(){
        return this.Stok;
    }
    
    public void insertHarga_Barang(String isi){
        this.Harga_Barang.add(isi);
    }
    public ArrayList<String> getRecordHarga_Barang(){
        return this.Harga_Barang;
    }
    
    public void insertBarang(String ID_Jenis, String ID_Barang, String Nama_Barang, String Stok, 
            String Harga_Barang){
        this.ID_Jenis.add(ID_Jenis);
        this.ID_Barang.add(ID_Barang);
        this.Nama_Barang.add(Nama_Barang);
        this.Stok.add(Stok);
        this.Harga_Barang .add(Harga_Barang);
        
    }
}