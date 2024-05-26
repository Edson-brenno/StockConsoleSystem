package View;

import java.util.Arrays;
import java.util.Scanner;
import Controller.MenuController;
import View.InterfacesView.MenuInterface;
import View.UtilitiesView.MenuUtilitiesView;

public class Menu implements MenuInterface {
    private int choosedMenuOption;
    /**
     * Will show the Menus name
     * Mostra o nome do menu
     **/
    @Override
    public void presentation(){
        MenuUtilitiesView.MenuPresentation("Sᴛᴏᴄᴋ Sʏsᴛᴇᴍ");
    }
    /**
     * Shows the menus options
     * Mostra as opções do menu
     **/
    private void options(){
        String[] menuOptions = new String[]{"See all the products", "Register a new Product", "Remove a Product",
        "Product entry", "Exit"};

        MenuUtilitiesView.MenuOptions(menuOptions);
    }
    /**
     * Asks the user for the menu option
     * Pergunta o usuário pela opção do menu**/
    private void askForOption(){
        Scanner sc = new Scanner(System.in);
        // While the Option is not valid
        while(true){
            String answer;
            System.out.println("Please the selected option: ");

            answer = sc.nextLine();
            // If the option is valid; Se a opção for válida
            if(MenuController.isOptionValid(answer)){
                this.choosedMenuOption = Integer.parseInt(answer);
                break;
            }
        }

        sc.close();
    }
    /**
     * Run the menu
     * Roda o menu**/
    @Override
    public void runMenu(){
        this.presentation();
        this.options();
        this.askForOption();
        MenuController.showTheChoosenOption(this.choosedMenuOption);
    }
}
