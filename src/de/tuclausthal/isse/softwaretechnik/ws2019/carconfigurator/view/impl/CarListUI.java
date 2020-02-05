package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.impl;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class CarListUI extends JFrame {
	private JFrame mainFrame;
	
	private JLabel titleLabel;
	private JPanel titlePanel;
	
	private ImageIcon image1;
	private ImageIcon image2;
	private ImageIcon image3;
	private ImageIcon image4;
	private ImageIcon image5;
	
	private JLabel im1Label;
	private JLabel im2Label;
	private JLabel im3Label;
	private JLabel im4Label;
	private JLabel im5Label;
	
	private JCheckBox im1ChBox;
	private JCheckBox im2ChBox;
	private JCheckBox im3ChBox;
	private JCheckBox im4ChBox;
	private JCheckBox im5ChBox;

	
	private JButton orderButton;
	private JButton configureButton;
	
	private JPanel mainPanel;
	
	private ActionListener actionListener;

	public CarListUI(ActionListener actionListener) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.actionListener = actionListener;
		this.composeUI();
	}
	private CarListUI() {
		this.composeUI();
	}
	public void composeUI() {
		this.mainFrame = new JFrame();

		this.mainPanel = new JPanel(null);
		this.titleLabel = new JLabel("Autos Liste");
		this.titleLabel.setBounds(900, 10, 100, 10);
		this.mainPanel.add(titleLabel);
		
		this.image1 = new ImageIcon(getClass().getResource("BMW_X5_3.jpg"));
		Image img1 = image1.getImage();
		Image newImg1 = img1.getScaledInstance(350, 240, java.awt.Image.SCALE_SMOOTH);
		this.image1 = new ImageIcon(newImg1);
		
		this.image2 = new ImageIcon(getClass().getResource("Audi_R8_2.jpg"));
		Image img2 = image2.getImage();
		Image newImg2 = img2.getScaledInstance(350, 240, java.awt.Image.SCALE_SMOOTH);
		this.image2 = new ImageIcon(newImg2);
		
		this.image3 = new ImageIcon(getClass().getResource("Audi_A4_4.jpg"));
		Image img3 = image3.getImage();
		Image newImg3 = img3.getScaledInstance(350, 240, java.awt.Image.SCALE_SMOOTH);
		this.image3 = new ImageIcon(newImg3);
		
		this.image4 = new ImageIcon(getClass().getResource("BMW_X6_2.jpg"));
		Image img4 = image4.getImage();
		Image newImg4 = img4.getScaledInstance(350, 240, java.awt.Image.SCALE_SMOOTH);
		this.image4 = new ImageIcon(newImg4);
		
		this.image5 = new ImageIcon(getClass().getResource("VW_Golf_2.jpg"));
		Image img5 = image5.getImage();
		Image newImg5 = img5.getScaledInstance(350, 240, java.awt.Image.SCALE_SMOOTH);
		this.image5 = new ImageIcon(newImg5);
		
		this.im1Label = new JLabel(image1);
		this.im1Label.setBounds(10, 60, 350, 240);
		this.im2Label = new JLabel(image2);
		this.im2Label.setBounds(370, 60, 350, 240);
		this.im3Label = new JLabel(image3);
		this.im3Label.setBounds(730, 60, 350, 240);
		this.im4Label = new JLabel(image4);
		this.im4Label.setBounds(1090, 60, 350, 240);
		this.im5Label = new JLabel(image5);
		this.im5Label.setBounds(1450, 60, 350, 240);
		
		this.im1ChBox = new JCheckBox("BMW X5 3");
		this.im1ChBox.setBounds(10,310, 100, 20);
		this.im1ChBox.addActionListener(this.actionListener);
		this.im2ChBox = new JCheckBox("Audi R8 2");
		this.im2ChBox.setBounds(370,310, 100, 20);
		this.im2ChBox.addActionListener(this.actionListener);
		this.im3ChBox = new JCheckBox("Audi A4 4");
		this.im3ChBox.setBounds(730 ,310, 100, 20);
		this.im3ChBox.addActionListener(this.actionListener);
		this.im4ChBox = new JCheckBox("BMW X6 2");
		this.im4ChBox.setBounds(1090 ,310, 100, 20);
		this.im4ChBox.addActionListener(this.actionListener);
		this.im5ChBox = new JCheckBox("VW Golf 2");
		this.im5ChBox.setBounds(1450 ,310, 100, 20);
		this.im5ChBox.addActionListener(this.actionListener);
		
		this.mainPanel.add(im1Label);
		this.mainPanel.add(im1ChBox);
		this.mainPanel.add(im2Label);
		this.mainPanel.add(im2ChBox);
		this.mainPanel.add(im3Label);
		this.mainPanel.add(im3ChBox);
		this.mainPanel.add(im4Label);
		this.mainPanel.add(im4ChBox);
		this.mainPanel.add(im5Label);
		this.mainPanel.add(im5ChBox);
		
		this.orderButton = new JButton("bestellen");
		this.configureButton = new JButton("Auto configurieren");
		this.orderButton.setBounds(900, 500, 100, 50);
		this.orderButton.addActionListener(this.actionListener);
		this.configureButton.setBounds(1010, 500, 160, 50);
		this.configureButton.addActionListener(this.actionListener);
		this.mainPanel.add(this.orderButton);
		this.mainPanel.add(this.configureButton);
		
		this.mainFrame.add(mainPanel);
		this.mainFrame.pack();
		this.mainFrame.setSize(2000,1000);
		
		this.im1ChBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(im1ChBox.isSelected()) {
					im2ChBox.setEnabled(false);
					im3ChBox.setEnabled(false);
					im4ChBox.setEnabled(false);
					im5ChBox.setEnabled(false);
				}else if(!im1ChBox.isSelected()) {
					im2ChBox.setEnabled(true);
					im3ChBox.setEnabled(true);
					im4ChBox.setEnabled(true);
					im5ChBox.setEnabled(true);
				}
				
			}
		});
		this.im2ChBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(im2ChBox.isSelected()) {
					im1ChBox.setEnabled(false);
					im3ChBox.setEnabled(false);
					im4ChBox.setEnabled(false);
					im5ChBox.setEnabled(false);
				}else if(!im2ChBox.isSelected()) {
					im1ChBox.setEnabled(true);
					im3ChBox.setEnabled(true);
					im4ChBox.setEnabled(true);
					im5ChBox.setEnabled(true);
				}
				
			}
		});
		this.im3ChBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(im3ChBox.isSelected()) {
					im1ChBox.setEnabled(false);
					im2ChBox.setEnabled(false);
					im4ChBox.setEnabled(false);
					im5ChBox.setEnabled(false);
				}else if(!im3ChBox.isSelected()) {
					im2ChBox.setEnabled(true);
					im1ChBox.setEnabled(true);
					im4ChBox.setEnabled(true);
					im5ChBox.setEnabled(true);
				}
				
			}
		});
		this.im4ChBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(im4ChBox.isSelected()) {
					im2ChBox.setEnabled(false);
					im3ChBox.setEnabled(false);
					im1ChBox.setEnabled(false);
					im5ChBox.setEnabled(false);
				}else if(!im4ChBox.isSelected()) {
					im2ChBox.setEnabled(true);
					im3ChBox.setEnabled(true);
					im1ChBox.setEnabled(true);
					im5ChBox.setEnabled(true);
				}
				
			}
		});
		this.im5ChBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(im5ChBox.isSelected()) {
					im2ChBox.setEnabled(false);
					im3ChBox.setEnabled(false);
					im4ChBox.setEnabled(false);
					im1ChBox.setEnabled(false);
				}else if(!im5ChBox.isSelected()) {
					im2ChBox.setEnabled(true);
					im3ChBox.setEnabled(true);
					im4ChBox.setEnabled(true);
					im1ChBox.setEnabled(true);
				}
				
			}
		});
	}
	
	
	public JCheckBox getIm1ChBox() {
		return im1ChBox;
	}
	public JCheckBox getIm2ChBox() {
		return im2ChBox;
	}
	public JCheckBox getIm3ChBox() {
		return im3ChBox;
	}
	public JCheckBox getIm4ChBox() {
		return im4ChBox;
	}
	public JCheckBox getIm5ChBox() {
		return im5ChBox;
	}
	public JButton getOrderButton() {
		return orderButton;
	}
	public JButton getConfigureButton() {
		return configureButton;
	}
	public JFrame getMainFrame() {
		return mainFrame;
	}	
	
}
