
/**
 * 
 * Java package     lv.yu.jav.start.start_11
 * 
 * Java program     JAV_start_11_09.java     Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023          mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.start.start_11;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;

/**
 * JAV_start_11_09
 */
public final class JAV_start_11_09 {

/**
 * JTabbedPane_start_11
 */
	public static JTabbedPane JTabbedPane_start_11 = new JTabbedPane();

/**
 * JInternalFrame_start_11
 */
    public static JInternalFrame JInternalFrame_start_11 = new JInternalFrame();

/**
 * JAV_start_11_09()
 */
    public JAV_start_11_09() { 
    	
    	JTabbedPane_start_11 = new JTabbedPane();
    	JTabbedPane_start_11.removeAll();

        JTabbedPane_start_11.setTabPlacement(SwingConstants.BOTTOM);
        JTabbedPane_start_11.setTabLayoutPolicy(JTabbedPane_start_11.SCROLL_TAB_LAYOUT);

    	JInternalFrame_start_11 = new JInternalFrame("11 START", true, false, true, true);
    	JInternalFrame_start_11.setLayout(new BorderLayout());
    	JInternalFrame_start_11.setBackground(Color.GRAY);
       	JInternalFrame_start_11.setVisible(true);
        
        JInternalFrame_start_11.add(JTabbedPane_start_11, BorderLayout.CENTER);  
        
    }  //  end JAV_start_11_09()
   
}  //  end JAV_start_11_09
