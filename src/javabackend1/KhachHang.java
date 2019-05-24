/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend1;

/**
 *
 * @author vuman_000
 */
public class KhachHang {
  public  int ma;
  public  String ten;
  public  String diaChi;

    KhachHang() {
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public KhachHang(int ma, String ten, String diaChi) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
    }
    
}


