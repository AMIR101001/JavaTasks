package service;

public class Runner {
    public static void main(String[] args) {
        Service serviceMem = new Service(new MemRepository());
        serviceMem.getOnlyName();
        // –аскоментировать и исправить код, чтобы он работал. ¬ерхний код должен оставатьс€ нетронутым.
        //Service serviceDataBase = new Service(new DataBaseRepository());
        //serviceDataBase.getOnlyName();
    }
}
