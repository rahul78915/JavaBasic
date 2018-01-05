package JavaOopsConcet;

public class Testmachine {

	public static void main(String[] args) {
		//static polymorphism-----compile time polymorshiam
		Bmw b=new Bmw();
		b.starts();
		b.stop();
		b.thefsafety();
		b.refuel();
		b.engine();
		

	System.out.println("----------");



Cars c= new Cars();
c.starts();
c.stop();
c.refuel();

System.out.println("----------");

 Cars c1=new Bmw();
 c1.starts();
 c1.stop();
 System.out.println("----------");
 
 
 //down casting
 Bmw b1= (Bmw)new Cars();
 
 
 //Top casting---child class object reffered parent class refrence variables




}
}

