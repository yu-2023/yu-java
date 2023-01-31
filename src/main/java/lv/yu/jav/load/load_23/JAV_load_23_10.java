
/**
 * 
 * Java package     lv.yu.jav.load.load_23
 * 
 * Java program     JAV_load_23_10.java        Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.load.load_23;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;

/**
 * JAV_load_23_10
 */
public final class JAV_load_23_10 {

/**
 * JTabbedPane_load_23
 */
    public static JTabbedPane JTabbedPane_load_23 = new JTabbedPane();

/**
 * JInternalFrame_load_23
 */
    public static JInternalFrame JInternalFrame_load_23 = new JInternalFrame();
           
/**
 * JAV_load_23_10()
 */
    public JAV_load_23_10() { 
                          
    	JTabbedPane_load_23 = new JTabbedPane();
    	JTabbedPane_load_23.removeAll();
    	
        new JAV_load_23_about_10();
        new JAV_load_23_help_10();

        JTabbedPane_load_23.setTabPlacement(SwingConstants.BOTTOM);
        JTabbedPane_load_23.setTabLayoutPolicy(JTabbedPane_load_23.SCROLL_TAB_LAYOUT);
        
        JInternalFrame_load_23 = new JInternalFrame("23 LOAD", true, false, true, true);
        JInternalFrame_load_23.setLayout(new BorderLayout());
        JInternalFrame_load_23.setBackground(Color.GRAY);
        JInternalFrame_load_23.setVisible(true);

        JInternalFrame_load_23.add(JTabbedPane_load_23, BorderLayout.CENTER);
               
    }  //  end JAV_load_23_10()
   
}  //  end JAV_load_23_10
