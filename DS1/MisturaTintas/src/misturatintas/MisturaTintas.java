package misturatintas;

import javax.swing.JOptionPane;

public class MisturaTintas {

    public static void main(String[] args) {
        System.out.println("Seja bem vindo - MisturaTintas");
        System.out.println("Nossas opções de tinta: ");
        System.out.println("coral - eucatex - renner");
        System.out.println("");
        
        Tinta tinta1 = new Tinta();
        
        tinta1.setAtribuirCor(JOptionPane.showInputDialog("Informe a cor da tinta 1: "));
        if(tinta1.setVerificarTinta(JOptionPane.showInputDialog("A marca: "))){
            System.out.println("Valor Cadastrado!");
        }else{
            System.out.println("Marca de Tinta não cadastrada \n!");
        }
        tinta1.setAtribuirPreco(Float.parseFloat(JOptionPane.showInputDialog("O preço: ")));
        System.out.println("");
        
        System.out.println("Tinta 1");
        System.out.println("Cor: "+tinta1.getCor()+"\nMarca: "+tinta1.getMarca()+"\nPreço: "+tinta1.getPreco());
        System.out.println("");
        
        Tinta tinta2 = new Tinta();
        
        tinta2.setAtribuirCor(JOptionPane.showInputDialog("Informe a cor da tinta 2: "));
        if(tinta2.setVerificarTinta(JOptionPane.showInputDialog("A marca: "))){
            System.out.println("Valor Cadastrado!");
        }else{
            System.out.println("Marca de Tinta não cadastrada \n!");
        }
        tinta2.setAtribuirPreco(Float.parseFloat(JOptionPane.showInputDialog("O preço: ")));
        System.out.println("");
        
        System.out.println("Tinta 2");
        System.out.println("Cor: "+tinta2.getCor()+"\nMarca: "+tinta2.getMarca()+"\nPreço: "+tinta2.getPreco());
        
        if(tinta1.getMisturarTintas(tinta2)){
            System.out.println("Nova cor após a mistura: "+tinta1.getCor());
        }
        else{
            System.out.println("Não houve mistura!");
        }
    }
    
}
