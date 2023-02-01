
/**
 * 
 * Java package     lv.yu.jav
 * 
 * Java program     JAV_01_frame.java     Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023       mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.EventQueue;

//------------------------------

/** JAV_01_frame */
public final class JAV_01_frame {
	
/** frame */
public static JFrame frame = new JFrame();	
	
//------------------------------
        
/** JAV_01_frame demonstrates Java Frame */
public JAV_01_frame() { 

    var imgURL     =               JAV_01_frame.class.getResource("/lv/yu/jav/JAV_resources/JAV.jpg");
    var icon_frame = new ImageIcon(JAV_01_frame.class.getResource("/lv/yu/jav/JAV_resources/JAV.jpg"));
                
//------------------------------
    
    var title = "JAVA -- JAV_01_frame -- v. 2023.01.01";
        
        frame.setTitle("     " + title);
        
        frame.setBounds(10+0*40, 10+0*40, 1000, 600);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setIconImage(icon_frame.getImage());  
        
        frame.setLayout(new BorderLayout());
        
        frame.setVisible(true);

//------------------------------
        
    new lv.yu.jav.JAV_02_text();
    new lv.yu.jav.JAV_03_menu();
    new lv.yu.jav.JAV_04_menu_wrap();
    new lv.yu.jav.JAV_05_action();
    new lv.yu.jav.JAV_06_internal_frame_one();
    new lv.yu.jav.JAV_07_internal_frame_six();
    new lv.yu.jav.JAV_08_internal_frames();
    new lv.yu.jav.JAV_09_internal_frames_change();
    new lv.yu.jav.JAV_10_tabs();

//------------------------------
        
}  //  end JAV_01_frame()
    
//------------------------------
    
/**
 * JAVA JAV_01_frame
 * 
 * @param args[]
 */    
public static void main(String[] args) {
                                         EventQueue.invokeLater( () -> { new JAV_01_frame(); } );
}

//------------------------------ 
    
}  //  end JAV_01_frame

//------------------------------
