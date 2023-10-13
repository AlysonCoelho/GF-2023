package filme;

import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class introduçao {

	//String caminhoDoVideo = "\"C:\\Users\\Alyson\\Documents\\filmes\\Superbad.mp4\"";
	
	public static void main(String[] args) {
		
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(" Informe o Nome de Usuario: ");
			sc.nextLine();
			
			System.out.println("Informe o Nome do Filme: ");
			 String input = sc.nextLine();
			
			//System.out.println("Informe a Categoria do Filme");
	     	//sc.nextLine();
			
			if(input.equalsIgnoreCase("Superbad")) {
			
			try {
				URI link = new URI("https://drive.google.com/file/d/0BzvnnMLOiNfaTXkzeldrdXd0a2s/view?usp=drive_link&resourcekey=0-zPvlf8IAirH8RQ0US7QvDg");
				Desktop.getDesktop().browse(link);	
			}catch(Exception erro) {
				System.out.println(erro);
			}
		    } else {
			System.out.println("nao encontrado");
	       }
     }
  }
}

