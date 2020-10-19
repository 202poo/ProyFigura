package proyfigura;

import java.applet.*;
import java.awt.*;

/************************************************************/
/* LA CLASE Rectangulo HEREDA DE FIGURA, NOTE QUE ESTA CLASE  */
/* ES UNA CLASE CONCRETA PUES NO SE DECLARO ABSTRACTA.      */
/* O SEA QUE SI SE PUEDEN CREAR OBJETOS DE LA CLASE Rectangulo.*/
/* A DEMAS COMO HEREDA DE FIGURA DEBE IMPLEMENTAR EL METODO  */
/* PINTAR QUE EN ESTE CASO PINTA UN  Rectangulo.               */                                
/************************************************************/

public class Rectangulo extends Figura
{
 int ancho,alto;

   /*******************************************************************/
   /* CONSTRUCTOR DE LA CLASE Rectangulo QUE RECIBE LOS ARGUMENTOS      */
   /* X,Y,ANCHO,ALTO Y COLOR. Y  LOS ASIGNA A LOS ATRIBUTOS APROPIADOS*/
   /*******************************************************************/

 public Rectangulo(int x1, int y1,int ancho,int alto,Color color1)
  {
   super(x1,y1,color1,Color.blue);
   this.alto=alto;
   this.ancho=ancho;
   
  }
   /************************************************************/
   /* ESTE METODO PINTA EL RECTANGULO EN EL OBJETO GRAFICO     */
   /* QUE RECIBE COMO ARGUMENTO                                */
   /************************************************************/

  public void pintar(Graphics g)
  {
   g.setColor(obtenerColorFondo());
   g.fillRect(obtenerX(),obtenerY(),alto,ancho);
   g.setColor(obtenerColorBorde());
   g.drawRect(obtenerX(),obtenerY(),alto,ancho);
  }
}

