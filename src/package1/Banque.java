package package1;

import java.util.List;
import java.util.Objects;

public class Banque {
    private String id;
    private String pays;
    private List<Compte> comptes; // Liste des comptes

    // Constructeur
    public Banque(String id, String pays, List<Compte> comptes) {
        this.id = id;
        this.pays = pays;
        this.comptes = comptes;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; 
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;  
        }
        Banque otherBanque = (Banque) obj;
        return Objects.equals(id, otherBanque.id) && Objects.equals(pays, otherBanque.pays);
    }

    // Getters et Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }
}

