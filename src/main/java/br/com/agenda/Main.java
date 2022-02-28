package br.com.agenda;

import br.com.agenda.Model.*;
import br.com.agenda.Repositorio.*;

import javax.lang.model.util.ElementScanner6;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.LocalDateTime.now;

public class Main {

    public static void main(String[] args) {

        AgendaDao cv = new AgendaDao();

        BigDecimal bigDecimal = new BigDecimal("2.0");
        Convenio convenio = new Convenio("Particular",bigDecimal);
        convenio.setId(1L);
        Especialidade especialidade = new Especialidade("Clinico Geral");
        especialidade.setId(1L);
        LocalDateTime data = now();
        Paciente paciente = new Paciente("Vitor Adams","01425668950","143504786","85853600","45991317498","vitor@email.com","vitor.da","12345","Brasileiro", Sexo.masculino, TipoAtendimento.convenio,convenio,"12345",data);
        Medico medico = new Medico("Vitor","01425668950","143504786","85853600","45991317498","vitor@email.com","vitor.da","123","Brasileiro", Sexo.masculino,especialidade,"333dsd",bigDecimal,"teste");
        Secretaria secretaria = new Secretaria("Vitor","01425668950","143504786","85853600","45991317498","vitor@email.com","vitor.da","123","Brasileiro", Sexo.masculino,bigDecimal,data,"3344325235");
        paciente.setId(7L);
        medico.setId(1L);
        secretaria.setId(1L);
        Agenda agenda = new Agenda(paciente,medico,StatusAgendamento.pendente,data,true);
        agenda.setId(2L);
        Historico historico = new Historico(agenda,StatusAgendamento.pendente,paciente,secretaria,data,"teste");

        cv.disableAgendamento(agenda);

    }
}
