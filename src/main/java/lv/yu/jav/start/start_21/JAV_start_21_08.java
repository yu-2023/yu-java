
/**
 * 
 * Java package     lv.yu.jav.start.start_21
 * 
 * Java program     JAV_start_21_08.java     Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023          mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.start.start_21;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;

/**
 * JAV_start_21_08
 */
public final class JAV_start_21_08 {
	
/**
 * JTabbedPane_start_21
 */
    public static JTabbedPane JTabbedPane_start_21 = new JTabbedPane();

/**
 * JInternalFrame_start_21
 */
    public static JInternalFrame JInternalFrame_start_21 = new JInternalFrame();
           
/**
 * JAV_start_21_08()
 */
    public JAV_start_21_08() { 
                                
    	JTabbedPane_start_21 = new JTabbedPane();
    	JTabbedPane_start_21.removeAll();
    	
        JTabbedPane_start_21.setTabPlacement(SwingConstants.BOTTOM);
        JTabbedPane_start_21.setTabLayoutPolicy(JTabbedPane_start_21.SCROLL_TAB_LAYOUT);
        
    	JInternalFrame_start_21 = new JInternalFrame("21 START", true, false, true, true);
    	JInternalFrame_start_21.setLayout(new BorderLayout());
    	JInternalFrame_start_21.setBackground(Color.GRAY);
        JInternalFrame_start_21.setVisible(true);

        JInternalFrame_start_21.add(JTabbedPane_start_21, BorderLayout.CENTER);
               
    }  //  end JAV_start_21_08()
   
}  //  end JAV_start_21_08
