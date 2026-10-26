# Tests-unitaires-en-Java-avec-JUnit-Mockito-et-PowerMock

Tests unitaires :

* une methode pour verifier une partie du code
* chaque unite de code de maniere isolee
* garantir la qualite du code

Exemple :
[Calculatrice.java](TDD/src/main/java/formation/Calculatrice.java)
[CalculatriceTest.java](TDD/src/test/java/formation/CalculatriceTest.java)

Methode de test testAdditionner:

* Etape Preparer: Definir les variables dont nous aurons besoin pour le test ici a, b et resultatAttendu
* Etape Agir: Appel de la méthode que nous desirons tester ici calculatrice.addition(a, b) que nous stockons dans resultatObtenu
* Etape Verifier: relutat attente (resultatAttendu) vs resultat obtenu (resultatObtenu)

Exemple :
[Commande.java](TDD/src/main/java/formation/Commande.java)
[CommandeTest.java](TDD/src/test/java/formation/CommandeTest.java)

Methode de test testAdditionner:

* Etape Preparer: Definir les variables dont nous aurons besoin pour le test ici prixArticle, tauxTaxe et resultatAttendu
* Etape Agir: Appel de la méthode que nous desirons tester ici calculeMontantTotal(prixArticle, tauxTaxe) que nous stockons dans resultatObtenu
* Etape Verifier: relutat attente (resultatAttendu) vs resultat obtenu (resultatObtenu)

## Outils

Junit: framework test unitaire java - Structure de base

* Annotation
* Méthode d'assertions
* Gestion des exceptions
* Tests parametres

Mockito - dependences et interactions

* Simulation des comportements
* Verification des interactions
* Flexibilite

PowerMock - cas plus difficiles

* Mocking de méthodes statiques
* mocking de constructeurs
* Mocking de methodes privees
  
## Junit Structure

* Annoté @Test
* Preparer - Agir - Verifier (Arrange - Act -Assert):
  * Preparer : Environnement de test, initialiser les donnees
  * Agir : Execution du code
  * Verifier: Resultat

### Annotations Junit

* `@Test` - indique un test unitaire
* `@Before` - methode executee avant chaque methode
* `@After` - methode executee apres chaque methode
* `@BeforeClass` - methode executee une seule fois avant tous les tests
* `@AfterClass` - methode executee une seule fois apres tous les tests
  
### Assertions et verification

* `assertEquals` - Verifie que deux valeurs sont egales
* `assertTrue` - Verifie qu'une condition est vraie
* `assertFalse` - Verifie qu'une condition est fausse
* `assertNull` - Verifie qu'un objet est null
* `assertNotNull` - Verifie qu'un objet n'est pas null
* `assertSame` - Deux objets ont la meme instance
* `assertNotSame` - Deux objets n'ont pas la meme instance
* `assertArrayEquals` - Verifie que deux tableaux sont egaux
* Message d'erreur personalise - Verifie qu'une

### Gestion des exceptions

* `@Test(expected = ...)`
* Specifie le type d'exception atttendue
Exemple :
[Validateur.java](TDD/src/main/java/formation/Validateur.java)
[ValidateurTest.java](TDD/src/test/java/formation/ValidateurTest.java)

* `try - catch`
* Aspects spécifiques de l'exception
Exemple :
[Validateur.java](TDD/src/main/java/formation/Validateur.java)
[Validateur2Test.java](TDD/src/test/java/formation/Validateur2Test.java)

* `assertThrows`
* Capture l'exception
Exemple:
[Validateur.java](TDD/src/main/java/formation/Validateur.java)
[Validateur3Test.java](TDD/src/test/java/formation/Validateur3Test.java)

## Junit test parametres

* `@ParameterizedTest` et `@ValuesSource` --> JUnit5

Exemple:
[Palindrome.java](TDD/src/main/java/formation/Palindrome.java)
[PalindromeTest.java](TDD/src/test/java/formation/PalindromeTest.java)

* `@RunWith` et `@Parameters` --> Junit4

Exemple:
[Calculatrice.java](TDD/src/main/java/formation/Calculatrice.java)
[Calculatrice2Test.java](TDD/src/test/java/formation/Calculatrice2Test.java)

Exemple:
[Validateur.java](TDD/src/main/java/formation/Validateur.java)
[Validateur4Test.java](TDD/src/test/java/formation/Validateur4Test.java)

## Mockito

* Simuler des objets
* Controle le comportement
* Verifier les interactions
  
A utiliser si:

* Difficulte de tester certaines classes de maniere isolee
* Mockito simule les dependences

Exemple:
[Service.java](TDD/src/main/java/formation/TDMockito/Service/Service.java)
[ServiceTest.java](TDD/src/test/java/formation/TDMockitoTest/Service/ServiceTest.java)

### Creation stub et mock

* Stub: Un mock qui retourne des valeurs specifiques
* Simuler les dependances
* Controler le comportement
* Tester des scenarios complexes

Exemple:
[NotificationService.java](TDD/src/main/java/formation/Stub/Services/NotificationService.java)
[NotificationServiceTest.java](TDD/src/test/java/formation/Stub/NotificationServiceTest.java)

* Simuler comportement plus complexes
* Simuler des exceptions

Exemple:
[Service.java](TDD/src/main/java/formation/Stub/Services/Service.java)
[ServiceTest.java](TDD/src/test/java/formation/Stub/ServiceTest.java)

