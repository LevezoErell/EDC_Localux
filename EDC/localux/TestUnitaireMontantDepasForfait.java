/**
 * QUESTION 2.3
 * 
 * Enregistrement du nombre de km retour
 */
laLocation.SetNbKmRetour(25400);
//Calcul du dépassement
double montantDepas = laLocation.GetMntantDepasForfait();
//Test du montant calculé par la méthode par rapport au montant attendu
Assert.AreEqual(300, montantDepas, "erreur calcul montant dépassement");