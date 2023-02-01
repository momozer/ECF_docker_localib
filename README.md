# Dockerisation Du projet Localib:

## Description
Localib est une application de gestion de locations de véhicules et de locataires.

## A propos
Vous trouverez dans ce dépôt 2 dossiers à la racine:

1. le dossier *EFC_CDA_Localib* qui contient la partie front-end : Angular
2. le dossier *ecfback* qui contient la partie back-end: Spring boot

## Prérequis
- docker
- docker-compose
- IDE
### La partie back-end
- Java 11+
- Spring
- Un IDE pour environnement Java (Eclipse, IntelliJ)
### La partie front-end
- JavaScript
- IDE javaScript (VsCode)
## Installation
### Build le projet à l'aide de Maven
Dans votre IDE, lancer la commande suivante pour se placer dans le dossier ecfback :
```
  cd ecfback 
```
Lancer la commande suivante pour le building:
```
./mvn clean package
```
Pour chargez le projet maven, taper la commande suivante:
```
 docker-compose build
 ```

## Conteneuriser l'application à l'aide de Docker Compose
Il faut se placer dans le dossier racine et lancer la commande suivante pour executer l'application avec docker: 
```
docker-compose up 
```
(le tiré n'est pas obligatoire).