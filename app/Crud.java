package app;

public interface Crud {

    String delete(String name);

    String create(String name);

    String update(String name);

    String read(String name);
}