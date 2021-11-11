import java.net.URL;
class A
{
	public static void main(String args[]) throws Exception
	{
		//System.out.println("Bishnu");
		URL url1=new URL("https://control.ameyo.com:8119/CustomerDashboard/Allow.php");
		String protocol=url1.getProtocol();
		String host=url1.getHost();
		String file=url1.getFile();
		int portnumber=url1.getPort();
		System.out.println("Protocol: "+protocol);
		System.out.println("Host Name: "+host);
		System.out.println("File Name: "+file);
		System.out.println("Port Number: "+portnumber);		
	}
}
