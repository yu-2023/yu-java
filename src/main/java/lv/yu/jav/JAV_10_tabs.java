
/**
 * 
 * Java package     lv.yu.jav
 * 
 * Java program     JAV_10_tabs.java     Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2022      mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.EventQueue;

//------------------------------

/** JAV_10_tabs */
public final class JAV_10_tabs {
    		
    /** frame */
    public static JFrame frame = new JFrame();
    
    /** manubar */
    public static JMenuBar menubar = new JMenuBar();
    
    /** panel_1 */    
    public static JPanel panel_1 = new JPanel();
    
    /** panel_2 */
    public static JPanel panel_2 = new JPanel();
    
    /** panel_3 */
    public static JPanel panel_3 = new JPanel(); 
    
    /** label_info */
    public static JLabel label_info = new JLabel();
    
    /** desktoppane_11 */
    public static JDesktopPane desktoppane_11 = new JDesktopPane();
  
    /** desktoppane_12 */
    public static JDesktopPane desktoppane_12 = new JDesktopPane();
    
    /** desktoppane_13 */
    public static JDesktopPane desktoppane_13 = new JDesktopPane();
    
    /** desktoppane_21 */
    public static JDesktopPane desktoppane_21 = new JDesktopPane();
    
    /** desktoppane_22 */
    public static JDesktopPane desktoppane_22 = new JDesktopPane();
    
    /** desktoppane_23 */
    public static JDesktopPane desktoppane_23 = new JDesktopPane();

//------------------------------
    
/** JAV_10_tabs demonstrates Java Tabs in Java Frame */
public JAV_10_tabs() {

    var imgURL     =               JAV_10_tabs.class.getResource("/lv/yu/jav/JAV_resources/JAV.jpg");
    var icon_frame = new ImageIcon(JAV_10_tabs.class.getResource("/lv/yu/jav/JAV_resources/JAV.jpg"));

//------------------------------            
    	
        var title = "JAVA -- JAV_10_tabs -- v. 2023.01.01";
            
        frame.setTitle("     " + title);
        
        frame.setBounds(10+9*40, 10+9*40, 1000, 600);
         
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
        frame.setIconImage(icon_frame.getImage());

        frame.setLayout(new BorderLayout());
        
        frame.setVisible(true);

//------------------------------
        
        frame.setJMenuBar(menubar);
        
//------------------------------ 

        panel_1.setLayout(new BorderLayout());
        panel_1.setBackground(Color.CYAN);
            
        panel_2.setLayout(new BorderLayout());
        panel_2.setBackground(Color.MAGENTA);

        panel_3.setLayout(new BorderLayout());
        panel_3.setBackground(Color.lightGray);

        label_info.setText("     Copyright     (c)     Yuri Utkin 2023     mob.+371 12345678     https://www.jago.lv");
        label_info.setForeground(Color.BLACK);
            
        panel_3.add(label_info, BorderLayout.CENTER);

        frame.getContentPane().add(panel_1, BorderLayout.NORTH);
        frame.getContentPane().add(panel_2, BorderLayout.CENTER);
        frame.getContentPane().add(panel_3, BorderLayout.SOUTH);
                           
//------------------------------
        
        desktoppane_11.setLayout(new BorderLayout());
        desktoppane_11.setBackground(Color.RED);
        desktoppane_11.setPreferredSize(new Dimension(200, 350));

        desktoppane_12.setLayout(new BorderLayout());
        desktoppane_12.setBackground(Color.PINK);
        desktoppane_12.setPreferredSize(new Dimension(600, 350));

        desktoppane_13.setLayout(new BorderLayout());
        desktoppane_13.setBackground(Color.YELLOW);
        desktoppane_13.setPreferredSize(new Dimension(200, 350));     

        desktoppane_21.setLayout(new BorderLayout());
        desktoppane_21.setBackground(Color.BLUE);
        desktoppane_21.setPreferredSize(new Dimension(200, 150));    
        	
        desktoppane_22.setLayout(new BorderLayout());
        desktoppane_22.setBackground(Color.CYAN);
        desktoppane_22.setPreferredSize(new Dimension(600, 150));       

        desktoppane_23.setLayout(new BorderLayout());
        desktoppane_23.setBackground(Color.GREEN);
        desktoppane_23.setPreferredSize(new Dimension(200, 150));                	
            
//--------------------------------------------------
        	
        new lv.yu.jav.start.JAV_start_visualize_10();        	
           
//------------------------------         

        frame.setVisible(true);
        
//------------------------------                
                
    }  //  end JAV_10_tabs()
    
//------------------------------    
    
/**
 * JAV_10_tabs
 * 
 * @param args[]
 */    
public static void main(String[] args) {
                                         EventQueue.invokeLater( () -> { new JAV_10_tabs(); } );
}  //  end main()

//------------------------------ 
    
}  //  end JAV_10_tabs

//------------------------------
