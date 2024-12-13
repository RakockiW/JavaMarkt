package main.java.market.cart;

import java.util.ArrayList;

public class ShoppingCartManager {

    public ArrayList<CartCommand> commands;

    public ShoppingCartManager() {
        commands = new ArrayList<>();
    }
    public void addCommand(CartCommand command) {
        commands.add(command);
    }
    public void executeCommands() {
        for (CartCommand command : commands) {
            command.execute();
        }
    }
    
}
