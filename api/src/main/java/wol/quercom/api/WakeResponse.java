package wol.quercom.api;

import wol.quercom.api.model.Device;

import java.text.MessageFormat;

public class WakeResponse
{

	private final boolean success;
	private final String message;
	private final String error;

	public WakeResponse( boolean success, String message, String error )
	{
		this.success = success;
		this.message = message;
		this.error = error;
	}

	public WakeResponse( boolean success, Device device )
	{
		this.success = success;
		String messageFormat = "Sent magic packet to device {0} with Mac {1} on Broadcast IP {2}";
		this.message = MessageFormat.format( messageFormat, device.getName(), device.getMac(), device.getIp() );
		this.error = null;
	}

	public boolean isSuccess( )
	{
		return success;
	}

	public String getMessage( )
	{
		return message;
	}

	public String getError( )
	{
		return error;
	}
}
