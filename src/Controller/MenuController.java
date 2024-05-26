package Controller;

import View.ProductsMenuView;
import View.UtilitiesView.ClearConsole;
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
        }else if(MenuController.isNotDigit(answer)){ // if the inputed option is not a digit; Se resposta não for digito
            return false;
        }else if(Integer.parseInt(answer) > 5 || Integer.parseInt(answer) <= 0) {
            // If the option doesn't exist; Se a opção não existe
            return false;
        }else{ // If it's everything good; Se está tudo ok
            return true;
        }
    }

    public static void showTheChoosenOption(@NotNull int choosenOption){
        switch (choosenOption){
            case 1: // Will list all the products; Vai listar todos os produtos
                ClearConsole.clear();
                ProductsMenuView productsMenuView = new ProductsMenuView();
                productsMenuView.runProductsMenu();
                break;
            case 2: // Menu Register for a new product;Menu para registro de um novo produto;
                System.out.println("Welcome to new product register");
                break;
            case 3: // Will remove one product; vai remover um produto;
                System.out.println("Welcome to remove product");
                break;
            case 4: // Menu of one product entry; Menu para entrada de um produto existe
                System.out.println("Welcome to product entry");
                break;
            case 5: // Menu of the stock exit of products; Menu sobre a saida de um produto
                System.out.println("Welcome to product exit");
                break;
            default: // Invalid option; Opção inválida
                System.out.println("Invalid option");
                break;
        }
    }
}
