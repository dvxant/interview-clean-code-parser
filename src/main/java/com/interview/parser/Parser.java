package com.interview.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// This class thread safe
public class Parser {
    private File file;
    private synchronized setFile(File f){
        this.file = f;
    }
    private synchronized getfile(){
        return file;
    }

    public String parseContent() throws IOException {
        FileInputStream i = new FileInputStream(file);
        String output = "";
        int data;
        while ((data = i.read())>0){
            output += (char) data;
        }
        return output;
    }

    public String parseContentWithoutUnicode() throws IOException {
        FileInputStream i = new FileInputStream(file);
        String output = "";
        int data;
        while ((data = i.read())>0){
            if(data< 0x80) {
                output += (char) data;
            }
        }
        return output;
    }

    public void saveContent(String content) throws IOException {
        FileOutputStream o = new FileOutputStream(file);
        for (int i = 0; i < content.length(); i +=1){
            o.write(content.charAt(i));
        }
    }
}
