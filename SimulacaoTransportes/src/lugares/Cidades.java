package lugares;

public class Cidades {
	
	//retorna a distancia entre as duas cidades, não importando a ordem em que elas são colocadas
	
	public int distancia(String c1, String c2) {
		
		
		int distancia = 0;
		
		if ((c1.equalsIgnoreCase("Porto Alegre") && c2.equalsIgnoreCase("Florianopolis")) || (c2.equalsIgnoreCase("Porto Alegre") && c1.equalsIgnoreCase("Florianopolis"))) {
			    distancia = 476;
			}
		else if((c1.equalsIgnoreCase("Porto Alegre") && c2.equalsIgnoreCase("Curitiba")) || c2.equalsIgnoreCase("Porto Alegre") && c1.equalsIgnoreCase("Curitiba")) {
			distancia = 711;
	}
		else if((c1.equalsIgnoreCase("Porto Alegre") && c2.equalsIgnoreCase("Maceio")) || c2.equalsIgnoreCase("Porto Alegre") && c1.equalsIgnoreCase("Maceio")) {
			distancia = 3572;
	}
		else if((c1.equalsIgnoreCase("Porto Alegre") && c2.equalsIgnoreCase("Sao Paulo")) || c2.equalsIgnoreCase("Porto Alegre") && c1.equalsIgnoreCase("Sao Paulo")) {
			distancia = 1109;
	}
		else if((c1.equalsIgnoreCase("Porto Alegre") && c2.equalsIgnoreCase("Goiania")) || c2.equalsIgnoreCase("Porto Alegre") && c1.equalsIgnoreCase("Goiania")) {
			distancia = 1847;
	}
		else if((c1.equalsIgnoreCase("Florianopolis") && c2.equalsIgnoreCase("Curitiba")) || c2.equalsIgnoreCase("Florianopolis") && c1.equalsIgnoreCase("Curitiba")) {
			distancia = 300;
	}
		else if((c1.equalsIgnoreCase("Florianopolis") && c2.equalsIgnoreCase("Maceio")) || c2.equalsIgnoreCase("Florianopolis") && c1.equalsIgnoreCase("Maceio")) {
			distancia = 3168;
	}
		else if((c1.equalsIgnoreCase("Florianopolis") && c2.equalsIgnoreCase("Sao Paulo")) || c2.equalsIgnoreCase("Florianopolis") && c1.equalsIgnoreCase("Sao Paulo")) {
			distancia = 705;
	}
		else if((c1.equalsIgnoreCase("Florianopolis") && c2.equalsIgnoreCase("Goiania")) || c2.equalsIgnoreCase("Florianopolis") && c1.equalsIgnoreCase("Goiania")) {
			distancia = 1493;
	}
		else if((c1.equalsIgnoreCase("Curitiba") && c2.equalsIgnoreCase("Maceio")) || c2.equalsIgnoreCase("Curitiba") && c1.equalsIgnoreCase("Maceio")) {
			distancia = 2871;
	}
		else if((c1.equalsIgnoreCase("Curitiba") && c2.equalsIgnoreCase("Sao Paulo")) || c2.equalsIgnoreCase("Curitiba") && c1.equalsIgnoreCase("Sao Paulo")) {
			distancia = 408;
	}
		else if((c1.equalsIgnoreCase("Curitiba") && c2.equalsIgnoreCase("Goiania")) || c2.equalsIgnoreCase("Curitiba") && c1.equalsIgnoreCase("Goiania")) {
			distancia = 1186;
	}
		else if((c1.equalsIgnoreCase("Maceio") && c2.equalsIgnoreCase("Sao Paulo")) || c2.equalsIgnoreCase("Maceio") && c1.equalsIgnoreCase("Sao Paulo")) {
			distancia = 2453;
	}
		else if((c1.equalsIgnoreCase("Maceio") && c2.equalsIgnoreCase("Goiania")) || c2.equalsIgnoreCase("Maceio") && c1.equalsIgnoreCase("Goiania")) {
			distancia = 2105;
	}
		else if((c1.equalsIgnoreCase("Sao Paulo") && c2.equalsIgnoreCase("Goiania")) || c2.equalsIgnoreCase("Sao Paulo") && c1.equalsIgnoreCase("Goiania")) {
			distancia = 926;
	}
		return distancia;
	}
	
	
	
	
}

