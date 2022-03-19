package wol.quercom.api.model;

public record Device(String name, String mac, String ip)
{

	public String getName( )
	{
		return name;
	}

	public String getMac( )
	{
		return mac;
	}

	public String getIp( )
	{
		return ip;
	}
}
