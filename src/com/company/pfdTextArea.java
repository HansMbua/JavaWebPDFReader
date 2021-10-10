package com.company;

import javax.swing.*;
import java.awt.*;

public class pfdTextArea extends JPanel {

    private JTextArea textArea;
    private TextStore textStore;

    public pfdTextArea(int rows, int columns)  {

        textArea = new JTextArea(rows, columns);
//        textArea.setText("Hansffbbbbbbbbb");


        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(250, 250));

        textArea.setFont(new Font("Serif", Font.ITALIC, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        add(textArea);
    }

    public Component getTextArea() {

        return textArea;
    }
    public void setTextArea(String text) {
//        String text = textStore.displayText();
//        System.out.println("inside setText");
         textArea.setText(text);
//        System.out.println(text);
    }
    //method to next line
    public void nextLine(){

    }
}
