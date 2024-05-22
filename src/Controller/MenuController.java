package Controller;

import org.jetbrains.annotations.NotNull;

public class MenuController {

    /**
     * Verify if the chosen options inputed from the user is not a digit;
     * verifica se o que o que o usuário digitou não é digito
     * @param optionInputed String of the menu option choosed; Texto da opcao selecionada
     * @return boolean
     * **/
    public static boolean isNotDigit(@NotNull String optionInputed){
        for (char c : optionInputed.toCharArray()) {
            if (!Character.isDigit(c)) {
                return true;
            }
        }

        return false;
    }
    /**
     * Verify if choosen menu option is valid
     * Verifica se a opção selecionada é valida
     * @param answer the inputed answer; A resposta inputada pelo usuário
     * @return boolean**/
    public static boolean isOptionValid(String answer){
        if (answer.isEmpty()){ // if user haven't inputed something; Se o usuário não digitou nada
            return false;
        }else if(MenuController.isNotDigit(answer)){ // if the inputed option has letter; Se a resposta tem letra
            return false;
        }else if(Integer.parseInt(answer) > 5 || Integer.parseInt(answer) <= 0) {
            // If the option doesn't exist; Se a opção não existe
            return false;
        }else{ // If it's everything good; Se está tudo ok
            return true;
        }
    }
}
