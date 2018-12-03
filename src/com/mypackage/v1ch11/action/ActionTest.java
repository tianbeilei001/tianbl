package com.mypackage.v1ch11.action;

import java.awt.*;
import javax.swing.*;
/**
 * 描述:
 * ActionTest
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年11月12日  11:36
 */
public class ActionTest {
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            JFrame frame = new ActionFrame();
            frame.setTitle("ActionTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
