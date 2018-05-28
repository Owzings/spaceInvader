package fr.unilim.iut.spaceinvaders;

public class Vaisseau {

    Position origine;
    int longueur;
    int hauteur;

    public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}

    public Vaisseau(int longueur, int hauteur, int x, int y) {
 	   this.longueur=longueur;
 	   this.hauteur=hauteur;
 	   this.origine = new Position (x,y);
 	   }

	public boolean occupeLaPosition(int x, int y) {
		return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
	}

	public boolean estOrdonneeCouverte(int y) {
		return ordonneeLaPlusBasse(y) && ordonneeLaPlusHaute(y);
	}

	public boolean ordonneeLaPlusHaute(int y) {
		return y <= this.origine.ordonnee();
	}

	public boolean ordonneeLaPlusBasse(int y) {
		return this.origine.ordonnee() - this.hauteur + 1 <= y;
	}

	public boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche() <= x) && (x <= abscisseLaPlusADroite());
	}
	public void positionner(int x, int y) {
		  this.origine.changerAbscisse(x);
		  this.origine.changerOrdonnee(y);
    }

    public void seDeplacerVersLaDroite() {
	    this.origine.changerAbscisse(this.origine.abscisse()+1);
   }
	public int abscisseLaPlusAGauche() {
        return this.origine.abscisse();
	}

	public void seDeplacerVersLaGauche() {
	    this.origine.changerAbscisse(this.origine.abscisse()-1);
  }

	public int abscisseLaPlusADroite() {
		return this.origine.abscisse();
	}

}
