
/**
 * 
 * Java package     lv.yu.jav.start.start_23
 * 
 * Java program     JAV_start_23_10.java     Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023          mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.start.start_23;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;

/**
 * JAV_start_23_10
 */
public final class JAV_start_23_10 {
	
/**
 * JTabbedPane_start_23
 */
	public static JTabbedPane JTabbedPane_start_23 = new JTabbedPane();

/**
 * JInternalFrame_start_23
 */
    public static JInternalFrame JInternalFrame_start_23 = new JInternalFrame();
           
/**
 * JAV_start_23_10()
 */
    public JAV_start_23_10() { 
                                
    	JTabbedPane_start_23 = new JTabbedPane();
    	JTabbedPane_start_23.removeAll();
    	
        new JAV_start_23_about_10();
        new JAV_start_23_help_10();

        JTabbedPane_start_23.setTabPlacement(SwingConstants.BOTTOM);
        JTabbedPane_start_23.setTabLayoutPolicy(JTabbedPane_start_23.SCROLL_TAB_LAYOUT);
        
    	JInternalFrame_start_23 = new JInternalFrame("23 START", true, false, true, true);
    	JInternalFrame_start_23.setLayout(new BorderLayout());
    	JInternalFrame_start_23.setBackground(Color.GRAY);
        JInternalFrame_start_23.setVisible(true);

        JInternalFrame_start_23.add(JTabbedPane_start_23, BorderLayout.CENTER);
               
    }  //  end JAV_start_23_10()
   
}  //  end JAV_start_23_10
