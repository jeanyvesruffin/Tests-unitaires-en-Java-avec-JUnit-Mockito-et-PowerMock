package formation.TDMockito.Service;

import formation.TDMockito.Repository.Repository;

public class Service {

    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public String obtenirDonnees() {
        return repository.recupererDonnees();
    }

}
