
/**
 * 
 * Java package     lv.yu.jav.start
 * 
 * Java program     JAV_start_menu_08.java     Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.start;

import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.event.KeyEvent;

/**
 * JAV_start_menu_08
 */
public class JAV_start_menu_08 {
	
/** menu_Menu */
public static JMenu menu_Menu = new JMenu();
	
/**
 * JAV_start_menu_08()
 */
    public JAV_start_menu_08() {

        lv.yu.jav.JAV_08_internal_frames.menubar = new JMenuBar();        
        lv.yu.jav.JAV_08_internal_frames.menubar.setLayout( new lv.yu.jav.JAV_LIB_wrap_layout(lv.yu.jav.JAV_LIB_wrap_layout.LEFT, 0, 0) );
        
            menu_Menu = new JMenu("Menu");
            menu_Menu.setMnemonic(KeyEvent.VK_M);  //  Alt M
            menu_Menu.setToolTipText("Menu commands");    

            lv.yu.jav.JAV_08_internal_frames.menubar.add(menu_Menu);       
                        
    }  //  end JAV_start_menu_08()
   
}  //  end JAV_start_menu_08

