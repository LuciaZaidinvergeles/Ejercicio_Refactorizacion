package prueba_;

public class CambiaLongitud extends Valor  {


    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    public void modificar(int[] vector, int LongitudActual, int posicion) {
        int i;
        final int longitud = vector.length;
        //Modificamos el array
        if (posicion < longitud) {
            System.out.println("Elemento a modificar=" + vector[posicion]);
            vector[posicion] = this.getValor();
        }
        //Mostramos los elementos del array
        Visualizacion(longitud, vector);
    }
    //metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos

    public void borrar(int[] vector, int LongitudActual, int posicion) {
        int i;
        final int longitud = vector.length;
        //Borramos el elemento
        if (posicion < longitud) {
            System.out.println("Elemento a borrar=" + vector[posicion]);
            for (i = posicion; i < longitud - 1; i++) {
                vector[i] = vector[i + 1];
            }
        }
        //Mostramos los elementos del array
        Visualizacion(longitud, vector);
    }
    //metodo que inserta un elemento en la posicion p desplazando a la derecha todos los elementos
    //metodo que inserta un elemento en la posicion p desplazando a la derecha todos los elementos

    public void insertar(int[] vector, int LongitudActual, int posicion) {
        int i;
        final int longitud = vector.length;
        //Borramos el elemento
        if (posicion < longitud) {
            System.out.println("Elemento a insertar=" + this.getValor());
            for (i = longitud - 1; i > posicion; i--) {
                vector[i] = vector[i - 1];
            }
            vector[posicion] = this.getValor();
        }
        Visualizacion(longitud, vector);
    }

}
