package View;

import java.util.Scanner;
import Controller.MenuController;

public class Menu {
    /**
     * Will show the Menus name
     * Mostra o nome do menu
     **/
    private void apresentation(){
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
                break;
            }
        }

        sc.close();
    }
    /**
     * Run the menu
     * Roda o menu**/
    public void runMenu(){
        this.apresentation();
        this.options();
        this.askForOption();
    }
}
