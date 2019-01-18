package service;

import dao.Book_typeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.Book_type;

/**
 * @time: 2019/1/17 16:57
 * @desc:
 */
@Service
public class Book_typeService{
    private final Book_typeMapper mapper;

    @Autowired
    public Book_typeService(Book_typeMapper mapper) {
        this.mapper = mapper;
    }


    public Book_type selectByPrimaryKey(Integer id) {

        return  mapper.selectByPrimaryKey(id);

    }
}
