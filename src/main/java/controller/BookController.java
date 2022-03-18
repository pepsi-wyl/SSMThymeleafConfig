package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pojo.Books;
import service.BookService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author by pepsi-wyl
 * @date 2022-03-03 9:07
 */
@Controller(value = "bookController")
public class BookController {

    // javax下的注解
    @Resource(name = "bookService")
    private BookService bookService;

    @RequestMapping(name = "展示所有书籍", value = {"/book"}, method = RequestMethod.GET)
    public ModelAndView queryBookList(ModelAndView modelAndView) {
        modelAndView.addObject("bookList", bookService.getBookList());
        modelAndView.addObject("queryName", "请输入要查询的书籍名称");
        modelAndView.setViewName("bookList");                                                   // 设置视图名称
        return modelAndView;
    }

    @RequestMapping(name = "查询书籍ByBookName", value = {"/book/{queryBookName}"}, method = RequestMethod.GET)
    public ModelAndView queryBookByBookName(@PathVariable("queryBookName") String queryBookName, ModelAndView modelAndView) {
        List<Books> books = bookService.getBookByBookName(queryBookName.trim());   //去除空格
        modelAndView.addObject("bookList", books);                         // 设置
        if (books.isEmpty()) {              //没有查到书
            modelAndView.addObject("bookIsEmpty", "没有查到数据!!!");
        } else {
            if (queryBookName == "") {
                modelAndView.addObject("queryName", "请输入要查询的书籍名称");
            } else {
                modelAndView.addObject("queryName", queryBookName);
            }
        }
        modelAndView.setViewName("bookList");
        return modelAndView;
    }

    @RequestMapping(name = "添加book", value = "/book", method = RequestMethod.POST)
    public String addBook(Books books) {
        bookService.addBook(books);
        return "redirect:/book";
    }

    @RequestMapping(name = "去修改页面，数据回显", value = "/toUpdate/{id}", method = RequestMethod.GET)
    public String toUpdatePager(@PathVariable("id") int id, Model model) {
        model.addAttribute("book", bookService.getBookByID(id));
        return "updateBook";       // 返回视图
    }

    @RequestMapping(name = "修改信息", value = "/book", method = RequestMethod.PUT)
    public String updateBook(Books book) {
        System.out.println(bookService.updateBookByID(book) > 0 ? "修改成功!" : "修改失败!");
        return "redirect:/book";
    }

    @RequestMapping(name = "删除信息", value = "/book/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable int id) {
        System.out.println(bookService.delBookByID(id) > 0 ? "删除成功!" : "删除失败!");
        return "redirect:/book";
    }

}
