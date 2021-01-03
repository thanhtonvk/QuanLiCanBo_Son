package com.company.BusinessLogic;

import com.company.Entites.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CanBo_BLL {
    Scanner scanner= new Scanner(System.in);
    public void Nhap(ArrayList<CanBo>canBos, ArrayList<PhongBan>phongBans){
        while(true){
            CanBo canBo = new CanBo();
            canBo.Nhap(canBos,phongBans);
            canBos.add(canBo);
            System.out.println("Bạn muốn thêm tiếp không?C/K");
            String chon = scanner.nextLine();
            if(chon.equalsIgnoreCase("k")) break;
        }
    }
    public void Hien(ArrayList<CanBo>canBos,ArrayList<PhongBan>phongBans){
        for (CanBo canBo:canBos
             ) {
            canBo.Hien(phongBans);
        }
    }
    public CanBo timCanBo(ArrayList<CanBo>canBos){
        CanBo ketqua= null;
        System.out.println("Nhập cán bộ cần tìm: ");
        String str = scanner.nextLine();
        for (CanBo canBo:canBos
             ) {
            if(str.equalsIgnoreCase(canBo.getHoten())||str.equalsIgnoreCase(canBo.getMacb())){
                ketqua= canBo;
            }
        }
        return  ketqua;
    }
    public void TimKiem(ArrayList<CanBo>canBos,ArrayList<PhongBan>phongBans){
        CanBo canBo = timCanBo(canBos);
        if(canBo == null){
            System.out.println("Không tìm thấy cán bộ");
        }
        else {
            canBo.Hien(phongBans);
        }
    }
    public void Sua(ArrayList<CanBo>canBos,ArrayList<PhongBan>phongBans){
        CanBo canBo = timCanBo(canBos);
        if(canBo == null){
            System.out.println("Không tìm thấy cán bộ");
        }
        else {
           canBo.Nhap(canBos,phongBans);
            System.out.println("Sửa thành công");
        }
    }
    public void Xoa(ArrayList<CanBo>canBos){
        CanBo canBo = timCanBo(canBos);
        if(canBo == null){
            System.out.println("Không tìm thấy cán bộ");
        }
        else {
           canBos.remove(canBo);
            System.out.println("Xóa cán bộ thành công");
        }
    }
    public void XemBangCap(ArrayList<BangCap>bangCaps,ArrayList<CanBo>canBos){
        CanBo canBo = timCanBo(canBos);
        if(canBo == null){
            System.out.println("Không tìm thấy cán bộ");
        }
        else {
            for (BangCap bangCap:bangCaps
                 ) {
                if(bangCap.getMacb().equalsIgnoreCase(canBo.getMacb())){
                    bangCap.Hien();
                }
            }
        }
    }
    public void XemChucVu(ArrayList<ChucVu>chucVus,ArrayList<CanBo>canBos){
        CanBo canBo = timCanBo(canBos);
        if(canBo == null){
            System.out.println("Không tìm thấy cán bộ");
        }
        else {
            for (ChucVu chucVu:chucVus
            ) {
                if(chucVu.getMacb().equalsIgnoreCase(canBo.getMacb())){
                    chucVu.Hien();
                }
            }
        }
    }
    public void XemChuyenMon(ArrayList<ChuyenMon>chuyenMons, ArrayList<CanBo>canBos){
        CanBo canBo = timCanBo(canBos);
        if(canBo == null){
            System.out.println("Không tìm thấy cán bộ");
        }
        else {
            for (ChuyenMon chuyenMon:chuyenMons
            ) {
                if(chuyenMon.getMacb().equalsIgnoreCase(canBo.getMacb())){
                    chuyenMon.Hien();
                }
            }
        }
    }

}
