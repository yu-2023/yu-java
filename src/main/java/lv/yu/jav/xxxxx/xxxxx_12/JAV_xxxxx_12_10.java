
/**
 *
 * Java package     lv.yu.jav.xxxxx.xxxxx_12
 *
 * Java program     JAV_xxxxx_12_10.java     Apache License 2.0
 *
 * Copyright (c)    Yuri Utkin 2023          mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.jav.xxxxx.xxxxx_12;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;

/**
 * JAV_xxxxx_12_10
 */
public final class JAV_xxxxx_12_10 {

/**
 * JTabbedPane_xxxxx_12
 */
    public static JTabbedPane JTabbedPane_xxxxx_12 = new JTabbedPane();

/**
 * JInternalFrame_xxxxx_12
 */
    public static JInternalFrame JInternalFrame_xxxxx_12 = new JInternalFrame();

/**
 * JAV_xxxxx_12_10()
 */
    public JAV_xxxxx_12_10() {

        JTabbedPane_xxxxx_12 = new JTabbedPane();
        JTabbedPane_xxxxx_12.removeAll();

        new JAV_xxxxx_12_about_10();
        new JAV_xxxxx_12_help_10();

        JTabbedPane_xxxxx_12.setTabPlacement(SwingConstants.BOTTOM);
        JTabbedPane_xxxxx_12.setTabLayoutPolicy(JTabbedPane_xxxxx_12.SCROLL_TAB_LAYOUT);

        JInternalFrame_xxxxx_12 = new JInternalFrame("12 XXXXX XXXXX XXXXX", true, false, true, true);
        JInternalFrame_xxxxx_12.setLayout(new BorderLayout());
        JInternalFrame_xxxxx_12.setBackground(Color.GRAY);
        JInternalFrame_xxxxx_12.setVisible(true);

        JInternalFrame_xxxxx_12.add(JTabbedPane_xxxxx_12, BorderLayout.CENTER);

    }  //  end JAV_xxxxx_12_10()

}  //  end JAV_xxxxx_12_10
