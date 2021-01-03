package com.company.Entites;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenMon {
    private String macb,macm,mota;

    public ChuyenMon() {

    }

    public void Nhap(ArrayList<ChuyenMon> chuyenMons){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã cán bộ");
        macb = scanner.nextLine();
        macm = "CM"+(chuyenMons.size()+1);
        System.out.println("Nhập mô tả chuyên môn");
        mota = scanner.nextLine();
    }
    public void Hien(){
        System.out.printf("|%-20s|%-20s\n",macm,mota);
    }
    @Override
    public  String toString(){
        return macb+"#"+macm+"#"+mota;
    }
    public String getMacb() {
        return macb;
    }

    public void setMacb(String macb) {
        this.macb = macb;
    }

    public String getMacm() {
        return macm;
    }

    public void setMacm(String macm) {
        this.macm = macm;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public ChuyenMon(String macb, String macm, String mota) {
        this.macb = macb;
        this.macm = macm;
        this.mota = mota;
    }
}
