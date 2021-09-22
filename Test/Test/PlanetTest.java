package Test;

import EksamensØvelser.model.Moon;
import EksamensØvelser.model.Planet;
import Test.OrbitalObjectConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @ParameterizedTest
    @ValueSource(ints =3)
    public void checkNumberFromSun(@ConvertWith(OrbitalObjectConverter.class) Planet planet){

        assertEquals(3,planet.getNumber());
    }

    @Test
    void testGetName() {
        //arrange
        Planet planet1 = new Planet("Earth", 5.97, 12.756, 3, 149.6, true, new ArrayList<>());
        Planet planet2 = new Planet("Mars", 67, 5.57, 4,  130.6, false, new ArrayList<>());
        //act
        String earth = planet1.getName();
        String mars = planet2.getName();
        //assert
        assertEquals("Earth", earth);
        assertEquals("Mars", mars);

    }

    @Test
    void testGetMass() {
        //arrange
        Planet planet1 = new Planet("Earth", 5.97, 12.756, 3,  149.6, true, new ArrayList<>());
        Planet planet2 = new Planet("Mars", 67, 5.57, 4,  130.6, false, new ArrayList<>());

        //act
        double earth = planet1.getMass();
        double mars = planet2.getMass();

        //assert
        assertEquals(5.97, earth);
        assertEquals(67, mars);
    }

    @Test
    void testGetDiameter() {
        //arrange
        Planet planet1 = new Planet("Earth", 5.97, 12.756, 3,  149.6, true, new ArrayList<>());
        Planet planet2 = new Planet("Mars", 67, 5.57, 4,  130.6, false, new ArrayList<>());

        //act
        double earth = planet1.getDiameter();
        double mars = planet2.getDiameter();

        //assert
        assertEquals(12.756, earth);
        assertEquals(5.57, mars);
    }


    @Test
    void testGetDistanceFromSun() {
        //arrange
        Planet planet1 = new Planet("Earth", 5.97, 12.756, 3,  149.6, true, new ArrayList<>());
        Planet planet2 = new Planet("Mars", 67, 5.57, 4, 130.6, false, new ArrayList<>());

        //act
        double earth = planet1.getDistanceFromSun10ToPower6Km();
        double mars = planet2.getDistanceFromSun10ToPower6Km();

        //assert
        assertEquals(149.6, earth);
        assertEquals(130.6, mars);
    }

    @Test
    void isHabitable() {
        //arrange
        Planet planet1 = new Planet("Earth", 5.97, 12.756, 3,  149.6, true, new ArrayList<>());
        Planet planet2 = new Planet("Mars", 67, 5.57, 4,  130.6, false, new ArrayList<>());

        //act
        boolean earth = planet1.isHabitable();
        boolean mars = planet2.isHabitable();

        //assert
        assertEquals(true, earth);
        assertEquals(false, mars);
    }


    @Test
    void testGetMoons(){
        Planet planet1 = new Planet("Earth", 5.97, 12.756, 3,  149.6, true, new ArrayList<>());
        Planet planet2 = new Planet("Mars", 67, 5.57, 4,  130.6, false, new ArrayList<>());

        //act
        Moon luna = new Moon("Luna",0.073, 3475, 3.1, planet1.getName());
        planet1.getMoons().add(luna);

        Moon phobos = new Moon("Phobos", 1.10, 5.6, 4.1, planet2.getName());
        Moon deimos = new Moon("Deimos", 3.32, 24, 4.2, planet2.getName());
        planet2.getMoons().add(phobos);
        planet2.getMoons().add(deimos);

        //assert
        assertEquals(1, planet1.getMoons().size());
        assertEquals(2, planet2.getMoons().size());
    }

}