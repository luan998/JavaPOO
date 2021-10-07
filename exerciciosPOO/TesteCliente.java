package exerciciosPOO;

public class TesteCliente {

	public static void main(String[] args) {
		
		cliente[] lista = new cliente[4];
		
		lista[0] = new cliente("José",200);
		lista[1] = new cliente("Walter",955);
		lista[2] = new cliente("Antonio",500);
		lista[3] = new cliente("Luiza",2100);
		
		for (cliente roda:lista)
		{
			roda.Imprimir();
			roda.DescontoEmCompras(0);
		}

	}

}
