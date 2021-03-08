package com.example.JavaEE8GetStarter.app;

import com.example.JavaEE8GetStarter.imagefileprocessor.ImageFileProcessor;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class ChatApplication {

    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        ImageFileProcessor imageFileProcessor =  container.select(ImageFileProcessor.class).get();
        System.out.println(imageFileProcessor.openFile("file.png"));
        System.out.println(imageFileProcessor.writeFile("file.png"));
        System.out.println(imageFileProcessor.saveFile("file.png"));
    }
}
