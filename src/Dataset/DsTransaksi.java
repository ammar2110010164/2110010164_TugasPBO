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
public class DsTransaksi {
    private ArrayList<Integer> ID_Transaksi;
    private ArrayList<String> Kode_Transaksi;
    private ArrayList<Integer> ID_User;
    private ArrayList<Integer> Tgl_Transaksi;
    private ArrayList<Integer> Sub_Total;
    private ArrayList<Integer> Nama_Pembeli;
    private ArrayList<Integer> Jenis_Pembayaran;
    
    public DsTransaksi() {
        ID_Transaksi = new ArrayList<Integer>();
        Kode_Transaksi = new ArrayList<String>();
        ID_User = new ArrayList<Integer>();
        Tgl_Transaksi = new ArrayList<Integer>();
        Sub_Total = new ArrayList<Integer>();
        Nama_Pembeli = new ArrayList<Integer>();
        Jenis_Pembayaran = new ArrayList<Integer>();
    }
    
    public void insertID_Transaksi(int isi){
        this.ID_Transaksi.add(isi);
    }
    public ArrayList<Integer> getRecordID_Transaksi(){
        return this.ID_Transaksi;
    }
    
    public void insertKode_Transaksi(String isi){
        this.Kode_Transaksi.add(isi);
    }
    public ArrayList<String> getRecordKode_Transaksi(){
        return this.Kode_Transaksi;
    }
    
    public void insertID_User(int isi){
        this.ID_User.add(isi);
    }
    public ArrayList<Integer> getRecordID_User(){
        return this.ID_User;
    }
    
    public void insertTgl_Transaksi(int isi){
        this.Tgl_Transaksi.add(isi);
    }
    public ArrayList<Integer> getRecordTgl_Transaksi(){
        return this.Tgl_Transaksi;
    }
    
    public void insertSub_Total(int isi){
        this.Sub_Total.add(isi);
    }
    public ArrayList<Integer> getRecordSub_Total(){
        return this.Sub_Total;
    }
    
    public void insertNama_Pembeli(int isi){
        this.Nama_Pembeli.add(isi);
    }
    public ArrayList<Integer> getRecordNama_Pembeli(){
        return this.Nama_Pembeli;
    }
    
     public void insertJenis_Pembayaran(int isi){
        this.Jenis_Pembayaran.add(isi);
    }
    public ArrayList<Integer> getRecordJenis_Pembayaran(){
        return this.Jenis_Pembayaran;
    }
    
    public void insertTransaksi(int ID_Transaksi, String Kode_Transaksi, int ID_User, int Tgl_Transaksi, 
            int Sub_Total, int Nama_Pembeli, int Jenis_Pembayaran){
        this.ID_Transaksi.add(ID_Transaksi);
        this.Kode_Transaksi.add(Kode_Transaksi);
        this.ID_User.add(ID_User);
        this.Tgl_Transaksi.add(Tgl_Transaksi);
        this.Sub_Total.add(Sub_Total);
        this.Nama_Pembeli.add(Nama_Pembeli);
        this.Jenis_Pembayaran.add(Jenis_Pembayaran);
        
    }
}