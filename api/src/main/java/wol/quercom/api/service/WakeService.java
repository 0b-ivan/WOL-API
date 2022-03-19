package wol.quercom.api.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import wol.quercom.api.model.Device;

import java.util.Objects;

public class WakeService
{

	public void wake(final Device device ) {
		Objects.requireNonNull( device );

		// TODO: Wake Device here

		boolean success = true;
		// or else
		if (!success) {
			throw new ResponseStatusException( HttpStatus.I_AM_A_TEAPOT);
		}
	}
}
