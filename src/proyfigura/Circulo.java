package proyfigura;

import java.applet.*;
import java.awt.*;
/************************************************************/
/* LA CLASE Circulo HEREDA DE FIGURA, NOTE QUE ESTA CLASE   */
/* ES UNA CLASE CONCRETA PUES NO SE DECLARO ABSTRACTA.      */
/* O SEA QUE SI SE PUEDEN CREAR OBJETOS DE LA CLASE Circulo.*/
/* DEMAS COMO HEREDA DE FIGURA DEBE IMPLEMENTAR EL METODO   */
/* PINTAR QUE EN ESTE CASO PINTA UN  Circulo.               */                                 
/************************************************************/

public class Circulo extends Figura
{
 int radio;
    /************************************************************/
   /* CONSTRUCTOR DE LA CLASE Circulo QUE RECIBE LOS ARGUMENTOS*/
   /* X,Y,RADIO Y COLOR Y LOS ASIGNA A LOS ATRIBUTOS APROPIADOS*/
   /************************************************************/

 public Circulo(int x1, int y1,int radio1,Color color1)
  {
  	super(x1,y1,color1,Color.red);
  
   radio=radio1;
   
  }
   /************************************************************/
   /* ESTE METODO PINTA EL Circulo EN EL OBJETO GRAFICO        */
   /* QUE RECIBE COMO ARGUMENTO                                */
   /************************************************************/

  public void pintar(Graphics g)
  {
   g.setColor(obtenerColorFondo());
   g.fillRoundRect(obtenerX(),obtenerY(),radio,radio,radio,radio);
   g.setColor(obtenerColorBorde());
   g.drawRoundRect(obtenerX(),obtenerY(),radio,radio,radio,radio);
  }
}




