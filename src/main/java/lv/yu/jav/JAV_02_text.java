
/**
 *
 * Java package     lv.yu.jav
 *
 * Java program     JAV_02_text.java     Apache License 2.0
 *
 * Copyright (c)    Yuri Utkin 2023      mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.jav;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.BorderLayout;

import javax.swing.WindowConstants;

import javax.swing.SwingUtilities;

//------------------------------

/** JAV_02_text */
public final class JAV_02_text {

    /** frame */
    public static JFrame frame = new JFrame();

//------------------------------

/** JAV_02_text demonstrates Java Text in Java Frame */
public JAV_02_text() {

        var imgURL =                   JAV_02_text.class.getResource("/lv/yu/jav/JAV_resources/JAV.jpg");
        var icon_frame = new ImageIcon(JAV_02_text.class.getResource("/lv/yu/jav/JAV_resources/JAV.jpg"));

//------------------------------

    var title = "JAVA -- JAV_02_text -- v. 2023.12.12";

        frame.setTitle("     " + title);

        frame.setBounds(10+1*40, 10+1*40, 1000, 600);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setIconImage(icon_frame.getImage());

        frame.setLayout(new BorderLayout());

        frame.setVisible(true);

//------------------------------

    var textarea = new JTextArea();
    var scrollpane = new JScrollPane(textarea);

        textarea.setText("" +
"        \r\n" +
"        💞️💞️ EN\r\n" +
"        \r\n" +
"        Comparative analysis of programming in Java, Kotlin, Clojure, Groovy, Scala and Jython.\r\n" +
"        \r\n" +
"        How to Program Java, Kotlin, Clojure, Groovy, Scala and Jython Simultaneously.\r\n" +
"        \r\n" +
"        Integration of Java, Kotlin, Clojure, Groovy, Scala and Jython in one software product.\r\n" +
"        \r\n" +
"        \r\n" +
"        \r\n" +
"        👋👋 RU\r\n" +
"        \r\n" +
"        Сравнительный анализ программирование на Java, Kotlin, Clojure, Groovy, Scala и Jython.\r\n" +
"        \r\n" +
"        Как программировать одновременно на Java, Kotlin, Clojure, Groovy, Scala и Jython.\r\n" +
"        \r\n" +
"        Интеграция Java, Kotlin, Clojure, Groovy, Scala и Jython в одном программном продукте.\r\n" +
"        \r\n" +
"        \r\n" +
"        \r\n" +
"        🌱🌱 LV\r\n" +
"        \r\n" +
"        Java, Kotlin, Clojure, Groovy, Scala un Jython programmēšanas salīdzinošā analīze.\r\n" +
"        \r\n" +
"        Kā programmēt Java, Kotlin, Clojure, Groovy, Scala un Jython vienlaicīgi.\r\n" +
"        \r\n" +
"        Java, Kotlin, Clojure, Groovy, Scala un Jython integrācija vienā programmatūras produktā.\r\n" +
"        \r\n" +
                         "");

        frame.getContentPane().add(scrollpane, BorderLayout.CENTER);

        frame.setVisible(true);

//------------------------------ 

}  //  end JAV_02_text()

//------------------------------

/**
 * JAVA JAV_02_text
 *
 * @param args[]
 */
    public static void main(String[] args) {
                                             SwingUtilities.invokeLater( () -> { new JAV_02_text(); } );
    }  //  end main

//------------------------------

}  //  end JAV_02_text

//------------------------------
