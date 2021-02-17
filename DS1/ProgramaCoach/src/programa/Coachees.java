package programa;

public class Coachees {
    private String nome;
    private String areaDeInteresse;
    private String tipoDeAtendimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaDeInteresse() {
        return areaDeInteresse;
    }

    public void setAreaDeInteresse(String areaDeInteresse) {
        this.areaDeInteresse = areaDeInteresse;
    }

    public String getTipoDeAtendimento() {
        return tipoDeAtendimento;
    }

    public void setTipoDeAtendimento(int op) {
        if(op==1){
            this.tipoDeAtendimento = "Virtual";
        }
        else{
            this.tipoDeAtendimento = "Presencial";
        }
    }
    
    
    
}
