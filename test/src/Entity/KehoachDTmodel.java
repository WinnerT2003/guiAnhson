/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;
import java.util.Date;
/**
 *
 * @author AD
 */
public class KehoachDTmodel {
    private int id;
    private String mota;
    private String ngaydieutri;
    private String BsiTH;
    private String Trokham;
    private String Ghichu;
    private String danhsachrang;
    private int gia;
    private String hoTen;
    public KehoachDTmodel(int id, String mota, String ngaydieutri, String BsiTH, String Trokham, String Ghichu, String danhsachrang) {
        this.id = id;
        this.mota = mota;
        this.ngaydieutri = ngaydieutri;
        this.BsiTH = BsiTH;
        this.Trokham = Trokham;
        this.Ghichu = Ghichu;
        this.danhsachrang = danhsachrang;
    }

    public KehoachDTmodel(String ngaydieutri, String BsiTH, String hoTen) {
        this.ngaydieutri = ngaydieutri;
        this.BsiTH = BsiTH;
        this.hoTen = hoTen;
    }
    
    public KehoachDTmodel(int id, String mota, int gia) {
        this.id = id;
        this.mota = mota;
        this.gia = gia;
    }
    
    public KehoachDTmodel() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getNgaydieutri() {
        return ngaydieutri;
    }

    public void setNgaydieutri(String ngaydieutri) {
        this.ngaydieutri = ngaydieutri;
    }

    public String getBsiTH() {
        return BsiTH;
    }

    public void setBsiTH(String BsiTH) {
        this.BsiTH = BsiTH;
    }

    public String getTrokham() {
        return Trokham;
    }

    public void setTrokham(String Trokham) {
        this.Trokham = Trokham;
    }

    public String getGhichu() {
        return Ghichu;
    }

    public void setGhichu(String Ghichu) {
        this.Ghichu = Ghichu;
    }

    public String getDanhsachrang() {
        return danhsachrang;
    }

    public void setDanhsachrang(String danhsachrang) {
        this.danhsachrang = danhsachrang;
    }

    public int getGia() {
        return gia;
    }

    public String getHoTen() {
        return hoTen;
    }
    
}
