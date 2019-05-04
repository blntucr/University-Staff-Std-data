import java.lang.Object;
public class testPerson {
	public static void main(String[] args) {
		Object o = new Person("Bulent Ucar", "xxxx st.",
				"+90xxxxxxxxx", "xxxxxxxx@gmail.com");
		Person p1 = new Person("Bulent Ucar", "xxxxx st.",
				"+90xxxxxxxxx", "xxxxxxxx@gmail.com");
		Student s1 = new Student("Junior", p1.getName(), 
				p1.getAddress(),
				p1.getPn(), p1.getMail());
		Employee e1 = new Employee(p1.getName(), 
				p1.getAddress(),
				p1.getPn(), p1.getMail(),
				"A605", 4000, "03/06/2013");
		FacultyMem f1 = new FacultyMem(p1.getName(), 
				p1.getAddress(),
				p1.getPn(), p1.getMail(),"14:00 - 16:00", "3");
		Staff st1 = new Staff("Ass. Prof.",p1.getName(), 
				p1.getAddress(),
				p1.getPn(), p1.getMail());
		System.out.print(s1.toString()+"\n\n"+ e1.toString());
	}
}
