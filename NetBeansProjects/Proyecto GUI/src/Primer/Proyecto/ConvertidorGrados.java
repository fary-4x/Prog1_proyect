
package Primer.Proyecto;

public class ConvertidorGrados {
     
    public int celciusAFarenheit(int celcius){
        int farenheit = (int)(celcius * 1.8 + 32);
        return farenheit;
    }
    public int farenheitACelcius (int farenheit){
        int celcius = (int)((farenheit - 32)/1.8);
        return celcius;
    }
}
