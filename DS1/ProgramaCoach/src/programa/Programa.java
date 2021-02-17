/*
Desenvolva um sistema para ser usado por coachs. Os coachs precisam encontrar os seus coachees(clientes), 
só não pode ter uma quantidade de coachees que ele não consiga dar atenção. Então os Coachs devem se cadastrar 
no sistema com o nome, os coachees que acompanha, quantidade máxima de coachees que pode auxiliar, se pode fazer 
atendimento virtual ou não e a área de atuação (ex: coach de carreira profissional, carreira acadêmica, 
sentimentos, esportivo, etc). Os Coachees por sua vez, também serão cadastrados com nome, área de necessidade 
(ex: profissional, acadêmica, etc - igual o de cima) e  se ele quer o atendimento exclusivamente virtual ou só presencial. 

Quando um coachee quiser ser auxiliado por um couch, é preciso que o sistema verifique se o couch é da área que ele quer, 
pode atender na modalidade q ele precisa (Virtual ou presencial) e se ainda tem espaço para mais um coachee 
(baseando-se na quantidade que ele pode atender). Caso alguma dessas verificações não bata, o sistema precisa 
dizer que deu incompatibilidade de coach.

Desafio: Informar qual foi a incompatibilidade que foi gerada. Ex1: Incompatibilidade de coach, pois o número de 
coachees foi atingido.

 */
package programa;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Programa {
    
    public static void main(String[] args) {
        
        ArrayList<Coachees> clientes = new ArrayList<>();

        Coach coach1 = new Coach();
        
        coach1.setNome(JOptionPane.showInputDialog("Nome do coach: "));
        coach1.setAreaDeAtuacao(JOptionPane.showInputDialog("Área de atuação: "));
        coach1.setQtdMaximaDeClientes(Integer.parseInt(JOptionPane.showInputDialog("Quantidade máxima de coachees que pode atender: ")));
        coach1.setAtendimentoVirtual(Integer.parseInt(JOptionPane.showInputDialog("Atende virtualmente? Digite 1 para sim ou 2 para não")));
       
        
        //----------------------------------------------Clientes:
        
        Coachees cliente1 = new Coachees(); //cliente1
        
        cliente1.setNome("Ayana");
        cliente1.setAreaDeInteresse("Profissional");
        cliente1.setTipoDeAtendimento(1);
        clientes.add(cliente1);
      
        Coachees cliente2 = new Coachees(); //cliente2
        
        cliente2.setNome("Vitor");
        cliente2.setAreaDeInteresse("Profissional");
        cliente2.setTipoDeAtendimento(1);
        clientes.add(cliente2);
        
        Coachees cliente3 = new Coachees(); //cliente3
        
        cliente3.setNome("Fran");
        cliente3.setAreaDeInteresse("Esportiva");
        cliente3.setTipoDeAtendimento(2);
        clientes.add(cliente3);
        
        Coachees cliente4 = new Coachees(); //cliente4
        
        cliente4.setNome("Sheila");
        cliente4.setAreaDeInteresse("Profissional");
        cliente4.setTipoDeAtendimento(1);
        clientes.add(cliente4);
        
        Coachees cliente5 = new Coachees(); //cliente5
        
        cliente5.setNome("Ramon");
        cliente5.setAreaDeInteresse("Esportiva");
        cliente5.setTipoDeAtendimento(2);
        clientes.add(cliente5);
        
        for (int i = 0; i < clientes.size(); i++){
            
            System.out.println("Cliente " + (i+1));
            
            if(clientes.get(i).getAreaDeInteresse().equalsIgnoreCase(coach1.getAreaDeAtuacao())){
                if(clientes.get(i).getTipoDeAtendimento().equalsIgnoreCase("Presencial") && coach1.isAtendimentoVirtual()==false
                        || clientes.get(i).getTipoDeAtendimento().equalsIgnoreCase("Virtual") && coach1.isAtendimentoVirtual()==true){
                    if(coach1.getClientes().size() < coach1.getQtdMaximaDeClientes()){
                            
                        coach1.setCliente(clientes.get(i)); 
                    }
                    else{
                        System.out.println("Incompatibilidade de coach, pois a quantidade máxima de coachees já foi atingida.");
                    }
                }
                else{
                    System.out.println("Incompatibilidade de coach, pois os tipos de atendimento não batem.");
                }
            }
            else{
                System.out.println("Incompatibilidade de coach, pois não é da mesma área de interesse.");
            }
        }
        System.out.println("");
        
        System.out.println("Coach: " + coach1.getNome() + "\nÁrea de atuação: " + coach1.getAreaDeAtuacao());
        System.out.println("Clientes: ");
        for (int i = 0; i < coach1.getClientes().size(); i++){
            System.out.println(coach1.getClientes().get(i).getNome());            
        }
    }
}
