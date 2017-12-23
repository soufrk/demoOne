package interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Any one of the following overriden methods compiles correctly.
 * 
 * @author soufrk
 *
 */
public class ThrowingExceptions implements A, B {

    public void write() throws IOException {}
    public void write() throws FileNotFoundException {}
    public void write() throws IOException, FileNotFoundException {}
    public void write() throws FileNotFoundException, IOException {}

}

interface A {
    void write() throws FileNotFoundException;
}

interface B {
    void write() throws IOException;
}