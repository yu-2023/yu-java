
/**
 * 
 * Java package     lv.yu.jav.start
 * 
 * Java program     JAV_start_menu_start_2_09.java     Apache License 2.0
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
 * JAV_start_menu_start_2_09
 */
public class JAV_start_menu_start_2_09 {
	
/**
 * JAV_start_menu_start_2_09()
 */
    public JAV_start_menu_start_2_09() {

        var menu_Start_2 = new JMenu("Start2");
            menu_Start_2.setMnemonic(KeyEvent.VK_2);  //  Alt 2
            menu_Start_2.setToolTipText("Start2 commands");    
            
        var menuitem_St21 = new JMenuItem("St21");
            menuitem_St21.setToolTipText("St21 application");
            menuitem_St21.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
            menu_Start_2.add(menuitem_St21);

        var menuitem_St22 = new JMenuItem("St22");
            menuitem_St22.setToolTipText("St22 application");
            menuitem_St22.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
            menu_Start_2.add(menuitem_St22);

            lv.yu.jav.JAV_09_internal_frames_change.menubar.add(menu_Start_2);       

    }  //  end JAV_start_menu_start_2_09()
   
}  //  end JAV_start_menu_start_2_09
