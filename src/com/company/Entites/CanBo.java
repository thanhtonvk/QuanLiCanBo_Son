package com.company.Entites;

import java.util.ArrayList;
import java.util.Scanner;

public class CanBo {
    private String macb;
    private String hoten;
    private String ngaysinh;
    private String gioitinh;
    private String diachi;
    private String sdt;
    private String mapb;

    public CanBo() {

    }

    public String getMapb() {
        return mapb;
    }

    public void setMapb(String mapb) {
        this.mapb = mapb;
    }

    public String getTenPhong(ArrayList<PhongBan>phongBans,String mapb){
        String phong = "";
        for (PhongBan phongBan:phongBans
             ) {
            if(mapb.equalsIgnoreCase(phongBan.getMapb())){
                phong= phongBan.getTenphong();
            }
        }
        return phong;
    }
    public void Hien(ArrayList<PhongBan>phongBans){
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s\n",macb,hoten,ngaysinh,gioitinh,diachi,sdt,getTenPhong(phongBans,mapb));
    }
    public String getMapb(ArrayList<PhongBan>phongBans){
        Scanner scanner= new Scanner(System.in);
        String mapb= scanner.nextLine();
        boolean kt=true;
        while(kt){
            for (PhongBan phongBan:phongBans
                 ) {
                if(mapb.equalsIgnoreCase(phongBan.getMapb())){
                    kt = false;
                }
            }
            if(kt){
                System.out.println("Không tìm thấy phòng ban, nhập lại");
                mapb = scanner.nextLine();
            }
        }
        return mapb;
    }
   public void Nhap(ArrayList<CanBo>canBos,ArrayList<PhongBan>phongBans){
        Scanner scanner = new Scanner(System.in);
        macb = "CB"+(canBos.size()+1);
       System.out.println("Nhập họ tên");
       hoten = scanner.nextLine();
       System.out.println("Nhập ngày sinh");
       ngaysinh = scanner.nextLine();
       System.out.println("Nhập giới tính");
       gioitinh = scanner.nextLine();
       System.out.println("Nhập địa chỉ");
       diachi = scanner.nextLine();
       System.out.println("Nhập sđt");
       sdt = scanner.nextLine();
       System.out.println("Nhập mã phòng ban");
       mapb= getMapb(phongBans);
   }

    @Override
    public String toString() {
        return macb+"#"+hoten+"#"+ngaysinh+"#"+gioitinh+"#"+diachi+"#"+sdt+"#"+mapb;
    }

    public String getMacb() {
        return macb;
    }

    public void setMacb(String macb) {
        this.macb = macb;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public CanBo(String macb, String hoten, String ngaysinh, String gioitinh, String diachi, String sdt,String mapb) {
        this.macb = macb;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.mapb = mapb;
    }
}
