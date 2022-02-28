package br.com.agenda.Model;

import java.time.LocalDateTime;

public class Agenda extends AbstractEntity {

    private Paciente paciente;
    private Medico medico;
    private StatusAgendamento statusAgendamento;
    private LocalDateTime dataAgendamento;
    private Boolean encaixe;

    public Agenda() {
    }

    public Agenda(Paciente paciente, Medico medico, StatusAgendamento statusAgendamento, LocalDateTime dataAgendamento, Boolean encaixe) {
        this.paciente = paciente;
        this.medico = medico;
        this.statusAgendamento = statusAgendamento;
        this.dataAgendamento = dataAgendamento;
        this.encaixe = encaixe;
    }

    public Agenda(Long id, LocalDateTime cadastro, LocalDateTime atualizado, LocalDateTime excluido, Paciente paciente, Medico medico, StatusAgendamento statusAgendamento, LocalDateTime dataAgendamento, Boolean encaixe) {
        super(id, cadastro, atualizado, excluido);
        this.paciente = paciente;
        this.medico = medico;
        this.statusAgendamento = statusAgendamento;
        this.dataAgendamento = dataAgendamento;
        this.encaixe = encaixe;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public StatusAgendamento getStatusAgendamento() {
        return statusAgendamento;
    }

    public void setStatusAgendamento(StatusAgendamento statusAgendamento) {
        this.statusAgendamento = statusAgendamento;
    }

    public LocalDateTime getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(LocalDateTime dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public Boolean getEncaixe() {
        return encaixe;
    }

    public void setEncaixe(Boolean encaixe) {
        this.encaixe = encaixe;
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "paciente=" + paciente +
                ", medico=" + medico +
                ", statusAgendamento=" + statusAgendamento +
                ", dataAgendamento=" + dataAgendamento +
                ", encaixe=" + encaixe +
                '}';
    }
}
