/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010164;

/**
 *
 * @author USER
 */
public class ttransaksi {
    private String ID_Transaksi;
    private String Kode_Transaksi;
    private String ID_User;
    private String Tgl_Transaksi;
    private String Sub_Total;
    private String Nama_Pembeli;
    private String Jenis_Pembayaran;
    
    public ttransaksi(){}
    
    public void setID_Transaksi (String Int){
        this.ID_Transaksi=ID_Transaksi;
    }
    public String getID_Transaksi(){
        return this.ID_Transaksi;
    }
    
    public void setKode_Transaksi (String NOP){
        this.Kode_Transaksi=Kode_Transaksi;
    }
    public String getKode_Transaksi(){
        return this.Kode_Transaksi;
    }
    
    public void setID_User (String Int){
        this.ID_User=ID_User;
    }
    public String getID_User(){
        return this.ID_User;
    }
    
    public void setTgl_Transaksi (String Date){
        this.Tgl_Transaksi=Tgl_Transaksi;
    }
    public String getTgl_Transaksi(){
        return this.Tgl_Transaksi;
    }
    
    public void setSub_Total (String Int){
        this.Sub_Total=Sub_Total;
    }
    public String getSub_Total(){
        return this.Sub_Total;
    }
    
    public void setNama_Pembeli (String NOP){
        this.Nama_Pembeli=Nama_Pembeli;
    }
    public String getNama_Pembeli(){
        return this.Nama_Pembeli;
    }
    
    public void setJenis_Pembayaran (String NOP){
        this.Jenis_Pembayaran=Jenis_Pembayaran;
    }
    public String getJenis_Pembayaran (){
        return this.Jenis_Pembayaran;
    }
       
    
}
