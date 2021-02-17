/*
Você foi convidado a desenvolver um módulo de uma plataforma Web de jogos On-line. 
O sócio lhe informou que os usuários se cadastram no sistema com nome, idade e e-mail e também escolhe 
que tipo de jogador ele se considera: Amador ou Profissional. Se ele optar por profissional, no cadastro 
dele será acrescentado um Ranking que é uma pontuação numérica dentro da plataforma, que indicará qual a 
posição dele na plataforma inteira.
O jogador depois de cadastrado, ele pode adicionar vários jogos que ele se interesse. Quando ele é amador 
ele ganha 20 moedas (da plataforma) a cada jogo que ele adicione. Se ele for profissional 50 moedas.
O jogo vai está cadastrado no sistema com nome, indicação e grau de dificuldade. A indicação é a idade mínima 
permitida para adicionar o jogo. Não permita que jogadores com idade inferior possa adicionar um jogo não liberado. 
O ranking, o sócio explicou que deixaria para implementação futura, já que ele já quer a primeira versão 
no ar daqui a 1h30min, mas é preciso que a plataforma esteja pronta para receber esse valor. 
Você precisa ser rápido, o sócio está aguardando só você para tudo ficar pronto! 
*/
package programajogoson;

import javax.swing.JOptionPane;

/**
 *
 * @author Ayana
 */
public class ProgramaJogosOn {
    public static void main(String[] args) {
        
        Jogos jogo1 = new Jogos();
        jogo1.setNome("Drift.0");
        jogo1.setGrauDeDificuldade(5);
        jogo1.setIndicacao(12);
        
        Jogos jogo2 = new Jogos();
        jogo2.setNome("Grow");
        jogo2.setGrauDeDificuldade(7);
        jogo2.setIndicacao(16);
        
        Jogos jogo3 = new Jogos();
        jogo3.setNome("Punisher");
        jogo3.setGrauDeDificuldade(8);
        jogo3.setIndicacao(18);
        
        System.out.println("Bem-vindo ao MegaJogosOnline!");
        
        int op = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu nível?\nDigite 1 para Amador ou 2 para Profissional: "));
        
        Profissional jog1 = new Profissional();
        Amador jog2 = new Amador();
        
        if(op==1){
            jog2.setNome(JOptionPane.showInputDialog("Nome: "));
            jog2.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
            jog2.setEmail(JOptionPane.showInputDialog("E-mail: "));
            jog2.setTipoJogador("Amador");
            
            jog2.setJogo(jogo1);
            jog2.setJogo(jogo2);
            jog2.setJogo(jogo3); 
            
            System.out.println("Jogador: " + jog2.getNome() + "\nIdade: " + jog2.getIdade() + "\nE-mail: " + jog2.getEmail() 
                    + "\nMoedas: " + jog2.getMoedas());
            
            System.out.print("Jogos do jogador: ");
            for (int i = 0; i < jog2.getJogos().size(); i++) {
                System.out.println(jog2.getJogos().get(i).getNome());
            }
        }
        else{
            jog1.setNome(JOptionPane.showInputDialog("Nome: "));
            jog1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
            jog1.setEmail(JOptionPane.showInputDialog("E-mail: "));
            jog1.setTipoJogador("Profissional");
            
            jog1.setJogo(jogo1);
            jog1.setJogo(jogo2);
            jog1.setJogo(jogo3);
            
            System.out.println("Jogador: " + jog1.getNome() + "\nIdade: " + jog1.getIdade() + "\nE-mail: " + jog1.getEmail() 
                    + "Pontuação: " + jog1.getPontucao());
            
            System.out.print("Jogos do jogador: ");
            for (int i = 0; i < jog1.getJogos().size(); i++) {
                System.out.println(jog1.getJogos().get(i).getNome() + "\t");
            }
        }
        
    }
    
}
