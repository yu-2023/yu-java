
/**
 *
 * Java package     lv.yu.jav.help
 *
 * Java program     JAV_help_menu_help_1_09.java     Apache License 2.0
 *
 * Copyright (c)    Yuri Utkin 2023                  mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.jav.help;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * JAV_help_menu_help_1_09
 */
public class JAV_help_menu_help_1_09 {

/**
 * JAV_help_menu_help_1_09()
 */
    public JAV_help_menu_help_1_09() {

        var menu_Help_1 = new JMenu("Help1");
            menu_Help_1.setMnemonic(KeyEvent.VK_1);  //  Alt 1
            menu_Help_1.setToolTipText("Help1 commands");

        var menuitem_He11 = new JMenuItem("He11");
            menuitem_He11.setToolTipText("He11 application");
            menuitem_He11.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
            menu_Help_1.add(menuitem_He11);

        var menuitem_He12 = new JMenuItem("He12");
            menuitem_He12.setToolTipText("He12 application");
            menuitem_He12.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
            menu_Help_1.add(menuitem_He12);

            lv.yu.jav.JAV_09_internal_frames_change.menubar.add(menu_Help_1);

    }  //  end JAV_help_menu_help_1_09()

}  //  end JAV_help_menu_help_1_09
