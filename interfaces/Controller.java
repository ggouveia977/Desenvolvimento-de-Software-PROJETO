package interfaces;

import java.util.ArrayList;

public interface Controller<T> {
    public void adicionar(T objeto);

    public ArrayList<T> listar();
}
