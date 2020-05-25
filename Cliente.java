package visao;
import javax.swing.JOptionPane;

import model.BancoProxy;
import model.BancoUsuarios;
import model.BancoUsuarioImplements;


public class Cliente {
	
	

	private static String BancoProxy = "Hacker" + "1234";
	
	private static String usua;
	private static String senh;

	public static void main(String[] args) {
		
		int senh;
		String usua;
		System.out.println("Usuario teste: ");
		
		
		BancoUsuarios banco = new BancoProxy("Hacker", "1234");
		
		
		
		usua = JOptionPane.showInputDialog("Digite seu Usuario");
		BancoProxy = JOptionPane.showInputDialog("Digite sua Senha");
		senh= Integer.parseInt(BancoProxy);
		
		//Opcao para Digitar
		
		if ((usua == "hacker") && (senh ==1234 )) {
				System.out.println("Login com sucesso");
		}
		
		//Opcao do Usuario ja cadastrado
		if ((BancoProxy == "Hacker") && (BancoProxy =="1234" )) {
			System.out.println("Login com sucesso");
		}
		
		else {
			System.out.println("Erro! Tente novamente");
		}
		
		
		
		System.out.println(banco.getUsuario());
		System.out.println(banco.getSenha());

		System.out.println("\nAdministrador acessando: ");
		banco = new BancoProxy("admin", "admin");
		System.out.println("Autenticacao realizada com sucesso!");
		
	}
}