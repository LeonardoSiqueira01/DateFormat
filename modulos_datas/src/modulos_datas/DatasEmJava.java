package modulos_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	public static void main(String[] args) throws ParseException{
		
		Date dateInicial = new SimpleDateFormat("dd/MM/yyyy").parse("08/04/2022");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateInicial);
		
		for (int parcela = 1 ; parcela <=12; parcela ++) {
			calendar.add(calendar.MONTH, 1);
			System.out.println("Parcela Número : "+parcela+ " vencimento é em : "+ new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		}
	}

}