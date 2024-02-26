
/**
 *
 * Java package     lv.yu.jav.help.help_22
 *
 * Java program     JAV_help_22_10.java     Apache License 2.0
 *
 * Copyright (c)    Yuri Utkin 2023         mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.jav.help.help_22;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;

/**
 * JAV_help_22_10
 */
public final class JAV_help_22_10 {

/**
 * JTabbedPane_help_22
 */
    public static JTabbedPane JTabbedPane_help_22 = new JTabbedPane();

/**
 * JInternalFrame_help_22
 */
    public static JInternalFrame JInternalFrame_help_22 = new JInternalFrame();

/**
 * JAV_help_22_10()
 */
    public JAV_help_22_10() {

        JTabbedPane_help_22 = new JTabbedPane();
        JTabbedPane_help_22.removeAll();

        new JAV_help_22_about_10();
        new JAV_help_22_help_10();

        JTabbedPane_help_22.setTabPlacement(SwingConstants.BOTTOM);
        JTabbedPane_help_22.setTabLayoutPolicy(JTabbedPane_help_22.SCROLL_TAB_LAYOUT);

        JInternalFrame_help_22 = new JInternalFrame("22 HELP HELP HELP", true, false, true, true);
        JInternalFrame_help_22.setLayout(new BorderLayout());
        JInternalFrame_help_22.setBackground(Color.GRAY);
        JInternalFrame_help_22.setVisible(true);

        JInternalFrame_help_22.add(JTabbedPane_help_22, BorderLayout.CENTER);

    }  //  end JAV_help_22_10()

}  //  end JAV_help_22_10
