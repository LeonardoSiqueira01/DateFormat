package modulos_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
	Calendar calendar = Calendar.getInstance(); /*Pega a Data Atual*/
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-04-2022"));
		
		calendar.add(Calendar.DAY_OF_MONTH, 5);/*Data de hoje mais 5 dias*/
		System.out.println("Somando o dia do m�s: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 1);
		System.out.println("Somando M�s : " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 1);
		System.out.println("Somando ano : " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}
}
