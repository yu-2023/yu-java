
/**
 * 
 * Java package     lv.yu.jav
 * 
 * Java program     JAV_07_internal_frame_six.java     Apache License 2.0
 *      
 * Copyright (c)    Yuri Utkin 2023                    mob.+371 12345678     https://www.jago.lv
 * 
 */
package lv.yu.jav;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.KeyStroke;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//------------------------------

/** JAV_07_internal_frame_six */
public final class JAV_07_internal_frame_six {
     
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

    /** internalframe_11 */
    public static JInternalFrame internalframe_start_11;

    /** internalframe_12 */
    public static JInternalFrame internalframe_start_12;
    
    /** internalframe_13 */
    public static JInternalFrame internalframe_start_13;
    
    /** internalframe_21 */
    public static JInternalFrame internalframe_start_21;
    
    /** internalframe_22 */
    public static JInternalFrame internalframe_start_22;
    
    /** internalframe_23 */
    public static JInternalFrame internalframe_start_23;
	
//------------------------------

/** JAV_07_internal_frame_six demonstrates six Java Internal Frames in Java Frame */
public JAV_07_internal_frame_six() { 

    var imgURL     =               JAV_07_internal_frame_six.class.getResource("/lv/yu/jav/JAV_resources/JAV.jpg");
    var icon_frame = new ImageIcon(JAV_07_internal_frame_six.class.getResource("/lv/yu/jav/JAV_resources/JAV.jpg"));

//------------------------------            
    	
        var title = "JAVA -- JAV_07_internal_frame_six -- v. 2023.01.01";

        frame.setTitle("     " + title);
        
        frame.setBounds(10+6*40, 10+6*40, 1000, 600);
      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setIconImage(icon_frame.getImage());
        
        frame.setLayout(new BorderLayout());
        
        frame.setVisible(true);
        
//------------------------------        
        
    var icon_Start       = new ImageIcon(JAV_07_internal_frame_six.class.getResource("/lv/yu/jav/JAV_resources/start.gif"));
    var icon_Load        = new ImageIcon(JAV_07_internal_frame_six.class.getResource("/lv/yu/jav/JAV_resources/load.gif"));
    var icon_Xxxx        = new ImageIcon(JAV_07_internal_frame_six.class.getResource("/lv/yu/jav/JAV_resources/xxxx.png"));
    var icon_Information = new ImageIcon(JAV_07_internal_frame_six.class.getResource("/lv/yu/jav/JAV_resources/information.gif"));
    var icon_Help        = new ImageIcon(JAV_07_internal_frame_six.class.getResource("/lv/yu/jav/JAV_resources/help.png"));
    var icon_About       = new ImageIcon(JAV_07_internal_frame_six.class.getResource("/lv/yu/jav/JAV_resources/about.gif"));
    var icon_Eng         = new ImageIcon(JAV_07_internal_frame_six.class.getResource("/lv/yu/jav/JAV_resources/prefs.gif"));
    var icon_Rus         = new ImageIcon(JAV_07_internal_frame_six.class.getResource("/lv/yu/jav/JAV_resources/prefs.gif"));
    var icon_Lat         = new ImageIcon(JAV_07_internal_frame_six.class.getResource("/lv/yu/jav/JAV_resources/prefs.gif"));
    var icon_Exit        = new ImageIcon(JAV_07_internal_frame_six.class.getResource("/lv/yu/jav/JAV_resources/exit.png"));
        
//------------------------------
        
    var menu_Menu = new JMenu("Menu");
      var item_Start = new JMenuItem("Start", icon_Start);
      var item_Load  = new JMenuItem("Load", icon_Load);
      var item_Xxxx  = new JMenuItem("Xxxx", icon_Xxxx);

    var menu_Start1 = new JMenu("Start1"); 
      var item_St11 = new JMenuItem("St11");
      var item_St12 = new JMenuItem("St12");
    
    var menu_Start2 = new JMenu("Start2");  
      var item_St21 = new JMenuItem("St21");
      var item_St22 = new JMenuItem("St22");

    var menu_Start3 = new JMenu("Start3");   
      var item_St31 = new JMenuItem("St31");
      var item_St32 = new JMenuItem("St32");

    var menu_Help = new JMenu("Help");
      var item_Information = new JMenuItem("Information", icon_Information);
      var item_Help        = new JMenuItem("Help", icon_Help);
      var item_About       = new JMenuItem("About", icon_About);
    
    var menu_Lang = new JMenu("Lang"); 
      var item_Eng = new JCheckBoxMenuItem("Eng", icon_Eng);
      var item_Rus = new JCheckBoxMenuItem("Rus", icon_Rus);
      var item_Lat = new JCheckBoxMenuItem("Lat", icon_Lat);

    var menu_Exit = new JMenu("Exit");
      var item_Exit = new JMenuItem("Exit", icon_Exit);
    
//------------------------------
      
        menu_Menu.setMnemonic(KeyEvent.VK_M);  //  Alt M
        menu_Menu.setToolTipText("Menu commands");    
          item_Start.setToolTipText("Start application");
          item_Load.setToolTipText("Load application");
          item_Xxxx.setToolTipText("Xxxx application");          
          item_Start.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));  //  Alt S
          item_Load.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.ALT_MASK));   //  Alt L
          item_Xxxx.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));   //  Alt X  
       
        menu_Start1.setMnemonic(KeyEvent.VK_1);  //  Alt 1
        menu_Start1.setToolTipText("Start1 commands"); 
          item_St11.setToolTipText("St11 application");
          item_St12.setToolTipText("St12 application");
 
        menu_Start2.setMnemonic(KeyEvent.VK_2);  //  Alt 2
        menu_Start2.setToolTipText("Start2 commands");    
          item_St21.setToolTipText("St21 application");
          item_St22.setToolTipText("St22 application");
            
        menu_Start3.setMnemonic(KeyEvent.VK_3);  //  Alt 3
        menu_Start3.setToolTipText("Start3 commands"); 
          item_St31.setToolTipText("St31 application");
          item_St32.setToolTipText("St32 application");
            
        menu_Help.setMnemonic(KeyEvent.VK_H);  //  Alt H
        menu_Help.setToolTipText("Help commands");    
          item_Information.setToolTipText("Information application");
          item_Help.setToolTipText("Help application");
          item_About.setToolTipText("About application");
        
        menu_Lang.setMnemonic(KeyEvent.VK_L);  //  Alt L
        menu_Lang.setToolTipText("Lang commands");                        
          item_Eng.setToolTipText("Eng application");
          item_Rus.setToolTipText("Rus application");
          item_Lat.setToolTipText("Lat application");   
          item_Eng.setSelected(true);

        menu_Exit.setMnemonic(KeyEvent.VK_E);  //  Alt E
        menu_Exit.setToolTipText("Exit commands");               
          item_Exit.setToolTipText("Exit application");
    
//------------------------------          
          
          item_Start.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
        
          item_Load.addActionListener(new ActionListener() {
    			 public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
        
          item_Xxxx.addActionListener(new ActionListener() {
    			 public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
        
          item_St11.addActionListener(new ActionListener() {
    			 public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
        
          item_St12.addActionListener(new ActionListener() {
    			 public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
        
          item_St21.addActionListener(new ActionListener() {
    			 public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
        
          item_St22.addActionListener(new ActionListener() {
    			 public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
        
          item_St31.addActionListener(new ActionListener() {
    			 public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
        
          item_St32.addActionListener(new ActionListener() {
    			 public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
     
          item_Information.addActionListener(new ActionListener() {
    			 public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );        
        
          item_Help.addActionListener(new ActionListener() {
    			 public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );

          item_About.addActionListener(new ActionListener() {
    			 public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );

          item_Eng.addActionListener(new ActionListener() {
    			 public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );        
        
          item_Rus.addActionListener(new ActionListener() {
    			 public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
          
          item_Lat.addActionListener(new ActionListener() {
    			 public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );
        
          item_Exit.addActionListener((event) -> System.exit(0));
        
//------------------------------         
        
        menu_Menu.add(item_Start);
        menu_Menu.add(item_Load);
        menu_Menu.add(item_Xxxx);

        menu_Start1.add(item_St11);
        menu_Start1.add(item_St12);

        menu_Start2.add(item_St21);
        menu_Start2.add(item_St22);
            
        menu_Start3.add(item_St31);
        menu_Start3.add(item_St32);
            
        menu_Help.add(item_Information);
        menu_Help.add(item_Help);
        menu_Help.add(item_About);

        menu_Lang.add(item_Eng);
        menu_Lang.add(item_Rus);
        menu_Lang.add(item_Lat);
        
        menu_Exit.add(item_Exit);
            
        menubar.add(menu_Menu);
        menubar.add(menu_Start1);
        menubar.add(menu_Start2);
        menubar.add(menu_Start3);
        menubar.add(menu_Help);
        menubar.add(menu_Lang);
        menubar.add(menu_Exit);
        
        menubar.setLayout( new lv.yu.jav.JAV_LIB_wrap_layout (lv.yu.jav.JAV_LIB_wrap_layout.LEFT, 0, 0) );

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

//------------------------------
        
        internalframe_start_11 = new JInternalFrame("11 START", true, false, true, true);
        internalframe_start_11.setLayout(new BorderLayout());
        internalframe_start_11.setBackground(Color.GRAY);
        internalframe_start_11.setVisible(true);
        
        internalframe_start_12 = new JInternalFrame("12 START START START", true, false, true, true);
        internalframe_start_12.setLayout(new BorderLayout());
        internalframe_start_12.setBackground(Color.GRAY);
        internalframe_start_12.setVisible(true);
  
        internalframe_start_13 = new JInternalFrame("13 START", true, false, true, true);
        internalframe_start_13.setLayout(new BorderLayout());
        internalframe_start_13.setBackground(Color.GRAY);
        internalframe_start_13.setVisible(true);

        internalframe_start_21 = new JInternalFrame("21 START", true, false, true, true);
        internalframe_start_21.setLayout(new BorderLayout());
        internalframe_start_21.setBackground(Color.GRAY);
        internalframe_start_21.setVisible(true);

        internalframe_start_22 = new JInternalFrame("22 START START START", true, false, true, true);
        internalframe_start_22.setLayout(new BorderLayout());
        internalframe_start_22.setBackground(Color.GRAY);
        internalframe_start_22.setVisible(true);

        internalframe_start_23 = new JInternalFrame("23 START", true, false, true, true);
        internalframe_start_23.setLayout(new BorderLayout());
        internalframe_start_23.setBackground(Color.GRAY);
        internalframe_start_23.setVisible(true);

//------------------------------

        desktoppane_11.add(internalframe_start_11, BorderLayout.CENTER);
        desktoppane_12.add(internalframe_start_12, BorderLayout.CENTER);
        desktoppane_13.add(internalframe_start_13, BorderLayout.CENTER);
        desktoppane_21.add(internalframe_start_21, BorderLayout.CENTER);
        desktoppane_22.add(internalframe_start_22, BorderLayout.CENTER);
        desktoppane_23.add(internalframe_start_23, BorderLayout.CENTER);
           
        panel_1.add(desktoppane_11, BorderLayout.WEST);
        panel_1.add(desktoppane_12, BorderLayout.CENTER);
        panel_1.add(desktoppane_13, BorderLayout.EAST);
        panel_2.add(desktoppane_21, BorderLayout.WEST);
        panel_2.add(desktoppane_22, BorderLayout.CENTER);
        panel_2.add(desktoppane_23, BorderLayout.EAST);
        
//------------------------------ 
        
        frame.setVisible(true);
        
//------------------------------ 
        
    }  //  end JAV_07_internal_frame_six()

//------------------------------    
    
/**
 * JAV_07_internal_frame_six
 * 
 * @param args[]
 */    
public static void main(String[] args) {
                                         EventQueue.invokeLater( () -> { new JAV_07_internal_frame_six(); } );
}  //  end main()

//------------------------------ 
    
}  //  end JAV_07_internal_frame_six

//------------------------------
