package implementation;

public class SupermarketArray implements Supermarket{

    private final String[] items;
    private int lastIdex;

    public SupermarketArray(final int size) {
        items = new String[size];
        lastIdex = -1;
    }

    @Override
    public void add(String item) {
        if (lastIdex == items.length - 1) {
            System.err.println("Lista de Supermercado cheia");
        } else {
            lastIdex++;
            items[lastIdex] = item;
        }
        
    }

    @Override
    public void print() {
        System.out.println("###################");
        if (lastIdex < 0) {
            System.out.println("Lista de Supermercado vazia");
        }
        for (int i = 0; i <= lastIdex; i++) {
            System.out.println(i + " - " + items[i]);
        }
        System.out.println("###################");
        
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index <= lastIdex) {
            shift(index);
            lastIdex --;

        } else {
            System.err.println("Índice inválido: " + index);
        }
        
    }

    private void shift(final int index) {
        for (int i = index; i < lastIdex; i++) {
            items[i] = items[i + 1];
        }
    }
        
}
