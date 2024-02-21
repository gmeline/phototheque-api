CREATE TABLE Utilisateur(
   id INT,
   pseudo VARCHAR(50),
   nom VARCHAR(50),
   prenom VARCHAR(50),
   mot_de_passe VARCHAR(50),
   rank_user BOOLEAN,
   PRIMARY KEY(id)
);

CREATE TABLE Categorie(
   id INT,
   nom VARCHAR(50),
   nombre_image VARCHAR(50),
   PRIMARY KEY(id)
);

CREATE TABLE Image(
   id INT,
   nom VARCHAR(50),
   description VARCHAR(50),
   taille_octet INT,
   date_creation DATE,
   date_modification DATE,
   elements_detectes VARCHAR(50),
   presence_individu VARCHAR(50),
   url_taille_reelle VARCHAR(50),
   url_miniature VARCHAR(50),
   compteur_telechargement VARCHAR(50),
   categorie_id INT,
   utilisateur_id INT,
   PRIMARY KEY(id),
   FOREIGN KEY(categorie_id) REFERENCES Categorie(id),
   FOREIGN KEY(utilisateur_id) REFERENCES Utilisateur(id)
);
