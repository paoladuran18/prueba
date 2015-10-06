import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Interes
{
	public static void main( String args[] )
	{
		double cantidad;
		double principal = 1000.0;
		double tasa = 0.05;

		NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance( Locale.US );

		JTextArea areaTextoSalida = new JTextArea(); // crea JTextArea para mostrar la salida
		areaTextoSalida.setText( "Año\tCantidad en depósito\n" );

		for (int anio = 1; anio <= 10; anio++)
		{
			cantidad = principal * Math.pow( 1.0 + tasa, anio );
			areaTextoSalida.append( anio + "\t" + formatoMoneda.format( cantidad ) + "\n" ); //anexa una linea de texto a areaTextoSalida
		}

		JOptionPane.showMessageDialog( null, areaTextoSalida, "Interés compuesto", JOptionPane.INFORMATION_MESSAGE );

		System.exit( 0 );
	}
}