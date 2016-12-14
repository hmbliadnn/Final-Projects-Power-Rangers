package mergelagi;

import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import mergelagi.*;
import javax.swing.JEditorPane;

public class mergelagibuilder {

	private JFrame frame;
	private JSlider slider;
	private JTextField txtWidth;
	private JTextField txtHeight;
	private JSlider slider_1;
	private JTextField txtFps;
	private JSlider slider_2;
	private JTextField txtMergeSort;
	private JTextField txtElements;
	private JSlider slider_3;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mergelagibuilder window = new mergelagibuilder();
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
	public mergelagibuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int[] num = {45,23,11,89,77,98,4,28,65,43};
		
		frame = new JFrame();
		frame.setBounds(100, 100, 897, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		slider = new JSlider();
		slider.setBounds(743, 76, 86, 20);
		frame.getContentPane().add(slider);
		
		txtWidth = new JTextField();
		txtWidth.setHorizontalAlignment(SwingConstants.CENTER);
		txtWidth.setText("width");
		txtWidth.setBounds(743, 45, 86, 20);
		frame.getContentPane().add(txtWidth);
		txtWidth.setColumns(10);
		
		txtHeight = new JTextField();
		txtHeight.setHorizontalAlignment(SwingConstants.CENTER);
		txtHeight.setText("height");
		txtHeight.setBounds(743, 107, 86, 20);
		frame.getContentPane().add(txtHeight);
		txtHeight.setColumns(10);
		
		slider_1 = new JSlider();
		slider_1.setBounds(743, 129, 87, 20);
		frame.getContentPane().add(slider_1);
		
		txtFps = new JTextField();
		txtFps.setHorizontalAlignment(SwingConstants.CENTER);
		txtFps.setText("FPS");
		txtFps.setBounds(743, 155, 86, 20);
		frame.getContentPane().add(txtFps);
		txtFps.setColumns(10);
		
		slider_2 = new JSlider();
		slider_2.setBounds(743, 179, 86, 20);
		frame.getContentPane().add(slider_2);
		
		txtMergeSort = new JTextField();
		txtMergeSort.setHorizontalAlignment(SwingConstants.CENTER);
		txtMergeSort.setText("Merge sort");
		txtMergeSort.setBounds(743, 287, 86, 20);
		frame.getContentPane().add(txtMergeSort);
		txtMergeSort.setColumns(10);
		
		txtElements = new JTextField();
		txtElements.setHorizontalAlignment(SwingConstants.CENTER);
		txtElements.setText("Elements:");
		txtElements.setBounds(743, 349, 86, 20);
		frame.getContentPane().add(txtElements);
		txtElements.setColumns(10);
		
		slider_3 = new JSlider();
		slider_3.setBounds(743, 380, 93, 20);
		frame.getContentPane().add(slider_3);
		
		JLabel label = new JLabel();
		JButton btnNewButton = new JButton("Generate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n=10;
				JEditorPane editorPane = new JEditorPane();
				editorPane.setBounds(10, 14, 300, 150);
				frame.getContentPane().add(editorPane);
				editorPane.setText(trymergeascanddesc.MergeSort(num, 0, n-1));
			}

		});
		btnNewButton.setBounds(720, 411, 123, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DESC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(658, 315, 68, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("RAND");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2.setBounds(743, 315, 68, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		
		
		JButton btnNewButton_3 = new JButton("Apply");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(720, 210, 123, 29);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnAsc = new JButton("ASC");
		btnAsc.setBounds(808, 325, -354, 54);
		frame.getContentPane().add(btnAsc);
		
		JButton btnAsc_1 = new JButton("ASC");
		btnAsc_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAsc_1.setBounds(821, 315, 60, 23);
		frame.getContentPane().add(btnAsc_1);
		
		JLabel lblDisplay = new JLabel("Display");
		lblDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisplay.setBounds(720, 11, 123, 23);
		frame.getContentPane().add(lblDisplay);
		
		JLabel lblAlgorithm = new JLabel("Algorithm");
		lblAlgorithm.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlgorithm.setBounds(743, 250, 86, 26);
		frame.getContentPane().add(lblAlgorithm);
		
		
		
		
	}

	private void baddActionListener(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}
}