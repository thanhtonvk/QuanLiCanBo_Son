package com.company.View;

import com.company.BusinessLogic.*;
import com.company.DataAccess.*;
import com.company.Entites.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CanBo_GUI {
    private static void MenuNhapThem() {
        System.out.println("-------------------------------------------------");
        System.out.println("|               QUẢN LÝ CÁN BỘ                   |");
        System.out.println("--------------------------------------------------");
        System.out.println("|       1. Nhập bằng cấp                         |");
        System.out.println("|       2. Nhập chức vụ                          |");
        System.out.println("|       3. Nhập chuyên môn                       |");
        System.out.println("|       0. Thoát                                 |");
        System.out.println("--------------------------------------------------");
    }

    private static void NhapThem(ArrayList<BangCap> bangCaps, ArrayList<ChucVu> chucVus, ArrayList<ChuyenMon> chuyenMons, BangCap_DAL bangCap_dal, ChuyenMon_DAL chuyenMon_dal, ChucVu_DAL chucVu_dal, BangCap_BLL bangCap_bll, ChucVu_BLL chucVu_bll, ChuyenMon_BLL chuyenMon_bll) {
        int chon;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            MenuNhapThem();
            chon = Integer.parseInt(scanner.nextLine());
            if (chon == 0) break;
            switch (chon) {
                case 1:
                    bangCap_bll.themBangCap(bangCaps);
                    bangCap_dal.ghiFile(bangCaps);
                    break;
                case 2:
                    chucVu_bll.themChucVu(chucVus);
                    chucVu_dal.ghiFile(chucVus);
                    break;
                case 3:
                    chuyenMon_bll.themChuyenMon(chuyenMons);
                    chuyenMon_dal.ghiFile(chuyenMons);
                    break;
                default:
                    break;
            }
        }
    }

    private static void Menu() {
        System.out.println("----------------------------------------------------");
        System.out.println("|               QUẢN LÝ CÁN BỘ                     |");
        System.out.println("----------------------------------------------------");
        System.out.println("|       1. Nhập cán bộ    6. Xem bằng cấp cán bộ   |");
        System.out.println("|       2. Hiện cán bộ    7. Xem chức vụ cán bộ    |");
        System.out.println("|       3. Sửa cán bộ     8. Xem chuyên môn cán bộ |");
        System.out.println("|       4. Xóa cán bộ     9. Nhập phòng ban        |");
        System.out.println("|       5. Tìm kiếm       10.Hiện phòng ban        |");
        System.out.println("|       11.Nhập bằng cấp,chức vụ, chuyên môn       |");
        System.out.println("|                    0. Thoát                      |");
        System.out.println("----------------------------------------------------");
    }

    public static void Run(CanBo_BLL canBo_bll, CanBo_DAL canBo_dal, ArrayList<CanBo> canBos, ArrayList<PhongBan> phongBans, ArrayList<BangCap> bangCaps, ArrayList<ChucVu> chucVus, ArrayList<ChuyenMon> chuyenMons, BangCap_DAL bangCap_dal, ChuyenMon_DAL chuyenMon_dal, ChucVu_DAL chucVu_dal, BangCap_BLL bangCap_bll, ChucVu_BLL chucVu_bll, ChuyenMon_BLL chuyenMon_bll, PhongBan_DAL phongBan_dal, PhongBan_BLL phongBan_bll) {
        int chon;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu();
            chon = Integer.parseInt(scanner.nextLine());
            if (chon == 0) break;
            switch (chon) {
                case 1:
                    canBo_bll.Nhap(canBos, phongBans);
                    canBo_dal.ghiFile(canBos);
                    break;
                case 2:
                    canBo_bll.Hien(canBos, phongBans);
                    break;
                case 3:
                    canBo_bll.Sua(canBos, phongBans);
                    canBo_dal.ghiFile(canBos);
                    break;
                case 4:
                    canBo_bll.Xoa(canBos);
                    canBo_dal.ghiFile(canBos);
                    break;
                case 5:
                    canBo_bll.TimKiem(canBos, phongBans);
                    break;
                case 6:
                    canBo_bll.XemBangCap(bangCaps, canBos);
                    break;
                case 7:
                    canBo_bll.XemChucVu(chucVus, canBos);
                    break;
                case 8:
                    canBo_bll.XemChuyenMon(chuyenMons, canBos);
                    break;
                case 9:
                    phongBan_bll.Nhap(phongBans);
                    phongBan_dal.ghiFile(phongBans);
                    break;
                case 10:
                    phongBan_bll.Hien(phongBans);
                    break;
                case 11:
                    NhapThem(bangCaps, chucVus, chuyenMons, bangCap_dal, chuyenMon_dal, chucVu_dal, bangCap_bll, chucVu_bll, chuyenMon_bll);
                    break;
                default:
                    break;
            }
        }
    }

}
