
/**
 * 
 * Java package     lv.yu.jav.help
 * 
 * Java program     JAV_help_menu_help_2_09.java       Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023                    mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.help;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * JAV_help_menu_help_2_09
 */
public class JAV_help_menu_help_2_09 {
	
/**
 * JAV_help_menu_help_2_09()
 */
    public JAV_help_menu_help_2_09() {

        var menu_Help_2 = new JMenu("Help2");
            menu_Help_2.setMnemonic(KeyEvent.VK_2);  //  Alt 2
            menu_Help_2.setToolTipText("Help2 commands");    
            
        var menuitem_He21 = new JMenuItem("He21");
            menuitem_He21.setToolTipText("He21 application");
            menuitem_He21.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
            menu_Help_2.add(menuitem_He21);

        var menuitem_He22 = new JMenuItem("He22");
            menuitem_He22.setToolTipText("He22 application");
            menuitem_He22.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
            menu_Help_2.add(menuitem_He22);

            lv.yu.jav.JAV_09_internal_frames_change.menubar.add(menu_Help_2);       

    }  //  end JAV_help_menu_help_2_09()
   
}  //  end JAV_help_menu_help_2_09
