
/**
 * 
 * Java package     lv.yu.jav.xxxxx
 * 
 * Java program     JAV_xxxxx_menu_start_10.java     Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023                  mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.xxxxx;

import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JAV_xxxxx_menu_start_10
 */
public class JAV_xxxxx_menu_start_10 {
	
/**
 * JAV_xxxxx_menu_start_10()
 */
    public JAV_xxxxx_menu_start_10() {

//------------------------------
    	
    var icon_Xxxx = new ImageIcon( getClass().getResource("/lv/yu/jav/JAV_resources/xxxx.png") );
    
//------------------------------
      
      var item_Xxxx = new JMenuItem("Xxxx", icon_Xxxx);
          item_Xxxx.setToolTipText("Xxxx application");
          item_Xxxx.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));   //  Alt X  
 
//------------------------------
            
          item_Xxxx.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) { new lv.yu.jav.xxxxx.JAV_xxxxx_visualize_10(); } } );

//------------------------------
            
        lv.yu.jav.start.JAV_start_menu_10.menu_Menu.add(item_Xxxx);

        lv.yu.jav.JAV_10_tabs.menubar.add(lv.yu.jav.start.JAV_start_menu_10.menu_Menu);
       
//------------------------------
            
    }  //  end JAV_xxxxx_menu_start_10()
   
}  //  end JAV_xxxxx_menu_start_10
