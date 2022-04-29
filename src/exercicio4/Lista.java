package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// m�todo para inserir um elemento na lista.
	// a inser��o deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {
		No aux = new No(dado);
		if(inicio == null){
			inicio = fim = aux;
		} else if(inicio == fim){
			if(aux.dado > inicio.dado){
				fim = aux;
				inicio.dir = aux;
				aux.esq = inicio;
			}else{
				inicio = aux;
				aux.dir = fim;
				fim.esq = aux;
			}
		} else{
			No aux2 = inicio;
			while(aux2!=null){
				if(aux.dado > aux2.dado){
					if(aux2 == fim){
						fim.dir = aux;
						aux.esq = fim.esq;
						fim.esq = aux;
						fim = aux;
					}
					aux.esq = aux2;
					aux.dir = aux2.dir;
					aux2.dir.esq = aux;
					aux2.dir = aux;	
				}
				aux2 = aux2.dir;
			}
			if(aux.dir == null || aux.esq == null){
				inicio.esq = aux;
				aux.dir = inicio;
				inicio = aux;
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
