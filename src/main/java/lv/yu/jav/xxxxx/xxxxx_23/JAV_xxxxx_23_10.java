
/**
 * 
 * Java package     lv.yu.jav.xxxxx.xxxxx_23
 * 
 * Java program     JAV_xxxxx_23_10.java        Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.xxxxx.xxxxx_23;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;

/**
 * JAV_xxxxx_23_10
 */
public final class JAV_xxxxx_23_10 {

/**
 * JTabbedPane_xxxxx_23
 */
    public static JTabbedPane JTabbedPane_xxxxx_23 = new JTabbedPane();

/**
 * JInternalFrame_xxxxx_23
 */
    public static JInternalFrame JInternalFrame_xxxxx_23 = new JInternalFrame();
           
/**
 * JAV_xxxxx_23_10()
 */
    public JAV_xxxxx_23_10() { 
                                
    	JTabbedPane_xxxxx_23 = new JTabbedPane();
    	JTabbedPane_xxxxx_23.removeAll();
    	
        new JAV_xxxxx_23_about_10();
        new JAV_xxxxx_23_help_10();

        JTabbedPane_xxxxx_23.setTabPlacement(SwingConstants.BOTTOM);
        JTabbedPane_xxxxx_23.setTabLayoutPolicy(JTabbedPane_xxxxx_23.SCROLL_TAB_LAYOUT);
        
        JInternalFrame_xxxxx_23 = new JInternalFrame("23 XXXXX", true, false, true, true);
        JInternalFrame_xxxxx_23.setLayout(new BorderLayout());
        JInternalFrame_xxxxx_23.setBackground(Color.GRAY);
        JInternalFrame_xxxxx_23.setVisible(true);

        JInternalFrame_xxxxx_23.add(JTabbedPane_xxxxx_23, BorderLayout.CENTER);
               
    }  //  end JAV_xxxxx_23_10()
   
}  //  end JAV_xxxxx_23_10
