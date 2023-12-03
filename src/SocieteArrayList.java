import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe>{
    private ArrayList<Employe> listeEmployes;

    public SocieteArrayList() {
        this.listeEmployes=new ArrayList<>();
    }


    @Override
    public void ajouterEmploye(Employe emp){
        listeEmployes.add(emp);
    }

    @Override
    public boolean rechercherEmploye(String nom){
        for(Employe emp:listeEmployes){
            if(emp.getNom().equals(nom)){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean rechercherEmploye(Employe emp)
    {
        return listeEmployes.contains(emp);
    }

    @Override
    public void supprimerEmploye(Employe emp)
    {
        listeEmployes.remove(emp);
    }

    public void displayEmploye()
    {
        System.out.println("Liste des employés: \n");
        for (Employe emp:listeEmployes)
        {
            String ch=emp.toString();
            System.out.println(ch);
        }
    }

    public void trierEmployeParID()
    {
        Collections.sort(listeEmployes, Comparator.comparingInt(Employe::getID));
    }

    @Override
    public void trierEmployeParNomDepartementetGrade()
    {
        Collections.sort(listeEmployes,
                Comparator.comparing(Employe::getNom).thenComparing(Employe::getDept).thenComparing(Employe::getGrade));
    }







}
