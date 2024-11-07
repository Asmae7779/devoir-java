package package1;
import java.util.Date;
import java.util.List;
public class Compte {
    private String numCompte;
    private Date dateCreation;
    private Date dateUpdate;
    private Client client; // Relation avec la classe Client
    private List<Transaction> transactions; // Liste des transactions
    private Banque banque ;

    // Constructeur
    public Compte(String numCompte, Date dateCreation, Date dateUpdate, Client client, List<Transaction> transactions) {
        this.numCompte = numCompte;
        this.dateCreation = dateCreation;
        this.dateUpdate = dateUpdate;
        this.client = client;
        this.transactions = transactions;
    }

    // Getters et Setters
    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }
    public Banque getBanque() {
    	return banque ;
    }
    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    public String toJson() {
        StringBuilder transactionsJson = new StringBuilder("[");
        for (Transaction transaction : transactions) {
            transactionsJson.append(transaction.toJson()).append(",");
        }
        if (transactionsJson.length() > 1) {
            transactionsJson.deleteCharAt(transactionsJson.length() - 1); 
        }
        transactionsJson.append("]");

        return "{"
            + "\"numCompte\":\"" + this.numCompte + "\","
            + "\"dateCreation\":\"" + this.dateCreation.toString() + "\","
            + "\"dateUpdate\":\"" + this.dateUpdate.toString() + "\","
            + "\"client\":\"" + this.client.getNumClient() + "\","
            + "\"transactions\":" + transactionsJson.toString() + ","
            + "\"banque\":\"" + this.banque.getId() + "\""
            + "}";
    }
}

