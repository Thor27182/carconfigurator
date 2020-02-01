package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.impl;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.*;



public class CarListUI extends JFrame {
	
	private JLabel titleLabel;
	private JPanel titlePanel;
	
	private ImageIcon image1;
	private ImageIcon image2;
	private ImageIcon image3;
	private ImageIcon image4;
	private ImageIcon image5;
	private ImageIcon image6;
	private JLabel im1Label;
	private JLabel im2Label;
	private JLabel im3Label;
	private JLabel im4Label;
	private JLabel im5Label;
	private JLabel im6Label;
	
	private JCheckBox im1ChBox;
	private JCheckBox im2ChBox;
	private JCheckBox im3ChBox;
	private JCheckBox im4ChBox;
	private JCheckBox im5ChBox;
	private JCheckBox im6ChBox;
	
	private JButton bestellenButton;
	private JButton configurierenButton;
	private JPanel buttonPanel;
	
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
		this.titleLabel = new JLabel("Car Liste");
		this.titlePanel = new JPanel();
		this.titlePanel.add(this.titleLabel);
		
		this.mainPanel = new JPanel();
		this.mainPanel.setLayout(new FlowLayout());
		
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
		
		this.image6 = new ImageIcon(getClass().getResource("VW_Passat_8.jpg"));
		Image img6 = image6.getImage();
		Image newImg6 = img6.getScaledInstance(350, 240, java.awt.Image.SCALE_SMOOTH);
		this.image6 = new ImageIcon(newImg6);
		
		
		this.im1Label = new JLabel(image1);
		this.im2Label = new JLabel(image2);
		this.im3Label = new JLabel(image3);
		this.im4Label = new JLabel(image4);
		this.im5Label = new JLabel(image5);
		this.im6Label = new JLabel(image6);
		this.im1ChBox = new JCheckBox("BMW X5 3");
		this.im2ChBox = new JCheckBox("Audi R8 2");
		this.im3ChBox = new JCheckBox("Audi A4 4");
		this.im4ChBox = new JCheckBox("BMW X6 2");
		this.im5ChBox = new JCheckBox("VW Golf 2");
		this.im6ChBox = new JCheckBox("VW Passat 8");
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
		this.mainPanel.add(im6Label);
		this.mainPanel.add(im6ChBox);
		
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.getContentPane().add(this.titlePanel);
		this.getContentPane().add(this.mainPanel);
		this.pack();
	}
	
	public static void main(String[] args) {
		CarListUI carLGUI = new CarListUI();
		carLGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		carLGUI.setVisible(true);
		carLGUI.pack();
	}
	
}
