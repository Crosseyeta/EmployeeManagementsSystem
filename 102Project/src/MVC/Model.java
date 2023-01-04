package MVC;
import User.*;
import Cryptography.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.crypto.SecretKey;



public class Model {
	private ArrayList<EmployeeUser> employeeList;
	
	public ArrayList<EmployeeUser> getEmployeeList() {
		return employeeList;
	}

	

	private File database;
	private Scanner scannerDatabase;
	private Scanner scannerImpDatabase;
	private File UserPass;
	private SecretKey key;
	private AdminUser admin;
	private EmployerUser employer;
	private EmployeeUser employee1;
	private PrintStream writer;
	
	
	
	
	
	public Model() throws IOException, Exception {
		key = Cryptography.generateSecretKey();
		employee1 = new EmployeeUser("Employee1","employee123","5000","Student");
		employeeList = new ArrayList<EmployeeUser>();
		database = new File("/Users/ayberkgulverin/Desktop/EVERYTHINK/University/2Semester/CS102/CS102Project/database.txt");
		UserPass = new File("/Users/ayberkgulverin/Desktop/EVERYTHINK/University/2Semester/CS102/CS102Project/userPass.txt");
		admin = new AdminUser();
		employer = new EmployerUser();
		scannerDatabase = new Scanner(database);
		while(scannerDatabase.hasNext()) {
			employeeList.add(new EmployeeUser(Cryptography.decrypt(scannerDatabase.next(), key)," ",Cryptography.decrypt(scannerDatabase.next(), key),Cryptography.decrypt(scannerDatabase.next(), key)));
		}
		
		
		
		
		
		
	
		

		
	}
	
	
	
	public void writeToDatabase() throws Exception{
		writer = new PrintStream(database);
		for(int i = 0;i<employeeList.size();i++) {
			String str = Cryptography.encrypt(employeeList.get(i).getUsername(), key) + " " + Cryptography.encrypt(employeeList.get(i).getJob(), key) + " " + Cryptography.encrypt(employeeList.get(i).getSalary(), key);
			writer.println(str);
		
		}
		
	}
	public String getAdminPassword() throws FileNotFoundException {
		scannerImpDatabase = new Scanner(UserPass);
		return scannerImpDatabase.nextLine();
		
	}
	public String getEmployeePassword() throws FileNotFoundException {
		scannerImpDatabase = new Scanner(UserPass);
		scannerImpDatabase.nextLine();
		scannerImpDatabase.nextLine();
		return scannerImpDatabase.nextLine();
	}
	public String getEmployerPassword() throws FileNotFoundException {
		scannerImpDatabase = new Scanner(UserPass);
		scannerImpDatabase.nextLine();
		return scannerImpDatabase.nextLine();
	}
	
	public EmployeeUser getEmployee1() {
		return employee1;
	}

	
	
	
	/*private void getImpData() throws Exception {
		admin = new AdminUser(scannerImpDatabase.nextLine(), Cryptography.decrypt(scannerImpDatabase.nextLine(), key));
		employer = new EmployerUser(scannerImpDatabase.nextLine(),Cryptography.decrypt(scannerImpDatabase.nextLine(), key));
		if(scannerImpDatabase.nextLine().equals(scannerDatabase.nextLine())) {
			String userName = scannerDatabase.nextLine();
		}
		employeeList.add(new EmployeeUser(userName,scannerDatabase.nextLine()));
	}
	*/
	 
}
