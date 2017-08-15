package com.springinaction.knights;

import java.io.PrintStream;

/**
 * Created by yangyu on 15/8/17.
 */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("Fa la al, the knight is so brave!");
    }

    public void singAfterQuest() {
        stream.println("Tee hee hee, the brave knight " + "did embark on a quest!");
    }

}
