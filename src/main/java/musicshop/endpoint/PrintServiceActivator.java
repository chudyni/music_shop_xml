package musicshop.endpoint;

import musicshop.domain.MusicItemsPackage;
import musicshop.domain.item.Guitar;
import musicshop.domain.item.MusicItem;
import org.apache.log4j.Logger;
import org.springframework.messaging.Message;

public class PrintServiceActivator {
	
	private static final Logger log = Logger.getLogger(PrintServiceActivator.class);

	public void print(final Message<MusicItemsPackage> message) {
		log.info("---PrintServiceActivator---");
		
		final MusicItemsPackage itemsPackage = message.getPayload();
		log.info(itemsPackage.getName() + " delivered!" + " Size: " + itemsPackage.getItems().size());
		for(MusicItem item : itemsPackage.getItems()) {
			Guitar guitar = (Guitar) item;
			log.info("Guitar " + guitar.getMark().name() + " " + guitar.getName());
		}
	}
}
