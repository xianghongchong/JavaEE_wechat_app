package wechat.app.mapper;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import wechat.app.model.Test;

import java.util.List;

@Repository
public interface TestMapper {
    public List<Test> Select();
}
