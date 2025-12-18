    
# TP 3 : Développement d’un Service REST Calculatrice (JAX-RS)

Ce projet est une application Web **RESTful** réalisée dans le cadre du module "Architecture SOA et Services Web". Il permet d'effectuer des opérations arithmétiques simples (Addition, Soustraction, Multiplication, Division) via des requêtes HTTP, retournant les résultats au format **JSON**.

## 📋 Informations Générales

*   **Matière :** Architecture SOA
*   **Année Universitaire :** 2025-2026
*   **Filière :** LSI3
*   **Technologies :** Java, Jakarta EE, Maven

## 🛠 Prérequis et Environnement

Pour exécuter ce projet correctement, l'environnement suivant est nécessaire :

*   **Java JDK :** Version 11 ou supérieure (Testé avec JDK 18).
*   **Serveur d'Application :** **Apache Tomcat 10.x** (Obligatoire pour supporter le namespace `jakarta.*`).
    *   *Note : Tomcat 9 n'est pas compatible avec ce projet.*
*   **Gestionnaire de dépendances :** Apache Maven.
*   **Implémentation JAX-RS :** Jersey 3.x.

## 🚀 Installation et Démarrage

1.  **Cloner le projet** ou extraire les sources.
2.  **Compiler le projet** avec Maven :
    ```bash
    mvn clean install
    ```
3.  **Déploiement sur Tomcat** :
    *   **Méthode 1 (IDE) :** Utiliser IntelliJ IDEA avec le plugin "Smart Tomcat". Configurer le contexte sur `/calculatrice`.
    *   **Méthode 2 (Manuelle) :** Copier le fichier `.war` généré dans le dossier `target/` vers le dossier `webapps/` de Tomcat et démarrer le serveur.

L'API sera accessible à l'adresse : `http://localhost:8080/calculatrice`

## 🔗 Documentation de l'API (Endpoints)

Toutes les méthodes utilisent le verbe HTTP **GET** pour faciliter les tests via un navigateur.

### 1. Addition
Effectue l'addition de deux nombres.
*   **URL :** `/api/calcul/addition`
*   **Paramètres :** `a` (double), `b` (double)
*   **Exemple de test :**
    [http://localhost:8080/calculatrice/api/calcul/addition?a=10&b=5](http://localhost:8080/calculatrice/api/calcul/addition?a=10&b=5)

### 2. Soustraction
Effectue la soustraction (a - b).
*   **URL :** `/api/calcul/soustraction`
*   **Paramètres :** `a`, `b`
*   **Exemple de test :**
    [http://localhost:8080/calculatrice/api/calcul/soustraction?a=10&b=5](http://localhost:8080/calculatrice/api/calcul/soustraction?a=10&b=5)

### 3. Multiplication
Effectue la multiplication de deux nombres.
*   **URL :** `/api/calcul/multiplication`
*   **Paramètres :** `a`, `b`
*   **Exemple de test :**
    [http://localhost:8080/calculatrice/api/calcul/multiplication?a=6&b=7](http://localhost:8080/calculatrice/api/calcul/multiplication?a=6&b=7)

### 4. Division
Effectue la division (a / b). Gère l'exception de division par zéro.
*   **URL :** `/api/calcul/division`
*   **Paramètres :** `a`, `b`
*   **Exemple de test (Succès) :**
    [http://localhost:8080/calculatrice/api/calcul/division?a=20&b=4](http://localhost:8080/calculatrice/api/calcul/division?a=20&b=4)
*   **Exemple de test (Erreur 400) :**
    [http://localhost:8080/calculatrice/api/calcul/division?a=10&b=0](http://localhost:8080/calculatrice/api/calcul/division?a=10&b=0)

## 📦 Format de Réponse JSON

L'API retourne un objet JSON structuré comme suit :

```json
{
    "type": "addition",
    "operande1": 10.0,
    "operande2": 5.0,
    "resultat": 15.0
}  
