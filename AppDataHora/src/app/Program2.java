package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program2 {

	public static void main(String[] args) {
		
		LocalDate d12 = LocalDate.parse("2022-07-20");
		LocalDateTime d13 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d14 = Instant.parse("2022-07-20T01:30:26Z");
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		//Como eu quero minha formatação:
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//instant nao tem .format pq ele esta num fuso Global
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());//Considera fuso do usuario
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;//formata para LocalDate
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;//formata para Instant
		
		//iguais
		System.out.println("d12 = " + d12.format(fmt1)); 
		System.out.println("d12 = " + fmt1.format(d12));
		System.out.println("d12 = " + d12.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		//
		System.out.println("d13 = " + d13.format(fmt1)); // 20/07/2022
		System.out.println("d13 = " + d13.format(fmt2));//  20/07/2022 01:30
		System.out.println("d13 = " + d13.format(fmt4));//  2022-07-20T01:30:26
		
		//Tentar passar um .format(fmt1).format(fmt2)para o d14 --> Vai dar ERRO!!Pq eu tenho que instanciar um .DateTimeFormatter(global).
		System.out.println("d14 = " + fmt3.format(d14));//formatou d14 apartir do fmt3
		System.out.println("d14 = " + fmt5.format(d14));
		System.out.println("d14 = " + d14.toString());
	}
}