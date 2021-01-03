package com.company.Entites;

import java.util.ArrayList;
import java.util.Scanner;

public class ChucVu {
    public ChucVu() {

    }

    public void Nhap(ArrayList<ChucVu> chucVus){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã cán bộ");
        macb = scanner.nextLine();
        macv = "CV"+(chucVus.size()+1);
        System.out.println("Nhập mô tả chức vụ");
        mota = scanner.nextLine();
    }
    public void Hien(){
        System.out.printf("|%-20s|%-20s\n",macv,mota);
    }
    @Override
    public  String toString(){
        return macb+"#"+macv+"#"+mota;
    }
    public String getMacb() {
        return macb;
    }

    public void setMacb(String macb) {
        this.macb = macb;
    }

    public String getMacv() {
        return macv;
    }

    public void setMacv(String macv) {
        this.macv = macv;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public ChucVu(String macb, String macv, String mota) {
        this.macb = macb;
        this.macv = macv;
        this.mota = mota;
    }

    private String macb,macv,mota;

}
