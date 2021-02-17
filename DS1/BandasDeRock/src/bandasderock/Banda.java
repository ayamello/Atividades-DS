package bandasderock;

import java.util.ArrayList;

public class Banda {
    private String nome;
    private String origem;
    private String tipoRock;
    private int pontuacaoBanda;
    private ArrayList<Musico> musicos;
    
    public Banda(){
        this.musicos = new ArrayList<>();
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setOrigem(String local){
        this.origem = local;
    }
    
    public void setRockTipo(String tipo){
        this.tipoRock = tipo;
    }
    
    public void setPontuacaoBanda(){
        int pontos = 0;
        
        for (int i = 0; i < this.musicos.size(); i++) {
            pontos += this.musicos.get(i).getPontuacaoMusico(); //soma a pontuação de todos os músicos para formar a pontuação da banda           
        }
        this.pontuacaoBanda = pontos;
    }
    
    //Passar todos os músicos do main, com o vetor já instanciado e tds os músicos dentro do main
    public void setMusicos(ArrayList<Musico> musicos){
        for (int i = 0; i < musicos.size(); i++){
            int pontuacaoMusico = musicos.get(i).getPontuacaoMusico(); //atribuir os pontos que o músico da posição i já tem à nova variável
            pontuacaoMusico++; //acrescentar 1 ponto nessa variável
            musicos.get(i).setPontuacaoMusico(pontuacaoMusico); //passar a nova quantidade de pontos para a pontuação total do músico
        }
        this.musicos = musicos; 
        this.setPontuacaoBanda();
    }
    
    //Adicionar um músico no vetor (que já pode ter outros músicos) da banda 
    public void setMusico(Musico musico){
        int pontuacaoMusico = musico.getPontuacaoMusico(); //atribuir os pontos que o músico adicionado já tem à nova variável
        pontuacaoMusico++; //acrescentar 1 ponto nessa variável
        musico.setPontuacaoMusico(pontuacaoMusico); //passar a nova quantidade de pontos para a pontuação total do músico
        
        this.musicos.add(musico);
        this.setPontuacaoBanda();
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getOrigem(){
        return this.origem;
    }
    
    public String getRockTipo(){
        return this.tipoRock;
    }
    
    public int getPontuacaoBanda(){
        return this.pontuacaoBanda;
    }
    
    public ArrayList<Musico> getMusicos(){
        return musicos;
    }
    
    
    
    
}
