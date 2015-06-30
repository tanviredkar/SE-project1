package elevator;

public class Third implements Floor{
Floor NextInChain;
	
	public void setNext(Floor c){
		NextInChain=c;
	}
	public void process(Context request){
		if(request.getNumber() == 3){
			System.out.println("You are on THIRD floor "+request.getNumber());
		}
		else{
			NextInChain.process(request);
		}
	}

}
