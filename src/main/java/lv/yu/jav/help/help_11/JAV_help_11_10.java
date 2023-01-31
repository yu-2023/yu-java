
/**
 * 
 * Java package     lv.yu.jav.help.help_11
 * 
 * Java program     JAV_help_11_10.java        Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.help.help_11;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;

/**
 * JAV_help_11_10
 */
public final class JAV_help_11_10 {

/**
 * JTabbedPane_help_11
 */
	public static JTabbedPane JTabbedPane_help_11 = new JTabbedPane();

/**
 * JInternalFrame_help_11
 */
    public static JInternalFrame JInternalFrame_help_11 = new JInternalFrame();
           
/**
 * JAV_help_11_10()
 */
    public JAV_help_11_10() { 
    	
    	JTabbedPane_help_11 = new JTabbedPane();
    	JTabbedPane_help_11.removeAll();
    	
        new JAV_help_11_about_10();
        new JAV_help_11_help_10();

        JTabbedPane_help_11.setTabPlacement(SwingConstants.BOTTOM);
        JTabbedPane_help_11.setTabLayoutPolicy(JTabbedPane_help_11.SCROLL_TAB_LAYOUT);
        
    	JInternalFrame_help_11 = new JInternalFrame("11 HELP", true, false, true, true);
    	JInternalFrame_help_11.setLayout(new BorderLayout());
    	JInternalFrame_help_11.setBackground(Color.GRAY);
       	JInternalFrame_help_11.setVisible(true);
        
        JInternalFrame_help_11.add(JTabbedPane_help_11, BorderLayout.CENTER);  
        
    }  //  end JAV_help_11_10()
   
}  //  end JAV_help_11_10