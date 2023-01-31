
/**
 * 
 * Java package     lv.yu.jav.lang
 * 
 * Java program     JAV_lang_menu_lang_10.java     Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023                mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.lang;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;

import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JAV_lang_menu_lang_10
 */
public class JAV_lang_menu_lang_10 {
	
/**
 * JAV_lang_menu_lang_10()
 */
    public JAV_lang_menu_lang_10() {

//------------------------------  
    	
    var icon_Eng = new ImageIcon( getClass().getResource("/lv/yu/jav/JAV_resources/prefs.gif") );
    var icon_Rus = new ImageIcon( getClass().getResource("/lv/yu/jav/JAV_resources/prefs.gif") );
    var icon_Lat = new ImageIcon( getClass().getResource("/lv/yu/jav/JAV_resources/prefs.gif") );     	
	
//------------------------------  
        
    var menu_Lang = new JMenu("Lang");
        menu_Lang.setMnemonic(KeyEvent.VK_L);  //  Alt L
        menu_Lang.setToolTipText("Lang commands");   
      var item_Eng = new JCheckBoxMenuItem("Eng", icon_Eng);
      var item_Rus = new JCheckBoxMenuItem("Rus", icon_Rus);
      var item_Lat = new JCheckBoxMenuItem("Lat", icon_Lat);
          item_Eng.setToolTipText("Eng application");
          item_Rus.setToolTipText("Rus application");
          item_Lat.setToolTipText("Lat application");
          item_Eng.setSelected(true);
            
//------------------------------
              
          item_Eng.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );

          item_Rus.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );          
          
          item_Lat.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
            
//------------------------------
            
        menu_Lang.add(item_Eng);
        menu_Lang.add(item_Rus);
        menu_Lang.add(item_Lat);
            
        lv.yu.jav.JAV_10_tabs.menubar.add(menu_Lang);       

//------------------------------
            
    }  //  end JAV_lang_menu_lang_10()
   
}  //  end JAV_lang_menu_lang_10
