package com.example.JavaEE8GetStarter.imagefileeditors;

public interface ImageFileEditor {
    String openFile(String fileName);
    String editFile(String fileName);
    String writefile(String fileName);
    String saveFile(String fileName);
}
