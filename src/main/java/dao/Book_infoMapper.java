package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import pojo.Book_info;
import pojo.Book_infoExample;

public interface Book_infoMapper {
    long countByExample(Book_infoExample example);

    int deleteByExample(Book_infoExample example);

    int deleteByPrimaryKey(String bookCode);

    int insert(Book_info record);

    int insertSelective(Book_info record);

    List<Book_info> selectByExample(Book_infoExample example);

    Book_info selectByPrimaryKey(String bookCode);

    int updateByExampleSelective(@Param("record") Book_info record, @Param("example") Book_infoExample example);

    int updateByExample(@Param("record") Book_info record, @Param("example") Book_infoExample example);

    int updateByPrimaryKeySelective(Book_info record);

    int updateByPrimaryKey(Book_info record);
}