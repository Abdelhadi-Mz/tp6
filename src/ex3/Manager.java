package ex3;

public class Manager extends Personne{
	 public Manager(String nom, double salaireBase) {
	        super(nom, salaireBase);
	    }

	    @Override
	    public double calculerSalaire() {
	        return salaireBase * 1.30;
	    }
}
