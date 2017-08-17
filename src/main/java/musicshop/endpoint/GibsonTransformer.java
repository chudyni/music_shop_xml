package musicshop.endpoint;

import musicshop.domain.item.Gibson;
import musicshop.domain.item.Guitar;
import org.apache.log4j.Logger;

public class GibsonTransformer {
	
	private static final Logger log = Logger.getLogger(GibsonTransformer.class);

	public Gibson signGibson(final Guitar guitar) {
		log.info("Transforming to Gibson");
		return new Gibson(guitar.getMark(), guitar.getName());
	}
}
