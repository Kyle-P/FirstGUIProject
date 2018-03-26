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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{422, 0};
		gbl_contentPane.rowHeights = new int[]{16, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblTemperatureConversionCalculator = new JLabel("Temperature Conversion Calculator");
		GridBagConstraints gbc_lblTemperatureConversionCalculator = new GridBagConstraints();
		gbc_lblTemperatureConversionCalculator.insets = new Insets(0, 0, 5, 0);
		gbc_lblTemperatureConversionCalculator.anchor = GridBagConstraints.NORTH;
		gbc_lblTemperatureConversionCalculator.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTemperatureConversionCalculator.gridx = 0;
		gbc_lblTemperatureConversionCalculator.gridy = 0;
		contentPane.add(lblTemperatureConversionCalculator, gbc_lblTemperatureConversionCalculator);
		
		JLabel lblEnterYourTemperature = new JLabel("Enter your temperature in Farenheit: ");
		GridBagConstraints gbc_lblEnterYourTemperature = new GridBagConstraints();
		gbc_lblEnterYourTemperature.insets = new Insets(0, 0, 5, 0);
		gbc_lblEnterYourTemperature.anchor = GridBagConstraints.WEST;
		gbc_lblEnterYourTemperature.fill = GridBagConstraints.VERTICAL;
		gbc_lblEnterYourTemperature.gridx = 0;
		gbc_lblEnterYourTemperature.gridy = 2;
		contentPane.add(lblEnterYourTemperature, gbc_lblEnterYourTemperature);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 3;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblCelsius = new JLabel("Celsius:");
		GridBagConstraints gbc_lblCelsius = new GridBagConstraints();
		gbc_lblCelsius.insets = new Insets(0, 0, 5, 0);
		gbc_lblCelsius.anchor = GridBagConstraints.WEST;
		gbc_lblCelsius.gridx = 0;
		gbc_lblCelsius.gridy = 5;
		contentPane.add(lblCelsius, gbc_lblCelsius);
		
		JLabel lbltemperatureInCelcius = new JLabel("[Temperature in Celcius]");
		GridBagConstraints gbc_lbltemperatureInCelcius = new GridBagConstraints();
		gbc_lbltemperatureInCelcius.insets = new Insets(0, 0, 5, 0);
		gbc_lbltemperatureInCelcius.anchor = GridBagConstraints.WEST;
		gbc_lbltemperatureInCelcius.gridx = 0;
		gbc_lbltemperatureInCelcius.gridy = 6;
		contentPane.add(lbltemperatureInCelcius, gbc_lbltemperatureInCelcius);
		
		JLabel lblKelvin = new JLabel("Kelvin:");
		GridBagConstraints gbc_lblKelvin = new GridBagConstraints();
		gbc_lblKelvin.anchor = GridBagConstraints.WEST;
		gbc_lblKelvin.insets = new Insets(0, 0, 5, 0);
		gbc_lblKelvin.gridx = 0;
		gbc_lblKelvin.gridy = 7;
		contentPane.add(lblKelvin, gbc_lblKelvin);
		
		JLabel lbltemperatureInKelvin = new JLabel("[Temperature in Kelvin]");
		GridBagConstraints gbc_lbltemperatureInKelvin = new GridBagConstraints();
		gbc_lbltemperatureInKelvin.anchor = GridBagConstraints.WEST;
		gbc_lbltemperatureInKelvin.gridx = 0;
		gbc_lbltemperatureInKelvin.gridy = 8;
		contentPane.add(lbltemperatureInKelvin, gbc_lbltemperatureInKelvin);
	
		JButton btnConvert = new JButton("Convert!");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Take in user-inputed value and convert
				double farenheit = Double.parseDouble(textField.getText());
				double celcius = (farenheit - 32) * (.55555555555555555556);
				
				//Round off the celcius so a long decimal won't be displayed to the user
				celcius = Math.round(celcius); 
				
				double kelvin = celcius + 273;
			
				
				//Display converted temperatures on their appropriate labels
				lbltemperatureInCelcius.setText(Double.toString(celcius));
				lbltemperatureInKelvin.setText(Double.toString(kelvin));
				
				
			}
		});
		
		GridBagConstraints gbc_btnConvert = new GridBagConstraints();
		gbc_btnConvert.insets = new Insets(0, 0, 5, 0);
		gbc_btnConvert.anchor = GridBagConstraints.WEST;
		gbc_btnConvert.gridx = 0;
		gbc_btnConvert.gridy = 4;
		contentPane.add(btnConvert, gbc_btnConvert);
		
	}

}
