package com.samthecoder;

/**
 * User: Sina Jahan
 * Date: 12-11-10
 */
public class UpCommand implements Command {
    private Mover mover;

    public UpCommand(Mover mover) {
        this.mover = mover;
    }

    @Override
    public String execute() {
        return mover.up();
    }
}
