/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author AD
 */
public class Lichhenmodel {
    private String tenbenhnhan;
    private String Nhasi;
    private String Trokham;
    private String giohen;
    private String phong;
    private String tinhtrang;

    public Lichhenmodel(String tenbenhnhan, String Nhasi, String Trokham, String giohen, String phong, String tinhtrang) {
        this.tenbenhnhan = tenbenhnhan;
        this.Nhasi = Nhasi;
        this.Trokham = Trokham;
        this.giohen = giohen;
        this.phong = phong;
        this.tinhtrang = tinhtrang;
    }

    public String getTenbenhnhan() {
        return tenbenhnhan;
    }

    public void setTenbenhnhan(String tenbenhnhan) {
        this.tenbenhnhan = tenbenhnhan;
    }

    public String getNhasi() {
        return Nhasi;
    }

    public void setNhasi(String Nhasi) {
        this.Nhasi = Nhasi;
    }

    public String getTrokham() {
        return Trokham;
    }

    public void setTrokham(String Trokham) {
        this.Trokham = Trokham;
    }

    public String getGiohen() {
        return giohen;
    }

    public void setGiohen(String giohen) {
        this.giohen = giohen;
    }

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
    
}
