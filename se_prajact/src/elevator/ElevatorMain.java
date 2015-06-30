package elevator;

public class ElevatorMain {
	
	public static void main(String[] args) {
	Floor f1 =new First();
	Floor f2 =new Second();
    Floor f3 =new Third();
	Floor f4 =new Zero();
	Floor f5 =new Fail();
	Floor f6 =new Fail2();
    
	f1.setNext(f2);
	f2.setNext(f3);
	f3.setNext(f4);
	f4.setNext(f5);
	f5.setNext(f6);

	f1.process(new Context(2));
	f1.process(new Context(0));
	f1.process(new Context(4));
	f1.process(new Context(-1));
	f1.process(new Context(1));
}
}