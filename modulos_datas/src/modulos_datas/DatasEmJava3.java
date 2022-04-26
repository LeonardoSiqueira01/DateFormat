package modulos_datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatasEmJava3 {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
	System.out.println("Data Atual : "+ localDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
	System.out.println("Dia da Semana : "+ localDate.getDayOfWeek().name());
	System.out.println("Dia do Mês : "+ localDate.getDayOfMonth());
	System.out.println("Dia do Ano : "+ localDate.getDayOfYear());
	System.out.println("Numero do Mês do ano: "+localDate.getMonthValue());
	System.out.println("Mês do ano: "+localDate.getMonth());
	System.out.println("Ano : "+localDate.getYear());

	} 

}  
