package de.telran.summary0315;

public class Office {
    public static void main(String[] args) {
        JobActions.Task task1 = new JobActions.Task("write code for bankApp","write code for a personality page");
        JobActions.Task task2 = new JobActions.Task("write  unit testing","test code for bookShop");
        JobActions.Task task3 = new JobActions.Task("to fix the bags","to find paar bags in ShopApp. To fix that");

        Manager manager = new Manager("Ilia");
        manager.doTask(task1);
        manager.haveRest();

        Worker worker = new Worker();
        worker.doTask(task3);
        worker.haveRest();

        LazyWorker lazyWorker = new LazyWorker();
        lazyWorker.doTask(task2);
        lazyWorker.haveRest();


    }

    public static class Manager implements JobActions{
        private String name;
        public Manager(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public void doTask(Task task) {
            System.out.println(task);
        }

        @Override
        public void haveRest() {
            System.out.println("trink a cup of coffee");
        }
    }
    public static class Worker implements JobActions{
        public Worker() {
        }

        @Override
        public void doTask(Task task) {
            System.out.println("i do this " + task);
        }

        @Override
        public void haveRest() {
            System.out.println("smokes while on holiday");
        }
    }
    public static class LazyWorker implements JobActions{
        public LazyWorker() {
        }

        @Override
        public void doTask(Task task) {
            System.out.println("ok");
        }

        @Override
        public void haveRest() {
            System.out.println("chill all time");
        }
    }
}
