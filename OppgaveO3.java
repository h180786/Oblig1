package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO3 {

	public static void main(String[] args) {

		String heltall = showInputDialog("Faktoriser tall");
		int n = Integer.parseInt(heltall);
		int j = 1;
		
		while (n > 0) {
			j = j * n;
			n--;
		}
		System.out.println(j);

	}
}