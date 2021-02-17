/*
Elaborar um sistema para catalogar dados de vírus, com as características de nome, gravidade (valores entre 1 e 5), 
data de descoberta(não precisa trabalhar com data, pode ser texto mesmo), taxa de mortalidade e se há vacina ou não. 

Caso não haja vacina e a taxa de mortalidade já tenha atingido 0.5, a gravidade, automaticamente, deve ser configurada 
para 5. Caso a taxa seja menor que 0.5, mas não tenha vacina, a gravidade cai para 4. Se houver vacina e a taxa estiver 
acima de 0.5, a gravidade é 3, entre 0.2 e 0.4 é 2 e abaixo de 0.2, a gravidade é 1. Ao registrar um vírus no sistema, 
é esperado que ainda não tenha vacina pra ele, então ele já deve vir configurado para "false".
Teste todo o sistema em uma classe contendo método main() e solicite os dados da tela, utilizando JOptionPane.
 */
package virus;

public class CatalogoVirus {
    private String nome;
    private String dataDeDescoberta;
    private double mortalidade;
    private boolean vacina;
    private int gravidade;
    

    public CatalogoVirus(){
        this.vacina = false;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDescoberta(String data){
        this.dataDeDescoberta = data;
    }
    
    public void setVacina(int opcao){
        if(opcao == 1){
            this.vacina = true;
        }
    }
    
    public void setMortalidade(double taxa){
        if(taxa >= 0.5 && this.vacina == false){
            this.mortalidade = taxa;
            this.gravidade = 5;
        }
        else if (taxa < 0.5 && this.vacina == false){
            this.mortalidade = taxa;
            this.gravidade = 4;
        }
        else if (taxa >= 0.5 && this.vacina == true){
            this.mortalidade = taxa;
            this.gravidade = 3;
        }
        else if ((taxa >= 0.2 && this.mortalidade <= 0.4) && this.vacina == true){
            this.mortalidade = taxa;
            this.gravidade = 2;
        }
        else if (taxa < 0.2 && this.vacina == true){
            this.mortalidade = taxa;
            this.gravidade = 1;
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getData(){
        return this.dataDeDescoberta;
    }
    
    public Double getMortalidade(){
        return this.mortalidade;
    }
    
    public int getGravidade(){
        return this.gravidade;
    }
    
    public boolean getVacina(){
        return this.vacina;
    }
    
}
