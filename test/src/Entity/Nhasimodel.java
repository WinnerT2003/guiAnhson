/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author AD
 */
public class Nhasimodel {
    private int Manv;
    private String Hoten;
    private String chucvu;
    private String gender;
    private String Sodt;
    private String Email;

    public Nhasimodel(int Manv, String Hoten, String chucvu, String gender, String Sodt, String Email) {
        this.Manv = Manv;
        this.Hoten = Hoten;
        this.chucvu = chucvu;
        this.gender = gender;
        this.Sodt = Sodt;
        this.Email = Email;
    }

    public int getManv() {
        return Manv;
    }

    public void setManv(int Manv) {
        this.Manv = Manv;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSodt() {
        return Sodt;
    }

    public void setSodt(String Sodt) {
        this.Sodt = Sodt;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
}
