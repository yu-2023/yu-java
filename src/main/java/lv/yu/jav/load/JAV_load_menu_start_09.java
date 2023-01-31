
/**
 * 
 * Java package     lv.yu.jav.load
 * 
 * Java program     JAV_load_menu_start_09.java     Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023                 mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.load;  //  JAV_load_menu_start.java

import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JAV_load_menu_start_09
 */
public class JAV_load_menu_start_09 {

/**
 * JAV_load_menu_start_09()
 */
    public JAV_load_menu_start_09() {

//------------------------------
    	
    var icon_Load = new ImageIcon( getClass().getResource("/lv/yu/jav/JAV_resources/load.gif") );

//------------------------------
      
      var item_Load = new JMenuItem("Load", icon_Load);
          item_Load.setToolTipText("Load application");
          item_Load.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.ALT_MASK));   //  Alt L
 
//------------------------------
            
          item_Load.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) { new lv.yu.jav.load.JAV_load_visualize_09(); } } );

//------------------------------
            
        lv.yu.jav.start.JAV_start_menu_09.menu_Menu.add(item_Load);

        lv.yu.jav.JAV_09_internal_frames_change.menubar.add(lv.yu.jav.start.JAV_start_menu_09.menu_Menu);
            
//------------------------------
       
    }  //  end JAV_load_menu_start_09()
   
}  //  end JAV_load_menu_start_09
