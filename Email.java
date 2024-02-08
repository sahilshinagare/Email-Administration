package mailApp;

import java.util.Scanner;

public class Email {
	
	private String firstname;
	private String lastName;
	private String username;
	private String password;
	private String department;
	private String email;
	
	private int mailboxCapacity = 500;
	private int deafultPasswordlength = 10;
	private int defaultusernamelength = 8;
	
	private String companySuffix = "portfoliosahilshinagare.mydurable.com/";
	String alternateEmail;
	
	Email(String firstname ,String lastName){
		
		this.firstname = firstname;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED : "+this.firstname+" "+this.lastName+" ");
		
		this.department=setDepartment();
		System.out.println("DEPARTMENT : "+this.department);
		
		this.username = setrandomUsername(defaultusernamelength);
		System.out.println("Your UserName Is : "+this.username);
		
		this.password = setrandomPassword(deafultPasswordlength);
		System.out.println("Your Password Is : "+this.password);
		
		//Combine email to genrateEmail 
		email = firstname.toLowerCase() + "" +lastName.toLowerCase()+ "@"+department +"." + companySuffix;
		System.out.println("Your Email Is : "+email);
		
		
		
		
	}
	
	public void setmailboxCapacity(int capacity ) {
		this.mailboxCapacity = capacity;
		
	}
	public void setAlternateEmail(String altemail) {
		this.alternateEmail= altemail;
		
	}
	
	public void setChangePassword(String password) {
		this.password = password;
		
	}
	public int getmailboxCapacity() {
		return mailboxCapacity;
		
	}
	public String getAltenateEmail() {
		return alternateEmail;
		
	}
	
	public String getPassword() {
		return password;
	}
	
	
	public String showInfo() {
		return "DISPLAY NAME    : "+firstname + " " +lastName 
				+"COMPANY MAIL  : "+email
				+"MAIL CAPACITY :" +mailboxCapacity+ " mb ";
				
				
				
	}
	private String setDepartment() {
		
		System.out.println("NEW WORKER :\nDepartMent Codes :- \n1 for sales\n2 for development\n3 for Accounting\n4 for Zero None\n0 Enter The Department code:");
		Scanner sc = new Scanner(System.in);
		int depChoise = sc.nextInt();
		if (depChoise==1) {
			return "sales";
			
			
		} else if (depChoise==2){
			return "development";
			

		}
		else if(depChoise==3) {
			return "Accountant";
		}
		else {
			return " " ;
			
		}
		
		
	}
	private String setrandomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*1234567890";
		char[] password = new char[length];
		for (int i = 0; i < password.length; i++) {
			
			int rand =(int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			
			
		}
		return new String(password);
		
		
	}
	
	private String setrandomUsername(int  length1) {
		String usernameSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghiklmnopqrstuvwxyz";
		char []username = new char[length1];
		for (int i = 0; i < username.length; i++) {
			int rand1 = (int) (Math.random()* usernameSet.length());
			
			username[i] = usernameSet.charAt(rand1);
			
		}
		return new String(username);
		
		
	}

}
