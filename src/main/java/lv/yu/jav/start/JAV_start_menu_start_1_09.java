
/**
 * 
 * Java package     lv.yu.jav.start
 * 
 * Java program     JAV_start_menu_start_1_09.java     Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023                    mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.start;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * JAV_start_menu_start_1_09
 */
public class JAV_start_menu_start_1_09 {
	
/**
 * JAV_start_menu_start_1_09()
 */
    public JAV_start_menu_start_1_09() {

        var menu_Start_1 = new JMenu("Start1");
            menu_Start_1.setMnemonic(KeyEvent.VK_1);  //  Alt 1
            menu_Start_1.setToolTipText("Start1 commands");    
            
        var menuitem_St11 = new JMenuItem("St11");
            menuitem_St11.setToolTipText("St11 application");
            menuitem_St11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
            menu_Start_1.add(menuitem_St11);

        var menuitem_St12 = new JMenuItem("St12");
            menuitem_St12.setToolTipText("St12 application");
            menuitem_St12.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
            menu_Start_1.add(menuitem_St12);

            lv.yu.jav.JAV_09_internal_frames_change.menubar.add(menu_Start_1);       

    }  //  end JAV_start_menu_start_1_09()
   
}  //  end JAV_start_menu_start_1_09
