package array;

import java.util.ArrayList;
import java.util.Iterator;

public class array {
	
    public static void main(String[] args) {

    	ArrayList<Integer> lista = new ArrayList<Integer>();

    	lista.add(79);
    	lista.add(375);
    	lista.add(255);
    	lista.add(64);
    	lista.add(15);
    	lista.add(145);
    	lista.add(38);
    	lista.add(500);
    	lista.add(123);
    	lista.add(5);
    	

    	 Iterator<Integer> it = lista.iterator();
 	 
    	 Integer max = lista.get(0);
    	 while (it.hasNext()) {		 
    		 Integer next = it.next();
    		 
    		 if (max < next) {				   			  
    			max = next;
			}      
    	 }    	 
    	System.out.println("El numero mas alto es: "+max);
    	
    	
    	
    	Iterator<Integer> it2 = lista.iterator();	
    	Integer min = lista.get(0);
    	while (it2.hasNext()) {		 
   		 	Integer next = it2.next();
   		 
   		 	if (min > next) {				   			  
   		 		min = next;
   		 		}      
    	 }    	 
    	System.out.println("El numero mas bajo es: "+min);
 
    
    }
}
