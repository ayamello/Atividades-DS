package virus;

import javax.swing.JOptionPane;

public class Virus {
    public static void main(String[] args) {
        
        CatalogoVirus virus1 = new CatalogoVirus();
        
        virus1.setNome(JOptionPane.showInputDialog("Informe o nome do vírus: "));
        virus1.setDescoberta(JOptionPane.showInputDialog("Informe a data de descoberta do vírus: "));
        virus1.setVacina(Integer.parseInt(JOptionPane.showInputDialog("Já tem vacina? Digite 1 para Sim ou 2 para Não: ")));
        virus1.setMortalidade(Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa de mortalidade (entre 0 e 1): ")));
        
        System.out.println("Vírus 1");
        System.out.println("Nome: " +virus1.getNome());
        System.out.println("Data de descoberta: " +virus1.getData());
        System.out.println("Taxa de mortalidade: " +virus1.getMortalidade());
        System.out.println("Gravidade: " +virus1.getGravidade());
        
        if(virus1.getVacina()){
            System.out.println("Há vacina!");
        }
        else{
            System.out.println("Não há vacina!");
        }
    }
    
}
