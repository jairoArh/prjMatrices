package logic;

import java.util.Random;

public class HandlingMatriz {
	private int[][] matriz;

	public HandlingMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	public HandlingMatriz(int rows, int cols) {
		matriz = new int[rows][cols];
	}

	public void loadValues() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = new Random().nextInt(491) + 10;
			}
		}
	}

	public String showMatriz() {

		StringBuilder matrizOut = new StringBuilder();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matrizOut.append(matriz[i][j] + "\t");
			}
			matrizOut.append("\n");
		}

		return matrizOut.toString();
	}

	/**
	 * Método que retorna si la matriz es mágica
	 * 
	 * @return Verdadero si la matriz es mágica, falso si no lo es
	 */
	public boolean isMagic() {
		// TODO responsable Andrés David

		return false;
	}

	/**
	 * Método que suma una fila dada
	 * 
	 * @param row especifica el número de fila a sumar
	 * @return la suma de los elementos de la fila especificada, si la fila está
	 *         fuera de rango, retorna -1
	 */
	public int sumRows(int row) {
		// TODO responsable Valentina vega

		return 0;

	}

	/**
	 * Método que suma una columna dada
	 * 
	 * @param col especifica el número de columna a sumar
	 * @return la suma de los elementos de la fila especificada, si la columna está
	 *         fuera de rango, retorna -1
	 */
	public int sumCol(int col) {
		// TODO responsable Valentina vega

		return 0;

	}

	/**
	 * Método que suma los elementos de la diagonal principal
	 * 
	 * @return la suma de los elementos, si no se puede retorna -1
	 */
	public int getMainDiag() {
		// TODO responsable Juan David

		int row = matriz.length;
		int columns = matriz[0].length;
		int suma = 0;
s
		if (row == columns) {
			for (int i = 0; i < matriz.length; i++) {

				for (int j = 0; j < matriz[i].length; j++) {
					if (i == j) {
						suma += matriz[i][j];
					}
				}
			}

		} else {
			return -1;
		}

		return suma;
	}

	/**
	 * Método que calcula la diagonal secundaria
	 * 
	 * @return la suma de los elementos de la diagonal secundaria. Si no se puede
	 *         retorna -1
	 */
	public int getSecDiag() {

		int row = matriz.length;
		int colums = matriz[0].length;
		int suma = 0;
		if (row == colums) {

			for (int i = 0; i < matriz.length; i++) {

				for (int j = 0; j < matriz[i].length; j++) {
					if (i + j == matriz.length - 1) {
						suma += matriz[i][j];
					}
				}
			}

		} else {

			return -1;
		}

		return suma;
	}

	}

	/**
	 * Método que calcula la multiplicación de dos matrices
	 * 
	 * @param mat especifica la matriz con la cual se va a multiplicar la matriz de
	 *            la clase
	 * @return una matriz con el resultado de la multiplicación de las dos matrices.
	 *         Si no se puede, retorna null
	 */

	public int[][] multMatriz(int[][] mat) {
		// TODO responsable Bibian

		return null;
	}

	/**
	 * Método que retorna la traspuesta de la matriz
	 * 
	 * @return un arreglo bidimensional con la traspuesta de la matriz
	 */
	public int[][] getTranspuesta() {
		// TODO responsable Alejandro Huerfano
		return null;
	}

	/**
	 * Método que suma dos matrices del mismo orden
	 * 
	 * @param mat especifica la matriz con la que se va a sumar la matriz de la
	 *            clase,
	 * @return un arreglo de dos dimensiones con la suma de la matriz, si no son del
	 *         mismo orden retorna null
	 */
	public int[][] sumMatriz(int[][] mat) {
		// TODO responsable Juan Steban

		return null;
	}

	/**
	 * Método que calcula la inversa de la matriz.
	 * 
	 * @return un arreglo de dos dimensiones con la inversa de la matriz, si no se
	 *         puede retorna null
	 */
	public int[][] getInversa() {
		// TODO responsable Jean Carlos

		return null;
	}

	public int[][] generateMagic(int size) {

		return size % 2 == 0 ? magicPair() : magicOdd();
	}

	/**
	 * Método que genera una matriz mágica de orden par
	 * 
	 * @return arreglo de dos dimensiones con la matriz mágica
	 */
	private int[][] magicPair() {
		// TODO responsable Camila Figueredo

		return null;
	}

	/**
	 * Método que calcula una matriz mágica de orden impar
	 * 
	 * @return arreglo de dos dimensiones con la matriz mágica
	 */

	private int[][] magicOdd() {
		// TODO responsable Laura

		return null;
	}

}
