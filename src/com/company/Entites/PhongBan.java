package com.company.Entites;

import java.util.ArrayList;
import java.util.Scanner;

public class PhongBan {
    private String mapb,tenphong,sdt,diachi;

    public PhongBan() {
    }

    public void Nhap(ArrayList<PhongBan>phongBans){
        Scanner scanner= new Scanner(System.in);
        mapb = "PB"+(phongBans.size()+1);
        System.out.println("Nhập tên phòng");
        tenphong= scanner.nextLine();
        System.out.println("Nhập sđt");
        sdt = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        diachi = scanner.nextLine();
    }
    public void Hien(){
        System.out.printf("|%-20s|%-20s|%-20s|%-20s\n",mapb,tenphong,sdt,diachi);
    }
    @Override
    public String toString(){
        return mapb+"#"+tenphong+"#"+sdt+"#"+diachi;
    }
    public String getMapb() {
        return mapb;
    }

    public void setMapb(String mapb) {
        this.mapb = mapb;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public PhongBan(String mapb, String tenphong, String sdt, String diachi) {
        this.mapb = mapb;
        this.tenphong = tenphong;
        this.sdt = sdt;
        this.diachi = diachi;
    }
}
