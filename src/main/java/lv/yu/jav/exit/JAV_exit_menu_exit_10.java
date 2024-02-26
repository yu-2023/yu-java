
/**
 *
 * Java package     lv.yu.jav.exit
 *
 * Java program     JAV_exit_menu_exit_10.java     Apache License 2.0
 *
 * Copyright (c)    Yuri Utkin 2023                mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.jav.exit;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

import java.awt.event.KeyEvent;

/**
 * JAV_exit_menu_exit_10
 */
public class JAV_exit_menu_exit_10 {

/**
 * JAV_exit_menu_exit_10()
 */
    public JAV_exit_menu_exit_10() {

//------------------------------

    var icon_Exit = new ImageIcon( getClass().getResource("/lv/yu/jav/JAV_resources/exit.png") );

//------------------------------

    var menu_Exit = new JMenu("Exit");
        menu_Exit.setMnemonic(KeyEvent.VK_E);  //  Alt E
        menu_Exit.setToolTipText("Exit commands");
      var item_Exit = new JMenuItem("Exit", icon_Exit);
          item_Exit.setToolTipText("Exit application");

//------------------------------

          item_Exit.addActionListener((event) -> System.exit(0));

//------------------------------

        menu_Exit.add(item_Exit);

        lv.yu.jav.JAV_10_tabs.menubar.add(menu_Exit);

//------------------------------

    }  //  end JAV_exit_menu_exit_10()

}  //  end JAV_exit_menu_exit_10

//------------------------------

