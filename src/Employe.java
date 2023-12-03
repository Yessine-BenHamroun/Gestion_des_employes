import java.util.Objects;
import java.util.Random;

public class Employe {
    private static Random random=new Random();
    private  int ID;
    private String nom;
    private String prenom;
    private String dept;
    private int grade;
    public Employe(){}

    public Employe( String nom, String prenom, String dept, int grade) {
        this.ID=random.nextInt(100);
        this.nom = nom;
        this.prenom = prenom;
        this.dept = dept;
        this.grade = grade;
    }


    public int getID() {
        return ID;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDept() {
        return dept;
    }

    public int getGrade() {
        return grade;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Employe employe = (Employe) obj;

        // Comparaison en chaîne : ID et nom
        return Objects.equals(ID, employe.ID) && Objects.equals(nom, employe.nom);
    }

    @Override
    public String toString(){
        return ("ID: "+ID+
                "\nNom: "+ nom+
                "\nPrenom: "+ prenom+
                "\nDepartement: "+ dept+
                "\nGrade: "+grade+"\n____________________________");
    }
}

