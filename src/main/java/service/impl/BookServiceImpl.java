package service.impl;

import mapper.BookMapper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pojo.Books;
import service.BookService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author by pepsi-wyl
 * @date 2022-03-02 21:20
 */

//注册组件
@Service("bookService")
@Scope("singleton")
// 编写事务
@Transactional(
        propagation = Propagation.REQUIRED,
        isolation = Isolation.REPEATABLE_READ,
        timeout = 10
)
public class BookServiceImpl implements BookService {

    @Resource(name = "bookMapper")
    private BookMapper bookMapper;

    @Override
    public List<Books> getBookList() {
        return bookMapper.getBookList();
    }

    @Override
    public Books getBookByID(int bookID) {
        return bookMapper.getBookByID(bookID);
    }

    @Override
    public List<Books> getBookByBookName(String bookName) {
        return bookMapper.getBookByBookName(bookName);
    }

    @Override
    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int delBookByID(int bookID) {
        return bookMapper.delBookByID(bookID);
    }

    @Override
    public int updateBookByID(Books book) {
        return bookMapper.updateBookByID(book);
    }

}