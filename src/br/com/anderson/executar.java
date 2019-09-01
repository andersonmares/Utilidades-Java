package br.com.anderson;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class executar {

    public static void main(String[] args) {

        //Apresentar a data atual
        LocalDate dataAtual= LocalDate.now();
        System.out.println("Data: " + dataAtual);

        //Apresentar a data e hora atual
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data e hora: " + dataHoraAtual);

        Instant instant = Instant.now();
        System.out.println("Usando o Instant: " + instant);

        //Data atual formatada
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Usando o format para passar a formatação informada acima
        System.out.println(localDate.format(formatter));

        //A data e hora atuais formatadas
        LocalDateTime dataFormatada = LocalDateTime.now();
        //Formatar Data e Hora para o padrão PT-BR
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT)
                .withLocale(new Locale("pt", "br"));

        System.out.println("Data e hora formatadas: " + dataFormatada.format(dateTimeFormatter));

    }

}
