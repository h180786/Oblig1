package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO2 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int student = i + 1;

			String poengsum = showInputDialog("Poengsummen din:");
			int karakterInn = Integer.parseInt(poengsum);
			String karakterUt = "";

			if (karakterInn < 0) {
				karakterUt = "Poengsum Feil";
			} else if (karakterInn >= 0 && karakterInn <= 39) {
				karakterUt = "Karakter F";
			} else if (karakterInn >= 40 && karakterInn <= 49) {
				karakterUt = "Karakter E";
			} else if (karakterInn >= 50 && karakterInn <= 59) {
				karakterUt = "Karakter D";
			} else if (karakterInn >= 60 && karakterInn <= 79) {
				karakterUt = "Karakter C";
			} else if (karakterInn >= 80 && karakterInn <= 89) {
				karakterUt = "Karakter B";
			} else if (karakterInn >= 90 && karakterInn <= 100) {
				karakterUt = "Karakter A";
			} else if (karakterInn > 101) {
				karakterUt = "Poengsum Feil";

			}

			System.out.println("Student " + student + ": " + karakterUt);
			if (karakterInn < 0 || karakterInn > 101) {
				i--;
			}
		}
	}
}
