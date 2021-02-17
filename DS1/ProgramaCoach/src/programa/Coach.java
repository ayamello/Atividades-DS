package programa;

import java.util.ArrayList;

public class Coach {
    private String nome;
    private ArrayList<Coachees> clientes;
    private int qtdMaximaDeClientes;
    private boolean atendimentoVirtual;
    private String areaDeAtuacao;
    
    public Coach(){
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Coachees> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Coachees> clientes) {
        this.clientes = clientes;
    }
    
    public void setCliente(Coachees cliente){
            this.clientes.add(cliente);
    }

    public int getQtdMaximaDeClientes() {
        return qtdMaximaDeClientes;
    }

    public void setQtdMaximaDeClientes(int qtdMaximaDeClientes) {
        this.qtdMaximaDeClientes = qtdMaximaDeClientes;
    }

    public boolean isAtendimentoVirtual() {
        return atendimentoVirtual;
    }

    public void setAtendimentoVirtual(int op) {
        if(op == 1){
            this.atendimentoVirtual = true;
        }
        else{
            this.atendimentoVirtual = false;
        }
    }

    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }
    
    
}
