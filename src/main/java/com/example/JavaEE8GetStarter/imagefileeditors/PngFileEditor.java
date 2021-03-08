package com.example.JavaEE8GetStarter.imagefileeditors;

import com.example.JavaEE8GetStarter.qualifiers.PngFileEditorQualifier;

@PngFileEditorQualifier
public class PngFileEditor implements ImageFileEditor {
    @Override
    public String openFile(String fileName) {
        return "Opening PNG File " + fileName;
    }

    @Override
    public String editFile(String fileName) {
        return "Editing PNG File " + fileName;
    }

    @Override
    public String writefile(String fileName) {
        return "Writing PNG File " + fileName;
    }

    @Override
    public String saveFile(String fileName) {
        return "Saving PNG File " + fileName;
    }    
}
