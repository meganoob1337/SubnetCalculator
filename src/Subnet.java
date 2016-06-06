import java.util.ArrayList;
import java.util.List;


public class Subnet {
	
	
	public ArrayList<Host> hosts;
	public List<String> potentialHosts;

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
