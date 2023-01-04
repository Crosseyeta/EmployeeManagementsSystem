package MVC;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.*;
import java.awt.event.*;
import User.*;
import java.util.ArrayList;
public class View {
	// LOGIN PAGE ENTRIES
	private JFrame mainFrame;
	private JPanel mainPanel;
	private JPanel labelPanel;
	private JLabel signLabel;
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JButton  loginButton;
	private JButton exitButton;
	private String password;
	private JOptionPane optionPane;
	 
	//EMPLOYEE PAGE ENTRIES
	private JFrame employeeFrame;
	private JPanel employeePanel;
	private JLabel employeeNameLabel;
	private JLabel employeeJobLabel;
	private JLabel employeeSalaryLabel;
	private JLabel employeeRealName;
	private JLabel employeeRealJob;
	private JLabel employeeRealSalary;
	private JButton employeeExitButton;
	private JButton employeeReturnButton;
	
	public JButton getEmployeeExitButton() {
		return employeeExitButton;
	}
	
	public JButton getEmployeeReturnButton() {
		return employeeReturnButton;
	}
	



	//EMPLOYER PAGE ENTRIES
	private JFrame employerFrame;
	private JPanel employerPanel;
	private JButton showData;
	private JLabel employerName;
	private JLabel employerJob;
	private JLabel employerSalary;
	private JTextField employerRealName;
	private JTextField employerRealJob;
	private JTextField employerRealSalary;
	private JButton hireButton;
	private JLabel employerIndex;
	private JTextField employerRealIndex;
	private JButton fireButton;
	private JLabel employerRaiseIndex;
	private JLabel employerRaiseSalary;
	private JTextField employerRealRaiseIndex;
	private JTextField employerRealRaiseSalary;
	private JButton raiseButton;
	private JButton exitButtonEmployer;
	private JButton returnButtonEmployer;

	
	
	//ADMIN PAGE ENTRIES
	private JFrame adminFrame;
	private JPanel adminPanel;
	private JButton showDataAdmin;
	private JLabel adminName;
	private JLabel adminJob;
	private JLabel adminSalary;
	private JTextField adminRealName;
	private JTextField adminRealJob;
	private JTextField adminRealSalary;
	private JButton addRowButton;
	private JLabel adminIndex;
	private JTextField adminRealIndex;
	private JButton deleteRowButton;
	private JLabel adminUpdateIndex;
	private JLabel adminUpdateName;
	private JLabel adminUpdateJob;
	private JLabel adminUpdateSalary;
	private JTextField adminRealUpdateIndex;
	private JTextField adminRealUpdateName;
	private JTextField adminRealUpdateJob;
	private JTextField adminRealUpdateSalary;
	private JButton updateButton;
	private JButton exitButtonAdmin;
	private JButton returnButtonAdmin;
	
	
	//DATABASE PAGE ENTRIES
	private JFrame databaseFrame;
	private JPanel databasePanel;
	private JTable databaseTable;
	private JButton databaseReturnButton;
	
	private String[] column;
	

	public JTable getDatabaseTable() {
		return databaseTable;
	}

	

	public JFrame getAdminFrame() {
		return adminFrame;
	}

	public JPanel getAdminPanel() {
		return adminPanel;
	}

	public JButton getShowDataAdmin() {
		return showDataAdmin;
	}

	public JLabel getAdminName() {
		return adminName;
	}

	public JLabel getAdminJob() {
		return adminJob;
	}

	public JLabel getAdminSalary() {
		return adminSalary;
	}

	public JTextField getAdminRealName() {
		return adminRealName;
	}

	public JTextField getAdminRealJob() {
		return adminRealJob;
	}

	public JTextField getAdminRealSalary() {
		return adminRealSalary;
	}

	public JButton getAddRowButton() {
		return addRowButton;
	}

	public JLabel getAdminIndex() {
		return adminIndex;
	}

	public JTextField getAdminRealIndex() {
		return adminRealIndex;
	}

	public JButton getDeleteRowButton() {
		return deleteRowButton;
	}

	public JLabel getAdminUpdateIndex() {
		return adminUpdateIndex;
	}

	public JLabel getAdminUpdateName() {
		return adminUpdateName;
	}

	public JLabel getAdminUpdateJob() {
		return adminUpdateJob;
	}

	public JLabel getAdminUpdateSalary() {
		return adminUpdateSalary;
	}

	public JTextField getAdminRealUpdateIndex() {
		return adminRealUpdateIndex;
	}

	public JTextField getAdminRealUpdateName() {
		return adminRealUpdateName;
	}

	public JTextField getAdminRealUpdateJob() {
		return adminRealUpdateJob;
	}

	public JTextField getAdminRealUpdateSalary() {
		return adminRealUpdateSalary;
	}

	public JButton getUpdateButton() {
		return updateButton;
	}

	public JButton getExitButtonAdmin() {
		return exitButtonAdmin;
	}

	public JButton getReturnButtonAdmin() {
		return returnButtonAdmin;
	}

	public JButton getReturnButtonEmployer() {
		return returnButtonEmployer;
	}

	public JFrame getEmployeeFrame() {
		return employeeFrame;
	}

	public JPanel getEmployeePanel() {
		return employeePanel;
	}

	public JLabel getEmployeeNameLabel() {
		return employeeNameLabel;
	}

	public JLabel getEmployeeJobLabel() {
		return employeeJobLabel;
	}

	public JLabel getEmployeeSalaryLabel() {
		return employeeSalaryLabel;
	}

	public JLabel getEmployeeRealName() {
		return employeeRealName;
	}

	public JLabel getEmployeeRealJob() {
		return employeeRealJob;
	}

	public JLabel getEmployeeRealSalary() {
		return employeeRealSalary;
	}

	public JFrame getEmployerFrame() {
		return employerFrame;
	}

	public JPanel getEmployerPanel() {
		return employerPanel;
	}

	public JButton getShowData() {
		return showData;
	}

	public JLabel getEmployerName() {
		return employerName;
	}

	public JLabel getEmployerJob() {
		return employerJob;
	}

	public JLabel getEmployerSalary() {
		return employerSalary;
	}

	public JTextField getEmployerRealName() {
		return employerRealName;
	}

	public JTextField getEmployerRealJob() {
		return employerRealJob;
	}

	public JTextField getEmployerRealSalary() {
		return employerRealSalary;
	}

	public JButton getHireButton() {
		return hireButton;
	}

	public JLabel getEmployerIndex() {
		return employerIndex;
	}

	public JTextField getEmployerRealIndex() {
		return employerRealIndex;
	}

	public JButton getFireButton() {
		return fireButton;
	}

	public JLabel getEmployerRaiseIndex() {
		return employerRaiseIndex;
	}

	public JLabel getEmployerRaiseSalary() {
		return employerRaiseSalary;
	}

	public JTextField getEmployerRealRaiseIndex() {
		return employerRealRaiseIndex;
	}

	public JTextField getEmployerRealRaiseSalary() {
		return employerRealRaiseSalary;
	}

	public JButton getRaiseButton() {
		return raiseButton;
	}

	public JButton getExitButtonEmployer() {
		return exitButtonEmployer;
	}

	public String getPassword() {
		return password;
	}
	public JFrame getMainFrame() {
		return mainFrame;
	}

	

	public JPanel getMainPanel() {
		return mainPanel;
	}

	

	public JOptionPane getOptionPane() {
		return optionPane;
	}

	public JPanel getLabelPanel() {
		return labelPanel;
	}

	

	public JLabel getSignLabel() {
		return signLabel;
	}

	

	public JLabel getUsernameLabel() {
		return usernameLabel;
	}

	

	public JLabel getPasswordLabel() {
		return passwordLabel;
	}

	

	public JTextField getUsernameField() {
		return usernameField;
	}

	

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	

	public JButton getLoginButton() {
		return loginButton;
	}

	

	public JButton getExitButton() {
		return exitButton;
	}

	

	public View()  {
		
		//CONSTRUCTOR
		mainFrame = new JFrame();
		mainPanel = new JPanel();
		labelPanel = new JPanel();
		signLabel = new JLabel("Sign In");
		usernameLabel = new JLabel("Username");
		usernameField = new JTextField();
		passwordLabel = new JLabel("Password");
		passwordField = new JPasswordField();
		loginButton = new JButton("Sign In");
        exitButton = new JButton("Exit");
        password = passwordField.getPassword().toString();
        employeePanel = new JPanel();
        employeeNameLabel = new JLabel("Name");
        employeeJobLabel = new JLabel("Job");
        employeeSalaryLabel = new JLabel("Salary");
        employeeRealName= new JLabel();
        employeeRealJob = new JLabel();
        employeeRealSalary =  new JLabel();
        employeeExitButton = new JButton("Exit");
        employeeReturnButton = new JButton("Return");
        employeeFrame = new JFrame();
        
        
        optionPane = new JOptionPane();
        
        employerFrame = new JFrame();
    	employerPanel = new JPanel();
    	showData = new JButton("Show Database");
    	employerName = new JLabel("Name");
    	employerJob = new JLabel("Job");
    	employerSalary= new JLabel("Job");
    	employerRealName = new JTextField();
    	employerRealJob = new JTextField();
        employerRealSalary = new JTextField();
    	hireButton= new JButton("Hire Employee");
    	employerIndex= new JLabel("Index");
    	 employerRealIndex = new JTextField();
    	fireButton= new JButton("Fire Employee");
    	employerRaiseIndex= new JLabel("Index");
    	employerRaiseSalary= new JLabel("Salary");
    	employerRealRaiseIndex = new JTextField();
    	employerRealRaiseSalary= new JTextField();
    	raiseButton= new JButton("Raise Salary");
    	exitButtonEmployer= new JButton("Exit");
        returnButtonEmployer = new JButton("Return");
        
        
        adminFrame = new JFrame();
    	adminPanel = new JPanel();
    	showDataAdmin = new JButton("Show Database");
    	adminName = new JLabel("Name");
    	adminJob = new JLabel("Job");
    	adminSalary= new JLabel("Salary");
    	adminRealName = new JTextField();
    	adminRealJob = new JTextField();
        adminRealSalary = new JTextField();
    	addRowButton= new JButton("Add Row");
    	adminIndex= new JLabel("Index");
    	adminRealIndex = new JTextField();
    	deleteRowButton= new JButton("Delete Row");
    	adminUpdateIndex= new JLabel("Index");
    	adminUpdateName = new JLabel("Name");
    	adminUpdateJob= new JLabel("Job");
    	adminUpdateSalary= new JLabel("Salary");
    	adminRealUpdateIndex = new JTextField();
    	adminRealUpdateName= new JTextField();
    	adminRealUpdateJob = new JTextField();
    	adminRealUpdateSalary= new JTextField();
    	updateButton= new JButton("Update Row");
    	exitButtonAdmin= new JButton("Exit");
        returnButtonAdmin = new JButton("Return");
        
        databaseFrame = new JFrame("Database Page");
        databasePanel = new JPanel();
        databaseReturnButton = new JButton("Return");
        column = new String[3];
        databaseTable=new JTable();
        
        
        
        
        
	}
	public void getFirstPage() {
		
		mainPanel.setLayout(null);
	        labelPanel.setLayout(null);
	        
	        /*loginButton.addActionListener(this);
	        exitButton.addActionListener(this);*/
	       
	        	
	        
	        
	        mainFrame.setSize(1920,1080);
			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			mainFrame.setTitle("Sign In");
			labelPanel.setBounds(0,0,120,30);
			labelPanel.add(signLabel);
			labelPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			
			
			
			
			/*mainPanel.setBounds(400,400,300,300);
			mainPanel.setLayout(new GridLayout(3,2));
			mainPanel.add(usernameLabel);
			mainPanel.add(usernameField);
			mainPanel.add(passwordLabel);              THE CODE THAT I WANT BUT I DOES NOT WORK
			mainPanel.add(passwordField);
			mainPanel.add(loginButton);
			mainPanel.add(exitButton);
			
			mainPanel.setBackground(Color.BLACK);*/
			
			
			
			
			mainPanel.add(usernameLabel);
			mainPanel.add(usernameField);
			mainPanel.add(passwordLabel);             
			mainPanel.add(passwordField);
			mainPanel.add(loginButton);
			mainPanel.add(exitButton);
			usernameLabel.setBounds(600,350,70,20);
			usernameField.setBounds(670,350,100,20);
			passwordLabel.setBounds(600,380,70,20);
			passwordField.setBounds(670,380,100,20);
			loginButton.setBounds(600,410,85,30);
			exitButton.setBounds(685,410,85,30);
			
			
			
			
			
			
			
			//loginButton.addActionListener(new View());
		
			
			mainFrame.add(labelPanel);
			mainFrame.add(mainPanel,BorderLayout.CENTER);
			
			mainFrame.setVisible(true);
	}
	public void closeFirstPage() {
		mainFrame.repaint();
		mainFrame.dispose();
	}
	
	
	public void getEmployeePage() {
		employeeFrame.setSize(1920,1080);
		employeeFrame.setDefaultCloseOperation(employeeFrame.EXIT_ON_CLOSE);
		employeeFrame.setTitle("Employee Page");
		employeePanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employeePanel.add(employeeNameLabel,gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employeePanel.add(employeeJobLabel,gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employeePanel.add(employeeSalaryLabel,gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employeePanel.add(employeeRealName,gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employeePanel.add(employeeRealJob,gbc);
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employeePanel.add(employeeRealSalary,gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		employeePanel.add(employeeReturnButton,gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employeePanel.add(employeeExitButton,gbc);
		
		
		
		
		
		employeeFrame.add(employeePanel);
		employeeFrame.setVisible(true);
		
		
	}
	public void closeEmployeePage() {
		employeeFrame.dispose();
	}
	
	
	public void getEmployerPage() {
		employerFrame.setSize(1920,1080);
		employerFrame.setDefaultCloseOperation(employerFrame.EXIT_ON_CLOSE);
		employerFrame.setTitle("Employer Page");
		
		employerRealName.setColumns(5);
		employerRealJob.setColumns(5);
		employerRealSalary.setColumns(5);
		employerRealIndex.setColumns(17);
		employerRealRaiseIndex.setColumns(11);
		employerRealRaiseSalary.setColumns(5);
		
		
		employerPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		gbc.gridheight = 2;
		employerPanel.add(showData,gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employerPanel.add(employerName,gbc);
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employerPanel.add(employerJob,gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employerPanel.add(employerSalary,gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employerPanel.add(employerRealName,gbc);
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employerPanel.add(employerRealJob,gbc);
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employerPanel.add(employerRealSalary,gbc);
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employerPanel.add(hireButton,gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employerPanel.add(employerIndex,gbc);
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 3;
		gbc.gridheight = 1;
		employerPanel.add(employerRealIndex,gbc);
		gbc.gridx = 3;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employerPanel.add(fireButton,gbc);
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employerPanel.add(employerRaiseIndex,gbc);
		gbc.gridx = 2;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employerPanel.add(employerRaiseSalary,gbc);
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		employerPanel.add(employerRealRaiseIndex,gbc);
		gbc.gridx = 2;
		gbc.gridy = 7;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employerPanel.add(employerRealRaiseSalary,gbc);
		gbc.gridx = 3;
		gbc.gridy = 7;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		employerPanel.add(raiseButton,gbc);
		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		employerPanel.add(exitButtonEmployer,gbc);
		gbc.gridx = 2;
		gbc.gridy = 8;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		employerPanel.add(returnButtonEmployer,gbc);
		
		
		
		
		
		employerFrame.add(employerPanel);
		employerFrame.setVisible(true);
		
	}
	public void closeEmployerPage() {
		
		employerFrame.dispose();
	}
	
	
	public void getAdminPage() {
		adminFrame.setSize(1920,1080);
		adminFrame.setTitle("Admin Page");
		adminFrame.setDefaultCloseOperation(adminFrame.EXIT_ON_CLOSE);
		
		
		adminRealName.setColumns(10);
		adminRealJob.setColumns(5);
		adminRealSalary.setColumns(5);
		
		adminRealIndex.setColumns(22);
		adminRealUpdateIndex.setColumns(4);
		adminRealUpdateName.setColumns(5);
		adminRealUpdateJob.setColumns(5);
		adminRealUpdateSalary.setColumns(5);
		
		adminPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.gridheight = 2;
		adminPanel.add(showDataAdmin,gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		adminPanel.add(adminName,gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		adminPanel.add(adminJob,gbc);
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		adminPanel.add(adminSalary,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		adminPanel.add(adminRealName,gbc);
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		adminPanel.add(adminRealJob,gbc);
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		adminPanel.add(adminRealSalary,gbc);
		gbc.gridx = 4;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		adminPanel.add(addRowButton,gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		adminPanel.add(adminIndex,gbc);
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 4;
		gbc.gridheight = 1;
		adminPanel.add(adminRealIndex,gbc);
		gbc.gridx = 4;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		adminPanel.add(deleteRowButton,gbc);
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		adminPanel.add(adminUpdateIndex,gbc);
		gbc.gridx = 1;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		adminPanel.add(adminUpdateName,gbc);
		gbc.gridx = 2;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		adminPanel.add(adminUpdateJob,gbc);
		gbc.gridx = 3;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		adminPanel.add(adminUpdateSalary,gbc);
		
		
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		adminPanel.add(adminRealUpdateIndex,gbc);
		gbc.gridx = 1;
		gbc.gridy = 7;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		adminPanel.add(adminRealUpdateName,gbc);
		gbc.gridx = 2;
		gbc.gridy = 7;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		adminPanel.add(adminRealUpdateJob,gbc);
		gbc.gridx = 3;
		gbc.gridy = 7;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		adminPanel.add(adminRealUpdateSalary,gbc);
		gbc.gridx = 4;
		gbc.gridy = 7;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		adminPanel.add(updateButton,gbc);
		gbc.gridx = 1;
		gbc.gridy = 8;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		adminPanel.add(exitButtonAdmin,gbc);
		gbc.gridx = 3;
		gbc.gridy = 8;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		adminPanel.add(returnButtonAdmin,gbc);
		
		
		
		
		adminFrame.add(adminPanel);
		adminFrame.setVisible(true);
	}
	public void closeAdminPage() {
		adminFrame.dispose();
	}
	
	public void getDatabasePage(ArrayList<EmployeeUser> array) {
		
		databaseFrame.setSize(1440,720);
		databaseFrame.setDefaultCloseOperation(databaseFrame.EXIT_ON_CLOSE);
		column[0]="Username";
		column[1]="Job";
		column[2]="Salary";
		ArrayList<Object[]> data = new ArrayList<>();
		for(int i = 0;i<array.size();i++) {
			data.add(new Object[] {array.get(i).getUsername(), array.get(i).getJob(), array.get(i).getSalary()});
			
		}

		DefaultTableModel model = new DefaultTableModel(data.toArray(new Object[data.size()][]), column);
        
		 
		  databaseTable.setModel(model);
		
		
		databaseFrame.setLayout(new FlowLayout());
		databasePanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc =  new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		databasePanel.add(databaseTable,gbc);
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		databasePanel.add(databaseReturnButton,gbc);
		databaseFrame.add(databasePanel);
		databaseFrame.setVisible(true);
		
	}
	public JButton getDatabaseReturnButton() {
		return databaseReturnButton;
	}

	public void closeDatabasePage() {
		
		databaseFrame.dispose();
	}

	
	
}
