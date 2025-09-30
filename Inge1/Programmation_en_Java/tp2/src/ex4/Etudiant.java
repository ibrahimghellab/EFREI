package ex4;

public class Etudiant {
    private int numEtudiant;
    private String nom;
    private String prenom;
    private int age;
    private String specialite;
    private float moyenne;

    @Override
    public String toString() {
        return "Etudiant{" +
                "numEtudiant=" + numEtudiant +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", specialite='" + specialite + '\'' +
                ", moyenne=" + moyenne +
                '}';
    }

    public int getNumEtudiant() {
        return numEtudiant;
    }

    public void setNumEtudiant(int numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    public Etudiant() {
        this.numEtudiant = 1;
        this.nom = "Jean";
        this.prenom = "Claude";
        this.age = 18;
        this.specialite = "Mathématiques";
        this.moyenne = 15.4f;
    }

    public Etudiant(int numEtudiant, String nom, String prenom, int age, String specialite, float moyenne) {
        this.numEtudiant = numEtudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.specialite = specialite;
        this.moyenne = moyenne;
    }
}
