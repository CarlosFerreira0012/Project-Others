package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program1 {

	public static void main(String[] args) {

		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");//Formato p/ transformar String --> DataHora atraves do parametro passado. @
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//LocalDate, LocalDatetime e instante -->  Gera Padrao ISO8601
		
		LocalDate d01 = LocalDate.now(); //instancia o Agora. (2002-01-29)
		LocalDateTime d02 = LocalDateTime.now();//instancia  Agora + Hora. (2002-01-29T03:52:20.4865)
		Instant d03 = Instant.now();//instancia o Agora + Hora + Global.  (2002-01-29T21:00:18.4865Z)
		
		
		//                              parametro
		LocalDate d04 = LocalDate.parse("2022-07-20");// Padrao ISO8601 --> Data local
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");//
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");// Horario GMT 
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");//(Qual é o equivalente de 01:30:26-03:00 no horario de londres)
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);//Instanciou ele la em cima[Agora passou como argumento] "LocalDate d08 tem uma SOBREGARGA que aceita o segundo arfumento fmt1 de como eu vou interpretar o texto@
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);//Segundo Formato instanciado la em cima. fmt2
		//Poderia ser assim ::: LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm") );
		
		
		LocalDate d10 = LocalDate.of(2022, 07, 20);//instancia em Dia,Mês,Ano 
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);//instancia em Ano, Mes, Dia, Hora, Minuto
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
	}
}