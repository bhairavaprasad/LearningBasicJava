package com.tss.threads.and.swing.lesson12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleEvent extends Object
{
	private static void print(String msg)
	{
		String name = Thread.currentThread().getName();
		System.out.println(name + ": " + msg);
	}
	
	public static void main(String[] args)
	{
		final JLabel label = new JLabel("--------");
		JButton button = new JButton("Click Here");
		
		JPanel panel = new JPanel(new FlowLayout());
		panel.add(button);
		panel.add(label);
		
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				print("in actionPerformed()");
				label.setText("CLICKED!");
			}
		});
		
		JFrame f = new JFrame("SimpleEvent");
		f.setContentPane(panel);
		f.setSize(300, 100);
		f.setVisible(true);
	}
}
