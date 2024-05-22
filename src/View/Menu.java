package View;

import java.util.Scanner;
import Controller.MenuController;

public class Menu {
    private void apresentation(){
        System.out.println("=======================================");
        System.out.println("             Sᴛᴏᴄᴋ Sʏsᴛᴇᴍ");
        System.out.println("=======================================");
    }

    private void options(){
        System.out.println("[1] See all the products");
        System.out.println("[2] Register a new Product");
        System.out.println("[1] Remove a Product");
        System.out.println("[3] Product entry");
        System.out.println("[4] Product exit");
        System.out.println("[5] Exit");
        System.out.println("=======================================");
    }

    private void askForOption(){
        Scanner input = new Scanner(System.in);
        while(true){
            String answer;

            System.out.println("Please the selected option: ");

            answer = input.nextLine();
            System.out.println(MenuController.isOptionValid(answer));

            if(MenuController.isOptionValid(answer)){
                break;
            }
        }

        input.close();
    }

    public void main(){
        this.apresentation();
        this.options();
        this.askForOption();
    }
}
