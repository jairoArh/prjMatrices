package logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandlingMatrizTest {

    @Test
    void isMagic() {
    }

    @Test
    void sumRows() {
    }

    @Test
    void sumCol() {
    }

    @Test
    void getMainDiag() {
    	HandlingMatriz handlingMatriz= new HandlingMatriz(new int [][]{{12,13,45},{4,5,6},{4,9,8}});
		assertEquals(25,handlingMatriz.getMainDiag());
		
		HandlingMatriz handlingMatriz2= new HandlingMatriz(new int [][]{{12,13},{4,5,6},{4,9,8}});
		assertEquals(-1,handlingMatriz2.getMainDiag());
    }

    @Test
    void getSecDiag() {
    	HandlingMatriz handlingMatriz= new HandlingMatriz(new int [][]{{12,13,44},{4,5,6},{4,9,8}});
		assertEquals(53,handlingMatriz.getSecDiag());
		
		HandlingMatriz handlingMatriz2= new HandlingMatriz(new int [][]{{12,13},{4,5,6},{4,9,8}});
		assertEquals(-1,handlingMatriz2.getSecDiag());
    }

    @Test
    void multMatriz() {
    }

    @Test
    void getTranspuesta() {
    }

    @Test
    void sumMatriz() {
    }

    @Test
    void getInversa() {
    }
}