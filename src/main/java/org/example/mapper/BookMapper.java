package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.domain.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface BookMapper extends BaseMapper<Book> {

}
