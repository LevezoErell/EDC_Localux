# LOCALUX SLAM 4 - Correction (E5)

Correction complète du cas Localux de SLAM4 (développement) en Java.
Etude de la mission 2 - Gestion du dépassement du forfait kilométrique.

## /!\ Possibilité de générer la JAVADOC /!\

## Question 2.1
### Réaliser le code du constructeur de la classe métier LocationSansChauffeur.
### Le kilométrage au compteur lors de la restitution du véhicule sera initialisé à 0.

	La question 2.1 se trouve dans la classe LocationSansChauffeur ligne 32.

## Question 2.2
### Réaliser le code de la méthode GetMontantDepasForfait() de la classe LocationSansChauffeur
### qui permet d'obtenir le montant à régler par la personne cliente en cas de dépassement kilométrique.

	La question 2.2 se trouve dans la classe LocationSansChauffeur ligne 53.
	
## Question 2.3
### Compléter le code du test unitaire de la méthode GetMontantDepasForfait(). 
	
	La question 2.3 se trouve dans TestUnitaireMontantDepasForfait.
	
## Question 2.4
### Afin de répondre au besoin de monsieur Berthu : 
### a)  apporter  les  modifications  nécessaires  au  diagramme  de  classes
### b)  coder les modifications à apporter à la classe Vehicule. 

	Pour la question 2.4 - a, il suffit d'ajouter une méthode dans la classe Véhicule
	une collection de LocationsSansChauffeur en faisant un lien avec LocationSansChauffeur 
	pour avoir une prorpiété lesLocationSansChauffeur et obtenir la collection.
	Ajouter une méthode dans véhicule (par ex addLocationSansChauffeur) pour ajouter la
	location de véhicule.
		
	La question 2.4 - b se trouve dans la classe Véhicule à partir de la ligne 12.
	
	