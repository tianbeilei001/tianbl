package com.mypackage.v1ch11.button;

import java.awt.*;
import javax.swing.*;
/**
 * 描述:
 * ButtonTest
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年11月12日  10:15
 */
public class ButtonTest {
    public static void main(String[] args) {
       EventQueue.invokeLater(()->{
           JFrame frame = new ButtonFrame();
           frame.setTitle("ButtonTest");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setVisible(true);
       });
    }
}
