package abc;

public class Shopkeeper 
{
	Shopkeeper (int c)
	{
	System.out.println("Actual Prize =="+c);
	  if(c>1000)
	  {
		 int b=(c-(c*10/100));
		System.out.println("Selling Prize=="+b);
	  }
	else
      { 
		System.out.println("Selling Prize=="+c);
	  }
	}

	public static void main(String[] args) {
	 new Shopkeeper(5000);
	}

}
