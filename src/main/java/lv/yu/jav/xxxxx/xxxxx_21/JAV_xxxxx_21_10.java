
/**
 * 
 * Java package     lv.yu.jav.xxxxx.xxxxx_21
 * 
 * Java program     JAV_xxxxx_21_10.java        Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.xxxxx.xxxxx_21;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;

/**
 * JAV_xxxxx_21_10
 */
public final class JAV_xxxxx_21_10 {

/**
 * JTabbedPane_xxxxx_21
 */
    public static JTabbedPane JTabbedPane_xxxxx_21 = new JTabbedPane();

/**
 * JInternalFrame_xxxxx_21
 */
    public static JInternalFrame JInternalFrame_xxxxx_21 = new JInternalFrame();
           
/**
 * JAV_xxxxx_21_10()
 */
    public JAV_xxxxx_21_10() { 
                                
    	JTabbedPane_xxxxx_21 = new JTabbedPane();
    	JTabbedPane_xxxxx_21.removeAll();
    	
        new JAV_xxxxx_21_about_10();
        new JAV_xxxxx_21_help_10();

        JTabbedPane_xxxxx_21.setTabPlacement(SwingConstants.BOTTOM);
        JTabbedPane_xxxxx_21.setTabLayoutPolicy(JTabbedPane_xxxxx_21.SCROLL_TAB_LAYOUT);
        
        JInternalFrame_xxxxx_21 = new JInternalFrame("21 XXXXX", true, false, true, true);
        JInternalFrame_xxxxx_21.setLayout(new BorderLayout());
        JInternalFrame_xxxxx_21.setBackground(Color.GRAY);
        JInternalFrame_xxxxx_21.setVisible(true);

        JInternalFrame_xxxxx_21.add(JTabbedPane_xxxxx_21, BorderLayout.CENTER);
               
    }  //  end JAV_xxxxx_21_10()
   
}  //  end JAV_xxxxx_21_10
