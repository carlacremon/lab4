/**
 * Carla Carolina Cremon 	RA:135238
 * 
 * A classe é responsável por gerar uma janela de erro caso o usuário
 * tenha preenchido alguma informaçao incorretamente.
 * 
 * */

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Janela extends JDialog {

	private final JPanel contentPanel = new JPanel();
	JLabel lblErroNoCampo = new JLabel("Erro em:");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Janela dialog = new Janela();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Janela() {
		setBounds(100, 100, 393, 85);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		lblErroNoCampo.setForeground(Color.RED);
		lblErroNoCampo.setFont(new Font("Dialog", Font.BOLD, 15));
		
		contentPanel.add(lblErroNoCampo);
	}
}
