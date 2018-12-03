package com.mypackage.v1ch11.plaf;

import javax.swing.*;

/**
 * 描述:
 * PlafFrame
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年11月12日  10:33
 */
public class PlafFrame extends JFrame {
    private JPanel buttonPanel;

    public PlafFrame(){
        buttonPanel = new JPanel();
        UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo info : infos){
            makeButton(info.getName(), info.getClassName());
        }
        add(buttonPanel);
        pack();
    }
    /**
     * Makes a button to change the pluggable look-and-feel.
     * @param name the button name
     * @param className the name of the look-and-feel class
     */
    private void  makeButton(String name,String className){
        JButton button = new JButton(name);
        buttonPanel.add(button);
        button.addActionListener(event->{
            try{
                UIManager.setLookAndFeel(className);
                SwingUtilities.updateComponentTreeUI(this);
                pack();

            }catch(Exception e){
                e.printStackTrace();
            }
        });

    }
}
