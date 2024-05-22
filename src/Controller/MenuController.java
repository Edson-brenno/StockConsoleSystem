package Controller;

import org.jetbrains.annotations.NotNull;

public class MenuController {

    public static boolean hasString(@NotNull String str){
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                return true;
            }
        }

        return false;
    }

    public static boolean isOptionValid(String answer){
        if (answer.isEmpty()){
            return false;
        }
        else if(!Character.isDigit(answer.charAt(0))){
            return false;
        }else if(MenuController.hasString(answer)){
            return false;
        }else if(Integer.parseInt(answer) > 5 || Integer.parseInt(answer) < 0) {
            return false;
        }else{
            return true;
        }
    }
}
