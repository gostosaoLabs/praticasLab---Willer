package arvoreBinaria;

public class Aplicacao {

	public static void main(String[] args) {
		
		Arvore tree = new Arvore(4);
		tree.insere(2);
		tree.insere(1);
		tree.insere(10);
		tree.insere(3);
		tree.insere(11);
		tree.insere(8);
		tree.insere(6);
		tree.insere(5);
		tree.remove(5);
		tree.remove(10);
		tree.remove(8);
		
		
	System.out.println("Pr�-ordem:");
	tree.preOrdem();
	System.out.println();
	System.out.println("P�s-ordem:");
	tree.posOrdem();
	System.out.println();
	System.out.println("Em ordem:");
	tree.emOrdem();
	System.out.println();
	System.out.println("Largura:");
	tree.largura();
	
	
	System.out.println("\nAltura do n� [6]: "+tree.pesquisaNo(6).getAlturaNo());
	
	
	System.out.println("Profundidade do n� [6]: "+tree.pesquisaNo(6).getProfundidadeNo());
	
	System.out.println("Altura �rvore: "+tree.getAltura());
	System.out.println("Profundidade �rvore: "+tree.getProfundidade());
	
	System.out.println("Nodo 10 existe na arvore: "+tree.existeNaArvore(10));
	tree.salvarArquivo();


	}

}
