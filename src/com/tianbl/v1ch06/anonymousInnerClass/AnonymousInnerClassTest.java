package com.tianbl.v1ch06.anonymousInnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年06月11日 11:31
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args)
    {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);

        // keep program running until user selects "Ok"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

/**
 * A clock that prints the time in regular intervals.
 */
class TalkingClock
{
    /**
     * Starts the clock.
     * @param interval the interval between messages (in milliseconds)
     * @param beep true if the clock should beep
     */
    public void start(int interval, boolean beep)
    {
        ActionListener listener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                System.out.println("At the tone, the time is " + new Date());
                if (beep){
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        };
        Timer t = new Timer(interval, listener);
        t.start();
    }
}

