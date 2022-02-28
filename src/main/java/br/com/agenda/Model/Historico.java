package br.com.agenda.Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Historico extends AbstractEntity {

    private Agenda agenda;
    private StatusAgendamento statusAgendamento;
    private Paciente paciente;
    private Secretaria secretaria;
    private LocalDateTime data;
    private String observacao;

    public Historico() {
    }

    public Historico(Agenda agenda, StatusAgendamento statusAgendamento, Paciente paciente, Secretaria secretaria, LocalDateTime data, String observacao) {
        this.agenda = agenda;
        this.statusAgendamento = statusAgendamento;
        this.paciente = paciente;
        this.secretaria = secretaria;
        this.data = data;
        this.observacao = observacao;
    }

    public Historico(Long id, LocalDateTime cadastro, LocalDateTime atualizado, LocalDateTime excluido, Agenda agenda, StatusAgendamento statusAgendamento, Paciente paciente, Secretaria secretaria, LocalDateTime data, String observacao) {
        super(id, cadastro, atualizado, excluido);
        this.agenda = agenda;
        this.statusAgendamento = statusAgendamento;
        this.paciente = paciente;
        this.secretaria = secretaria;
        this.data = data;
        this.observacao = observacao;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public StatusAgendamento getStatusAgendamento() {
        return statusAgendamento;
    }

    public void setStatusAgendamento(StatusAgendamento statusAgendamento) {
        this.statusAgendamento = statusAgendamento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "br.com.agenda.Model.Historico{" +
                "agenda=" + agenda +
                ", statusAgendamento=" + statusAgendamento +
                ", paciente=" + paciente +
                ", secretaria=" + secretaria +
                ", data=" + data +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}
