class Pai extends Pessoa {

    private String profissao;

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String getTipoVoz() {
        return "Voz decidida";
    }
}