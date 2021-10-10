package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class PdfReader  {
    public PdfReader() throws IOException {
        TextStore textStore = new TextStore();
        textStore.setStore();
        textStore.getText("C:\\Users\\Gebruiker\\Desktop\\pdf reader\\hello.txt");
        String s = textStore.displayText();
        System.out.println(s);

        pfdTextArea panel = new pfdTextArea(20,50);
        panel.setTextArea(s);
        panel.setOpaque(true);

        JFrame frame = new JFrame("JTextArea Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setSize(700,700);
        frame.setVisible(true);
    }
}
