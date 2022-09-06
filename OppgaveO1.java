package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO1 {

	public static void main(String[] args) {

		String lønn = showInputDialog("Lønnen din:");
		int inntekt = Integer.parseInt(lønn);
		double rente = 0.0;
		int inntektEtterSkatt = 0;
		int skatt = 0;

		if (inntekt < 164100) {
			rente = 0.0;
			inntektEtterSkatt = (int) (inntekt * rente);
			skatt = inntekt * inntektEtterSkatt;
		} else if (inntekt > 164101 && inntekt < 230950) {
			rente = 0.9907;
			inntektEtterSkatt = (int) (inntekt * rente);
			skatt = inntekt - inntektEtterSkatt;
		} else if (inntekt > 230951 && inntekt < 580650) {
			rente = 0.9759;
			inntektEtterSkatt = (int) (inntekt * rente);
			skatt = inntekt - inntektEtterSkatt;
		} else if (inntekt > 580651 && inntekt < 934050) {
			rente = 0.8848;
			inntektEtterSkatt = (int) (inntekt * rente);
			skatt = inntekt - inntektEtterSkatt;
		} else if (inntekt > 934051) {
			rente = 0.8548;
			inntektEtterSkatt = (int) (inntekt * rente);
			skatt = inntekt - inntektEtterSkatt;
		}
		System.out.println("Inntekten din er: " + inntekt + ",-");
		System.out.println("Skatten din er: " + skatt + ",-");
		System.out.println("Resterende Inntekt er: " + inntektEtterSkatt + ",-");
	}

}
