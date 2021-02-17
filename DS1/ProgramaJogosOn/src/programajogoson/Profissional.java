package programajogoson;

import java.util.ArrayList;

public class Profissional extends Jogador{
    private ArrayList<Jogos> jogos;
    private double pontuacaoRanking;
    
    public Profissional(){
        this.jogos = new ArrayList();
    }
    
    public ArrayList<Jogos> getJogos() {
        return jogos;
    }

    public void setJogos(ArrayList<Jogos> jogos) {
        this.jogos = jogos;
    }
 
    public void setJogo(Jogos jogo){
        if(this.idade >= jogo.getIndicacao()){
            this.jogos.add(jogo);
            this.pontuacaoRanking += 50;
        }
    }
    
    public double getPontucao(){
        return this.pontuacaoRanking;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getTipoJogador() {
        return tipoJogador;
    }
    
}
