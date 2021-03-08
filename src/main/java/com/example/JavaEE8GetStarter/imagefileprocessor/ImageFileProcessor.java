package com.example.JavaEE8GetStarter.imagefileprocessor;

import com.example.JavaEE8GetStarter.imagefileeditors.ImageFileEditor;
import com.example.JavaEE8GetStarter.loggers.TimeLogger;
import com.example.JavaEE8GetStarter.qualifiers.PngFileEditorQualifier;

import javax.inject.Inject;

public class ImageFileProcessor {
    private final ImageFileEditor imageFileEditor;
    private final TimeLogger timeLogger;

    @Inject
    public ImageFileProcessor(@PngFileEditorQualifier ImageFileEditor imageFileEditor, TimeLogger timeLogger) {
        this.imageFileEditor = imageFileEditor;
        this.timeLogger = timeLogger;
    }
    public ImageFileEditor getImageFileEditor() { return this.imageFileEditor; }
    public TimeLogger getTimeLogger() { return this.timeLogger; }
    public String openFile(String fileName) {
        return this.imageFileEditor.openFile(fileName) + " at " + timeLogger.getTime();
    }
    public String editFile(String fileName) {
        return this.imageFileEditor.editFile(fileName) + " at " + timeLogger.getTime();
    }
    public String writeFile(String fileName) {
        return this.imageFileEditor.writefile(fileName) + " at " + timeLogger.getTime();
    }
    public String saveFile(String fileName) {
        return this.imageFileEditor.saveFile(fileName) + " at " + timeLogger.getTime();
    }


}
