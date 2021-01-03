package com.company.DataAccess;

import com.company.Entites.BangCap;

import java.io.*;
import java.util.ArrayList;

public class BangCap_DAL {
    File file = new File("bangcap.txt");
    public void docFile(ArrayList<BangCap>bangCaps){
        try{
            if(file.exists()){
                FileReader fileReader= new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while((line = bufferedReader.readLine())!=null){
                    String[]arr=line.split("#");
                    bangCaps.add(new BangCap(arr[0],arr[1],arr[2] ));
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
    public void ghiFile(ArrayList<BangCap>bangCaps){
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (BangCap bangCap:bangCaps
                 ) {
                fileWriter.write(bangCap.toString()+"\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
