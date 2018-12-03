package com.mypackage.v1ch11.mouse;

import javax.swing.*;

/**
 * 描述:
 * MouseFrame
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年11月12日  11:47
 */
public class MouseFrame extends JFrame {
    public MouseFrame()
    {
        add(new MouseComponent());
        pack();
    }
}
