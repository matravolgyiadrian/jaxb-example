package legoset;

import album.Album;
import jaxb.JAXBHelper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        LegoSet legoset = new LegoSet();
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);

        Set<String> tags = new HashSet<>();
        tags.add("Starfighter");
        tags.add("Stormtrooper  ");
        tags.add("Star Wars");
        tags.add("Solo");

        legoset.setTags(tags);

        List<Minifig> minifigures = new ArrayList<>();
        minifigures.add(new Minifig("Imperial Mudtrooper", 2));
        minifigures.add(new Minifig("Imperial Pilot", 1));
        minifigures.add(new Minifig("Mimban Stormtrooper", 1));

        legoset.setMinifigs(minifigures);
        legoset.setWeight(new Weight(0.89, "kg"));
        legoset.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");

        JAXBHelper.toXML(legoset, System.out);
    }
}
