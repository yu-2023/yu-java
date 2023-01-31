
/**
 * 
 * Java package     lv.yu.jav.load.load_13
 * 
 * Java program     JAV_load_13_10.java        Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.load.load_13;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;

/**
 * JAV_load_13_10
 */
public final class JAV_load_13_10 {

/**
 * JTabbedPane_load_13
 */
    public static JTabbedPane JTabbedPane_load_13 = new JTabbedPane();

/**
 * JInternalFrame_load_13
 */
    public static JInternalFrame JInternalFrame_load_13 = new JInternalFrame();
           
/**
 * JAV_load_13_10()
 */
    public JAV_load_13_10() { 
                                
    	JTabbedPane_load_13 = new JTabbedPane();
    	JTabbedPane_load_13.removeAll();
    	
        new JAV_load_13_about_10();
        new JAV_load_13_help_10();

        JTabbedPane_load_13.setTabPlacement(SwingConstants.BOTTOM);
        JTabbedPane_load_13.setTabLayoutPolicy(JTabbedPane_load_13.SCROLL_TAB_LAYOUT);
        
        JInternalFrame_load_13 = new JInternalFrame("13 LOAD", true, false, true, true);
        JInternalFrame_load_13.setLayout(new BorderLayout());
        JInternalFrame_load_13.setBackground(Color.GRAY);
        JInternalFrame_load_13.setVisible(true);

        JInternalFrame_load_13.add(JTabbedPane_load_13, BorderLayout.CENTER);
               
    }  //  end JAV_load_13_10()
   
}  //  end JAV_load_13_10
