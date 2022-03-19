package wol.quercom.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import wol.quercom.api.database.DeviceStorage;
import wol.quercom.api.service.WakeService;

@RestController
public class WakeController
{

	private final DeviceStorage storage = new DeviceStorage( );

	@GetMapping( "/wake/{name}" )
	public ResponseEntity<WakeResponse> wake( @PathVariable final String name )
	{
		var device = storage.findByName( name );
		// Do something
		new WakeService( ).wake( device );
		return ResponseEntity.status( HttpStatus.ACCEPTED )
							 .body( new WakeResponse( true, device ) );
	}
}
