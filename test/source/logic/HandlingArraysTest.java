package logic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HandlingArraysTest {
    private HandlingArrays handlingArrays;

    void setupOne(){
        handlingArrays = new HandlingArrays();
    }

    void setupTwo(){
        handlingArrays = new HandlingArrays(15);
    }

    void setupThree(){
        handlingArrays = new HandlingArrays( new String[]{"234","d","T","Yess"});
    }

    @Test
    void addElement() {
        setupOne();
        assertEquals(10, handlingArrays.getMyArray().length);
        handlingArrays.addElement("56");
        handlingArrays.addElement("JG");
        handlingArrays.addElement("Sogamoso");
        String[] array = handlingArrays.getMyArray();
        assertEquals("JG",array[1]);

        setupThree();
        handlingArrays.addElement("560");
        assertEquals( 6,handlingArrays.getMyArray().length);
        assertEquals("560",handlingArrays.getMyArray()[4]);
        handlingArrays.addElement("Tia");
        String[] arrayAux = new String[]{"234","d","T","Yess","560","Tia"};
        assertArrayEquals(arrayAux,handlingArrays.getMyArray());

        setupTwo();
        handlingArrays.addElement("Sol");
        assertEquals(22,handlingArrays.getMyArray().length);
        assertEquals("Sol",handlingArrays.getMyArray()[15]);
    }

    @Test
    void findElement() {
        //["234","d","T","Yess"]
        setupThree();
        assertEquals(0,handlingArrays.findElement("234"));
        assertEquals(1,handlingArrays.findElement("d"));
        assertEquals(2,handlingArrays.findElement("T"));
        assertEquals(3,handlingArrays.findElement("Yess"));
        assertEquals(-1,handlingArrays.findElement("635"));
        handlingArrays.addElement("635");
        assertEquals(4,handlingArrays.findElement("635"));
    }

    @Test
    void deleteElement() {
        //["234","d","T","Yess"]
        setupThree();
        assertEquals("234",handlingArrays.deleteElement("234"));
        //["d","T","Yess","234"],  position=3
        assertEquals(-1,handlingArrays.findElement("234"));
        assertEquals("d",handlingArrays.getMyArray()[0]);
        assertEquals("Yess",handlingArrays.getMyArray()[2]);
        handlingArrays.deleteElement("Yess");
        assertArrayEquals(new String[]{"d","T"},handlingArrays.getMyArray());
        handlingArrays.addElement("424");
        //["d","T","424","Yess"]
        assertEquals(2,handlingArrays.findElement("424"));
    }

    @Test
    void updateElement() {
    }

    @Test
    void getMyArray() {
    }

    @Test
    void sort() {
        handlingArrays = new HandlingArrays(new String[]{"100","45","12","56","06","725","627"});
        //Ordenado -> ["06","100","12","45","56","627","725"]
        String[] sorted = handlingArrays.sort( TypeSort.BURBLE );
        assertEquals("06",sorted[0]);
        assertEquals("100",sorted[1]);
        assertEquals("12",sorted[2]);
        assertEquals("725",sorted[6]);
        assertArrayEquals(new String[]{"06","100","12","45","56","627","725"},sorted);
        handlingArrays.deleteElement("45");
        //["100","12","56","06","725","627"]
        handlingArrays.deleteElement("100");
        //["12","56","06","725","627"]
        handlingArrays.addElement("034");
        handlingArrays.addElement("69");
        handlingArrays.addElement("523");
        handlingArrays.addElement("232");
        //["12","56","06","725","627","034","69","523","232"]
        sorted = handlingArrays.sort(TypeSort.SELECTION);
        //["034","06","12","232","523","56","627","69","725"]
        assertEquals("034",sorted[0]);
        assertEquals("06",sorted[1]);
        assertEquals("12",sorted[2]);
        assertEquals("232",sorted[3]);
        assertEquals("523",sorted[4]);
        assertEquals("725",sorted[8]);
        assertArrayEquals(new String[]{"034","06","12","232","523","56","627","69","725"},sorted);
    }

    @Test
    void findBinary() {
        handlingArrays = new HandlingArrays(new String[]{"034","006","012","232","523","056","627","069","725"});
        //["006","012","034","056","069","232","523","627","725"]
        assertEquals( 0, handlingArrays.findBinary("006"));
        assertEquals( 1, handlingArrays.findBinary("012"));
        assertEquals( 2, handlingArrays.findBinary("034"));
        assertEquals( 3, handlingArrays.findBinary("056"));
        assertEquals( 4, handlingArrays.findBinary("069"));
        assertEquals( 5, handlingArrays.findBinary("232"));
        assertEquals( 6, handlingArrays.findBinary("523"));
        assertEquals( 7, handlingArrays.findBinary("627"));
        assertEquals( 8, handlingArrays.findBinary("725"));
        assertEquals( -1, handlingArrays.findBinary("4444"));
        assertEquals( -1, handlingArrays.findBinary("2232"));
    }

    @Test
    void getElement() {
    }
}