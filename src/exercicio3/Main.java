package exercicio3;

public class Main {
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		// inser��o dos elementos na lista
		lista.inserir(1);
		lista.inserir(2);
		lista.inserir(3);
		lista.inserir(4);
		lista.inserir(5);
		
		// inverte os elementos da lista
		inverter(lista);
		
		// imprime os elementos da lista
		lista.imprimir();
	}
	
	public static void inverter(Lista lista) {
		Lista invertida = new Lista();
		No aux = lista.inicio;
		while(aux != null){
			invertida.inserir(aux.dado);
			aux = aux.dir;
		}
		aux = invertida.fim;
		
		do{
			lista.inicio = aux;
			System.out.println("-" + aux.dado);
			aux = aux.esq;
			lista.inicio = lista.inicio.dir;
			
		}while(aux!=null);	
		invertida.imprimir();	
		System.out.println("--");
	}
}