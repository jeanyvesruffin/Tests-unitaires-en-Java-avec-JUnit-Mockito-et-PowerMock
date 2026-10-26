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

}
