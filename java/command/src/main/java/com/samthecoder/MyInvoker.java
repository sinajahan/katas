package com.samthecoder;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Sina Jahan
 * Date: 12-11-10
 */
public class MyInvoker {
    private List<Command> history;
    public MyInvoker() {
        history = new ArrayList<Command>();
    }

    public String storeAndExecute(Command command) {
        history.add(command);
        return command.execute();
    }
}
