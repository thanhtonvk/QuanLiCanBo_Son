package com.company.DataAccess;

import com.company.Entites.CanBo;

import java.io.*;
import java.util.ArrayList;

public class CanBo_DAL {
    File file = new File("canbo.txt");
    public void docFile(ArrayList<CanBo>canBos){
        try{
            if(file.exists()){
                FileReader fileReader= new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while((line = bufferedReader.readLine())!=null){
                    String[]arr=line.split("#");
                    canBos.add(new CanBo(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6]));
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
    public void ghiFile(ArrayList<CanBo>canBos){
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (CanBo canBo:canBos
            ) {
                fileWriter.write(canBo.toString()+"\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
