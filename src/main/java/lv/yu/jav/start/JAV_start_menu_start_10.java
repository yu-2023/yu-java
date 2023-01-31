
/**
 * 
 * Java package     lv.yu.jav.start
 * 
 * Java program     JAV_start_menu_start_10.java     Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023                  mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.start;

import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JAV_start_menu_start_10
 */
public class JAV_start_menu_start_10 {
	
/**
 * JAV_start_menu_start_10()
 */
    public JAV_start_menu_start_10() {

//------------------------------
    	
    var icon_Start = new ImageIcon( getClass().getResource("/lv/yu/jav/JAV_resources/start.gif") );
    
//------------------------------
	
      var item_Start = new JMenuItem("Start", icon_Start);
          item_Start.setToolTipText("Start application");
          item_Start.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));  //  Alt S
 
//------------------------------
            
          item_Start.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) { new lv.yu.jav.start.JAV_start_visualize_10(); } } ); 

//------------------------------
            
        lv.yu.jav.start.JAV_start_menu_10.menu_Menu.add(item_Start);

        lv.yu.jav.JAV_10_tabs.menubar.add(lv.yu.jav.start.JAV_start_menu_10.menu_Menu);
       
//------------------------------
            
    }  //  end JAV_start_menu_start_10()
   
}  //  end JAV_start_menu_start_10

