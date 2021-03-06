import java.util.ArrayList;
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
    		int del_index_start = input.indexOf("//");
    		int del_index_end = input.indexOf("\n");
    		String sub_string = "";
    		String input_split[];
    		if(del_index_start != -1 && del_index_end != -1) {
    			sub_string = input.substring(del_index_start+2, del_index_end);
    			input = input.substring(del_index_end+1);
    			//System.out.println(sub_string);
    			//System.out.println(input);
    			input_split = input.split(sub_string);
    		} else {
    			input_split = input.split(",|\n");
    		}

    		ArrayList<String> negatives = new ArrayList<String>();
    		for(String s : input_split) {
    			//System.out.println("string: "+s);
		    	if(s.indexOf("-") != -1) {
		    		negatives.add(s);
		    	} else {
		    		int addition =  Integer.parseInt(s);
		    		if(addition <= 1000) {
	    				sum += addition;
	    			}
		    	}
    		}
    		String argument = "";
    		int counter = 0;
    		for(String s : negatives) {
    			if(counter > 0) {
    				argument += ",";
    			}
    			argument += s;
    			counter++;
    		}
    		if(negatives.size() > 0) {
		   		throw new IllegalArgumentException(argument);
			}
    		return sum;
    	}

    }

    /*public static void main(String[] args) {
    	string_calculator st = new string_calculator();
    	int addition; //= st.add("//;\n1;2");
    	addition = st.add("//,\n5,7,3");
    	System.out.println(addition);
    }*/
}
