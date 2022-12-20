public class LeetCode1678 {

    public String interpret(String command) {
        for (int i = 0; i <= command.length()-2; i++) {
            String temp = command.substring(i,i+2);
            if (temp.equals("()")){
                command=command.replace("()","o");
            }
        }
        for (int i = 0; i <= command.length()-4; i++) {
            String temp2 = command.substring(i,i+4);
            if (temp2.equals("(al)")){
                command = command.replace("(al)","al");
            }
        }
        return command;
    }

}
