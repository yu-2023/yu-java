
/**
 * 
 * Java package     lv.yu.jav.start.start_22
 * 
 * Java program     JAV_start_22_08.java     Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023          mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.start.start_22;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;

/**
 * JAV_start_22_08
 */
public final class JAV_start_22_08 {
	
/**
 * JTabbedPane_start_22
 */
	public static JTabbedPane JTabbedPane_start_22 = new JTabbedPane();

/**
 * JInternalFrame_start_22
 */
    public static JInternalFrame JInternalFrame_start_22 = new JInternalFrame();
           
/**
 * JAV_start_22_08()
 */
    public JAV_start_22_08() { 
                                
    	JTabbedPane_start_22 = new JTabbedPane();
    	JTabbedPane_start_22.removeAll();
    	
        JTabbedPane_start_22.setTabPlacement(SwingConstants.BOTTOM);
        JTabbedPane_start_22.setTabLayoutPolicy(JTabbedPane_start_22.SCROLL_TAB_LAYOUT);
        
    	JInternalFrame_start_22 = new JInternalFrame("22 START START START", true, false, true, true);
    	JInternalFrame_start_22.setLayout(new BorderLayout());
    	JInternalFrame_start_22.setBackground(Color.GRAY);
        JInternalFrame_start_22.setVisible(true);

        JInternalFrame_start_22.add(JTabbedPane_start_22, BorderLayout.CENTER);
               
    }  //  end JAV_start_22_08()
   
}  //  end JAV_start_22_08
