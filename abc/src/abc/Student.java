package abc;

public class Student {
	int rolno;
	String name;
	String group;
	static String clg;
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student std1=new Student();
	std1.init(001,"Prasuna","Bi.P.C");
	std1.display();
	Student st2=new Student();
	st2.init(002,"Geetha","Bi.P.C");
	st2.display();
	Student st3=new Student();
	st3.init(003,"Swarna","Bi.P.C");
	st3.display();
	Student st4=new Student();
	st4.init(004,"Satya","Bi.P.C");
	st4.display();
	Student st5=new Student();
	st5.init(005,"Gowthami","Bi.P.C");
	st5.display();
}
void init(int rolno_temp,String name_temp,String group_temp)
{
	rolno=rolno_temp;
	name=name_temp;
	group=group_temp;
}
void display()
{
	System.out.println("Name = "+name);
	System.out.println("Rolno = "+rolno);
	System.out.println("Group ="+group);
}
	
}
