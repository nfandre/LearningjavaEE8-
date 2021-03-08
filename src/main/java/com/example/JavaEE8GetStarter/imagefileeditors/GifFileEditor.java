package com.example.JavaEE8GetStarter.imagefileeditors;

import com.example.JavaEE8GetStarter.qualifiers.GifFileEditorQualifier;

@GifFileEditorQualifier
public class GifFileEditor implements ImageFileEditor {
    @Override
    public String openFile(String fileName) {
        return "Opening GIF File " + fileName;
    }

    @Override
    public String editFile(String fileName) {
        return "Editing GIF File " + fileName;
    }

    @Override
    public String writefile(String fileName) {
        return "Writing GIF File " + fileName;
    }

    @Override
    public String saveFile(String fileName) {
        return "Saving GIF File " + fileName;
    }
}
