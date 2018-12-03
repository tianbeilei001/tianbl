package com.mypackage.v1ch11.mouse;

import java.awt.*;
import javax.swing.*;
/**
 * 描述:
 * MouseTest
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年11月12日  11:50
 */
public class MouseTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new MouseFrame();
            frame.setTitle("MouseTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
