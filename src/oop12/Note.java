package oop12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Note extends JFrame{
	
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("파일");
	JMenu editMenu = new JMenu("편집");
	JMenu helpMenu = new JMenu("도움말");
	JTextArea textArea = new JTextArea();
	
	JMenuItem newMenuItem = new JMenuItem("새 파일");
	JMenuItem openMenuItem = new JMenuItem("열기");
	JMenuItem saveMenuItem = new JMenuItem("저장하기");
	JMenuItem exitMenuItem = new JMenuItem("끌내기");
	
	
	public Note(){
		
		setLayout(new BorderLayout());
		
		ActionListener al1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "새 파일을 엽니다.");
			}
		};
		
			
		JFileChooser chooser = new JFileChooser();
		
		ActionListener al2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				chooser.showOpenDialog(null);
			}
		};
		
		ActionListener al3 = (e) -> {
			chooser.showSaveDialog(null);
		};
		ActionListener al4 = (e) -> {
			System.exit(0);
		};
		
		newMenuItem.addActionListener(al1);
		openMenuItem.addActionListener(al2);
		saveMenuItem.addActionListener(al3);
		exitMenuItem.addActionListener(al4);
		
		fileMenu.add(newMenuItem);
		fileMenu.add(openMenuItem);
		fileMenu.add(saveMenuItem);
		fileMenu.add(exitMenuItem);
		
		
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		setJMenuBar(menuBar);
		
		add(new JScrollPane(textArea),BorderLayout.CENTER);
		
		setBounds(100,100,600,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}
	
	public static void main(String[] args) {
		new Note();
		
		
		
		
	}
	
}
