package org.example;
import java.util.Scanner;


class Store{
    private String name;
    private String address;
    private int workHours;
    private int workers;

    public Store(String name, String address, int workHours, int workers) {
        this.name = name;
        this.address = address;
        this.workHours = workHours;
        this.workers = workers;
    }
    public void employWorker(int number){
        this.workers += number;
    }
    public void fireWorker(int number){
        this.workers -= number;
    }
    public void printOut(){
        System.out.println(name+"\n"+address+"\n"+workHours+" часов в день"+"\n"+workers);
    }
}
class JewelryStore extends Store {
    private int jewelry;

    public JewelryStore(String name, String address, int workHours, int workers, int jewerly) {
        super(name, address, workHours, workers);
        this.jewelry = jewerly;
    }
}
class ClothingStore extends Store {
    private int clothes;
    public ClothingStore(String name, String address, int workHours, int workers, int Clothes) {
        super(name, address, workHours, workers);
        this.clothes = clothes;
    }
}
class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите название магазина: ");
        String name = scanner.nextLine();
        System.out.print("введите адрес магазина: ");
        String address = scanner.nextLine();
        System.out.print("введите количество рабочих часов в день магазина: ");
        int workHours = scanner.nextInt();
        if (workHours > 24 | workHours < 0 ){
            workHours = 0;
        }
        System.out.print("введите количество работников магазина: ");
        int workers = scanner.nextInt();

        Store store = new Store(name, address, workHours, workers);
        store.printOut();
    }
}

