package GitHubFirst;

public class Context {

	private Floor floor;
	public Context(Floor f){
		floor=f;
	}
	public Floor getFloor() {
		return floor;
	}
	public void setFloor(Floor f) {
	    this.floor=f; 
	}
	public void switchFloor(){
		floor.switchFloor(this);
	}
}
