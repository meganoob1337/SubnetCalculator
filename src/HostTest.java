

import static org.junit.Assert.*;

import org.junit.Test;

public class HostTest {

	@Test
	public void test() {
		Host h1 = new Host(new IPv4("192.168.14.55","255.255.255.0"));
		assertEquals("192.168.14.55", h1.getIpv4().getIP());
		assertNotEquals("192.168.14.56", h1.getIpv4().getIP());
		h1.setIpv4(h1.getIpv4());

	}

}
