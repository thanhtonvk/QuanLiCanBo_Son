package com.company.BusinessLogic;

import com.company.Entites.BangCap;

import java.util.ArrayList;
import java.util.Scanner;

public class BangCap_BLL {
    Scanner scanner = new Scanner(System.in);
    public void themBangCap(ArrayList<BangCap>bangCaps){
        while(true){
            BangCap bangCap = new BangCap();
            bangCap.Nhap(bangCaps);
            bangCaps.add(bangCap);
            System.out.println("Bạn muốn thêm tiếp không?C/K");
            String chon = scanner.nextLine();
            if(chon.equalsIgnoreCase("k")) break;
        }
    }
    public void hienDSBangCap(ArrayList<BangCap>bangCaps){
        for (BangCap bangCap:bangCaps
             ) {
            bangCap.Hien();
        }
    }
}
