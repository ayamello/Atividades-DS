package programajogoson;

import java.util.ArrayList;

public class RankingProfissas {
    private ArrayList<Profissional> profissionais;

    public ArrayList<Profissional> getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(ArrayList<Profissional> profissionais) {
        this.profissionais = profissionais;
    }
    
    public void setProfissional(Profissional profissa){
        this.profissionais.add(profissa);
    }
}
