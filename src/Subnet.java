import java.util.ArrayList;


public class Subnet {
	
	
	public ArrayList<Host> hosts;
	public ArrayList<Host> potentialHosts;

	public ArrayList<Host> getHosts() {
		return hosts;
	}
	public void setHosts(ArrayList<Host> hosts) {
		this.hosts = hosts;
	}
	public Subnet(ArrayList<Host> hostlist){
		hosts = hostlist;
	}
}
