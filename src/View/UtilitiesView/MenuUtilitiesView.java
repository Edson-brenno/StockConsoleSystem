package View.UtilitiesView;

import org.jetbrains.annotations.NotNull;

public class MenuUtilitiesView {

    public static void MenuPresentation(String menusName){
        System.out.println("=======================================");
        System.out.println(menusName);
        System.out.println("=======================================");
    }

    /**
     * Shows the menus options
     * Mostra as opções do menu
     * @param optionsName Array where each position is the name of the menu option;
     **/
    public static void MenuOptions(String[] optionsName){
        int menuOptionCounter = 1;

        for (String optionName : optionsName){
            System.out.println("[ " + menuOptionCounter + " ] " + optionName);
            menuOptionCounter += 1;
        }

        System.out.println("========================================");
    }
}
