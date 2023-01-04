package MVC;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import Cryptography.*;
import javax.swing.JOptionPane;
import User.*;


public class Controller implements ActionListener {
	private View view;
	private Model model;
	private String password;
	private int controller;
	//private Scanner scanner;
	
	
	public Controller() throws IOException, Exception{
		view = new View();
		view.getFirstPage();
		model = new Model();
		
		//scanner = new Scanner(model.getDatabase());
		
		
		
		
		
		//ACTION LISTENERS
		view.getLoginButton().addActionListener(this);
        view.getExitButton().addActionListener(this);
        view.getEmployeeExitButton().addActionListener(this);
        view.getEmployeeReturnButton().addActionListener(this);
        view.getExitButtonEmployer().addActionListener(this);
        view.getReturnButtonEmployer().addActionListener(this);
        view.getExitButtonAdmin().addActionListener(this);
        view.getReturnButtonAdmin().addActionListener(this);
        view.getHireButton().addActionListener(this);
        view.getFireButton().addActionListener(this);
        view.getRaiseButton().addActionListener(this);
        view.getAddRowButton().addActionListener(this);
        view.getDeleteRowButton().addActionListener(this);
        view.getUpdateButton().addActionListener(this);
        view.getShowData().addActionListener(this);
        view.getShowDataAdmin().addActionListener(this);
        view.getDatabaseReturnButton().addActionListener(this);
        
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		password = String.valueOf(view.getPasswordField().getPassword());
		if(e.getSource()==view.getLoginButton()) {
			try {
				if(Cryptography.getHash(password).equals(model.getAdminPassword())) {
					view.closeFirstPage();
					view.getAdminPage();
				}
				else if (Cryptography.getHash(password).equals(model.getEmployeePassword())){
					view.closeFirstPage(); 
					view.getEmployeeRealName().setText(model.getEmployee1().getUsername());
					view.getEmployeeRealJob().setText(model.getEmployee1().getJob());
					view.getEmployeeRealSalary().setText(model.getEmployee1().getSalary());
					view.getEmployeePage();
				}
				
				else if (Cryptography.getHash(password).equals(model.getEmployerPassword())) {
					view.closeFirstPage();
					view.getEmployerPage();
				}else {
					view.getOptionPane();
					JOptionPane.showMessageDialog(null, "You have entered wrong password or username");
					
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
			
			
		}else if(e.getSource()==view.getEmployeeExitButton() || e.getSource()==view.getExitButtonEmployer() || e.getSource()==view.getExitButton() || e.getSource() == view.getExitButtonAdmin()) {
			System.exit(0);
			
		}else if(e.getSource()==view.getEmployeeReturnButton() ) {
			view.closeEmployeePage();
			view.getUsernameField().setText(null);
			view.getPasswordField().setText(null);
			view.getFirstPage();
			
		}else if(e.getSource()==view.getReturnButtonEmployer()) {
			view.closeEmployerPage();
			view.getUsernameField().setText(null);
			view.getPasswordField().setText(null);
			view.getFirstPage();
			
		}else if(e.getSource()==view.getReturnButtonAdmin()) {
			view.closeAdminPage();
			view.getUsernameField().setText(null);
			view.getPasswordField().setText(null);
			view.getFirstPage();
		}else if(e.getSource()==view.getShowData() || e.getSource()==view.getShowDataAdmin()) {
			
			controller = 0;
			
			if(e.getSource()==view.getShowData()) {
				controller = 1;
				view.closeEmployerPage();
				view.getDatabasePage(model.getEmployeeList());
			}else {
				controller = 2;
				view.closeAdminPage();
				view.getDatabasePage(model.getEmployeeList());
			}
			
		}
		else if(e.getSource()==view.getHireButton()) {
			model.getEmployeeList().add(new EmployeeUser(view.getEmployerRealName().getText(),"",view.getEmployerRealJob().getText(),view.getEmployerRealSalary().getText()));
			
			try {
				model.writeToDatabase();
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (e.getSource()==view.getFireButton()) {
			model.getEmployeeList().remove(Integer.parseInt(view.getEmployerRealIndex().getText()));
			try {
				model.writeToDatabase();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (e.getSource()==view.getRaiseButton()) {
			model.getEmployeeList().get(Integer.parseInt(view.getEmployerRealRaiseIndex().getText())).setSalary(view.getEmployerRealRaiseSalary().getText());
			try {
				model.writeToDatabase();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}else if(e.getSource()==view.getAddRowButton()) {
			model.getEmployeeList().add(new EmployeeUser(view.getAdminRealName().getText(),"",view.getAdminRealSalary().getText(),view.getAdminRealJob().getText()));
			
			try {
				model.writeToDatabase();
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(e.getSource()==view.getDeleteRowButton()) {
			model.getEmployeeList().remove(Integer.parseInt(view.getAdminRealIndex().getText()));
			try {
				model.writeToDatabase();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(e.getSource()==view.getUpdateButton()) {
			model.getEmployeeList().get(Integer.parseInt(view.getAdminRealUpdateIndex().getText())).setSalary(view.getAdminRealUpdateSalary().getText());
			model.getEmployeeList().get(Integer.parseInt(view.getAdminRealUpdateIndex().getText())).setUsername(view.getAdminRealUpdateName().getText());
			model.getEmployeeList().get(Integer.parseInt(view.getAdminRealUpdateIndex().getText())).setJob(view.getAdminRealUpdateJob().getText());
			try {
				model.writeToDatabase();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(e.getSource()==view.getDatabaseReturnButton()) {
			view.closeDatabasePage();
			if(controller == 1) {
				view.getEmployerPage();
			}else if(controller == 2) {
				view.getAdminPage();
			}
		}
		
		
	}
	
	
	
}
