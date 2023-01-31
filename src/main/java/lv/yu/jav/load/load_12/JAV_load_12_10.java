
/**
 * 
 * Java package     lv.yu.jav.load.load_12
 * 
 * Java program     JAV_load_12_10.java        Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.load.load_12;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;

/**
 * JAV_load_12_10
 */
public final class JAV_load_12_10 {

/**
 * JTabbedPane_load_12
 */
	public static JTabbedPane JTabbedPane_load_12 = new JTabbedPane();

/**
 * JInternalFrame_load_12
 */
    public static JInternalFrame JInternalFrame_load_12 = new JInternalFrame();
           
/**
 * JAV_load_12_10()
 */
    public JAV_load_12_10() { 
                        
    	JTabbedPane_load_12 = new JTabbedPane();
    	JTabbedPane_load_12.removeAll();
    	
	    new JAV_load_12_about_10();
        new JAV_load_12_help_10();

        JTabbedPane_load_12.setTabPlacement(SwingConstants.BOTTOM);
        JTabbedPane_load_12.setTabLayoutPolicy(JTabbedPane_load_12.SCROLL_TAB_LAYOUT);
        
        JInternalFrame_load_12 = new JInternalFrame("12 LOAD LOAD LOAD", true, false, true, true);
        JInternalFrame_load_12.setLayout(new BorderLayout());
        JInternalFrame_load_12.setBackground(Color.GRAY);
        JInternalFrame_load_12.setVisible(true);
        
        JInternalFrame_load_12.add(JTabbedPane_load_12, BorderLayout.CENTER);
               
    }  //  end JAV_load_12_10()
   
}  //  end JAV_load_12_10
