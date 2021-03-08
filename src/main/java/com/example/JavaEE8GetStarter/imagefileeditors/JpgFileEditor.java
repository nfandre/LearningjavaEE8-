package com.example.JavaEE8GetStarter.imagefileeditors;

import com.example.JavaEE8GetStarter.qualifiers.JpgFileEditorQualifier;

@JpgFileEditorQualifier
public class JpgFileEditor implements ImageFileEditor {
    @Override
    public String openFile(String fileName) {
        return "Opening JPG File " + fileName;
    }

    @Override
    public String editFile(String fileName) {
        return "Editing JPG File " + fileName;
    }

    @Override
    public String writefile(String fileName) {
        return "Writing JPG File " + fileName;
    }

    @Override
    public String saveFile(String fileName) {
        return "Saving JPG File " + fileName;
    }
}
