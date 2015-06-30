package elevator;

public class Second implements Floor{
Floor NextInChain;
	
	public void setNext(Floor c){
		NextInChain=c;
	}
	public void process(Context request){
		if(request.getNumber() == 2){
			System.out.println("You are on SECOND floor "+request.getNumber());
		}
		else{
			NextInChain.process(request);
		}
	}

}
