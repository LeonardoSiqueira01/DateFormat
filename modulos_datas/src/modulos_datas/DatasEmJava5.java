package modulos_datas;

import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava5 {
 public static void main(String[] args) {
	/*LocalDate dataAntiga = LocalDate.of(2020, 3, 7);
	LocalDate dataNova = LocalDate.of(2022, 4, 26);*/
	LocalDate dataAntiga = LocalDate.parse("2020-03-07");
	LocalDate dataNova = LocalDate.parse("2022-04-26");
	System.out.println("Data Antiga é maior que data nova: " +dataAntiga.isAfter(dataNova));
	
	System.out.println("Data Antiga é anterior a data nova: " +dataAntiga.isBefore(dataNova));
	
	System.out.println("Datas são iguais : " +dataAntiga.isEqual(dataNova));
	
	Period periodo = Period.between(dataAntiga, dataNova);
	System.out.println("Quantidade de dias :"+periodo.getDays());
	System.out.println("Quantos meses :"+periodo.getMonths());
	System.out.println("Quantos anos :"+periodo.getYears());
	System.out.println("Periodo é : "+periodo.getYears()+" Anos "
	+periodo.getMonths()+" Mes e "+periodo.getDays()+" Dias.");
	System.out.println("Total de meses: "+periodo.toTotalMonths());
}
}
