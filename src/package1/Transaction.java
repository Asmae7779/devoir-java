package package1;

import java.util.Date;
import java.util.List;

public class Transaction {
    public enum Type {
        VIRIN, VIREST, VIRCA, VIRMULTRA
    }

    private Type type;
    private Date timeSetup;
    private String reference;
    private List<Compte> comptes; 
    
   
    private void TypeTransaction() {
        if (this.comptes.size() == 2) {
            if (this.comptes.get(0).getBanque().getId().equals(this.comptes.get(1).getBanque().getId())) {
                this.type = Type.VIRIN;
            } else if (this.comptes.get(0).getBanque().getPays().equals(this.comptes.get(1).getBanque().getPays())) {
                this.type = Type.VIREST;
            } else {
                this.type = Type.VIRCA;
            }
        } else if (this.comptes.size() > 2) {
            this.type = Type.VIRMULTRA;
        }
    }
    // Constructeur
    public Transaction(Type type, Date timeSetup, String reference, List<Compte> comptes) {
    	
        this.type = type;
        this.timeSetup = timeSetup;
        this.reference = reference;
        this.comptes = comptes;
        TypeTransaction();
    }
  
    // Getters et Setters
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Date getTimeSetup() {
        return timeSetup;
    }

    public void setTimeSetup(Date timeSetup) {
        this.timeSetup = timeSetup;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }
    public String toJson() {
       
        return "{"
            + "\"type\":\"" + this.type.toString() + "\","
            + "\"timeSetup\":\"" + this.timeSetup.toString() + "\","
            + "\"reference\":\"" + this.reference + "\","
            
            + "}";
    }
}
