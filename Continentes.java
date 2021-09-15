package Enumeracion;

public enum Continentes {
	AFRICA (53,"1.2 billones"),
	AMERICA(46,"0.8 billones"),
	OCEANIA(14,"0.2 billones");
	
	private final int paises;
	private final String habitantes;
	Continentes (int paises, String habitantes) {
		this.habitantes = habitantes;
		this.paises = paises;
	}
	public int getPaises() {
		return paises;
	}
	public String getHabitantes() {
		return habitantes;
	}
	
	
	

}
