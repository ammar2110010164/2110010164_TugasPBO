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
public class DsUser {
    private ArrayList<Integer> ID_User;
    private ArrayList<String> Nama;
    private ArrayList<Integer> No_telp;
    
    public DsUser() {
        ID_User = new ArrayList<Integer>();
        Nama = new ArrayList<String>();
        No_telp = new ArrayList<Integer>();
    }
    
    public void insertID_User(int isi){
        this.ID_User.add(isi);
    }
    public ArrayList<Integer> getRecordID_User(){
        return this.ID_User;
    }
    
    public void insertNama(String isi){
        this.Nama.add(isi);
    }
    public ArrayList<String> getRecordNama(){
        return this.Nama;
    }
    
    public void insertNo_telp(int isi){
        this.No_telp.add(isi);
    }
    public ArrayList<Integer> getRecordNo_telp(){
        return this.No_telp;
    }
    
    public void insertBarang(int ID_User, String Nama, int No_telp){
        this.ID_User.add(ID_User);
        this.Nama.add(Nama);
        this.No_telp.add(No_telp);
        
    }
}