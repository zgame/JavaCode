package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("dddddddddddddddd");

        sss();
        ZipFile("in.txt","out.txt");
    }

    public static void sss(){
        System.out.println("---------------------------");

    }

    public static void zlib(String input, String output) throws Exception {

    }
    /** 压缩单个文件*/
    public static void ZipFile(String filepath ,String zippath) {
        try {
            File file = new File(filepath);
            File zipFile = new File(zippath);
            InputStream input = new FileInputStream(file);
            ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
            zipOut.putNextEntry(new ZipEntry(file.getName()));
            int temp = 0;
            while((temp = input.read()) != -1){
                zipOut.write(temp);
            }
            input.close();
            zipOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
