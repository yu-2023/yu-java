
/**
 *
 * Java package     lv.yu.jav.xxxxx.xxxxx_11
 *
 * Java program     JAV_xxxxx_11_help_10.java     Apache License 2.0
 *
 * Copyright (c)    Yuri Utkin 2023               mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.jav.xxxxx.xxxxx_11;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;

import java.awt.event.KeyEvent;

/**
 * JAV_xxxxx_11_about_10
 */
public class JAV_xxxxx_11_help_10 {

/**
 * JAV_xxxxx_11_about_10()
 */
    public JAV_xxxxx_11_help_10() {

    var imageicon = new ImageIcon(JAV_xxxxx_11_help_10.class.getResource("/lv/yu/jav/JAV_resources/info.gif"));

    var jtextarea = new JTextArea();
        jtextarea.setText("JAV_xxxxx_11_help_10_JTextArea");

        JAV_xxxxx_11_10.JTabbedPane_xxxxx_11.addTab("help", imageicon, jtextarea, "Load help JTextArea");
        JAV_xxxxx_11_10.JTabbedPane_xxxxx_11.setMnemonicAt(1, KeyEvent.VK_H);  //  Alt H

    }  //  end JAV_xxxxx_11_help_10()

}  //  end JAV_xxxxx_11_help_10
