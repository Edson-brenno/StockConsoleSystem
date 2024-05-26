package View.UtilitiesView;

public class ClearConsole {
    public static void clear() {
        try{
            String os = System.getProperty("os.name");
            if (os.toLowerCase().contains("windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }else{
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }

        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
