/**
 * Carla Carolina Cremon 	RA:135238
 * 
 * O programa recebe informaçoes do usuario e
 * 		- Verifica se os campos obrigatórios estao preenchidos
 * 		- Verifica se os campos Data Nascimento, email, CPF e CEP estao no formato correto
 * 		- Verifica se os dígitos do CPF estao corretos.
 * Caso algum campo nao esteja preenchido como pedido, uma janela de erro aparece e 
 * então o usuário precisa preencher a informação errada corretamente para que os dados sejam impressos
 * */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.util.regex.*;

public class form extends JFrame {

	public JPanel contentPane;
	public JTextField textfirstName;
	public JTextField textlastName;
	private JTextField textFieldDataNasc;
	private JTextField textFieldAddress1;
	private JTextField textFieldEmail;
	private JTextField textFieldPhone;
	private JTextField textFieldCPF;
	private JTextField textFieldCEP;
	private JTextField textFieldCountry;
	private JTextField textFieldState;
	private JTextField textFieldAddress2;
	private JTextField textFieldCity;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Funçoes que verificam os Campos Obrigatorios e CPF*/
	
	//confere se o primeiro nome está preenchido
	boolean confereFirstName(print printForm){
		String text = textfirstName.getText();
		printForm.firstNameLabel.setText(text);
		
		if(Pattern.matches(".+", text)){
			return true;
		}
		else{
			Janela erro = new Janela();
			erro.lblErroNoCampo.setText("First Name required.");
			erro.show();
			return false;
		}
	}
	
	//confere se o ultimo nome esta preenchido
	boolean confereLastName(print printForm){
		String text = textlastName.getText();
		printForm.lastNameLabel.setText(text);
		
		if(Pattern.matches(".+", text)){
			return true;
		}
		else{
			Janela erro = new Janela();
			erro.lblErroNoCampo.setText("Last Name required.");
			erro.show();
			return false;
		}
	}
	
	//confere se a data de nascimento está preenchida e no formato dd/mm/aaaa
	boolean confereDataNasc(print printForm){
		String text = textFieldDataNasc.getText();
		printForm.DataNascimentoLabel.setText(text);
		
		if(Pattern.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}", text)){
			return true;
		}
		else{
			Janela erro = new Janela();
			erro.lblErroNoCampo.setText("Data Nascimento required/wrong format.");
			erro.show();
			return false;
		}
	}
	
	//confere se o email esta preenchido e no formato email@email.com.etc
	boolean confereEmail(print printForm){
		String text = textFieldEmail.getText();
		printForm.EmailLabel.setText(text);
		
		if(Pattern.matches(".+@[a-z0-9](.[a-z])+", text)){
			return true;
		}
		else{
			Janela erro = new Janela();
			erro.lblErroNoCampo.setText("Email required/wrong format.");
			erro.show();
			return false;
		}
	}
	
	//confere se o cpf está preenchido e correto (utiliza uma classe para isso)
	boolean confereCPF(print printForm){
		String text = textFieldCPF.getText();
		printForm.CPFLabel.setText(text);
		
		if(Pattern.matches("[0-9]{11}", text)){
			ConfereCPF confere = new ConfereCPF();
			if(confere.CPF(text))
				return true;
			else{
				Janela erro = new Janela();
				erro.lblErroNoCampo.setText("CPF inválido");
				erro.show();
				return false;
			}
		}
		else{
			Janela erro = new Janela();
			erro.lblErroNoCampo.setText("CPF required/wrong format.");
			erro.show();
			return false;
		}
	}
	
	//confere se o cep, caso esteja preenchido, está no formato correto
	boolean confereCEP(print printForm){
		String text = textFieldCEP.getText();
		printForm.CEPLabel.setText(text);
		if(Pattern.matches("", text))
			return true;
		else if(Pattern.matches("[0-9]{5}-[0-9]{3}", text) || Pattern.matches("[0-9]{8}", text) ){
			return true;
		}
		else{
			Janela erro = new Janela();
			erro.lblErroNoCampo.setText("CEP in wrong format.");
			erro.show();
			return false;
		}
	}
	/**
	 * Create the frame.
	 */
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textfirstName = new JTextField();
		textfirstName.setBounds(191, 143, 154, 19);
		contentPane.add(textfirstName);
		textfirstName.setColumns(10);
		
		textlastName = new JTextField();
		textlastName.setBounds(191, 174, 154, 19);
		contentPane.add(textlastName);
		textlastName.setColumns(10);
		
		final JComboBox comboTitle = new JComboBox();
		comboTitle.setModel(new DefaultComboBoxModel(new String[] {"Mr.", "Mrs.", "Miss.", "Ms.", "Dr.", "Other"}));
		comboTitle.setToolTipText("");
		comboTitle.setBounds(58, 97, 81, 24);
		contentPane.add(comboTitle);
		
		JLabel lblFirstName = new JLabel("First Name *");
		lblFirstName.setBounds(12, 145, 103, 15);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name *");
		lblLastName.setBounds(12, 176, 103, 15);
		contentPane.add(lblLastName);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(12, 102, 90, 15);
		contentPane.add(lblTitle);
		
		JButton btnPrint = new JButton("Print");
		
		
		btnPrint.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {		
				//contentPane.setVisible(false);
				print printForm = new print();
				printForm.titleLabel.setText((String) comboTitle.getSelectedItem());
				if (!confereFirstName(printForm)) return;
				if (!confereLastName(printForm)) return;
				if (!confereDataNasc(printForm)) return;
				if (!confereEmail(printForm)) return;
				if (!confereCEP(printForm)) return;
				if (!confereCPF(printForm)) return;
				printForm.PhoneLabel.setText(textFieldPhone.getText());
				printForm.Address1Label.setText(textFieldAddress1.getText());
				printForm.Address2Label.setText(textFieldAddress2.getText());
				printForm.CityLabel.setText(textFieldCity.getText());
				printForm.StateLabel.setText(textFieldState.getText());
				printForm.CountryLabel.setText(textFieldCountry.getText());
				//printForm.contentPane.setVisible(true);				
				printForm.show();	
			}
		});
		btnPrint.setBounds(12, 541, 74, 25);
		contentPane.add(btnPrint);
		
		textFieldDataNasc = new JTextField();
		textFieldDataNasc.setText("DD/MM/AAAA");
		textFieldDataNasc.setToolTipText("DD/MM/AAAA");
		textFieldDataNasc.setColumns(10);
		textFieldDataNasc.setBounds(191, 205, 154, 19);
		contentPane.add(textFieldDataNasc);
		
		JLabel lblDataNasc = new JLabel("Data de Nascimento *");
		lblDataNasc.setToolTipText("DD/MM/AAAA");
		lblDataNasc.setBounds(12, 207, 161, 19);
		contentPane.add(lblDataNasc);
		
		textFieldAddress1 = new JTextField();
		textFieldAddress1.setColumns(10);
		textFieldAddress1.setBounds(191, 329, 154, 19);
		contentPane.add(textFieldAddress1);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(191, 236, 154, 19);
		contentPane.add(textFieldEmail);
		
		JLabel lblEmail = new JLabel("Email *");
		lblEmail.setBounds(12, 238, 90, 15);
		contentPane.add(lblEmail);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setToolTipText("Including international country code and DDD");
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(191, 298, 154, 19);
		contentPane.add(textFieldPhone);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setText("only numbers");
		textFieldCPF.setColumns(10);
		textFieldCPF.setBounds(191, 267, 154, 19);
		contentPane.add(textFieldCPF);
		
		textFieldCEP = new JTextField();
		textFieldCEP.setColumns(10);
		textFieldCEP.setBounds(191, 391, 154, 19);
		contentPane.add(textFieldCEP);
		
		textFieldCountry = new JTextField();
		textFieldCountry.setColumns(10);
		textFieldCountry.setBounds(191, 484, 154, 19);
		contentPane.add(textFieldCountry);
		
		textFieldState = new JTextField();
		textFieldState.setColumns(10);
		textFieldState.setBounds(191, 453, 154, 19);
		contentPane.add(textFieldState);
		
		textFieldAddress2 = new JTextField();
		textFieldAddress2.setText("Apt, floor, suite, etc.");
		textFieldAddress2.setColumns(10);
		textFieldAddress2.setBounds(191, 360, 154, 19);
		contentPane.add(textFieldAddress2);
		
		textFieldCity = new JTextField();
		textFieldCity.setColumns(10);
		textFieldCity.setBounds(191, 422, 154, 19);
		contentPane.add(textFieldCity);
		
		JLabel lblCpf = new JLabel("CPF *");
		lblCpf.setBounds(12, 269, 90, 15);
		contentPane.add(lblCpf);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setToolTipText("Including international country code and DDD");
		lblPhone.setBounds(12, 300, 90, 15);
		contentPane.add(lblPhone);
		
		JLabel lblAddress = new JLabel("Address 1");
		lblAddress.setBounds(12, 331, 90, 15);
		contentPane.add(lblAddress);
		
		JLabel lblAddress_1 = new JLabel("Address 2");
		lblAddress_1.setBounds(12, 362, 90, 15);
		contentPane.add(lblAddress_1);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(12, 393, 90, 15);
		contentPane.add(lblCep);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(12, 424, 90, 15);
		contentPane.add(lblCity);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(12, 455, 90, 15);
		contentPane.add(lblState);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(12, 488, 90, 15);
		contentPane.add(lblCountry);
		
		JLabel lblTitulo = new JLabel("EA975 :: Lab. Eng. SW ::1S/2015");
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 16));
		lblTitulo.setBounds(58, 6, 350, 47);
		contentPane.add(lblTitulo);
		
		JLabel lblSubTitulo = new JLabel("Exercício Design & Automated Testing");
		lblSubTitulo.setForeground(Color.GRAY);
		lblSubTitulo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSubTitulo.setBounds(151, 57, 194, 19);
		contentPane.add(lblSubTitulo);
		
		JLabel lblRequired = new JLabel("* Required");
		lblRequired.setBounds(272, 97, 90, 20);
		contentPane.add(lblRequired);
	}
}
