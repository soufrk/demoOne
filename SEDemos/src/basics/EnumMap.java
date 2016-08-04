package basics;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates usage of enum as a lookup map.
 * @author soufrk
 *
 */
public class EnumMap {

	private enum Operation{
		INGEST_FW (0), 
		INGEST_CE (1), 
		RETIRGGER_FW(2), 
		RETRIGGER_CE(3),
		INVALID(4);
		
		private final int opCode;

	    private Operation(int opCode) {
	        this.opCode = opCode;
	    }
	    
	    private static final Map<Integer, Operation> intToTypeMap = new HashMap<Integer, Operation>();
	    static {
	        for (Operation type : Operation.values()) {
	            intToTypeMap.put(type.opCode, type);
	        }
	    }

	    public static Operation fromInt(int i) {
	    	Operation type = intToTypeMap.get(Integer.valueOf(i));
	        if (type == null) 
	            return Operation.INVALID;
	        return type;
	    }
	    
	}

     public static void main(String []args){
        int op = getOperation("IF");
        //int op = getOperation("IC");
        //int op = getOperation("RF");
        //int op = getOperation("RC");
        Operation opC = Operation.fromInt(1);
        
        switch(opC){
            case INGEST_FW : System.out.println("Hello");break;
            case INGEST_CE: System.out.println("World");break;
        }
        
     }
     
     private static int getOperation(String input){
         int op = 0;
         if(input.contains("R"))
             op +=2;
         if(input.contains("C"))
             op ++;
        return op;
     }
}
