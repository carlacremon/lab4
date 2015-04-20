import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class print extends JFrame {

	public JPanel contentPane;
	JLabel titleLabel = new JLabel("Title");
	JLabel firstNameLabel = new JLabel("First Name");
	JLabel lastNameLabel = new JLabel("Last Name");
	JLabel DataNascimentoLabel = new JLabel("Data Nascimento");
	JLabel EmailLabel = new JLabel("Email");
	JLabel CPFLabel = new JLabel("CPF");
	JLabel PhoneLabel = new JLabel("Phone");
	JLabel Address1Label = new JLabel("Address 1");
	JLabel Address2Label = new JLabel("Address 2");
	JLabel CEPLabel = new JLabel("CEP");
	JLabel CityLabel = new JLabel("City");
	JLabel StateLabel = new JLabel("State");
	JLabel CountryLabel = new JLabel("Country");




	/**
	 * Launch the application.
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					print frame = new print();					
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
	public print() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		firstNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		
		
		firstNameLabel.setBounds(190, 82, 216, 15);
		contentPane.add(firstNameLabel);		
		
		lastNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lastNameLabel.setBounds(190, 109, 216, 15);
		contentPane.add(lastNameLabel);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(12, 82, 106, 15);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(12, 109, 98, 15);
		contentPane.add(lblLastName);
		
		JLabel lblNewLabel_2 = new JLabel("Title:");
		lblNewLabel_2.setBounds(12, 55, 70, 15);
		contentPane.add(lblNewLabel_2);
		
		
		titleLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		titleLabel.setBounds(190, 55, 216, 15);
		contentPane.add(titleLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Form Printed");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_3.setBounds(139, 12, 159, 31);
		contentPane.add(lblNewLabel_3);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(12, 517, 117, 25);
		contentPane.add(btnExit);
		
		JLabel lblDataNascimento = new JLabel("Data Nascimento:");
		lblDataNascimento.setBounds(12, 136, 132, 15);
		contentPane.add(lblDataNascimento);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(12, 163, 98, 15);
		contentPane.add(lblEmail);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(12, 190, 98, 15);
		contentPane.add(lblCpf);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(12, 217, 98, 15);
		contentPane.add(lblPhone);
		
		JLabel lblAddress1 = new JLabel("Address 1:");
		lblAddress1.setBounds(12, 244, 98, 15);
		contentPane.add(lblAddress1);
		
		JLabel lblAddress2 = new JLabel("Address 2:");
		lblAddress2.setBounds(12, 271, 98, 15);
		contentPane.add(lblAddress2);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(12, 298, 98, 15);
		contentPane.add(lblCep);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(12, 326, 98, 15);
		contentPane.add(lblCity);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(12, 353, 98, 15);
		contentPane.add(lblState);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setBounds(12, 380, 98, 15);
		contentPane.add(lblCountry);
		
		DataNascimentoLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		DataNascimentoLabel.setBounds(190, 136, 216, 15);
		contentPane.add(DataNascimentoLabel);
		
		EmailLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		EmailLabel.setBounds(190, 163, 216, 15);
		contentPane.add(EmailLabel);
		
		CPFLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		CPFLabel.setBounds(190, 190, 216, 15);
		contentPane.add(CPFLabel);
		
		PhoneLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		PhoneLabel.setBounds(190, 217, 216, 15);
		contentPane.add(PhoneLabel);
		
		Address1Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		Address1Label.setBounds(190, 244, 216, 15);
		contentPane.add(Address1Label);
		
		Address2Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		Address2Label.setBounds(190, 271, 216, 15);
		contentPane.add(Address2Label);
		
		CEPLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		CEPLabel.setBounds(190, 298, 216, 15);
		contentPane.add(CEPLabel);
		
		CityLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		CityLabel.setBounds(190, 326, 216, 15);
		contentPane.add(CityLabel);
		
		StateLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		StateLabel.setBounds(190, 353, 216, 15);
		contentPane.add(StateLabel);
		
		CountryLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		CountryLabel.setBounds(190, 380, 216, 15);
		contentPane.add(CountryLabel);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

}
