package abc;

public class ConstructorOverLoading {
		int rolno;
		String name;
		String group;
		int salary;
		static String clg ="SKR COLLEGE For Women";
		
	public static void main(String[] args) {
		
		ConstructorOverLoading std1=new ConstructorOverLoading(001,"Prasuna","Bi.P.C");
		ConstructorOverLoading st1=new ConstructorOverLoading(100000);
		std1.display();
		
		ConstructorOverLoading std2=new ConstructorOverLoading(002,"Gowthami","Bi.P.C");
		ConstructorOverLoading st2=new ConstructorOverLoading(100000);
		std2.display();
		
		ConstructorOverLoading std3=new ConstructorOverLoading(001,"Swarna","Bi.P.C");
		ConstructorOverLoading st3=new ConstructorOverLoading(100000);
		std3.display();
		
		ConstructorOverLoading std4=new ConstructorOverLoading(001,"Geetha","Bi.P.C");
		ConstructorOverLoading st4=new ConstructorOverLoading(100000);
		std4.display();
		
		ConstructorOverLoading std5=new ConstructorOverLoading(001,"Satya","Bi.P.C");
		ConstructorOverLoading st5=new ConstructorOverLoading(100000);
		std5.display();
		
	}
	ConstructorOverLoading(int rolno_temp,String name_temp,String group_temp)
	{
		rolno=rolno_temp;
		name=name_temp;
		group=group_temp;
	}
	ConstructorOverLoading(int salary_temp)
	{
		salary=salary_temp;
	}
	void display()
	{
		System.out.println(clg);
		System.out.println("------------------------------");
		System.out.println("Name = "+name);
		System.out.println("Rolno = "+rolno);
		System.out.println("Group ="+group);
		System.out.println("salary="+salary);
	}
	
}


