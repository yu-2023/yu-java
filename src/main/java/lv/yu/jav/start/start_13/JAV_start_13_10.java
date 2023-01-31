
/**
 * 
 * Java package     lv.yu.jav.start.start_13
 * 
 * Java program     JAV_start_13_10.java     Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023          mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.start.start_13;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;

/**
 * JAV_start_13_10
 */
public final class JAV_start_13_10 {
	
/**
 * JTabbedPane_start_13
 */
	public static JTabbedPane JTabbedPane_start_13 = new JTabbedPane();

/**
 * JInternalFrame_start_13
 */
    public static JInternalFrame JInternalFrame_start_13 = new JInternalFrame();
           
/**
 * JAV_start_13_10()
 */
    public JAV_start_13_10() { 
                   
    	JTabbedPane_start_13 = new JTabbedPane();
    	JTabbedPane_start_13.removeAll();
    	
        new JAV_start_13_about_10();
        new JAV_start_13_help_10();

        JTabbedPane_start_13.setTabPlacement(SwingConstants.BOTTOM);
        JTabbedPane_start_13.setTabLayoutPolicy(JTabbedPane_start_13.SCROLL_TAB_LAYOUT);
        
    	JInternalFrame_start_13 = new JInternalFrame("13 START", true, false, true, true);
    	JInternalFrame_start_13.setLayout(new BorderLayout());
    	JInternalFrame_start_13.setBackground(Color.GRAY);
        JInternalFrame_start_13.setVisible(true);

        JInternalFrame_start_13.add(JTabbedPane_start_13, BorderLayout.CENTER);
               
    }  //  end JAV_start_13_10()
   
}  //  end JAV_start_13_10
