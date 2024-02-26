
/**
 *
 * Java package     lv.yu.jav.start
 *
 * Java program     JAV_start_menu_10.java     Apache License 2.0
 *
 * Copyright (c)    Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.jav.start;

import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.event.KeyEvent;

/**
 * JAV_start_menu_10
 */
public class JAV_start_menu_10 {

/** menu_Menu */
public static JMenu menu_Menu = new JMenu();

/**
 * JAV_start_menu_10
 */
    public JAV_start_menu_10() {

        lv.yu.jav.JAV_10_tabs.menubar = new JMenuBar();
        lv.yu.jav.JAV_10_tabs.menubar.setLayout( new lv.yu.jav.JAV_LIB_wrap_layout(lv.yu.jav.JAV_LIB_wrap_layout.LEFT, 0, 0) );

            menu_Menu = new JMenu("Menu");
            menu_Menu.setMnemonic(KeyEvent.VK_M);  //  Alt M
            menu_Menu.setToolTipText("Menu commands");

            lv.yu.jav.JAV_10_tabs.menubar.add(menu_Menu);

    }  //  end JAV_start_menu_10()

}  //  end JAV_start_menu_10
