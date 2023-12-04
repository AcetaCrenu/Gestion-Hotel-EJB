# Projet EJB de Gestion d'Hôtels et de Villes

## Introduction
Ce projet EJB vise à fournir une solution de gestion des hôtels et des villes avec la capacité de filtrer les hôtels par ville. Il utilise la technologie Enterprise JavaBeans (EJB) pour garantir une architecture robuste et évolutive.

## Fonctionnalités

1. **Gestion des Hôtels**
   - Ajout, modification et suppression d'informations sur les hôtels.
   - Stockage des détails tels que le nom, l'emplacement, la ville, etc.

2. **Gestion des Villes**
   - Enregistrement, mise à jour et suppression d'informations sur les villes.
   - Stockage des détails tels que le nom.

3. **Filtrage des Hôtels par Ville**
   - Possibilité de filtrer la liste des hôtels en fonction de la ville.

## Technologies Utilisées

- **Java EE (Enterprise Edition):** Utilisation d'EJB pour la gestion des composants métier.
- **JPA (Java Persistence API):** Stockage des données dans une base de données relationnelle.
- **RESTful Web Services:** Exposition des fonctionnalités via des services web RESTful.
- **Maven:** Gestion des dépendances et construction du projet.
- **Serveur d'Application:** Configuration pour s'exécuter sur un serveur d'application compatible Java EE.

## Configuration du Projet

1. **Base de Données:**
   - Configurez les détails de la base de données dans le fichier `persistence.xml`.
   - Exécutez les scripts SQL fournis dans le dossier `scripts` pour initialiser la base de données.

2. **Serveur d'Application:**
   - Assurez-vous que le serveur d'application (comme WildFly ou GlassFish) est correctement installé.
   - Déployez le projet sur le serveur d'application.

3. **URL des Services Web:**
   - Les services web sont accessibles à partir de l'URL de base : `http://localhost:8080/nom-du-projet/rest/`.

## Exemple d'Utilisation
###Gestion des villes
- Ajouter une ville:
![WhatsApp Image 2023-12-04 at 19 39 12_5aa28db4](https://github.com/AcetaCrenu/Gestion-Hotel-EJB/assets/127788237/9ea0a192-84b4-4858-b4ce-727eecd904d1)
![WhatsApp Image 2023-12-04 at 19 40 58_c92bb6ff](https://github.com/AcetaCrenu/Gestion-Hotel-EJB/assets/127788237/1431eed9-fda2-40ba-aba2-369846ab4bff)
- Modifier une ville:
![WhatsApp Image 2023-12-04 at 19 41 42_dbf28e27](https://github.com/AcetaCrenu/Gestion-Hotel-EJB/assets/127788237/1e7828bb-1109-4bfc-96a3-ef399715e965)
![WhatsApp Image 2023-12-04 at 19 42 30_e9cbf950](https://github.com/AcetaCrenu/Gestion-Hotel-EJB/assets/127788237/c4d00971-78e4-427f-a4e6-56fffafa84ec)
###Gestion des hotels
- Ajouter un hotel:
![WhatsApp Image 2023-12-04 at 19 45 50_8885d2c5](https://github.com/AcetaCrenu/Gestion-Hotel-EJB/assets/127788237/d43f14ff-0325-4c0f-9d6e-23491f5a56e1)
![WhatsApp Image 2023-12-04 at 19 54 12_d78da040](https://github.com/AcetaCrenu/Gestion-Hotel-EJB/assets/127788237/d08f48a3-3c3e-4a24-b3b9-1ff0dcc35a2c)
- Modifier un hotel:
![WhatsApp Image 2023-12-04 at 19 46 50_7f020423](https://github.com/AcetaCrenu/Gestion-Hotel-EJB/assets/127788237/7afafce9-82d9-4cf7-a843-8da5a03528be)
###Filtrage des hotels par ville:
![WhatsApp Image 2023-12-04 at 19 39 12_d4f47c2c](https://github.com/AcetaCrenu/Gestion-Hotel-EJB/assets/127788237/22e2233e-ad24-4cf8-85d2-ee28446f492b)

