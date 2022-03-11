package prueba_;

public class NoCambiaLongitud extends Valor {

    protected int valor;
    //metodo que modifica el contenido de la posicion p de un array con el valor pasado

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


    public void Visualizacion(int longitud, int[] vector) {
        //Mostramos los elementos del array
        System.out.print("v={");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }

    }
