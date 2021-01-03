package com.company.DataAccess;

import com.company.Entites.ChuyenMon;

import java.io.*;
import java.util.ArrayList;

public class ChuyenMon_DAL {
    File file = new File("chuyenmon.txt");
    public void docFile(ArrayList<ChuyenMon>chuyenMons){
        try{
            if(file.exists()){
                FileReader fileReader= new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while((line = bufferedReader.readLine())!=null){
                    String[]arr=line.split("#");
                    chuyenMons.add(new ChuyenMon(arr[0],arr[1],arr[2] ));
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
    public void ghiFile(ArrayList<ChuyenMon>chuyenMons){
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (ChuyenMon chuyenMon:chuyenMons
            ) {
                fileWriter.write(chuyenMon.toString()+"\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
