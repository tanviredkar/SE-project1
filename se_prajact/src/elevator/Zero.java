package elevator;

public class Zero implements Floor{
Floor NextInChain;
	
	public void setNext(Floor c){
		this.NextInChain=c;
	}
	public void process(Context request){
		if(request.getNumber() == 0){
			System.out.println("You are on Ground floor "+request.getNumber());
		}
		else{
			NextInChain.process(request);
		}
	}


}
