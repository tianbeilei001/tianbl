package com.mypackage.v1ch10.sizedFrame;

import javax.swing.*;
import java.awt.*;

/**
 * 描述:
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年11月07日  14:59
 */
public class SizedFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            JFrame frame = new SizedFrame();
            frame.setTitle("SizedFrame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }

}
class SizedFrame extends JFrame
{
    public SizedFrame()
    {
        // get screen dimensions

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        // set frame width, height and let platform pick screen location

        setSize(screenWidth / 2, screenHeight / 2);
        setLocationByPlatform(true);

        // set frame icon

        Image img = new ImageIcon("icon.gif").getImage();
        setIconImage(img);
    }
}