
/**
 * 
 * Java package     lv.yu.jav.start.start_13
 * 
 * Java program     JAV_start_13_help_10.java     Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023               mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav.start.start_13;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;

import java.awt.event.KeyEvent;
 
/**
 * JAV_start_13_help_10
 */
public class JAV_start_13_help_10 {
		
/**
 * JAV_start_13_help_10()
 */
    public JAV_start_13_help_10() { 
                                
    var imageicon = new ImageIcon(JAV_start_13_help_10.class.getResource("/lv/yu/jav/JAV_resources/info.gif"));
        
    var jtextarea = new JTextArea();
        jtextarea.setText("JAV_start_13_help_10_JTextArea");
                                            	
    	JAV_start_13_10.JTabbedPane_start_13.addTab("help", imageicon, jtextarea, "Load help JTextArea");
        JAV_start_13_10.JTabbedPane_start_13.setMnemonicAt(1, KeyEvent.VK_H);  //  Alt H
               
    }  //  end JAV_start_13_help_10()
   
}  //  end JAV_start_13_help_10
