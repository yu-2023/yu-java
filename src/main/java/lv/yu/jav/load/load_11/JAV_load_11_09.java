
/**
 * 
 * Java package     lv.yu.jav.load.load_11
 * 
 * Java program     JAV_load_11_09.java        Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.load.load_11;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;

/**
 * JAV_load_11_09
 */
public final class JAV_load_11_09 {

/**
 * JTabbedPane_load_11
 */
    public static JTabbedPane JTabbedPane_load_11 = new JTabbedPane();

/**
 * JInternalFrame_load_11
 */
    public static JInternalFrame JInternalFrame_load_11 = new JInternalFrame();
           
/**
 * JAV_load_11_09()
 */
    public JAV_load_11_09() { 

    	JTabbedPane_load_11 = new JTabbedPane();
    	JTabbedPane_load_11.removeAll();
    	
        JTabbedPane_load_11.setTabPlacement(SwingConstants.BOTTOM);
        JTabbedPane_load_11.setTabLayoutPolicy(JTabbedPane_load_11.SCROLL_TAB_LAYOUT);
        
      	JInternalFrame_load_11 = new JInternalFrame("11 LOAD", true, false, true, true);
       	JInternalFrame_load_11.setLayout(new BorderLayout());
       	JInternalFrame_load_11.setBackground(Color.GRAY);
       	JInternalFrame_load_11.setVisible(true);
    
        JInternalFrame_load_11.add(JTabbedPane_load_11, BorderLayout.CENTER);
        
    }  //  end JAV_load_11_09()
   
}  //  end JAV_load_11_09
