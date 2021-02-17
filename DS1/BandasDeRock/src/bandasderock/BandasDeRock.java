package bandasderock;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BandasDeRock {
    public static void main(String[] args) {
        
        ArrayList<Musico> musicos = new ArrayList<>();
               
            Banda banda1 = new Banda();
            banda1.setNome(JOptionPane.showInputDialog("Nome: "));
            banda1.setOrigem(JOptionPane.showInputDialog("Local de origem: "));
            banda1.setRockTipo(JOptionPane.showInputDialog("Tipo de Rock: "));
            
            int qtdeMusicos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de músicos da banda:" ));
            
            Musico musicos1 = new Musico();
            
            for (int i = 0; i < qtdeMusicos; i++){
                musicos1.setNome(JOptionPane.showInputDialog("Nome do músico: "));
                musicos1.setFuncao(JOptionPane.showInputDialog("Função: "));
                
                musicos.add(musicos1);              
            }
            
            banda1.setMusicos(musicos);
            banda1.setPontuacaoBanda();
            
            System.out.println("Nome: " +banda1.getNome());
            System.out.println("Local de origem: " +banda1.getOrigem());
            System.out.println("Tipo de Rock: " +banda1.getRockTipo());
            System.out.println("Membros");
            System.out.println("");
            for (int i = 0; i < banda1.getMusicos().size(); i++){
                System.out.println(banda1.getMusicos().get(i).getNome() + "\t" + banda1.getMusicos().get(i).getFuncao()+ 
                        "\t" + banda1.getMusicos().get(i).getPontuacaoMusico() + "pontos");
        }
    }
    
}
