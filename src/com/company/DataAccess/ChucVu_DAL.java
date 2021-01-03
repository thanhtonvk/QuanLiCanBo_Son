package com.company.DataAccess;

import com.company.Entites.ChucVu;

import java.io.*;
import java.util.ArrayList;

public class ChucVu_DAL {
    File file = new File("chucvu.txt");
    public void docFile(ArrayList<ChucVu>chucVus){
        try{
            if(file.exists()){
                FileReader fileReader= new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while((line = bufferedReader.readLine())!=null){
                    String[]arr=line.split("#");
                    chucVus.add(new ChucVu(arr[0],arr[1],arr[2] ));
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
    public void ghiFile(ArrayList<ChucVu>chucVus){
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (ChucVu chucVu:chucVus
            ) {
                fileWriter.write(chucVu.toString()+"\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
