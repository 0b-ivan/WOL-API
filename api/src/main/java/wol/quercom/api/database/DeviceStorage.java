package wol.quercom.api.database;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import wol.quercom.api.model.Device;

import java.text.MessageFormat;
import java.util.List;

public class DeviceStorage
{
	private final List<Device> devices = List.of(
		new Device( "PC", "F0:79:59:67:76:4D", "192.168.178.60:9" ),
		new Device( "TP", "54:E1:AD:27:B5:2F", "192.168.1.209:9" ),
		new Device( "Server", "34:E6:D7:33:12:71", "192.168.1.255:9" ),
		new Device( "NAS", "28:C6:8E:36:DC:38", "192.168.1.255:9" ),
		new Device( "Laptop", "18:1D:EA:70:A0:21", "192.168.1.255:9" )
	);

	public Device findByName( final String name )
	{
		return devices.stream( )
					  .filter( d -> d.getName( ).equalsIgnoreCase( name ) )
					  .findAny( )
					  .orElseThrow( ( ) -> new ResponseStatusException( HttpStatus.BAD_REQUEST,
						  MessageFormat.format( "Device with name '{0}' could not be found. Make sure the device exists.",
							  name ) ) );

	}
}
