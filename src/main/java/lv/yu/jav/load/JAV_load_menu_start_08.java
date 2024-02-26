
/**
 *
 * Java package     lv.yu.jav.load
 *
 * Java program     JAV_load_menu_start_08.java     Apache License 2.0
 *
 * Copyright (c)    Yuri Utkin 2023                 mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.jav.load;

import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JAV_load_menu_start_08
 */
public class JAV_load_menu_start_08 {

/**
 * JAV_load_menu_start_08()
 */
    public JAV_load_menu_start_08() {

//------------------------------

    var icon_Load = new ImageIcon( getClass().getResource("/lv/yu/jav/JAV_resources/load.gif") );

//------------------------------

      var item_Load = new JMenuItem("Load", icon_Load);
          item_Load.setToolTipText("Load application");
          item_Load.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.ALT_MASK));   //  Alt L

//------------------------------

          item_Load.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) { System.out.println("Selected menu: " + e.getActionCommand()); } } );

//------------------------------

        lv.yu.jav.start.JAV_start_menu_08.menu_Menu.add(item_Load);

        lv.yu.jav.JAV_08_internal_frames.menubar.add(lv.yu.jav.start.JAV_start_menu_08.menu_Menu);

//------------------------------

    }  //  end JAV_load_menu_start_08()

}  //  end JAV_load_menu_start_08
