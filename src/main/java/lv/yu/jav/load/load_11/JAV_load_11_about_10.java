
/**
 *
 * Java package     lv.yu.jav.load.load_11
 *
 * Java program     JAV_load_11_about_10.java     Apache License 2.0
 *
 * Copyright (c)    Yuri Utkin 2023               mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.jav.load.load_11;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;

import java.awt.event.KeyEvent;

/**
 * JAV_load_11_about_10
 */
public class JAV_load_11_about_10 {

/**
 * JAV_load_11_about_10()
 */
    public JAV_load_11_about_10() {

    var imageicon = new ImageIcon(JAV_load_11_about_10.class.getResource("/lv/yu/jav/JAV_resources/info.gif"));

    var jtextarea = new JTextArea();
        jtextarea.setText("JAV_load_11_about_10_JTextArea");

        JAV_load_11_10.JTabbedPane_load_11.addTab("about", imageicon, jtextarea, "Load about JTextArea");
        JAV_load_11_10.JTabbedPane_load_11.setMnemonicAt(0, KeyEvent.VK_A);  //  Alt A

    }  //  end JAV_load_11_about_10()

}  //  end JAV_load_11_about_10
