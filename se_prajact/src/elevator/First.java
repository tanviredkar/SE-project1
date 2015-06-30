package elevator;


public class First implements Floor{
Floor NextInChain;
	
	public void setNext(Floor c){
		this.NextInChain=c;
	}
	public void process(Context request){
		if(request.getNumber() == 1){
			System.out.println("You are on first floor "+request.getNumber());
		}
		else{
			NextInChain.process(request);
		}
	}

}
