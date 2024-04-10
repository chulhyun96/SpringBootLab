package springboot.basic;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BookService {
    private final Map<String, BookRepository> bookRepository;

    public BookService(Map<String, BookRepository> bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void printStatus() {
        for (String key : bookRepository.keySet()) {
            System.out.println(key);
        }
        System.out.println(bookRepository.getClass().getName());
    }
}
