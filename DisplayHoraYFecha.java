
/**
 * Write a description of class DisplayHoraYFecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayHoraYFecha
{
    // instance variables - replace the example below with your own
    private ClockDisplay reloj;
    private CalendarioAitor fecha;
    private CalendarioAitor momento;
    private NumberDisplay horas;
    private NumberDisplay minutos;

    /**
     * Constructor for objects of class DisplayHoraYFecha
     */
    public DisplayHoraYFecha()
    {
        fecha = new CalendarioAitor();
        reloj = new ClockDisplay();
    }
    
    public void avanzarMomento()
    {
        reloj.avanzarMinuto();
        if(horas.getValue() == 0 && minutos.getValue() == 0){
            fecha.avanzarFecha();
        }
    }
}
