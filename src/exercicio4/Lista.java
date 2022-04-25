package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// m�todo para inserir um elemento na lista.
	// a inser��o deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {
		No aux = new No(dado);
		if(inicio == null){
			inicio = aux;
			aux.esq = null;
			aux.dir = null;
			fim = aux;
		} else{
			No no = inicio;
			while(no != null) {
				if(no.dado > aux.dado){
					aux.esq = null;
					aux.dir = inicio;
					inicio.esq = aux;
					inicio = aux;
				} else{
					aux.dir = null;
					aux.esq = fim;
					fim.dir = aux;
					fim = aux;
				}
				aux = aux.dir;
			}
		}
	}
	
	// m�todo para imprimir os elementos da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}
}
