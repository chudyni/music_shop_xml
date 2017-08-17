package musicshop.endpoint;

import musicshop.domain.MusicItemsPackage;
import musicshop.domain.item.Gibson;
import org.apache.log4j.Logger;
import org.springframework.messaging.Message;

import java.util.List;

public class GibsonAggregator {
	
	private static final Logger log = Logger.getLogger(GibsonAggregator.class);

	public MusicItemsPackage completeGibsons(List<Gibson> gibsonList) {
		log.info("Completing all Gibson guitars");
		
		final MusicItemsPackage itemsPackage = new MusicItemsPackage();
		itemsPackage.setItems(gibsonList);
		itemsPackage.setName("Gibson package");
		return itemsPackage;
	}

	public boolean releaseChecker(List<Message<?>> messages) {
	    return messages.size() >= 2;
	}

}
