package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends JFrame{
    private JButton nextButton;
    private JButton prevButton;
    private pfdTextArea textArea;

// changing the state of textArea to next
    public void setNextButton() {

        this.nextButton = nextButton;
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //get string from textArea and move to next line

            }
        });
    }
    // changing the state of textArea to prev
    public void setPrevButton() {
        this.prevButton = prevButton;
    }
}
