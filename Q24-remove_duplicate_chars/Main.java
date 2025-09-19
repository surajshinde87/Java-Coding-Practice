// Remove Duplicate Characters from a String

public class Main {

    public static void main(String[] args) {
        
        String str = "Programming";
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(result.indexOf(String.valueOf(ch)) == -1){
                result.append(ch);
            }

        }

        System.out.println(result.toString()); 

        // Second way
        String input = "Hello World";
        String output = "";
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(output.indexOf(ch) == -1){
                output += ch;
            }
        }
        System.out.println(output);


        // third way
        String s = "Mississippi";
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(sb.indexOf(String.valueOf(c)) == -1){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }

}
