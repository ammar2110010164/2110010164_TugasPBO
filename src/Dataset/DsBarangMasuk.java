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
public class DsBarangMasuk {
    private ArrayList<String> Kode_Barangmasuk;
    private ArrayList<String> ID_Barang;
    private ArrayList<String> ID_User;
    private ArrayList<String> ID_Supplier;
    private ArrayList<String> Jumlah_Masuk;
    private ArrayList<String> Tgl_Masuk;
    private ArrayList<String> Harga_Beli;
    private ArrayList<String> Harga_Barang;
    
    
    public DsBarangMasuk() {
        Kode_Barangmasuk = new ArrayList<String>();
        ID_Barang = new ArrayList<String>();
        ID_User = new ArrayList<String>();
        ID_Supplier = new ArrayList<String>();
        Jumlah_Masuk = new ArrayList<String>();
        Tgl_Masuk = new ArrayList<String>();
        Harga_Beli = new ArrayList<String>();
        Harga_Barang = new ArrayList<String>();
    }
    
    public void insertKKode_Barangmasuk(String isi){
        this.Kode_Barangmasuk.add(isi);
    }
    public ArrayList<String> getRecordKode_Barangmasuk(){
        return this.Kode_Barangmasuk;
    }
    
    public void insertID_Barang(String isi){
        this.ID_Barang.add(isi);
    }
    public ArrayList<String> getRecordID_Barang(){
        return this.ID_Barang;
    }
    
    public void insertID_User(String isi){
        this.ID_User.add(isi);
    }
    public ArrayList<String> getRecordID_User(){
        return this.ID_User;
    }
    
    public void insertID_Supplier(String isi){
        this.ID_Supplier.add(isi);
    }
    public ArrayList<String> getRecordID_Supplier(){
        return this.ID_Supplier;
    }
    
    public void insertJumlah_Masuk(String isi){
        this.Jumlah_Masuk.add(isi);
    }
    public ArrayList<String> getRecordJumlah_Masuk(){
        return this.Jumlah_Masuk;
    }
    
    public void insertTgl_Masuk(String isi){
        this.Tgl_Masuk.add(isi);
    }
    public ArrayList<String> getRecordTgl_Masuk(){
        return this.Tgl_Masuk;
    }
    
    public void insertHarga_Beli(String isi){
        this.Harga_Beli.add(isi);
    }
    public ArrayList<String> getRecordHarga_Beli(){
        return this.Harga_Beli;
    }
    
    public void insertHarga_Barang (String isi){
        this.Harga_Barang .add(isi);
    }
    public ArrayList<String> getRecordHarga_Barang (){
        return this.Harga_Barang ;
    }
    public void insertBarangMasuk(String Kode_Barangmasuk, String ID_Barang, String ID_User, String ID_Supplier, 
            String Jumlah_Masuk, String Tgl_Masuk, String Harga_Beli, String Harga_Barang ){
        this.Kode_Barangmasuk.add(Kode_Barangmasuk);
        this.ID_Barang.add(ID_Barang);
        this.ID_User.add(ID_User);
        this.ID_Supplier.add(ID_Supplier);
        this.Jumlah_Masuk.add(Jumlah_Masuk);
        this.Tgl_Masuk.add(Tgl_Masuk);
        this.Harga_Beli.add(Harga_Beli);
        this.Harga_Barang.add(Harga_Barang);
        
        
    }
}