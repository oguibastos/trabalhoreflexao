class Avo extends Pessoa {

    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String getTipoVoz() {
        return "Voz experiente";
    }
}