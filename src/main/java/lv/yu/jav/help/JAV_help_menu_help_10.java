
/**
 *
 * Java package     lv.yu.jav.help
 *
 * Java program     JAV_help_menu_help_10.java     Apache License 2.0
 *
 * Copyright (c)    Yuri Utkin 2023                mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.jav.help;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JAV_help_menu_help_10
 */
public class JAV_help_menu_help_10 {

/**
 * JAV_help_menu_help_10()
 */
    public JAV_help_menu_help_10() {

//------------------------------

    var icon_Information = new ImageIcon( getClass().getResource("/lv/yu/jav/JAV_resources/information.gif") );
    var icon_Help        = new ImageIcon( getClass().getResource("/lv/yu/jav/JAV_resources/help.png") );
    var icon_About       = new ImageIcon( getClass().getResource("/lv/yu/jav/JAV_resources/about.gif") );

//------------------------------

    var menu_Help = new JMenu("Help");
        menu_Help.setMnemonic(KeyEvent.VK_H);  //  Alt H
        menu_Help.setToolTipText("Help commands");
      var item_Information = new JMenuItem("Information", icon_Information);
          item_Information.setToolTipText("Information application");
      var item_Help = new JMenuItem("Help", icon_Help);
          item_Help.setToolTipText("Help application");
      var item_About = new JMenuItem("About", icon_About);
          item_About.setToolTipText("About application");

//------------------------------

          item_Information.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );

          item_Help.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) { new lv.yu.jav.help.JAV_help_visualize_10(); } } );

          item_About.addActionListener(new ActionListener() {
           	  public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );

//------------------------------

            menu_Help.add(item_Information);
            menu_Help.add(item_Help);
            menu_Help.add(item_About);

            lv.yu.jav.JAV_10_tabs.menubar.add(menu_Help);

//------------------------------

    }  //  end JAV_help_menu_help_10()

}  //  end JAV_help_menu_help_10

