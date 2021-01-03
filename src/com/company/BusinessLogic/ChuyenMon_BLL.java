package com.company.BusinessLogic;

import com.company.Entites.ChuyenMon;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenMon_BLL {
    Scanner scanner = new Scanner(System.in);
    public void themChuyenMon(ArrayList<ChuyenMon>chuyenMons){
        while(true){
            ChuyenMon chuyenMon = new ChuyenMon();
            chuyenMon.Nhap(chuyenMons);
            chuyenMons.add(chuyenMon);
            System.out.println("Bạn muốn thêm tiếp không?C/K");
            String chon = scanner.nextLine();
            if(chon.equalsIgnoreCase("k")) break;
        }
    }
    public void hienDSChuyenMon(ArrayList<ChuyenMon>chuyenMons){
        for (ChuyenMon chuyenMon:chuyenMons
        ) {
            chuyenMon.Hien();
        }
    }
}
