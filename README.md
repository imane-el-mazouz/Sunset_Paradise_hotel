# Sunset Paradise Hotel Web Application

Cette application web permet aux utilisateurs de rechercher des chambres d'hôtel disponibles, d'effectuer des réservations et de consulter leurs réservations précédentes au Sunset Paradise Hotel. Elle offre une expérience conviviale, réactive et sécurisée aux clients de l'hôtel.

## Fonctionnalités

### Liste des Chambres d'Hôtel

- Affiche une liste des chambres d'hôtel disponibles avec des détails tels que le type de chambre, le prix, les équipements, la disponibilité, etc.

### Gestion des Réservations

- Permet à l'utilisateur de rechercher des chambres en fonction des dates d'arrivée/départ, du nombre de personnes, des préférences de type de chambre, etc.
- Permet à l'utilisateur de faire des réservations en sélectionnant des chambres disponibles et en fournissant les détails nécessaires.

### Consultation des Réservations

- Permet à l'utilisateur de consulter ses réservations précédentes, y compris les détails tels que les dates de séjour, le type de chambre, etc.

## Conception

### Diagramme de classes UML

- Voir le fichier `diagramme_classes.png` pour le diagramme de classes représentant les deux classes principales de l'application : Room et Reservation.

## Côté Technique

### Classes Backend (Java EE)

- Servlet(s) pour :
  - Gérer la recherche de chambres d'hôtel.
  - Gérer la création de réservations.
  - La consultation des réservations précédentes de l'utilisateur.

### JavaBeans

- Classe Room pour représenter les informations sur une chambre d'hôtel (type, prix, équipements, disponibilité, etc.).
- Classe Reservation pour représenter les réservations effectuées par les utilisateurs (identifiant, chambre réservée, dates, etc.).

### DAO (Data Access Object)

- Interface RoomDAO pour définir les opérations de manipulation des données des chambres (recherche, réservation, etc.).
- Interface ReservationDAO pour définir les opérations de manipulation des données des réservations.

### Base de Données

- Utilisation d'une base de données relationnelle (par exemple, MySQL, PostgreSQL) pour stocker les informations sur les chambres et les réservations.
- Utilisation de JDBC (Java Database Connectivity) pour la communication entre l'application Java et la base de données.

### Frontend

- HTML pour la structure de la page.
- CSS pour le design et la mise en page.
- JavaScript pour les fonctionnalités interactives et la validation des données côté client.
