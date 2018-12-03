package com.mypackage.v1ch11.plaf;

import java.awt.*;
import javax.swing.*;
/**
 * 描述:
 * PlafTest
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年11月12日  10:46
 */
public class PlafTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new PlafFrame();
            frame.setTitle("PlafTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
