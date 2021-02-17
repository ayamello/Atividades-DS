package programajogoson;

public abstract class Jogador {
    protected String nome;
    protected int idade;
    protected String email;
    protected String tipoJogador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoJogador() {
        return tipoJogador;
    }

    public void setTipoJogador(String tipoJogador) {
        this.tipoJogador = tipoJogador;
    }
    
}
