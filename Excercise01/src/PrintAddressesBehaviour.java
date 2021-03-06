import jade.core.behaviours.SimpleBehaviour;


public class PrintAddressesBehaviour extends SimpleBehaviour {
	private String[] addresses;
	private int index = 0;
	
	public void onStart(){
		this.addresses = (String[]) getDataStore().get("addresses");
	}
	
	public void action(){
		System.out.println("Address:" + this.addresses[this.index]);
		this.index++;
	}
	
	public boolean done(){
		return this.addresses != null && this.index > this.addresses.length-1;
	}
}
