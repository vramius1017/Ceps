# 
MODÉLISATION 

Structure des Tables de la base de données
version 2

 
  

DONNES INPUT 

Table categorie


Nom de champs (3):  
    1. id :  identifiant unique de catégorie qui est utilisé comme clé primaire et qui n’est pas nulle.  Variable integer auto_incrément
    2. charac : identifiant du nom de la catégorie.  Variable varchar avec un maximum de 40 caractères au maximum (40 pour définir)
    3. code : identifiant court du nom technique de la catégorie.  Variable  varchar  avec un maximum de 10 caractères au maximum. (10 pour définir)

REQUÊTE Création du table categorie :

CREATE TABLE categorie (
    id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    charac VARCHAR(50) NOT NULL,
    code VARCHAR(10));

REQUÊTE Insert sur table categorie

INSERT INTO categorie (id,charac,code)
VALUES
 (, 'Psychologiques', ''),
 (, 'Physiques', ''),
 (, 'Nutritionnelles', ''),
 (, 'Numériques', ''),
 (, 'Élémentaires', '');

REQUÊTE Select sur table categorie
SELECT charac
FROM categorie
WHERE id = 1

Table sous_categorie


Nom de champs (4):  
    1. id :  identifiant unique de la sous-categorie qui est utilisé comme clé primaire et qui n’est pas nulle.  Variable integer auto_incrément 
    2. name: identifiant du nom de la sous-catégorie.  Variable varchar avec un maximum de 40 caractères au maximum (40 pour définir)
    3. code : identifiant court du nom technique de la sous-catégorie. Variable  varchar  avec un maximum de 10 caractères au  maximum. (10 pour définir)
    4. categorieID :identifiant unique de la catégorie qui est utilisé comme clé étrangère et qui n’est pas nulle.  (Correspond a clé primaire table catégorie)

  
REQUÊTE Création du table sous_categorie :

CREATE TABLE sous_categorie (
    id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    code VARCHAR(10), 
    categorieID int not null,
    FOREIGN KEY (categorieID) REFERENCES categorie (id));

REQUÊTE Insert sur table sous_categorie

INSERT INTO sous_categorie (id,name,code,categorieID)
VALUES
 (1,'Art Thérapies','xxxxxxxxxx',1),
 (2,'Programmes d’éducation santé','xxxxxxxxxx',1),
 (3,'Psychothérapies','xxxxxxxxxx',1),
 (4,'Pratiques psychocorporelles','xxxxxxxxxx',1),
 (5,'Thérapies assistées par l’animal','xxxxxxxxxx',1),
 (6,'Programmes d’activité physique','xxxxxxxxxx',2),
 (7,'Hortithérapies','xxxxxxxxxx',2),
 (8,'Physiothérapies','xxxxxxxxxx',2),
 (9,'Thérapies manuelles','xxxxxxxxxx',2),
 (10,'Programmes balnéologiques','xxxxxxxxxx',2),
 (11,'Compléments alimentaires','xxxxxxxxxx',3),
 (12,'Programmes nutritionnels','xxxxxxxxxx',3),
 (13,'m-Santé','xxxxxxxxxx',4),
 (14,'Thérapies par le jeu vidéo','xxxxxxxxxx',4),
 (15,'Thérapies par la réalité virtuelle','xxxxxxxxxx',4),
 (16,'Préparations minérales','xxxxxxxxxx',5),
 (17,'Préparations mycologiques','xxxxxxxxxx',5),
 (18,'Préparations botaniques','xxxxxxxxxx',5),
 (19,'Méthodes électromagnétiques','xxxxxxxxxx',5),
 (20,'Cosméceutiques','xxxxxxxxxx',5);

REQUÊTE Select sur table sous_categorie

SELECT name
FROM sous_categorie
WHERE id = 1

Table maladie

Nom de champs (4):  
    1. id : identifiant unique de la maladie qui est utilisé comme clé primaire et qui n’est pas nulle.  Variable integer auto_incrément 
    2. name: identifiant du nom de la maladie.  Variable varchar avec un maximum de 20 caractères au maximum ( 20 pour définir)
    3. definition: bref commentaire qui donne d’information de la maladie. Variable  texte avec un maximum de 100 caractères au  maximum. ( 100 pour définir).

  
REQUÊTE Création du table maladie :

CREATE TABLE maladie (
id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50) NOT NULL,
definition TEXT (100) NOT NULL);


REQUÊTE Insert sur table maladie

INSERT INTO maladie (id,name,description)
VALUES
 (1, 'Neoplasms', 'xxxxxxxxxx'),
 (2, 'Covid-19', 'xxxxxxxxxx'),
 (3, 'Bien vieillir', 'xxxxxxxxxx');

REQUÊTE Select sur table maladie

SELECT name
FROM maladie
WHERE id = 1

Table neoplasms

Nom de champs (6):  
    1. id : identifiant unique de neoplasms qui est utilisé comme clé primaire et qui n’est pas nulle.  Variable integer auto_incrément 
    2. class : identifie la classe à laquelle il appartient.  Variable varchar avec un maximum de XX caractères au maximum ( XX pour définir)
    3. name: identifiant du nom neoplasm.  Variable string/varchar avec un maximum de 20 caractères au maximum ( 20 pour définir)
    4. definition: bref commentaire qui donne d’information du neoplasm. Variable  texte  avec un maximum de 1000 caractères au maximum. (1000 pour définir)
    5. label : identifiant de l’étiquette avec caractère ou ensemble de caractères lié à un article d'un fichier et destiné à l'identifier.  Variable string/varchar avec un maximum de XX caractères au maximum ( XX pour définir)
    6. maladieID :identifiant unique de la maladie qui est utilisé comme clé étrangère et qui n’est pas nulle.  (Correspond a clé primaire table maladie)

  
REQUÊTE Création du table neoplasms:

CREATE TABLE neoplasms (
id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
class VARCHAR(50) NOT NULL,
name VARCHAR(50) NOT NULL,
definition TEXT(1000) NOT NULL,
label VARCHAR(10) NOT NULL,
maladieID INTEGER NOT NULL,
FOREIGN KEY (maladieID) REFERENCES maladie (id));

REQUÊTE Insert sur table neoplasms

INSERT INTO neoplasms (id,class,name,description,label, maladieID)
VALUES
 (,'Cancer','Cancer ',' ',' ',1);

REQUÊTE Select sur table neoplasms
SELECT name
FROM neoplasms
WHERE maladieID = 1


Table Covid-19


Nom de champs (6):  
    1. id :  identifiant unique de Covid-19 qui est utilisé comme clé primaire et qui n’est pas nulle.  Variable integer auto_incrément. 
    2. class : identifie la classe à laquelle il appartient.  Variable string/varchar avec un maximum de XX caractères au maximum ( XX pour définir)
    3. name: identifiant du nom Covid-19.  Variable string/varchar avec un maximum de 20 caractères au maximum ( 20 pour définir)
    4. definition: bref commentaire qui donne d’information de Covid-19. Variable  texte  avec un maximum de 100 caractères au maximum. ( 100 pour définir)
    5. label : identifiant de l’étiquette avec caractère ou ensemble de caractères lié à un article d'un fichier et destiné à l'identifier.  Variable string/varchar avec un maximum de XX caractères au maximum ( XX pour définir)
    6. maladieID :identifiant unique de la maladie qui est utilisé comme clé étrangère et qui n’est pas nulle.  (Correspond a clé primaire table maladie)

  

REQUÊTE Création du table Covid-19:

Création
CREATE TABLE Covid_19 (
id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
class VARCHAR(50) NOT NULL,
name VARCHAR(50) NOT NULL,
definition TEXT(1000) NOT NULL,
label VARCHAR(10) NOT NULL,
maladieID INTEGER NOT NULL,
FOREIGN KEY (maladieID) REFERENCES maladie (id));


REQUÊTE Insert sur table Covid-19

INSERT INTO Covid_19 (id,class,name,description,label, maladieID)
VALUES
(1,'Covid-19','Covid-19','','',2),

REQUÊTE Select sur table Covid_19
SELECT name
FROM neoplasms
WHERE maladieID = 1






Table Bienvieillir


Nom de champs (6):  
    1. id :  identifiant unique de bienvieillir qui est utilisé comme clé primaire et qui n’est pas nulle.  Variable integer auto_incrément. 
    2. class : identifie la classe à laquelle il appartient.  Variable string/varchar avec un maximum de XX caractères au maximum ( XX pour définir)
    3. name: identifiant du nom bienvieillir.  Variable string/varchar avec un maximum de 20 caractères au maximum ( 20 pour définir)
    4. definition: bref commentaire qui donne d’information de bien vieillir. Variable  texte  avec un maximum de 1000 caractères au maximum. (1000 pour définir)
    5. label : identifiant de l’étiquette avec caractère ou ensemble de caractères lié à un article d'un fichier et destiné à l'identifier.  Variable string/varchar avec un maximum de XX caractères au maximum ( XX pour définir)
    6. maladieID :identifiant unique de la maladie qui est utilisé comme clé étrangère et qui n’est pas nulle.  (Correspond a clé primaire table maladie)

  
REQUÊTE Création du table bienvieillir:

CREATE TABLE Bien_vieillir (
id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
class VARCHAR(50) NOT NULL,
name VARCHAR(50) NOT NULL,
definition TEXT(1000) NOT NULL,
label VARCHAR(10) NOT NULL,
maladieID INTEGER NOT NULL,
FOREIGN KEY (maladieID) REFERENCES maladie (id));



REQUÊTE Insert sur table  bienvieillir

INSERT INTO bienvieillir (id,class,name,description,label, maladieID)
VALUES
 (1,'Bien vieillir 1','Bien vieillir','','',3) ;

REQUÊTE Select sur table bienvieillir
SELECT name
FROM neoplasms
WHERE maladieID = 1



DONNES RESULTAT 

Table INM


Nom de champs (5):  
    1. id : identifiant unique de INM qui est utilisé comme clé primaire et qui n’est pas nulle.  Variable integer auto_incrément
    2. sous_categorieID :identifiant unique de la catégorie qui est utilisé comme clé étrangère et qui n’est pas nulle.  (Correspond a clé primaire table catégorie) 
    3. name: identifiant du nom d’Intervention Non Médicamenteuse.  Variable string/varchar avec un maximum de 100 caractères au maximum ( 100 pour définir)
    4. npi: identifiant du nom Non Pharmacologie Intervention.  Variable  texte  avec un maximum de 1000 caractères au maximum. (1000 pour définir)
    5. npi_code: identifiant court du nom Non Pharmacologie Intervention. Variable  string/varchar  avec un maximum de 10 caractères au  maximum. ( 10 pour définir)

  


REQUÊTE Création du table INM:

CREATE TABLE INM (
id  INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
sous_categorieID INTEGER NOT NULL,
name  VARCHAR(50) NOT NULL,
npi TEXT(1000) NOT NULL,
npi_code VARCHAR(100) NOT NULL,
FOREIGN KEY (sous_categorieID) REFERENCES sous_categorie (id));

REQUÊTE Insert sur table INM

INSERT INTO INM (id,sous_categorieID,name,npi,npi_code)
VALUES
 (,2,'Themalism related terms','Local aerobath','NPI2.5.1 '),
(,2,'Themalism related terms','Individual aerosol','NPI2.5.1 ');

REQUÊTE Select sur table INM
SELECT name
FROM INM
WHERE sous_categorieID = 1


Local copie de DB Medline et EDITEUR

 
Elle fait référence à une table historique de mise à jour sur la base local Medline.  La source pour cette information sera de deux manière différents :
    • Accès aux données de la base Medline par API via web
    • Accès local à un fichier extraction de la base Medline daté ( qui sera mis à jour via ftp sur Medline .
Contrainte : le fichier local extraction de Medline sera sous la format CSV UTF8 impérativement. En effet, ce format sera utilisable par les méthodes de l’API  NCBI.

Le nom de ficher dois être le même quel champ nom_fichier avec format nomddmmaaaa.ext (xls ou csv)





Table HistoMed


Nom de champs (5):  
    1. id :  identifiant unique de Histomed qui est utilisé comme clé primaire et qui n’est pas nulle.  Variable integer auto_incrément
    2. nom_fichier : bref description du fichier.  Variable texte avec un maximum de 100 caractères au maximum (100 pour définir)
    3. date_info: identifiant de la date réception du fichier.  Variable date avec un format dd/mm/aaaa
    4. date_enreg: identifiant de la date télécharge du fichier.  Variable date avec un format dd/mm/aaaa
    5. nombre_lignes : identifiant quantité des lignes dans le fichier.  Variable integer (considérer la file concernant du titre).


REQUÊTE Création du table HistoMed:

CREATE TABLE HistoMed(
id  INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
nom_fichier  TEXT(100) NOT NULL,
date_info DATE NOT NULL,
date_enreg DATE NOT NULL,
nombre_lignes INTEGER UNSIGNED NOT NULL);

REQUÊTE Insert sur table HistoMed

INSERT INTO HistoMed (
 id,nom_fichier,date_info,date_enreg,nombre_lignes)
VALUES
 (1,'','','',);


REQUÊTE Select sur table HistoMed
SELECT nom_fichier
FROM HistoMed


Table EDITEUR

Nom de champs (3):  
    1. id :  identifiant unique de editeur qui est utilisé comme clé primaire et qui n’est pas nulle.  Variable integer auto_incrément
    2. name : nom du editeur.  Variable string/varchar avec un maximum de 40 caractères au maximum ( 40 pour définir)
    3. adresseURL: identifiant l’adresse vers l’editeur doit aller.  Variable string/varchar avec un maximum de 50 caractères au maximum (50 pour définir).


REQUÊTE Création du table EDITEUR :

CREATE TABLE EDITEUR(
id  INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
name  VARCHAR(50) NOT NULL,
adresseURL VARCHAR(50) NOT NULL);

REQUÊTE Insert sur table EDITEUR

INSERT INTO EDITEUR (id,name,adresseURL)
VALUES
(,'COCHRAME',''),
(,'PUBMED',''),
(,'MOTRIAL',''),
(,'CORE','');

REQUÊTE Select sur table EDITEUR

SELECT name
FROM editeur
WHERE id = 1




Table HistoQuery

Nom de champs (3):  
    1. id :  identifiant unique de histoquery qui est utilisé comme clé primaire et qui n’est pas nulle.  Variable integer auto_incrément
    2. name_query : nom du requête.  Variable string/varchar avec un maximum de 40 caractères au maximum ( 40 pour définir)
    3. description: bref commentaire qui donne d’information de la renquête Variable  texte  avec un maximum de 1000 caractères au maximum. (1000 pour définir)


REQUÊTE Création du table Histoquery:

CREATE TABLE Histoquery(
id  INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
name  VARCHAR(50) NOT NULL,
description TEXT(1000) NOT NULL);

REQUÊTE Insert sur table  Histoquery

INSERT INTO Histoquery (id,name,description)
VALUES
(1,'Création table x','Permite crée une table sur la DBInm'),
(2,'Insert table x','Permite enregistrer d’information dans la table x'),
(3,'Select champ','Permite la sélection de l’information de la table x');

REQUÊTE Select sur table  Histoquery

SELECT name
FROM Histoquery
WHERE id = 1



   

Structure de Table d'etudes medicales

La source pour cette information sera le résultat des paramètres de recherche.  Accès aux données de la base externe par API via web.

Contrainte:  Cette table permettre faire l'exportation d'information dans un fichier format CSV UTF8 impérativement. En effet, ce format sera utilisable par les méthodes de l’API  NCBI.
 

DONNES RESULTAT 

Table etudie



Nom de champs (12):  
    1. titre:  identifiant unique de étude qui est utilisé comme clé primaire et qui n’est pas nulle.  Variable string 
    2. auteurs: identifiant du nom d’auteur.  Variable string/varchar avec un maximum de 50 caractères au maximum ( 50 pour définir)
    3. anneePubl_1: identifiant de l’année de publication initiale.  Variable year formato AAAA
    4. anneePubl_2: identifiant de l’année de publication final.  Variable year formato AAAA
    5. categorie : identifiant du nom de la catégorie qui est utilisé comme clé étrangère.  Variable string qui correspond au paramètre qui a rentre l’utilisateur de l’application)
    6. sous_categorie : identifiant du nom de la sous_catégorie qui est utilisé comme clé étrangère.  Variable string qui correspond au paramètre qui a rentre l’utilisateur de l’application)
    7. maladie : identifiant du nom de la maladie qui est utilisé comme clé étrangère.  Variable string qui correspond au paramètre qui a rentre l’utilisateur de l’application)
    8. nom_journal : identifiant du nom au journal auteur de la publication. Variable string/varchar avec un maximum de 50 caractères au  maximum ( 50 pour définir)
    9. pays : identifiant du nom du pays origen de la publication. Variable string/varchar avec un maximum de 50 caractères au  maximum ( 50 pour définir)
    10. sponsor : identifiant du nom de qui finance la publication. Variable string/varchar avec un maximum de 50 caractères au  maximum ( 50 pour définir)
    11. lien : identifiant hypertexte, commande qui permet d'accéder à d'information. Variable texte avec un maximum de 1000 caractères au  maximum ( 1000 pour définir)
    12. nomDb : identifiant du nom de base des données. Variable string/varchar avec un maximum de 50 caractères au  maximum ( 50 pour définir)
       
REQUÊTE Création du table etude:

CREATE TABLE etude (
titre VARCHAR(50) NOT NULL PRIMARY KEY,
auteurs  VARCHAR(50) NOT NULL,
anneePubl_1 YEAR NOT NULL,
anneePubl_2 YEAR NOT NULL,
categorie VARCHAR(50) NOT NULL,
sous_categorie VARCHAR(50) NOT NULL,
maladie VARCHAR(50) NOT NULL,
nom_journal VARCHAR(50) NOT NULL,
pays VARCHAR(50) NOT NULL,
sponsor VARCHAR(50) NOT NULL,
lien TEXT(1000) NOT NULL,
nomDb VARCHAR(50) NOT NULL);





REQUÊTE Insert sur table etude

INSERT INTO etude (titre,auteurs,anneePubl_1,anneePubl_2,categorie,sous_categorie,maladie,nom_journal, pays,sponsor,lien,nomDb)
VALUES
(1,'Ceps',2020,2021,'Physiques','Thérapies manuelles','Neoplasms','xxxxx','France','La Région','xxxxxxx','PubMed');

REQUÊTE Select sur table etude

SELECT titre,categorie,sous_categorie,maladie
FROM etude
WHERE anneePubl_1 = 2020;

 
Nous utiliserons comme interclassement en production soit general_ci, soit utf8
