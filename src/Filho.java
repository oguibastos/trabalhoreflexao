class Filho extends Pessoa {

    private String escola;

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    public String getTipoVoz() {
        return "Voz enérgica";
    }
}