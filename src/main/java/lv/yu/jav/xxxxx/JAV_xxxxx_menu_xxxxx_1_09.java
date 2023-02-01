
/**
 * 
 * Java package     lv.yu.jav.xxxxx
 * 
 * Java program     JAV_xxxxx_menu_xxxxx_1_09.java     Apache License 2.0
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
 * JAV_xxxxx_menu_xxxxx_1_09
 */
public class JAV_xxxxx_menu_xxxxx_1_09 {
	
/**
 * JAV_xxxxx_menu_xxxxx_1_09()
 */
    public JAV_xxxxx_menu_xxxxx_1_09() {

        var menu_Xxxxx_1 = new JMenu("Xxxxx1");
            menu_Xxxxx_1.setMnemonic(KeyEvent.VK_1);  //  Alt 1
            menu_Xxxxx_1.setToolTipText("Xxxxx1 commands");    
            
        var menuitem_Xx11 = new JMenuItem("Xx11");
            menuitem_Xx11.setToolTipText("Xx11 application");
            menuitem_Xx11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );                      
            menu_Xxxxx_1.add(menuitem_Xx11);

        var menuitem_Xx12 = new JMenuItem("Xx12");
            menuitem_Xx12.setToolTipText("Xx12 application");
            menuitem_Xx12.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
            menu_Xxxxx_1.add(menuitem_Xx12);

            lv.yu.jav.JAV_09_internal_frames_change.menubar.add(menu_Xxxxx_1);   

    }  //  end JAV_xxxxx_menu_xxxxx_1_09()
   
}  //  end JAV_xxxxx_menu_xxxxx_1_09
