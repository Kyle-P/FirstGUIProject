package UCLA_Learning_Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TestSwing extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestSwing frame = new TestSwing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{422, 0};
		gbl_contentPane.rowHeights = new int[]{16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblTemperatureConversionCalculator = new JLabel("Temperature Conversion Calculator");
		GridBagConstraints gbc_lblTemperatureConversionCalculator = new GridBagConstraints();
		gbc_lblTemperatureConversionCalculator.insets = new Insets(0, 0, 5, 0);
		gbc_lblTemperatureConversionCalculator.anchor = GridBagConstraints.NORTH;
		gbc_lblTemperatureConversionCalculator.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTemperatureConversionCalculator.gridx = 0;
		gbc_lblTemperatureConversionCalculator.gridy = 0;
		contentPane.add(lblTemperatureConversionCalculator, gbc_lblTemperatureConversionCalculator);
		
		JLabel lblPleaseChooseAn = new JLabel("Please choose an option above...");
		GridBagConstraints gbc_lblPleaseChooseAn = new GridBagConstraints();
		gbc_lblPleaseChooseAn.insets = new Insets(0, 0, 5, 0);
		gbc_lblPleaseChooseAn.gridx = 0;
		gbc_lblPleaseChooseAn.gridy = 1;
		contentPane.add(lblPleaseChooseAn, gbc_lblPleaseChooseAn);
		
		JLabel lblEnterYourTemperature = new JLabel("Enter your temperature here...");
		GridBagConstraints gbc_lblEnterYourTemperature = new GridBagConstraints();
		gbc_lblEnterYourTemperature.insets = new Insets(0, 0, 5, 0);
		gbc_lblEnterYourTemperature.anchor = GridBagConstraints.WEST;
		gbc_lblEnterYourTemperature.fill = GridBagConstraints.VERTICAL;
		gbc_lblEnterYourTemperature.gridx = 0;
		gbc_lblEnterYourTemperature.gridy = 3;
		contentPane.add(lblEnterYourTemperature, gbc_lblEnterYourTemperature);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 4;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblFirstOtherTemp = new JLabel("");
		GridBagConstraints gbc_lblCelsius = new GridBagConstraints();
		gbc_lblCelsius.insets = new Insets(0, 0, 5, 0);
		gbc_lblCelsius.anchor = GridBagConstraints.WEST;
		gbc_lblCelsius.gridx = 0;
		gbc_lblCelsius.gridy = 6;
		contentPane.add(lblFirstOtherTemp, gbc_lblCelsius);
		
		JLabel lblFirstOtherCalculatedTemp = new JLabel("");
		GridBagConstraints gbc_lbltemperatureInCelcius = new GridBagConstraints();
		gbc_lbltemperatureInCelcius.insets = new Insets(0, 0, 5, 0);
		gbc_lbltemperatureInCelcius.anchor = GridBagConstraints.WEST;
		gbc_lbltemperatureInCelcius.gridx = 0;
		gbc_lbltemperatureInCelcius.gridy = 7;
		contentPane.add(lblFirstOtherCalculatedTemp, gbc_lbltemperatureInCelcius);
		
		JLabel lblSecondOtherTemp = new JLabel("");
		GridBagConstraints gbc_lblKelvin = new GridBagConstraints();
		gbc_lblKelvin.anchor = GridBagConstraints.WEST;
		gbc_lblKelvin.insets = new Insets(0, 0, 5, 0);
		gbc_lblKelvin.gridx = 0;
		gbc_lblKelvin.gridy = 8;
		contentPane.add(lblSecondOtherTemp, gbc_lblKelvin);
		
		JLabel lblSecondOtherCalculatedTemp = new JLabel("");
		GridBagConstraints gbc_lbltemperatureInKelvin = new GridBagConstraints();
		gbc_lbltemperatureInKelvin.anchor = GridBagConstraints.WEST;
		gbc_lbltemperatureInKelvin.gridx = 0;
		gbc_lbltemperatureInKelvin.gridy = 9;
		contentPane.add(lblSecondOtherCalculatedTemp, gbc_lbltemperatureInKelvin);
	
		JButton btnConvert = new JButton("Convert!");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double toConvert = Double.parseDouble(textField.getText());
				double firstToConvert = 0.0;
				double secondToConvert = 0.0;
				
				if(lblPleaseChooseAn.getText() == "Converting from Fahrenheit!") {
										
					//firstToConvert will be in Celcius
					firstToConvert = Math.round((toConvert - 32) * (.555555555555555556));
					//secondtoConvert will be in Kelvin
					secondToConvert = firstToConvert + 273;
					
					//Display new temperatures
					lblFirstOtherCalculatedTemp.setText(Double.toString(firstToConvert));
					lblSecondOtherCalculatedTemp.setText(Double.toString(secondToConvert));
					
				}else if(lblPleaseChooseAn.getText() == "Converting from Celcius!"){
					
					//firstToConvert will be in Fahrenheit
					firstToConvert = Math.round((toConvert / .555555555555555556) + 32);
					//secondToConvert will be in Kelvin
					secondToConvert = toConvert + 273;
					
					lblFirstOtherCalculatedTemp.setText(Double.toString(firstToConvert));
					lblSecondOtherCalculatedTemp.setText(Double.toString(secondToConvert));
					
				}else if(lblPleaseChooseAn.getText() == "Converting from Kelvin!"){
				
					//firstToConvert will be in Fahrenheit
					firstToConvert = Math.round((toConvert - 273) / (.555555555555555556) + 32);
					//secondToConvert will be in Celcius
					secondToConvert = toConvert - 273;
					
					lblFirstOtherCalculatedTemp.setText(Double.toString(firstToConvert));
					lblSecondOtherCalculatedTemp.setText(Double.toString(secondToConvert));
				
				}else {
					lblPleaseChooseAn.setText("No temperature has been chosen... Please choose an option above!");
				}
					
			}
		});
		
		JMenuItem mntmFromFahrenheit = new JMenuItem("From Fahrenheit");
		mntmFromFahrenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblPleaseChooseAn.setText("Converting from Fahrenheit!");
				lblFirstOtherTemp.setText("Temperature in Celcius:");
				lblSecondOtherTemp.setText("Temperature in Kelvin:");
			}
		});
		menuBar.add(mntmFromFahrenheit);
		
		JMenuItem mntmFromCelcius = new JMenuItem("From Celcius");
		mntmFromCelcius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPleaseChooseAn.setText("Converting from Celcius!");
				lblFirstOtherTemp.setText("Temperature in Fahrenheit:");
				lblSecondOtherTemp.setText("Temperature in Kelvin:");
			}
		});
		
		menuBar.add(mntmFromCelcius);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("From Kelvin");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPleaseChooseAn.setText("Converting from Kelvin!");
				lblFirstOtherTemp.setText("Temperature in Fahrenheit:");
				lblSecondOtherTemp.setText("Temperature in Celcius:");
			}
		});
		menuBar.add(mntmNewMenuItem);
		
		GridBagConstraints gbc_btnConvert = new GridBagConstraints();
		gbc_btnConvert.insets = new Insets(0, 0, 5, 0);
		gbc_btnConvert.anchor = GridBagConstraints.WEST;
		gbc_btnConvert.gridx = 0;
		gbc_btnConvert.gridy = 5;
		contentPane.add(btnConvert, gbc_btnConvert);
		
	}

}
