package musicshop.endpoint;

import musicshop.domain.MusicItemsPackage;
import musicshop.domain.item.Guitar;
import org.apache.log4j.Logger;

import java.util.List;

public class GuitarSplitter {

	private static final Logger LOGGER = Logger.getLogger(GuitarSplitter.class);

	public List<Guitar> splitGuitars(final MusicItemsPackage musicItemsPackage) {
		LOGGER.info("-----GuitarSplitter-----");
		return (List<Guitar>) musicItemsPackage.getItems();
	}
}
