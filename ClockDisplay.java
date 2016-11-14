
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay minutos;
    
    private NumberDisplay horas;

    public ClockDisplay()
    {
        minutos = new NumberDisplay(60);
        horas = new NumberDisplay(24);
    }
    
    public void fijarHora(int m, int h)
    {
        minutos.setValue(m);
        horas.setValue(h);
    }
    
    public void avanzarMinuto()
    {
        minutos.increment();
            if(minutos.getValue() == 0){
                horas.increment();
            }
    }
    
    public String verHora()
    {
        return horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
}