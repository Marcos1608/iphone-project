package iphone.main;

import iphone.features.*;


public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet{

	private String[] musicas = {"Cliffs of Dover - Eric Johnson", "Holding On - Dragonforce", "Phoenix - Stratovarius"};
	private String musicaEscolhida;
	
	public String[] getMusicas() {
		return musicas;
	}

	public void setMusicas(String[] musicas) {
		this.musicas = musicas;
	}
	
	
	// ------------------------------------------------------------------------------------------------//
	// Métodos implementados da Interface NavegadorDeInternet
	// ------------------------------------------------------------------------------------------------//

	@Override
	public String exibirPagina(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adicionarNovaAba() {
		// TODO
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		
	}
	
	// ------------------------------------------------------------------------------------------------//
	//Métodos implementados da Interface AparelhoTelefonico
	// ------------------------------------------------------------------------------------------------//
	
	@Override
	public String ligar(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		
	}
	
	// ------------------------------------------------------------------------------------------------//
	//Métodos implementados da Interface ReprodutorMusical
	// ------------------------------------------------------------------------------------------------//
	
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String selecionarMusica(int musica) {
			musicaEscolhida = musicas[musica - 1];
		return musicaEscolhida;
	}

}
