
/**
 *
 * Java package     lv.yu.jav.start.start_23
 *
 * Java program     JAV_start_23_about_10.java     Apache License 2.0
 *
 * Copyright (c)    Yuri Utkin 2023                mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.jav.start.start_23;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;

import java.awt.event.KeyEvent;

/**
 * JAV_start_23_about_10
 */
public class JAV_start_23_about_10 {

/**
 * JAV_start_23_about_10()
 */
    public JAV_start_23_about_10() {

    var imageicon = new ImageIcon(JAV_start_23_about_10.class.getResource("/lv/yu/jav/JAV_resources/info.gif"));

    var jtextarea = new JTextArea();
        jtextarea.setText("JAV_start_23_about_10_JTextArea");

        JAV_start_23_10.JTabbedPane_start_23.addTab("about", imageicon, jtextarea, "Load about JTextArea");
        JAV_start_23_10.JTabbedPane_start_23.setMnemonicAt(0, KeyEvent.VK_A);  //  Alt A

    }  //  end JAV_start_23_about_10()

}  //  end JAV_start_23_about_10
