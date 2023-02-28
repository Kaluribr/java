
public class TesteAutomovel {

	public static void main(String[] args) {
		
		Automovel auto1 = new Automovel ("Pacoca", "JEEP", "toto", "kml32154", 2023);
		
		auto1.impriInfo();
		System.out.println("\n Fransferencia de proprietarie");
		auto1.setNomeProprietario("Danilo");
		auto1.setPlaca("Cxgf654");
		System.out.println("\n*****************************************");
	}

}
