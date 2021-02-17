package misturatintas;

public class Tinta {
    private String marca;
    private String cor;
    private float preco;
    
    public boolean setVerificarTinta(String nomeTinta){
        if(nomeTinta.equalsIgnoreCase("coral") || nomeTinta.equalsIgnoreCase("renner") || nomeTinta.equalsIgnoreCase("eucatex")){
            this.marca = nomeTinta;
            return true;
        }
        else{
            return false;
        }
    }
    public void setAtribuirCor(String cor){
        this.cor = cor;    
    }
    
    public void setAtribuirPreco(float preco){
        this.preco = preco;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    public boolean getMisturarTintas(Tinta t2){
        if(t2.marca.equalsIgnoreCase("coral") && t2.cor.equalsIgnoreCase("branco")){
            this.cor += " claro";
            return true;
        }
        else if(t2.marca.equalsIgnoreCase("coral") && t2.cor.equalsIgnoreCase("preto")){
            this.cor += " escuro";
            return true;
        }
        else if(t2.marca.equalsIgnoreCase("eucatex") && t2.cor.equalsIgnoreCase("branco")){
            this.cor += " frio";
            return true;
        }
        else if(t2.marca.equalsIgnoreCase("eucatex") && t2.cor.equalsIgnoreCase("ocre")){
            this.cor += " quente";
            return true;
        }
        else{
            return false;
        }
    }

    boolean getMisturarTintas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
