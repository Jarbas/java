package br.edu.unoesc.pos.interfac;

public class Portal {
	
	
	public static void main(String[] args) {
		
		
		Professor prof = new Professor();
		prof.setNickname("Andre");
		
		Aluno aluno = new Aluno();
		aluno.setNickname("Jarbas");
		
		Portal portal = new Portal();
		portal.acessa(prof);
		portal.acessa(aluno);
		
		
		
	}
	
	public void acessa(AcessaPortal acessaPortal){
		
		
		System.out.println("Bem vindo " + acessaPortal.getNickName() );
		
		
	}

}
