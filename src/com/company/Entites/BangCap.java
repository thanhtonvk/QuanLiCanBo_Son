package com.company.Entites;

import java.util.ArrayList;
import java.util.Scanner;

public class BangCap {
    private String macb;
    private String mabc;
    private String mota;
    public BangCap(String macb, String mabc, String mota) {
        this.macb = macb;
        this.mabc = mabc;
        this.mota = mota;
    }
    public BangCap(){

    }

    public void Nhap(ArrayList<BangCap>bangCaps){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã cán bộ");
        macb = scanner.nextLine();
        mabc = "BC"+(bangCaps.size()+1);
        System.out.println("Nhập mô tả bằng cấp");
        mota = scanner.nextLine();
    }
    public void Hien(){
        System.out.printf("|%-20s|%-20s\n",mabc,mota);
    }
    @Override
    public  String toString(){
        return macb+"#"+mabc+"#"+mota;
    }
    public String getMacb() {
        return macb;
    }

    public void setMacb(String macb) {
        this.macb = macb;
    }

    public String getMabc() {
        return mabc;
    }

    public void setMabc(String mabc) {
        this.mabc = mabc;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
