package JavaOopsConcet;

public class TestBank {

	public static void main(String[] args) {
		System.out.println( USBank.min_bal);
		
	
		HSBCBank hb=new HSBCBank();
		hb.credit();
		hb.debit();
		hb.transfermoney();
		hb.educationloan();
		hb.carloan();
		//dynamic polymorphism.
		//child class object refrered by parent interface ref var..
		USBank b=new HSBCBank();
		b.credit();
		b.debit();
		b.transfermoney();
	
		
		

	}

}
