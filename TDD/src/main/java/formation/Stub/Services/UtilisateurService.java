package formation.Stub.Services;

import formation.Stub.Entities.Utilisateur;
import formation.Stub.Repositories.UtilisateurRepository;

public class UtilisateurService {

    private UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    public String obtenirNomUtilisateur(int id) {
        Utilisateur utilisateur = utilisateurRepository.trouveParId(id);
        return utilisateur != null ? utilisateur.getNom() : "Inconnu";
    }

}
