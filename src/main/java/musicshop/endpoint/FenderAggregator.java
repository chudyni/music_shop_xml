package musicshop.endpoint;

import musicshop.domain.MusicItemsPackage;
import musicshop.domain.item.Fender;
import org.apache.log4j.Logger;
import org.springframework.messaging.Message;

import java.util.List;

public class FenderAggregator {
	
	private static final Logger log = Logger.getLogger(FenderAggregator.class);

	public MusicItemsPackage completeFenders(final List<Fender> fendersList) {
		log.info("Completing all Fender guitars");
		
		final MusicItemsPackage itemsPackage = new MusicItemsPackage();
		itemsPackage.setItems(fendersList);
		itemsPackage.setName("Fender package");
		return itemsPackage;
	}

	public boolean releaseChecker(List<Message<?>> messages) {
		return messages.size() >= 1;
	}
}
