
/**
 *
 * Java package     lv.yu.jav.load
 *
 * Java program     JAV_load_menu_load_1_09.java     Apache License 2.0
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
 * JAV_load_menu_load_1_09
 */
public class JAV_load_menu_load_1_09 {

/**
 * JAV_load_menu_load_1_09()
 */
    public JAV_load_menu_load_1_09() {

        var menu_Load_1 = new JMenu("Load1");
            menu_Load_1.setMnemonic(KeyEvent.VK_1);  //  Alt 1
            menu_Load_1.setToolTipText("Load1 commands");

        var menuitem_Lo11 = new JMenuItem("Lo11");
            menuitem_Lo11.setToolTipText("Lo11 application");
            menuitem_Lo11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
            menu_Load_1.add(menuitem_Lo11);

        var menuitem_Lo12 = new JMenuItem("Lo12");
            menuitem_Lo12.setToolTipText("Lo12 application");
            menuitem_Lo12.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
            menu_Load_1.add(menuitem_Lo12);

            lv.yu.jav.JAV_09_internal_frames_change.menubar.add(menu_Load_1);

    }  //  end JAV_load_menu_load_1_09()

}  //  end JAV_load_menu_load_1_09
