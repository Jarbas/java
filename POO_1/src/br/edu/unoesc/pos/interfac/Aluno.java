package br.edu.unoesc.pos.interfac;

public class Aluno implements AcessaPortal {
	
	private String nickname;

	@Override
	public String getNickName() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}
