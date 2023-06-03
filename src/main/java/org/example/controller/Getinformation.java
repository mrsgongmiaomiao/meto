package org.example.controller;

import org.example.domain.Book;
import org.example.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller//标记该类为控制类
public class Getinformation {
    @Autowired//注入mapper层接口，已经用jsoup把数据爬到数据库里，现在可以使用mapper接口来查出数据
    private BookMapper bookMapper;
    @ResponseBody//该方法的返回值会被自动解析为JSON的格式
    @RequestMapping("/getinformation")
    public List<Book> getBooks(){
        //调用mapper接口获取数据
        List<Book> books=bookMapper.selectList(null);
        return books;
    }
//新增数据
  @RequestMapping("/insertBook")
  public Book insertBook(@RequestBody Book book){
      bookMapper.insert(book);
      System.out.println("新增成功，新增的数据是："+book);
      return book;
    }
//修改数据
  @RequestMapping("/updateBook")
  public String updateBook(@RequestBody Book book){
      bookMapper.updateById(book);
      System.out.println(book);
      return "修改成功";
  }
//删除数据
@RequestMapping("deleteBook")
public void deleteBook(@RequestBody Integer id){
bookMapper.deleteById(id);
    System.out.println("删除成功");
}

}
