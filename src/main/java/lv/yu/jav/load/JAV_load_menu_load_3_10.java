
/**
 *
 * Java package     lv.yu.jav.load
 *
 * Java program     JAV_load_menu_load_3_10.java     Apache License 2.0
 *
 * Copyright (c)    Yuri Utkin 2023                  mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.jav.load;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * JAV_load_menu_load_3_10
 */
public class JAV_load_menu_load_3_10 {

/**
 * JAV_load_menu_load_3_10()
 */
    public JAV_load_menu_load_3_10() {

        var menu_Load_3 = new JMenu("Load3");
            menu_Load_3.setMnemonic(KeyEvent.VK_3);  //  Alt 3
            menu_Load_3.setToolTipText("Load3 commands");

        var menuitem_Lo31 = new JMenuItem("Lo31");
            menuitem_Lo31.setToolTipText("Lo31 application");
            menuitem_Lo31.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
            menu_Load_3.add(menuitem_Lo31);

        var menuitem_Lo32 = new JMenuItem("Lo32");
            menuitem_Lo32.setToolTipText("Lo32 application");
            menuitem_Lo32.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
            menu_Load_3.add(menuitem_Lo32);

            lv.yu.jav.JAV_10_tabs.menubar.add(menu_Load_3);

    }  //  end JAV_load_menu_load_3_10()

}  //  end JAV_load_menu_load_3_10
