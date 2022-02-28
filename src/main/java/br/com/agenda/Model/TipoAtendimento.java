package br.com.agenda.Model;

public enum TipoAtendimento {
    plano("Plano"),
    convenio("Convenio");

    public final String valor;

    private TipoAtendimento(String valor){
        this.valor = valor;
    }
}
