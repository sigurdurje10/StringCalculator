/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class string_calculator {
    public int add(String input) {
    	if(input.equals("")) {
    		return 0;
    	} else if(input.length() == 1) {
    		return Integer.parseInt(input);
    	} else {
    		int sum = 0;
    		for(String s : input.split(",")) {
    			sum += Integer.parseInt(s);
    		}
    		return sum;
    	}
    	
    }
}
