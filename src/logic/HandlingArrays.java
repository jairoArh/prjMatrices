package logic;

import java.util.Arrays;
import java.util.Random;

public class HandlingArrays {

    private String[] myArray;
    private int position;

    private TypeSort typeSort;

    public HandlingArrays() {
        myArray = new String[10];
        position = 0;
    }

    public HandlingArrays(int dimension) {
        myArray = new String[dimension];
        position = 0;
        myArray = loadElements();
    }

    public HandlingArrays(String[] myArray) {
        this.myArray = myArray;
        position = myArray.length;
    }

    private String[] loadElements(){
        String[ ] array = new String[myArray.length];

        for( int index = 0 ; index < array.length ; index++ ){
            String character = Character.toString(new Random().nextInt(75)+48);
            array[index] = character;
            position++;
        }

        return array;
    }

    public void addElement(String element){
        if( position < myArray.length ){
            myArray[position++] = element;
        }else{
            myArray = ensureCapacity(element);
        }
    }

    private String[] ensureCapacity(String element){

        int newSize = myArray.length / 2 + myArray.length;

        String[] newArray = new String[newSize];

        newArray = Arrays.copyOf( myArray,newSize );

        newArray[position++] = element;


        return newArray;
    }

    /**
     * Método que busca un elemento en el arreglo, usa una búsqueda secuencial
     * @param element El elemento a buscar
     * @return La posición del primer elemento que encuentra
     */
    public int findElement(String element){

        for( int index = 0 ; index < position ; index++ ){
            if ( element.equals( myArray[index] ) ){

                return index;
            }
        }

        return -1;
    }

    /**
     * Método que permite eliminar un elemento
     * @param element especifica el elemento a eliminar
     * @return el elemento que se elimina
     */
    public String deleteElement(String element){

        int posDelete = findElement( element );

        if( posDelete != -1 ){
            for( int index = posDelete ; index < position -  1 ; index++ ){
                String aux = myArray[index];
                myArray[index] = myArray[ index + 1];
                myArray[ index + 1] = aux;
            }

            position--;

            return element;
        }

        return null;
    }

    public String updateElement(String element, int pos){

        return null;
    }

    public String[] getMyArray(){

        String[ ] newArray = new String[position];
        for( int index = 0 ; index < position ; index++ ){
            newArray[index] = myArray[index];
        }

        return newArray;
    }

    private String[] sortBurble(){

        String[] sorted = getMyArray();

        for( int pivot = position ; pivot >= 1 ; pivot-- ){
            for( int index = 0 ; index < pivot - 1 ; index++ ){
                if( sorted[index].compareTo( sorted[index + 1]) > 0 ){
                    String aux = sorted[index];
                    sorted[index] = sorted[ index + 1];
                    sorted[ index + 1] = aux;
                }
            }
        }

        return sorted;
    }

    private String[] sortSelection(){

        return null;
    }

    private String[] sortInsertion(){

        return null;
    }

    private String[] sortShell(){

        return null;
    }

    public String[] sort(TypeSort typeSort){

        switch ( typeSort ){
            case BURBLE : return sortBurble();

            case SELECTION: return sortSelection();

            case INSERTION: return sortInsertion();

            default: return sortShell();
        }
    }

    public int findBinary(String element){

        String[] arrayFind = sortBurble();
        int medium = 0;
        int begin = 0;
        int end = arrayFind.length - 1;
        while( begin <= end ){
            medium = ( begin + end ) / 2;
            if( arrayFind[medium].equals( element)){
                return medium;
            }else{
                if( arrayFind[medium].compareTo(element) > 0 ){
                    end = medium - 1 ;
                }else{
                    begin = medium + 1;
                }
            }
        }

        return -1;
    }

    public String getElement( int pos ){

        return null;
    }



}
