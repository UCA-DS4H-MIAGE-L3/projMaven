package exemple1;

/**
 * La classe Boite représente une boite recatngulaire qui contient des jouets
 */
public class Boite {

	protected int largeur;
	protected int longueur;
	protected int hauteur;
	Jouet typeJouet;
	int nbJouet = 0;
	
	/**
	 * Permet d'ajouter un jouet à la boite.
	 * Mais si le jouet est différent des jouets déjà présents on remplace les anciens jouets
	 * @param j : le jouet à rajouter
	 * @return le nombre de jouets dans la boite
	 */
	public int ajouteJouet(Jouet j) {
		if ((typeJouet != null) && (typeJouet.nom() == j.nom())) {
			nbJouet++;
		}
		else {
			typeJouet = j;
			nbJouet = 1;
		}
		return nbJouet;
	}
	
	public Boite(int largeur, int longueur, int hauteur) {
		super();
		this.largeur = largeur;
		this.longueur = longueur;
		this.hauteur = hauteur;
	}

	public Boite() {
		this.largeur = 1;
		this.longueur = 1;
		this.hauteur = 1;
	}

	/**
	 * @return the largeur
	 */
	public int getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	/**
	 * @return the longueur
	 */
	public int getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	/**
	 * @return the hauteur
	 */
	public int getHauteur() {
		return hauteur;
	}

	/**
	 * @param hauteur the hauteur to set
	 */
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

}
