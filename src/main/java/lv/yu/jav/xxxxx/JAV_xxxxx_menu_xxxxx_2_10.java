
/**
 *
 * Java package     lv.yu.jav.xxxxx
 *
 * Java program     JAV_xxxxx_menu_xxxxx_2_10.java     Apache License 2.0
 *
 * Copyright (c)    Yuri Utkin 2023                    mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.jav.xxxxx;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * JAV_xxxxx_menu_xxxxx_2_10
 */
public class JAV_xxxxx_menu_xxxxx_2_10 {

/**
 * JAV_xxxxx_menu_xxxxx_2_10()
 */
    public JAV_xxxxx_menu_xxxxx_2_10() {

        var menu_Xxxxx_2 = new JMenu("Xxxxx2");
            menu_Xxxxx_2.setMnemonic(KeyEvent.VK_2);  //  Alt 2
            menu_Xxxxx_2.setToolTipText("Xxxxx2 commands");

        var menuitem_Xx21 = new JMenuItem("Xx21");
            menuitem_Xx21.setToolTipText("Xx21 application");
            menuitem_Xx21.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
            menu_Xxxxx_2.add(menuitem_Xx21);

        var menuitem_Xx22 = new JMenuItem("Xx22");
            menuitem_Xx22.setToolTipText("Xx22 application");
            menuitem_Xx22.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
            menu_Xxxxx_2.add(menuitem_Xx22);

            lv.yu.jav.JAV_10_tabs.menubar.add(menu_Xxxxx_2);

    }  //  end JAV_xxxxx_menu_xxxxx_2_10()

}  //  end JAV_xxxxx_menu_xxxxx_2_10
