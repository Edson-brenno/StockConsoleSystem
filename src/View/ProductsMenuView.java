package View;

import View.InterfacesView.MenuInterface;
import View.UtilitiesView.MenuUtilitiesView;

public class ProductsMenuView implements MenuInterface{
    /**
     * Show the Menus name
     * Mostra o nome do menu**/
    @Override
    public void presentation(){
        MenuUtilitiesView.MenuPresentation("Aʟʟ ᴛʜᴇ ᴘʀᴏᴅᴜᴄᴛs");
    }

    @Override
    public void runMenu(){
        this.presentation();
    }
}
