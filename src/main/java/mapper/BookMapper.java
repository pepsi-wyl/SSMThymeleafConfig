package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Books;

import java.util.List;

/**
 * @author by pepsi-wyl
 * @date 2022-03-02 20:03
 */
public interface BookMapper {

    /**
     * 查询所有书
     */
    List<Books> getBookList();

    /**
     * 查询一本书ByID
     */
    Books getBookByID(@Param("bookID") int bookID);

    /**
     * 查询书ByName
     */
    List<Books> getBookByBookName(@Param("bookName") String bookName);

    /**
     * 增加一本书
     */
    int addBook(Books book);

    /**
     * 删除一本书
     */
    int delBookByID(@Param("bookID") int bookID);

    /**
     * 更新一本书
     */
    int updateBookByID(Books book);

}
