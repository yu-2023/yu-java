
/**
 *
 * Java package     lv.yu.jav.help.help_12
 *
 * Java program     JAV_help_12_09.java     Apache License 2.0
 *
 * Copyright (c)    Yuri Utkin 2023         mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.jav.help.help_12;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;

/**
 * JAV_help_12_09
 */
public final class JAV_help_12_09 {

/**
 * JTabbedPane_help_12
 */
    public static JTabbedPane JTabbedPane_help_12 = new JTabbedPane();

/**
 * JInternalFrame_help_12
 */
    public static JInternalFrame JInternalFrame_help_12 = new JInternalFrame();

/**
 * JAV_help_12_09()
 */
    public JAV_help_12_09() {

        JTabbedPane_help_12 = new JTabbedPane();
        JTabbedPane_help_12.removeAll();

        JTabbedPane_help_12.setTabPlacement(SwingConstants.BOTTOM);
        JTabbedPane_help_12.setTabLayoutPolicy(JTabbedPane_help_12.SCROLL_TAB_LAYOUT);

        JInternalFrame_help_12 = new JInternalFrame("12 HELP HELP HELP", true, false, true, true);
        JInternalFrame_help_12.setLayout(new BorderLayout());
        JInternalFrame_help_12.setBackground(Color.GRAY);
        JInternalFrame_help_12.setVisible(true);

        JInternalFrame_help_12.add(JTabbedPane_help_12, BorderLayout.CENTER);

    }  //  end JAV_help_12_09()

}  //  end JAV_help_12_09
