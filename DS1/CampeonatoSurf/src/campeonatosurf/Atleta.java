package campeonatosurf;

public class Atleta {
    String nome;
    float peso;
    float altura;
    int idade;
    String categoria;
    
    public void atribuirCategoria(){
        if(this.idade >= 10 && this.idade <= 14){
            this.categoria = "Infantil";
        }
        else if (this.idade >= 15 && this.idade <= 17){
            this.categoria = "Juvenil";
        }
        else if (this.idade > 18){
            this.categoria = "Adulto";
        }
        else{
            this.categoria = "Sem categoria";
        }
    }
}
