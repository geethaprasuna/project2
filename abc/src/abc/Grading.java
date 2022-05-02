package abc;

public class Grading 
 {
	Grading(int m)	
	{
     if(m<=25)
     System.out.println(" Marks Obtained by Student==" +m +"Grade ('F')");
     else if (m<=45)
      System.out.println("Marks Obtained by Student==" +m +"Grade ('E') ");
      else if (m<=50)
       System.out.println("Marks Obtained by Student==" +m +"Grade ('D') ");
        else if (m<=60)
    	 System.out.println("Marks Obtained by Student==" +m +"Grade ('C') ");
    	  else if (m<=80)
    	  System.out.println("Marks Obtained by Student==" +m +"Grade ('B') ");
    	   else if (m<=100)
    	   System.out.println("Marks Obtained by Student==" +m +"Grade ('*A') ");
      }

	public static void main(String[] args) {
		new Grading(69);
		

	}

}
