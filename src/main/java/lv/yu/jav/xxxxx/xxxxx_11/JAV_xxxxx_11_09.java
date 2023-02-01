
/**
 * 
 * Java package     lv.yu.jav.xxxxx.xxxxx_11
 * 
 * Java program     JAV_xxxxx_11_09.java        Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.xxxxx.xxxxx_11;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;

/**
 * JAV_xxxxx_11_09
 */
public final class JAV_xxxxx_11_09 {

/**
 * JTabbedPane_xxxxx_11
 */
    public static JTabbedPane JTabbedPane_xxxxx_11 = new JTabbedPane();

/**
 * JInternalFrame_xxxxx_11
 */
    public static JInternalFrame JInternalFrame_xxxxx_11 = new JInternalFrame();
           
/**
 * JAV_xxxxx_11_09()
 */
    public JAV_xxxxx_11_09() { 

    	JTabbedPane_xxxxx_11 = new JTabbedPane();
    	JTabbedPane_xxxxx_11.removeAll();
    	
        JTabbedPane_xxxxx_11.setTabPlacement(SwingConstants.BOTTOM);
        JTabbedPane_xxxxx_11.setTabLayoutPolicy(JTabbedPane_xxxxx_11.SCROLL_TAB_LAYOUT);
        
      	JInternalFrame_xxxxx_11 = new JInternalFrame("11 XXXXX", true, false, true, true);
       	JInternalFrame_xxxxx_11.setLayout(new BorderLayout());
       	JInternalFrame_xxxxx_11.setBackground(Color.GRAY);
       	JInternalFrame_xxxxx_11.setVisible(true);
    
        JInternalFrame_xxxxx_11.add(JTabbedPane_xxxxx_11, BorderLayout.CENTER);
        
    }  //  end JAV_xxxxx_11_09()
   
}  //  end JAV_xxxxx_11_09
