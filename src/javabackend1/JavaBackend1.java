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
public class JavaBackend1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Cach tao obj
        KhachHang kh01;
        kh01= new KhachHang();
        kh01.ma=1;
        kh01.ten= "Nguyen Van A";
        kh01.diaChi="Ha Noi";
        System.out.println("Xin chao Ban :"+kh01.ten+" diachi: "+kh01.diaChi );
        System.out.println("Thêm status");
    }
    
}
