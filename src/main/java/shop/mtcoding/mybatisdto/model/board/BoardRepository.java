package shop.mtcoding.mybatisdto.model.board;

import org.apache.ibatis.annotations.Mapper;
import shop.mtcoding.mybatisdto.model.user.User;

import java.util.List;

@Mapper
public interface BoardRepository {
    public int insert(Board board);

    public int updateById(Board board);

    public int deleteById(int id);

    public List<Board> findAll();

    public Board findById(int id);
}