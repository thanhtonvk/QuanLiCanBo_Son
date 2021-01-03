package com.company.BusinessLogic;

import com.company.Entites.ChucVu;

import java.util.ArrayList;
import java.util.Scanner;

public class ChucVu_BLL {
    Scanner scanner = new Scanner(System.in);
    public void themChucVu(ArrayList<ChucVu>chucVus){
        while(true){
            ChucVu chucVu = new ChucVu();
           chucVu.Nhap(chucVus);
            chucVus.add(chucVu);
            System.out.println("Bạn muốn thêm tiếp không?C/K");
            String chon = scanner.nextLine();
            if(chon.equalsIgnoreCase("k")) break;
        }
    }
    public void hienDSChucVu(ArrayList<ChucVu>chucVus){
        for (ChucVu chucVu:chucVus
        ) {
            chucVu.Hien();
        }
    }
}
