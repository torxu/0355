public class DisplayDosDigitos
{
    // El valor limite que nunca alcanza el display y en el que vuelve a 1
    private int limite;
    // El valor actual que almacena el display
    private int valor;


    /**
     * Constructor de la clase DisplayDosDigitos
     *
     * @param limiteDisplay El valor máximo que ya no puede mostrar el display
     */
    public DisplayDosDigitos(int limiteDisplay)
    {
        limite = limiteDisplay;
        valor = 1;
    }

    /**
     * Devuelve el valor actual como número entero
     */
    public int getValor()
    {
        return valor;
    }

    /**
     * Devuelve el valor del display como cadena de caracteres de longitud 2
     */
    public String getValorDelDisplay()
    {
        if(valor < 10) {
            return "0" + valor;
        }
        else {
            return "" + valor;
        }
    }

    /**
     * Fija un nuevo valor para el display. Si el nuevo valor no es legal, 
     * entonces no hace nada.
     */
    public void setValor(int nuevoValor)
    {
        if((nuevoValor >= 1) && (nuevoValor < limite)) {
            valor = nuevoValor;
        }
    }

    /**
     * Incrementa el valor del display. Si llega al limite cambia a uno.
     */
    public void incrementaValor()
    {
        valor = valor + 1;
        if (valor == limite) {
            valor = 1;
        }
    }
}