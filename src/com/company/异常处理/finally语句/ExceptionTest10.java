package com.company.异常处理.finally语句;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest10 {

    public static void main(String[] args) {

        // 必须在外边声明
        FileInputStream fis = null;

        try{

            fis = new FileInputStream("...");
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }finally{
            //为了保证资源一定会释放
            if(fis != null) {
                try {
                    fis.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
