package View;

import java.util.Scanner;
import Controller.MenuController;
import View.InterfacesView.MenuInterface;

public class Menu implements MenuInterface {
    private int choosedMenuOption;
    /**
     * Will show the Menus name
     * Mostra o nome do menu
     **/
    @Override
    public void presentation(){
        System.out.println("=======================================");
        System.out.println("             Sᴛᴏᴄᴋ Sʏsᴛᴇᴍ");
        System.out.println("=======================================");
    }
    /**
     * Shows the menus options
     * Mostra as opções do menu
     **/
    private void options(){
        System.out.println("[1] See all the products");
        System.out.println("[2] Register a new Product");
        System.out.println("[1] Remove a Product");
        System.out.println("[3] Product entry");
        System.out.println("[4] Product exit");
        System.out.println("[5] Exit");
        System.out.println("=======================================");
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
