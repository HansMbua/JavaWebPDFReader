package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class ManuBar extends JPanel {
    private JMenuBar menuBar;
   private JMenu menu;
   private JMenuItem menuItem;
    public Component setManuBar() {
      //Create the menu bar.
        menuBar = new JMenuBar();

      //Build the first menu
        menu = new JMenu(" welcome ");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription("menu items");
        menuBar.add(menu);

        //a group of JMenuItems
        menuItem = new JMenuItem("A text-only menu item",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menu.add(menuItem);
        return menuBar;
    }
}
