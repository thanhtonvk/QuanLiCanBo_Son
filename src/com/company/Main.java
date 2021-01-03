package com.company;
import com.company.BusinessLogic.*;
import com.company.DataAccess.*;
import com.company.Entites.*;
import com.company.View.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BangCap_BLL bangCap_bll = new BangCap_BLL();
        CanBo_BLL canBo_bll = new CanBo_BLL();
        ChucVu_BLL chucVu_bll= new ChucVu_BLL();
        ChuyenMon_BLL chuyenMon_bll = new ChuyenMon_BLL();
        PhongBan_BLL  phongBan_bll = new PhongBan_BLL();
        BangCap_DAL bangCap_dal = new BangCap_DAL();
        CanBo_DAL canBo_dal = new CanBo_DAL();
        ChucVu_DAL chucVu_dal= new ChucVu_DAL();
        ChuyenMon_DAL chuyenMon_dal = new ChuyenMon_DAL();
        PhongBan_DAL phongBan_dal = new PhongBan_DAL();
        ArrayList<BangCap>bangCaps = new ArrayList<>();
        ArrayList<CanBo>canBos = new ArrayList<>();
        ArrayList<ChucVu>chucVus = new ArrayList<>();
        ArrayList<ChuyenMon>chuyenMons = new ArrayList<>();
        ArrayList<PhongBan>phongBans = new ArrayList<>();
        bangCap_dal.docFile(bangCaps);
        canBo_dal.docFile(canBos);
        chucVu_dal.docFile(chucVus);
        chuyenMon_dal.docFile(chuyenMons);
        phongBan_dal.docFile(phongBans);
        CanBo_GUI.Run(canBo_bll,canBo_dal,canBos,phongBans,bangCaps,chucVus,chuyenMons,bangCap_dal,chuyenMon_dal,chucVu_dal,bangCap_bll,chucVu_bll,chuyenMon_bll,phongBan_dal,phongBan_bll);
    }
}
