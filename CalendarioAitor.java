
public class CalendarioAitor
{   
    private DisplayDosDigitos dia;
    
    private DisplayDosDigitos mes;
    
    private DisplayDosDigitos año;

    public CalendarioAitor()
    {
       dia = new DisplayDosDigitos(31);
       mes = new DisplayDosDigitos(13);
       año = new DisplayDosDigitos(100);   
    }
    
    public void fijarFecha(int d, int m, int a)
    {
      dia.setValor(d);
      mes.setValor(m);
      año.setValor(a);
    }
    
    public void avanzarFecha()
    {
       dia.incrementaValor();
        if(dia.getValor() == 1){
            mes.incrementaValor();
            if(mes.getValor() == 1){
                    año.incrementaValor();
                }
            }
    }
    
    public String mostrarFecha()
    {
       return dia.getValorDelDisplay() + "-" + mes.getValorDelDisplay() + "-" + año.getValorDelDisplay();
    }            
}