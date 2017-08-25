package basics;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates usage of enum as a lookup map.
 * 
 * Out of a pool of string inputs, switch operation if string contains 'R' or 'C' or both.
 * Consider a situation where action needs to be taken based on HTTP-code returned by a service.
 * <ul>
 * <li>200,500 - service exists; but one works one doesn't</li>
 * <li>400,415 - service exists; but cannot consume input type</li>
 * <li>404 - service doesn't exist</li>
 * </ul>
 * 
 * @author soufrk
 *
 */
public class EnumMap {

    private enum Operation {
	OP_ONE(0), OP_TWO(1), OP_THREE(2), OP_FOUR(3), OP_INVALID(4);

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
		return Operation.OP_INVALID;
	    return type;
	}

    }

    public static void main(String[] args) {
	// String inputs
	String[] stringInputs = {"IF", "IC", "RF", "RC"};
	for(String input:stringInputs){
	    int opCode = getTheOperationCode(input);
	    Operation operation = Operation.fromInt(opCode);	    
	    switchTheOperation(operation);
	}
    }
    
    // Based on condition in string input, operation code is determined.
    private static int getTheOperationCode(String input) {
	int op = 0;
	if (input.contains("R"))
	    op += 2;
	if (input.contains("C"))
	    op++;
	return op;
    }
    
    // Switching amongst various operations.
    private static void switchTheOperation(Operation operation){
	switch (operation) {
	case OP_ONE:
	    System.out.println("Hello");
	    break;
	case OP_TWO:
	    System.out.println("World");
	    break;
	case OP_THREE:
	    System.out.println("This");
	    break;
	case OP_FOUR:
	    System.out.println("is");
	    break;
	case OP_INVALID:
	    System.out.println("just");
	    break;
	default:
	    System.out.println("a test");
	    break;
	}
    }
}
