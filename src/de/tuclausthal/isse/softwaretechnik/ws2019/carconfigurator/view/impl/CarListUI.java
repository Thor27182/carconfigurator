package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.impl;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * 
 * @author Yamen Sahyouni, ISSE, TU Clausthal
 * @author Thore Braun, ISSE, TU Clausthal
 * @author Mohamed Dawod, ISSE, TU Clausthal
 * @author Mohamad Deyaa Akil, ISSE, TU Clausthal
 * @author Oliver Greulich, ISSE, TU Clausthal
 * @author Bassel Rafie, ISSE, TU Clausthal
 * @author Amirreza Fahimifarimani, ISSE, TU Clausthal
 *
 */


public class CarListUI extends JFrame {

	//<--- Attributes --->

	private JPanel titlePanel;

	private JCheckBox im1ChBox;
	private JCheckBox im2ChBox;
	private JCheckBox im3ChBox;
	private JCheckBox im4ChBox;
	private JCheckBox im5ChBox;

	private JButton orderButton;
	private JButton configureButton;

	private ActionListener actionListener;


	//<--- Constructor --->
	public CarListUI(ActionListener actionListener) {
		super("Auto Liste");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.actionListener = actionListener;
		this.composeUI();
	}

	//<--- Methodes --->

	/*
	 * Creates an ImageIcon with the size of 350 x 240
	 */
	ImageIcon render(ImageIcon icon){
		Image image = icon.getImage().getScaledInstance(350, 240, Image.SCALE_SMOOTH);
		icon = new ImageIcon(image);
		return  icon;
	}

	/*
	 * Creates the UI for the Car-List
	 */
	public void composeUI() {
		//Panel for holding UI-Elements
		JPanel mainPanel = new JPanel();

		//Create Pictures for the View
		ImageIcon image1 = render(new ImageIcon(getClass().getResource("BMW_X5_3.jpg")));
		ImageIcon image2 = render(new ImageIcon(getClass().getResource("Audi_R8_2.jpg")));
		ImageIcon image3 = render(new ImageIcon(getClass().getResource("Audi_A4_4.jpg")));
		ImageIcon image4 = render(new ImageIcon(getClass().getResource("BMW_X6_2.jpg")));
		ImageIcon image5 = render(new ImageIcon(getClass().getResource("VW_Golf_2.jpg")));

		//Create Labels for the Pictures
		JLabel im1Label = new JLabel(image1);
		im1Label.setBounds(10, 60, 350, 240);
		JLabel im2Label = new JLabel(image2);
		im2Label.setBounds(370, 60, 350, 240);
		JLabel im3Label = new JLabel(image3);
		im3Label.setBounds(730, 60, 350, 240);
		JLabel im4Label = new JLabel(image4);
		im4Label.setBounds(1090, 60, 350, 240);
		JLabel im5Label = new JLabel(image5);
		im5Label.setBounds(1450, 60, 350, 240);

		//Create Checkboxes for the Pictures
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

		//Add UI-Elements to Panel
		mainPanel.add(im1Label);
		mainPanel.add(im1ChBox);
		mainPanel.add(im2Label);
		mainPanel.add(im2ChBox);
		mainPanel.add(im3Label);
		mainPanel.add(im3ChBox);
		mainPanel.add(im4Label);
		mainPanel.add(im4ChBox);
		mainPanel.add(im5Label);
		mainPanel.add(im5ChBox);

		//create Buttons
		this.orderButton = new JButton("bestellen");
		this.configureButton = new JButton("Auto configurieren");
		this.orderButton.setBounds(900, 500, 100, 50);
		this.orderButton.addActionListener(this.actionListener);
		this.configureButton.setBounds(1010, 500, 160, 50);
		this.configureButton.addActionListener(this.actionListener);

		//Add Buttons to the Panel
		mainPanel.add(this.orderButton);
		mainPanel.add(this.configureButton);

		//Add Panel to the Frame
		this.add(mainPanel);
		this.pack();
		this.setSize(2000,1000);


		//Add ActionListener to the Buttons
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
	


	//<--- Getters and Setters
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


	
}
