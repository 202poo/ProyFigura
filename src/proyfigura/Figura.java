package proyfigura;

import java.applet.*;
import java.awt.*;
/*********************************************************/
/* LA CLASE FIGURA ES ABSTRACTA O SEA QUE NO SE PUEDEN   */
/* CREAR OBJETOS DE DICHA CLASE ,Y SIRBE PARA AGRUPAR    */
/* METODOS Y ATRIBUTOS COMUNES PARA LAS CLASES HIJAS     */
/* EN ESTE CASO TODAS LAS CLASES HIJAS DEBEN IMPLEMENTAR */
/* EL METOD PINTAR                                       */
/********************************************************/
abstract  class Figura 
{
  private int x,y;
  private Color colorFondo,colorBorde;

  public Figura( int x, int y, Color colorFondo, Color colorBorde)
  {
  	this.x = x;
  	this.y = y;
  	this.colorFondo=colorFondo;
  	this.colorBorde=colorBorde;
  }
  public int obtenerX()
  {
  	return x;
  }
  public int obtenerY()
  {
  	return y;
  }
  public Color obtenerColorFondo()
  {
    return colorFondo;
  }
  public Color obtenerColorBorde()
  {
    return colorBorde;
  }
  
  //****************************************************
  // METODO ABSTRACTO QUE DEBE SER IMPLEMENTADO POR
  // TODAS LAS CLASES CONCRETAS QUE HEREDEN DE FIGURA
  //****************************************************	
  abstract void pintar(Graphics g);
 
}
