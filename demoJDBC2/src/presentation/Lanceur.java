package presentation;

import java.util.ArrayList;
import java.util.Collection;

import exceptions.ClientExistePasException;
import metier.Client;
import service.ClientService;
import service.IClientService;
import service.IClientServiceVip;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// déclaration de l'interface
		IClientService s = new ClientService();
		IClientServiceVip sv = new ClientService();
		
		//declaration de la classe;
		//ClientService cs = new ClientService();
		System.out.println("--------------CLIENT NORMAL-------------------------------");		
		// utilisation de l'interface
		s.direBonjour();
		s.direAurevoir();
		
		//s.jesuisVip();
		System.out.println("--------------CLIENT VIP---------------------------------");
		sv.direBonjour();
		sv.direAurevoir();
		sv.jesuisVip();
		
		//utilisation de la classe
		/*cs.direAurevoir();
		cs.direBonjour();
		cs.jesuisVip();*/
		
		/*System.out.println("------------Ajouter client ------------------");
		Client c1 = new Client();
		c1.setNom("GTM");
		c1.setPrenom("Eddy");
		s.ajouterClient(c1);
		*/
		
		//System.out.println("------------Supprimer client ------------------");
		//s.supprimerClient(c1);
		
		System.out.println("------------Lister clients ------------------");
		Collection <Client> col = new ArrayList<Client>();
		col = s.listerClients();
		
		for (Client c : col) 
		{
			System.out.println(c);
		}
		
		System.out.println("------------Modifier client ------------------");
		s.modifierClient(1, "Espuche", "Marine");
		
		
		System.out.println("------------Lister clients ------------------");
		Collection <Client> col2 = new ArrayList<Client>();
		col2 = s.listerClients();
		
		for (Client c : col2) 
		{
			System.out.println(c);
		}
		
		
		Collection <Client> col3 = new ArrayList<Client>();
		String mc = "t";
		col3 = s.chercherParMC(mc);
		System.out.println("------------Afficher les clients qui comportent un " + mc +  " dans leur nom------------------");
		
		for (Client c : col3) 
		{
			System.out.println(c);
		}
		
		
		int idclient = 2;
		System.out.println("------------Rechercher le client dont l'id est " + idclient +  " ------------------");
		try {
			System.out.println(s.chercherClient(idclient));
		} catch (ClientExistePasException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		idclient = 10;
		System.out.println("------------Rechercher le client dont l'id est " + idclient +  " ------------------");
		try {
			System.out.println(s.chercherClient(idclient));
		} catch (ClientExistePasException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		idclient = 10;
		System.out.println("------------Supprimer le client dont l'id est " + idclient +  " ------------------");
		try {
			s.supprimerClient(idclient);
		} catch (ClientExistePasException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		/*System.out.println("------------Ajouter client ------------------");
		Client c1 = new Client();
		c1.setNom("aaaaaa");
		c1.setPrenom("bbbbbbb");
		s.ajouterClient(c1);
		
		
		System.out.println("------------Lister clients ------------------");
		col2 = s.listerClients();
		
		for (Client c : col2) 
		{
			System.out.println(c);
		}
		
		idclient = 10;
		System.out.println("------------Supprimer le client dont l'id est " + idclient +  " ------------------");
		try {
			s.supprimerClient(idclient);
		} catch (ClientExistePasException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("------------Lister clients ------------------");
		col2 = s.listerClients();
		
		for (Client c : col2) 
		{
			System.out.println(c);
		}
		*/
		/*System.out.println("------------Ajouter client ------------------");
		Client c1 = new Client();
		c1.setNom("g");
		c1.setPrenom("h");
		c1.setCouleurYeux("vert");
		s.ajouterClient(c1);
		*/
		
		System.out.println("------------Lister clients ------------------");
		col2 = s.listerClients();
		
		for (Client c : col2) 
		{
			System.out.println(c);
		}
		
	
		
	}

}
