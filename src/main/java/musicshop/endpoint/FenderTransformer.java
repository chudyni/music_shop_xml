package musicshop.endpoint;

import musicshop.domain.item.Fender;
import musicshop.domain.item.Guitar;
import org.apache.log4j.Logger;

public class FenderTransformer {
	
	private static final Logger log = Logger.getLogger(FenderTransformer.class);

	public Fender signFender(final Guitar guitar) {
		log.info("Transforming to Fender");
		return new Fender(guitar.getMark(), guitar.getName());
	}
}
