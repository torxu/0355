
/**
 * Write a description of class DisplayHoraYFecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayHoraYFecha
{
    private NumberDisplay horas;
    private NumberDisplay minutos;
    private DisplayDosDigitos dia;
    private DisplayDosDigitos mes;
    private DisplayDosDigitos año;

    /**
     * Constructor for objects of class DisplayHoraYFecha
     */
    public DisplayHoraYFecha()
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        dia = new DisplayDosDigitos(31);
        mes = new DisplayDosDigitos(13);
        año = new DisplayDosDigitos(100);
    }
    
    public void avanzarMomento()
    {
        minutos.increment();
        if(minutos.getValue() == 0){
           horas.increment();
           if(horas.getValue() == 0 && minutos.getValue() == 0){
            dia.incrementaValor();
            if (dia.getValor() == 1);{
                mes.incrementaValor();
                if(mes.getValor() == 1);{
                    año.incrementaValor();
                }
            }
           }
        }
        
    }
    
    public void setMomento(int h, int m, int di, int me, int añ)
    {
       horas.setValue(h);
       minutos.setValue(m);
       dia.setValor(di);
       mes.setValor(me);
       año.setValor(añ);
    }
    
    public String getMomento()
    {
        return horas.getDisplayValue()+":"+minutos.getDisplayValue()+" "+dia.getValorDelDisplay()+"/"+mes.getValorDelDisplay()+"/"+año.getValorDelDisplay();
    }
}
