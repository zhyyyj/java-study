package com.yjzh.java.week4;

import java.io.*;

/**
 * @ClassName FilReadDemo
 * @Description TODO
 * @Author zhyyyj
 * @Date 2020/10/26
 **/
public class FilReadDemo {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("C:\\Users\\zhyyyj\\Desktop\\aa");
        InputStream is = new FileInputStream(inputFile);
        byte[] b = new byte[(int) inputFile.length()];
        is.read(b);
        File outputFile = new File("C:\\Users\\zhyyyj\\Desktop\\aa");
        OutputStream os = new FileOutputStream(outputFile);
        os.write(b);
        is.close();
        os.close();
    }
}
