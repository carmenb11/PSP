package Calculadora;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Calculadoraa {

	private JFrame frame;

	public void ejecutarNote(String ruta) {

		ProcessBuilder pb;
		try {
			pb = new ProcessBuilder(ruta);
			pb.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ejecutarCalculadora(String ruta) {

		ProcessBuilder pb;
		try {
			pb = new ProcessBuilder(ruta);
			pb.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadoraa window = new Calculadoraa();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadoraa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnCalculadora = new JButton("Calculadora");
		btnCalculadora.setIcon(new ImageIcon("C:\\Users\\carme\\OneDrive\\Imágenes\\Saved Pictures\\calculadora.png"));
		btnCalculadora.setActionCommand("Calculadora");
		btnCalculadora.setBounds(10, 77, 191, 87);
		frame.getContentPane().add(btnCalculadora);

		JButton btnBlocNotas = new JButton("Bloc de Notas");
		btnBlocNotas
				.setIcon(new ImageIcon("C:\\Users\\carme\\OneDrive\\Imágenes\\Saved Pictures\\Bloc_de_notas.png"));
		btnBlocNotas.setBounds(248, 77, 178, 87);
		frame.getContentPane().add(btnBlocNotas);
		
		btnCalculadora.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String rutaNote = "C:\\WINDOWS\\System32\\calc.exe";
				LanzadorProcesos lp = new LanzadorProcesos();
				lp.ejecutar(rutaNote);

			}
		});
		btnBlocNotas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
							    
			    String rutaNote=
			            "C:\\WINDOWS\\System32\\notepad.exe";
			    LanzadorProcesos lp = new LanzadorProcesos();
			    lp.ejecutar(rutaNote);
			    
				
			}
		});
	}
}
