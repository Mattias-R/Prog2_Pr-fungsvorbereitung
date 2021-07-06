package Multithreading;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class Multithreading implements ExecutorService, Future {
    String name;
    static int xar = 0;

    //Constructor
    Multithreading(String n){
        name = n;
    }

    // Multithreading method
    public void multiThread(){
        int numWorkers = Runtime.getRuntime().availableProcessors(); // Returns the number of processors available to the JVM
        ExecutorService pool = Executors.newFixedThreadPool(numWorkers); // Creates a thread pool that reuses a fixed number of threads

        List<Future<Integer>> futures = new ArrayList(); // creates a List that holds Future results
        for(int i = 0; i < 5; i++){ // creates tasks dynamically
            int idx = i;
            Callable<Integer> task = () -> doWork(idx); // pass the async function as a lambda
            futures.add(pool.submit(task)); // pool.submit returns Future objects -> add all Future objects to array
        }
    }
    public int doWork(int x){
        System.out.println(x);
        return x;
    }


    public void multiTest(){
        String[] names = {"hans","peter","steffie","martina","kathrin","needles","ken"};
        int numWorkers = Runtime.getRuntime().availableProcessors(); // Returns the number of processors available to the JVM
        ExecutorService pool = Executors.newFixedThreadPool(numWorkers); // Creates a thread pool that reuses a fixed number of threads

        List<Future<String>> futures = new ArrayList(); // creates a List that holds Future results
        for(int i = 0; i < names.length-1;i++){ // creates task dynamically
            int finalI1 = i;
            Callable<String> task = () -> workAllDay(names[finalI1]); // pass the async function as a lambda
            futures.add(pool.submit(task)); // pool.submit returns Future objects -> add all Future objects to array
        }
    }



    public String workAllDay(String x){
        xar++;
        System.out.println(xar);
        System.out.println(x);
        return x;
    }


    public void shutdown() {

    }

    public List<Runnable> shutdownNow() {
        return null;
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return false;
    }

    public <T> Future<T> submit(Callable<T> task) {
        return null;
    }

    public <T> Future<T> submit(Runnable task, T result) {
        return null;
    }

    public Future<?> submit(Runnable task) {
        return null;
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return null;
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        return null;
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
        return null;
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    public void execute(Runnable command) {

    }

    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return false;
    }

    public Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    public Object get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }
}
