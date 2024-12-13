package main.java.market.cart;

import java.util.ArrayList;

import main.java.market.command.Command;

public class ShoppingCartManager {

    public ArrayList<Command> commands;

    public ShoppingCartManager() {
        commands = new ArrayList<>();
    }
    public void addCommand(Command command) {
        commands.add(command);
    }
    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
    }
    
}
