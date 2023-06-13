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
public class DsJual {
    private ArrayList<Integer> ID_Transaksi;
    private ArrayList<String> ID_Barang;
    private ArrayList<Integer> Jumlah_Beli;
    private ArrayList<Integer> Total_Harga;
   
    public DsJual() {
        ID_Transaksi = new ArrayList<Integer>();
        ID_Barang = new ArrayList<String>();
        Jumlah_Beli = new ArrayList<Integer>();
        Total_Harga = new ArrayList<Integer>();
    }
    
    public void insertID_Transaksi(int isi){
        this.ID_Transaksi.add(isi);
    }
    public ArrayList<Integer> getRecordID_Transaksi(){
        return this.ID_Transaksi;
    }
    
    public void insertID_Barang(String isi){
        this.ID_Barang.add(isi);
    }
    public ArrayList<String> getRecordID_Barang(){
        return this.ID_Barang;
    }
    
    public void insertJumlah_Beli(int isi){
        this.Jumlah_Beli.add(isi);
    }
    public ArrayList<Integer> getJumlah_Beli(){
        return this.Jumlah_Beli;
    }
    
    public void insertTotal_Harga(int isi){
        this.Total_Harga.add(isi);
    }
    public ArrayList<Integer> getRecordTotal_Harga(){
        return this.Total_Harga;
    }
    
    
    public void insertBarang(int ID_Transaksi, String ID_Barang, int Jumlah_Beli, int Total_Harga){
        this.ID_Transaksi.add(ID_Transaksi);
        this.ID_Barang.add(ID_Barang);
        this.Jumlah_Beli.add(Jumlah_Beli);
        this.Total_Harga.add(Total_Harga);
        
    }
}