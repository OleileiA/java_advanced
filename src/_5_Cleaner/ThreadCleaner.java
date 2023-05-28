package _5_Cleaner;


import java.lang.ref.Cleaner;

public class ThreadCleaner implements AutoCloseable {

    private static final Cleaner cleaner = Cleaner.create();

    private final Cleaner.Cleanable cleanable;

    public ThreadCleaner(Book book) {
        this.cleanable = cleaner.register(this, book);
    }

    @Override
    public void close() throws Exception {
        this.cleanable.clean();
    }
}
