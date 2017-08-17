package musicshop.endpoint;

import musicshop.domain.item.Guitar;
import musicshop.domain.item.GuitarMark;
import org.apache.log4j.Logger;

public class GuitarRouter {
	
	private static final Logger log = Logger.getLogger(GuitarRouter.class);

	public String routeGuitar(final Guitar guitar) {
		log.info("---GuitarRouter---");
		return this.getChannel(guitar);
	}
	
	private String getChannel(final Guitar guitar) {
		String channel = "";
		if(guitar.getMark() == GuitarMark.FENDER) {
			channel = "fenderChannel";
		}
		if(guitar.getMark() == GuitarMark.GIBSON) {
			channel = "gibsonChannel";
		}
		log.info("Routed to " + channel);
		return channel;
	}
}
