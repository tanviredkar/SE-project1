package elevator;

public class Fail implements Floor  {

Floor NextInChain;
	
	public void setNext(Floor c){
		NextInChain=c;
	}
	public void process(Context request){
		if(request.getNumber() > 3){
			System.out.println("You are on 3rd floor cant go up "+request.getNumber());
		}
		else{
			NextInChain.process(request);
		}
	}
}
