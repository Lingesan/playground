package com.designpatterns;

public class Singleton {

    static class EagerInitialization {

        private static final EagerInitialization INSTANCE = new EagerInitialization();

        private EagerInitialization() {

        }

        public static EagerInitialization getInstance() {
            return INSTANCE;
        }
    }

    static class StaticBlockInitialization {
        public static final StaticBlockInitialization INSTANCE;

        private StaticBlockInitialization() {

        }

        static {
            INSTANCE = new StaticBlockInitialization();
        }

    }

    static class LazyInitialization {

        private static LazyInitialization INSTANCE;

        private LazyInitialization() {

        }

        private static LazyInitialization getInstance() {
            if (INSTANCE == null) {
                INSTANCE = new LazyInitialization();
            }
            return INSTANCE;
        }
    }

    static class ThreadSafeSingleton {

        private static ThreadSafeSingleton INSTANCE;

        private ThreadSafeSingleton() {

        }

        synchronized public static ThreadSafeSingleton getInstance() {
            if (INSTANCE == null) {
                INSTANCE = new ThreadSafeSingleton();
            }
            return INSTANCE;
        }
    }

    static class DoubleCheckLockLazySingleton {

        private static volatile DoubleCheckLockLazySingleton INSTANCE;

        private DoubleCheckLockLazySingleton() {

        }

        public static DoubleCheckLockLazySingleton getInstance() {
            if (INSTANCE == null) {
                synchronized (DoubleCheckLockLazySingleton.class) {
                    if (INSTANCE == null) {
                        INSTANCE = new DoubleCheckLockLazySingleton();
                    }
                }
            }
            return INSTANCE;
        }

    }

    // Bill Pugh Singleton class
    static class BillPughHolderSingleton {

        private BillPughHolderSingleton() {

        }

        private static final class InstanceHolder {
            private static final BillPughHolderSingleton INSTANCE = new BillPughHolderSingleton();
        }

        public static BillPughHolderSingleton getInstance() {
            return InstanceHolder.INSTANCE;
        }
    }

    enum SingletonEnum {
        INSTANCE;

        public String getPropertyValue() {
            return "Hello World";
        }
    }

}
