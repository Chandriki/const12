package chandriki2;

public class constructor12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(18,"Harry");
		Student s2=new Student(17,"Durga");
		System.out.println(s1.age+"  "+s2.name);
		System.out.println(s2.age+"  "+s2.name);

	}

}
class Student{
	int age;
	String name;
	Student(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
}