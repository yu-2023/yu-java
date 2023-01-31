
/**
 * 
 * Java package     lv.yu.jav.start
 * 
 * Java program     JAV_start_menu_start_3_09.java     Apache License 2.0
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
 * JAV_start_menu_start_3_09
 */
public class JAV_start_menu_start_3_09 {
	
/**
 * JAV_start_menu_start_3_09()
 */
    public JAV_start_menu_start_3_09() {

        var menu_Start_3 = new JMenu("Start3");
            menu_Start_3.setMnemonic(KeyEvent.VK_3);  //  Alt 3
            menu_Start_3.setToolTipText("Start3 commands");    
            
        var menuitem_St31 = new JMenuItem("St31");
            menuitem_St31.setToolTipText("St31 application");
            menuitem_St31.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
            menu_Start_3.add(menuitem_St31);

        var menuitem_St32 = new JMenuItem("St32");
            menuitem_St32.setToolTipText("St32 application");
            menuitem_St32.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
            menu_Start_3.add(menuitem_St32);

            lv.yu.jav.JAV_09_internal_frames_change.menubar.add(menu_Start_3);       

    }  //  end JAV_start_menu_start_3_09()
   
}  //  end JAV_start_menu_start_3_09
