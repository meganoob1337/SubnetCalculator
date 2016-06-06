import java.util.List;


public class test {

	public static void main(String[] args) {
		IPv4 ip1 = new IPv4("10.1.17.0/20");
		System.out.println("BaseIP: " + ip1.baseIPnumeric);
		System.out.println("NetMask: " + ip1.netmaskNumeric);

	}

}
