package musicshop.run;

import musicshop.domain.MusicItemsPackage;
import musicshop.domain.item.Guitar;
import musicshop.domain.item.GuitarMark;
import musicshop.endpoint.MusicItemsPackageGateway;
import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by marcin.bracisiewicz
 */
public class MusicShopXML {

    private static final Logger LOGGER = Logger.getLogger(MusicShopXML.class);

    public static void main(String[] args) {
        final AbstractApplicationContext context = new ClassPathXmlApplicationContext("/context.xml", MusicShopXML.class);

        LOGGER.info("--------------------MusicShopXML-------------------------");
        final MusicItemsPackage musicItemsPackage = prepareGuitarPackage();
        final MusicItemsPackageGateway musicItemsPackageGateway =
                (MusicItemsPackageGateway) context.getBean("musicItemsPackageGateway");

        musicItemsPackageGateway.gatherMusicItemPackage(musicItemsPackage);

        context.close();
    }

    private static MusicItemsPackage prepareGuitarPackage() {
        final Guitar guitar1 = new Guitar(GuitarMark.GIBSON, "SG 400");
        final Guitar guitar2 = new Guitar(GuitarMark.GIBSON, "Les Paul Classic");
        final Guitar guitar3 = new Guitar(GuitarMark.FENDER, "Telecaster");

        final List<Guitar> guitars = new ArrayList<Guitar>(Arrays.asList(guitar1, guitar2, guitar3));

        final MusicItemsPackage musicItemsPackage = new MusicItemsPackage();
        musicItemsPackage.setItems(guitars);

        return musicItemsPackage;
    }
}
