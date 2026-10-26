package formation.Stub.Services;

import formation.Stub.Repositories.Repository;

public class Service {

    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public String obtenirDonneees(int id) {

        try {
            return repository.recupererDonnees(id);
        } catch (Exception e) {
            return "Erreur";

        }
    }

    public void traiterDonnees(int id) throws Exception {
        repository.recupererDonnees(id);
        repository.recupererDonnees(id);
    }

    public void traiterDonnees2(int id) throws Exception {
        repository.recupererDonnees(id);
    }

    public void saveData(String data) {
        repository.sauvegarder(data);
    }

}
