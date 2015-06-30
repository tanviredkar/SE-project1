package elevator;

public class Fail2 implements Floor{
Floor NextInChain;
	
	public void setNext(Floor c){
		this.NextInChain=c;
	}
	public void process(Context request){
		if(request.getNumber() < 0){
			System.out.println("You are on ground floor cant go down "+request.getNumber());
		}
		else{
			NextInChain.process(request);
		}
	}

	
}
