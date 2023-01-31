
/**
 * 
 * Java package     lv.yu.jav.load.load_21
 * 
 * Java program     JAV_load_21_09.java        Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.load.load_21;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;

/**
 * JAV_load_21_09
 */
public final class JAV_load_21_09 {

/**
 * JTabbedPane_load_21
 */
	public static JTabbedPane JTabbedPane_load_21 = new JTabbedPane();

/**
 * JInternalFrame_load_21
 */
    public static JInternalFrame JInternalFrame_load_21 = new JInternalFrame();
           
/**
 * JAV_load_21_09()
 */
    public JAV_load_21_09() { 
                                
    	JTabbedPane_load_21 = new JTabbedPane();
    	JTabbedPane_load_21.removeAll();
    	
        JTabbedPane_load_21.setTabPlacement(SwingConstants.BOTTOM);
        JTabbedPane_load_21.setTabLayoutPolicy(JTabbedPane_load_21.SCROLL_TAB_LAYOUT);
        
        JInternalFrame_load_21 = new JInternalFrame("21 LOAD", true, false, true, true);
        JInternalFrame_load_21.setLayout(new BorderLayout());
        JInternalFrame_load_21.setBackground(Color.GRAY);
        JInternalFrame_load_21.setVisible(true);

        JInternalFrame_load_21.add(JTabbedPane_load_21, BorderLayout.CENTER);
               
    }  //  end JAV_load_21_09()
   
}  //  end JAV_load_21_09
