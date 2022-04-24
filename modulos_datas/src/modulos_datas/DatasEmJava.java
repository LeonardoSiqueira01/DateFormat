package modulos_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		Calendar calendar =  Calendar.getInstance();
		
		Date date = new Date();
		System.out.println("Data em Milisegundos: "+date.getTime());
		System.out.println("Calendar em milisegundos: "+calendar.get(calendar.MILLISECOND));
		System.out.println("Dia do mes : "+date.getDate());
		System.out.println("Dia do mes em calendar : "+calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Calendar semana em semana: " +calendar.getWeeksInWeekYear());
		System.out.println("Hora do dia: "+date.getHours());
		System.out.println("Calendar Hora do dia: "+calendar.get(calendar.HOUR_OF_DAY));
		System.out.println("calendar dia do ano : "+calendar.get(calendar.DAY_OF_YEAR));
		System.out.println("Mes do ano: "+date.getMonth());
		System.out.println("Dia da semana: "+date.getDay());
		System.out.println("Minuto da hora: "+date.getMinutes());
		System.out.println("Calendar Minuto da hora: " + calendar.get(calendar.MINUTE));
		System.out.println("Ano atual - 1900 anos: "+date.getYear());
		System.out.println("Calendar ano : "+ calendar.get(calendar.YEAR));

/* -------------------- SIMPLE DATE FORMAT ---------------------*/
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");

		System.out.println("Data a patir do simple date format = " + simpleDateFormat.format(date));
		System.out.println("Calendar Data a patir do simple date format = " +simpleDateFormat.format(calendar.getTime()));
		System.out.println("Data em formato para Banco de Dados : "+simpleDateFormat2.format(date));
		System.out.println("DATA e hora : "+ simpleDateFormat.format(date));
		System.out.println("Objeto Date:"+ simpleDateFormat.parse("1987-10-18 20:10.2"));
	}
}
