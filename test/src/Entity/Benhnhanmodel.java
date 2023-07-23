/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author AD
 */
public class Benhnhanmodel {
    int id;
    String hoten;
    String gender;
    String tongquat;
    String diung;
    String Kehoach;

    public Benhnhanmodel(int id,String hoten, String gender, String tongquat, String diung, String Kehoach) {
        this.id = id;
        this.hoten = hoten;
        this.gender = gender;
        this.tongquat = tongquat;
        this.diung = diung;
        this.Kehoach = Kehoach;
    }   

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTongquat() {
        return tongquat;
    }

    public void setTongquat(String tongquat) {
        this.tongquat = tongquat;
    }

    public String getDiung() {
        return diung;
    }

    public void setDiung(String diung) {
        this.diung = diung;
    }

    public String getKehoach() {
        return Kehoach;
    }

    public void setKehoach(String Kehoach) {
        this.Kehoach = Kehoach;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
