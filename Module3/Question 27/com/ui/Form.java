package com.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.Model.User;
import com.controler.UserControler;
import com.mysql.cj.util.TestUtils;
import com.util.DatabaseUtil;

import net.proteanit.sql.DbUtils;


class Registration {
	JFrame frame;
	JPanel northJPanel,westJPanel,centerPanel;
	JPanel formPanel,buttoJPanel,gendreJPanel,gridPanel,resetJPanel;
	JLabel regiLabel;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1;
	JTextField t2,t4,t5;
	JRadioButton maleButton,femaleButton;
	ButtonGroup group;
	JTable table;
	JScrollPane scrollPane;
	JButton deleteButton,registerButton,updateButton,resetButton,exiButton,refereshButton;
	public UserControler controler = new UserControler();
	

	public Registration() {
		
		l1=new JLabel("ID");
		l2=new JLabel("Name");
		l3=new JLabel("Gendre");
		l4=new JLabel("Address");
		l5=new JLabel("Contact");
		
		maleButton=new JRadioButton("Male");
		femaleButton=new JRadioButton("Female");
		group=new ButtonGroup();
		group.add(femaleButton);
		group.add(maleButton);
		gendreJPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		gendreJPanel.add(maleButton);
		gendreJPanel.add(femaleButton);
	
		
		t1=new JTextField();
		t1.setEnabled(false);
		t2=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		
		registerButton=new JButton("Register");
		updateButton=new JButton("Update");
		resetButton=new JButton("Reset");
		exiButton=new JButton("Exit");
		deleteButton=new JButton("Delete");
		refereshButton=new JButton("Refresh");
		
	
		
		
		
		
		
		
		 frame=new JFrame("Registration Form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,500);
		frame.setLayout(new BorderLayout());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		northJPanel=new JPanel();
		regiLabel=new JLabel("Registration Form");
		
		
		
		
		
		
		westJPanel=new JPanel(new BorderLayout());
		westJPanel.setPreferredSize(new Dimension(350, 0));
		
		
		
		formPanel =new JPanel(new GridLayout(5,2,10,10));
		formPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		westJPanel.setBorder(new TitledBorder(BorderFactory.createEtchedBorder(), "Registration Details",
				TitledBorder.CENTER, TitledBorder.TOP));
		
		formPanel.add(l1);
		formPanel.add(t1);
		
		formPanel.add(l2);
		formPanel.add(t2);
		
		formPanel.add(l3);
		formPanel.add(gendreJPanel);
		
		formPanel.add(l4);
		formPanel.add(t4);
		
		formPanel.add(l5);
		formPanel.add(t5);
		
		
		
		
		
		
		
		
		buttoJPanel=new JPanel(new BorderLayout());

		
		gridPanel=new JPanel(new GridLayout(2,2,10,10));
		gridPanel.add(exiButton);
		gridPanel.add(registerButton);
		gridPanel.add(deleteButton);
		gridPanel.add(updateButton);
		
		
		resetJPanel=new JPanel(new FlowLayout());
		resetJPanel.add(resetButton);

		buttoJPanel.add(gridPanel,BorderLayout.NORTH);
		buttoJPanel.add(resetJPanel,BorderLayout.SOUTH);
		
	
		
		// adding component to main frame
		
		centerPanel=new JPanel(new BorderLayout());
		table=new JTable();
		scrollPane=new JScrollPane(table);
		centerPanel.add(scrollPane,BorderLayout.NORTH);
		centerPanel.add(refereshButton,BorderLayout.SOUTH);
	
		frame.add(northJPanel,BorderLayout.NORTH);
		frame.add(centerPanel,BorderLayout.CENTER);
		frame.add(westJPanel,BorderLayout.WEST);
		northJPanel.add(regiLabel);
		westJPanel.add(formPanel,BorderLayout.NORTH);
		westJPanel.add(buttoJPanel,BorderLayout.SOUTH);
		
		
		frame.setVisible(true);
		
		deleteButton.setEnabled(false);
		updateButton.setEnabled(false);
		
		
		updateButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		int id=	Integer.parseInt(t1.getText());
		if (id>0) {
		User user=new User();
		user.setId(Integer.parseInt(t1.getText()));
		user.setName(t2.getText());
		user.setGender(maleButton.isSelected() ? "Male" : "Female");
		user.setAddress(t4.getText());
		user.setContact(t5.getText());
		
		try {
		int result=controler.updateRecord(user);
		if (result>0) {
			refreshTable();
			refreshRecord();
			JOptionPane.showMessageDialog(frame, "Record Updated Successfully");
			
			
		}
			
		} catch (ClassNotFoundException e2) {
		e2.printStackTrace();
		}
		catch (SQLException e2) {
			e2.printStackTrace();
			}
		catch (NumberFormatException e2) {
			e2.printStackTrace();
			}

		
		
		
			
			
		}
				
			}
		});
		
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
			int selectedRow=table.getSelectedRow();
			if (selectedRow!=-1) {

				t1.setText(table.getValueAt(selectedRow, 0).toString());
				t2.setText(table.getValueAt(selectedRow, 1).toString());
				t4.setText(table.getValueAt(selectedRow, 3).toString());
				t5.setText(table.getValueAt(selectedRow, 4).toString());
				
				String gender=table.getValueAt(selectedRow,2).toString();
				if (gender.equalsIgnoreCase("Male")) {
					maleButton.setSelected(true);
					
				}
				else {
					femaleButton.setSelected(true);
				}
				registerButton.setEnabled(false);
				updateButton.setEnabled(true);
				deleteButton.setEnabled(true);
				resetButton.setEnabled(true);
				
				
				
			}
			
				
			}
		});
		
		
		exiButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			int desion=	JOptionPane.showConfirmDialog(buttoJPanel, "Are you sure?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
			
				if (desion==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		resetButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				refreshRecord();
				
			}
		});
		
		
		
		
		refereshButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			refreshTable();
				
			}
		});
		
		

		registerButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name=t2.getText();
				String address=t4.getText();
				String contact=t5.getText();
				if (name.length()>0 && address.length()>0 && contact.length()>0 ){
					String name1=t2.getText();
					String gender1 = maleButton.isSelected() ? "Male" : "Female";
					String address1=t4.getText();
					String contact1=t5.getText();
					addUser(name1, gender1, address1, contact1);
					
				}else {
					JOptionPane.showMessageDialog(frame,"Please enter the detail");
				}
			
				
			}
		}
		);
		
		deleteButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(t1.getText());
				
				if (id>0) {
					try {
					int i=controler.deleteRecord(id);
					if (i>0) {
						refreshRecord();
						resetButton.setEnabled(true);
						JOptionPane.showMessageDialog(frame, "Record deleted Successfully");
						
					}
						
					} catch (ClassNotFoundException e2) {
						e2.printStackTrace();
					}catch (SQLException e1) {
						e1.printStackTrace();
					}
					
				}
				


				
			}
		});
		
		
	}
	
	public void addUser(String name,String gender,String address,String contact) {
		User user=new User();
		user.setName(name);
		user.setGender(gender);
		user.setAddress(address);
		user.setContact(contact);
		
		

			
		
			try {
				int row=controler.insertRecord(user);
				
				if (row>0) {
					refreshRecord();
					JOptionPane.showMessageDialog(frame, "Record inserted Successfully");
					
				}
				else {
					JOptionPane.showMessageDialog(frame, "Something went wrong");
				}
			} catch (ClassNotFoundException e2) {
				e2.printStackTrace();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		
	}
	
	public void refreshRecord() {
		t1.setText("");
		t2.setText("");
		t4.setText("");
		t5.setText("");
		maleButton.setSelected(true);
		updateButton.setEnabled(false);
		registerButton.setEnabled(true);
		resetButton.setEnabled(false);
		deleteButton.setEnabled(false);
		
	}
	
	
	public void refreshTable(){
		try {
			 ResultSet  rs=controler.readRecord();
			 table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
}

public class Form {
	public static void main(String[] args) {
		new Registration();
	}

}
