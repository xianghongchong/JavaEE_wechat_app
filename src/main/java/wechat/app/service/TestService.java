package wechat.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wechat.app.mapper.TestMapper;
import wechat.app.model.Test;

import java.util.List;

@Service
public class TestService {
    @Autowired
     TestMapper testMapper;
    public List<Test> Select()
    {
        return testMapper.Select();
    }
}
