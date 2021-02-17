package bandasderock;

public class Musico {
    private String nome;
    private String funcao;
    private int pontuacaoMusico;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
    
    public void setPontuacaoMusico(int pontos){
        this.pontuacaoMusico = pontos;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getFuncao(){
        return this.funcao;
    }
    
    public int getPontuacaoMusico(){
        return this.pontuacaoMusico;
    }
}
