import java.util.HashSet;
import java.util.Set;

public class Principal {
	 
	public static boolean sumaDosElementos(int [] num, int sumaRequerida)
	{
		for (int i = 0; i < num.length; i ++)            // Bucle externo que recorre cada elemento
		{
			for (int j = i + 1; j < num.length; j++)     // Bucle interno que comienza desde el siguiente elemento
			{
				if(num[i]+num[j] == sumaRequerida)        // Verifica si la suma de num[i] y num[j] es igual a sumaRequerida
				{
					return true;                         // Si es así, retorna true y finaliza la función
				}
				}
			}
		return false;
		}

	public static boolean sumaDosElementosOptimizada(int [] num, int sumaRequerida)
	{
		  Set<Integer> complementos = new HashSet<>();    // Creamos un HashSet para almacenar complementos

	        for (int numero : num) { 
	            int complemento = sumaRequerida - numero; // Calculamos el complemento necesario para alcanzar sumaRequerida
	            
	                                                      
	            if (complementos.contains(complemento))   // Verificamos si el complemento ya está en el HashSet
	            {
	            	return true;                          // Si está, significa que existe un par que suma sumaRequerida
	            }
	            complementos.add(numero);                 // Agregamos el número actual al HashSet de complementos
	        }
	        return false;		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		  int[] num = {1, 4, 3, 9};
	      int sumaRequerida = 8;
	      System.out.println("¿puede un número X formarse\r\n" + 
	      		"usando la suma de 2 elementos de un array?"+ sumaDosElementos(num, sumaRequerida)); 
	      
	      int [] num2 = {1,2,4,4};
	      System.out.println("¿puede un número X formarse\r\n" + 
	      		"usando la suma de 2 elementos de un array?" + sumaDosElementosOptimizada(num2,sumaRequerida));
	      
	     
	}
		
}
