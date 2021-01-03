package com.company.DataAccess;

import com.company.Entites.PhongBan;

import java.io.*;
import java.util.ArrayList;

public class PhongBan_DAL {
    File file = new File("phongban.txt");
    public void docFile(ArrayList<PhongBan>phongBans){
        try{
            if(file.exists()){
                FileReader fileReader= new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while((line = bufferedReader.readLine())!=null){
                    String[]arr=line.split("#");
                    phongBans.add(new PhongBan(arr[0],arr[1],arr[2],arr[3]));
                }
                fileReader.close();
                bufferedReader.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void ghiFile(ArrayList<PhongBan>phongBans){
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (PhongBan phongBan:phongBans
            ) {
                fileWriter.write(phongBan.toString()+"\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
