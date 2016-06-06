
public class Host {

	public IPv4 ipv4;
	public IPv6 ipv6;
	
	public Host(IPv4 ip4){
		ipv4 = ip4;
	}
	public Host(IPv6 ip6){
		ipv6 = ip6;
	}
	public Host(IPv4 ip4,IPv6 ip6){
		ipv4 = ip4;
		ipv6 = ip6;
	}
	public IPv4 getIpv4() {
		return ipv4;
	}
	public void setIpv4(IPv4 ipv4) {
		this.ipv4 = ipv4;
	}
	public IPv6 getIpv6() {
		return ipv6;
	}
	public void setIpv6(IPv6 ipv6) {
		this.ipv6 = ipv6;
	}
	
	
}
