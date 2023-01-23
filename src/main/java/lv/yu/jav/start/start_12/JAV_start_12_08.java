
/**
 * 
 * Java package     lv.yu.jav.start.start_12
 * 
 * Java program     JAV_start_12_08.java     Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023          mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.start.start_12;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;

/**
 * JAV_start_12_08
 */
public final class JAV_start_12_08 {
	
/**
 * JTabbedPane_start_12
 */
	public static JTabbedPane JTabbedPane_start_12 = new JTabbedPane();

/**
 * JInternalFrame_start_12
 */
    public static JInternalFrame JInternalFrame_start_12 = new JInternalFrame();
           
/**
 * JAV_start_12_08()
 */
    public JAV_start_12_08() { 
                              
    	JTabbedPane_start_12 = new JTabbedPane();
    	JTabbedPane_start_12.removeAll();
    	
        JTabbedPane_start_12.setTabPlacement(SwingConstants.BOTTOM);
        JTabbedPane_start_12.setTabLayoutPolicy(JTabbedPane_start_12.SCROLL_TAB_LAYOUT);
        
    	JInternalFrame_start_12 = new JInternalFrame("12 START START START", true, false, true, true);
    	JInternalFrame_start_12.setLayout(new BorderLayout());
    	JInternalFrame_start_12.setBackground(Color.GRAY);
        JInternalFrame_start_12.setVisible(true);
        
        JInternalFrame_start_12.add(JTabbedPane_start_12, BorderLayout.CENTER);
               
    }  //  end JAV_start_12_08()
   
}  //  end JAV_start_12_08
