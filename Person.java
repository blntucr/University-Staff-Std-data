
public class Person extends Object{
	private String name, address, pn, mail;
	
	Person(){
		this(null,null,null,null);
	}
	
	Person(String name, String address, String pn,
			String mail){
		this.name = name;
		this.address = address;
		this.pn = pn;
		this.mail = mail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPn() {
		return pn;
	}

	public void setPn(String pn) {
		this.pn = pn;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	public String toString() {
		return "Name: "+name+"\n"+"address: "+address+"\n"
				+"Phone number: "+pn+"\n"+"E-mail address: "+
				mail;
	}
	
}
class Student extends Person{
	 final String status;
	 
	 Student(){
		 this.status = null;
	 }
	 
	 Student(String status, String name, String address, String pn, String mail){
		 super(name, address, pn, mail);
		 this.status = status;
	 }

	public String getStatus() {
		return status;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nStatus: "+status;
	}
	 
}
class Employee extends Person{
	String office;
	double salary;
	String dateHired;
	
	Employee(){
	}
	
	Employee(String name, String address, String pn,
			String mail, String office, 
			double salary, String dateHired){
		
		super(name, address, pn, mail);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	public String getOffice() {
		return office;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	@Override
	public String toString() {
		return super.toString()+"\nOffice: "+office+
				"\nSalary: "+salary+"TL"+"\nHire date: "
				+dateHired;
	}
}

class FacultyMem extends Person{
	String officeHours, rank;
	
	FacultyMem(){
	}
	
	FacultyMem(String name, String address,
			String pn, String mail,
			String officeHours, String rank){
		super(name, address, pn, mail);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return super.toString()+"\nOffice hours: "+officeHours+
				"\nRank: "+rank;
	}
}

class Staff extends Person{
	String title;
	
	Staff(){
	}
	
	Staff(String title, String name, String address,
			String pn, String mail){
		super(name, address, pn, mail);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return super.toString()+"\nTitle: "+title;
	}
}
