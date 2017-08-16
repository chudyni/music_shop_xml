package musicshop.endpoint;

import musicshop.domain.MusicItemsPackage;
import musicshop.domain.item.Guitar;
import musicshop.domain.item.MusicItem;
import org.apache.log4j.Logger;

import java.util.List;

public class MusicItemPackageFilter {
	
	private static final Logger LOGGER = Logger.getLogger(MusicItemPackageFilter.class);

	public boolean guitarsOnly(final MusicItemsPackage musicItemsPackage) {
		LOGGER.info("---MusicItemPackageFilter---");
		final List<? extends MusicItem> itemsList = musicItemsPackage.getItems();
		for(MusicItem item : itemsList) {
			if(!this.isGuitar(item)) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isGuitar(final MusicItem item) {
		return item instanceof Guitar;
	}
}
