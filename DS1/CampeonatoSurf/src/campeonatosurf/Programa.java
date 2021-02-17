package campeonatosurf;

public class Programa {
    public static void main(String[] args) {
        
        Atleta atleta1 = new Atleta();
        int x;
        
        atleta1.nome = "Kelsy";
        atleta1.idade = 21;
        atleta1.peso = 56f;
        atleta1.altura = 1.72f;
        
        Atleta atleta2 = new Atleta();
        
        atleta2.nome = "Jake";
        atleta2.idade = 19;
        atleta2.peso = 58f;
        atleta2.altura = 1.76f;
        
        System.out.println("ATLETA 1");
        System.out.println("Nome: " + atleta1.nome);
        System.out.println("Idade: " + atleta1.idade);
        System.out.println("Peso: " + atleta1.peso + "kg");
        System.out.println("Altura: " + atleta1.altura);
        atleta1.atribuirCategoria();
        System.out.println("Categoria: " + atleta1.categoria);
        System.out.println("");
        System.out.println("ATLETA 2");
        System.out.println("Nome: " + atleta2.nome);
        System.out.println("Idade: " + atleta2.idade);
        System.out.println("Peso: " + atleta2.peso + "kg");
        System.out.println("Altura: " + atleta2.altura);
        atleta2.atribuirCategoria();
        System.out.println("Categoria: " + atleta2.categoria);
        
        
    }
    
}
