package modulos_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava6 {

	public static void main(String[] args) {
		LocalDate dataBase = LocalDate.parse("2020-05-10");
		System.out.println("Data Base : "+dataBase);
		System.out.println("Mais 5 dias: "+(dataBase = dataBase.plusDays(5)));
		System.out.println("Mais 5 semanas:"+(dataBase = dataBase.plusWeeks(5)));
		System.out.println("Mais 5 meses:"+(dataBase = dataBase.plusMonths(5)));
		System.out.println("Mais 5 anos: "+(dataBase = dataBase.plusYears(5)));
		
		System.out.println("Menos 1 ano : "+(dataBase = dataBase.minusYears(1)));
		System.out.println("Menos 1 mes : "+(dataBase = dataBase.minusMonths(1)));
		System.out.println("Menos 20 Dias : "+(dataBase = dataBase.minusDays(20))); 
		
		
		for (int mes =1; mes<=12; mes ++) {
			dataBase = dataBase.plusMonths(1);
	
			System.out.println("Data de Vencimento do Boleto : "
					+dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do Mês "+ mes);
}
		
	}

}
