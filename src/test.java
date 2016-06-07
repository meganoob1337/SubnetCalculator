import java.util.List;


public class test {

	public static void main(String[] args) {
		IPv4 ip1 = new IPv4("10.1.17.0/20");
		System.out.println("BaseIP: " + ip1.getAvailableIPs(ip1.getNumberOfHosts()));
		System.out.println("symbolic: " + ip1.getIP());
		System.out.println("binary: " + ip1.getBinary(ip1.baseIPnumeric));

	}

}
