package elevator;

public interface Floor {
	public abstract void setNext(Floor NextInChain);
	public abstract void process(Context request);
}
