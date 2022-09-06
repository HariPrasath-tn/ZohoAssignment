package Threading;
import java.util.Random;

import static java.lang.System.out;

final class Stock{
    private static final Random random = new Random();
    private int stackCount;
    private static final int MAX_STOCK = 20;
    private static final int MIN_STOCK = 0;

    public synchronized void setStackCount(int stockSupplied){
        out.println("Current Stock : " + stackCount + " \n Stock going to be supplied next : " + stockSupplied );
        while(stackCount + stockSupplied > MAX_STOCK){
            try{ wait();} catch (Exception ignored){}
        }
        stackCount+=stockSupplied;
        out.println("Stock after supply : " + stackCount);
        notify();
    }

    public synchronized void getStackCount(int stockConsumed){
        out.println("Current Stock : " + stackCount + " \n Stock going to be consumed next : " + stockConsumed );
        while(stackCount - stockConsumed < MIN_STOCK){
            try{ wait();} catch (Exception ignored){}
        }
        stackCount-= stockConsumed;
        out.println("Stock after consumer : " + stackCount);
        notify();
    }

    public int randInt(int beginning, int ending){
        return random.nextInt(beginning, ending);
    }
}

final class Supplier implements Runnable{
    private final Stock stock;
    private final Thread supplierThread;

    Supplier(Stock stock){
        this.stock = stock;
        supplierThread = new Thread(this, "Supplier Thread");
        supplierThread.start();
    }

    public void run(){
        while(true){
            stock.setStackCount(stock.randInt(1, 10));
            try{ Thread.sleep((long)stock.randInt(1, 5)*1000);}catch (Exception ignored){}
        }
    }
}


final class Consumer implements Runnable{
    private final Stock stock;
    private final Thread consumerThread;
    public Consumer(Stock stock){
        this.stock = stock;
        consumerThread = new Thread(this, "Consumer Thread");
        consumerThread.start();
    }

    public void run(){
        while(true){
            stock.getStackCount(stock.randInt(1, 10));
            try{ Thread.sleep((long)stock.randInt(1, 5)*1000);}catch (Exception ignored){}
        }
    }
}


final class ThreadInnerCommunication {
    public static void main(String[] args) {
        Stock stock = new Stock();
        new Supplier(stock);
        new Consumer(stock);
    }
}
