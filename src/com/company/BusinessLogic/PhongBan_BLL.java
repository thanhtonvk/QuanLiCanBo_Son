package com.company.BusinessLogic;

import com.company.Entites.PhongBan;

import java.util.ArrayList;
import java.util.Scanner;

public class PhongBan_BLL {
    Scanner scanner = new Scanner(System.in);
    public void Nhap(ArrayList<PhongBan>phongBans){
        while(true){
            PhongBan phongBan = new PhongBan();
            phongBan.Nhap(phongBans);
            phongBans.add(phongBan);
            System.out.println("Bạn muốn thêm tiếp không?C/K");
            String chon = scanner.nextLine();
            if(chon.equalsIgnoreCase("k")) break;
        }
    }
    public void Hien(ArrayList<PhongBan>phongBans){
        for (PhongBan phongBan:phongBans
             ) {
            phongBan.Hien();
        }
    }
}
