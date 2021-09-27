package com.spring.sample.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import com.spring.sample.java.Repository.MinOrdersRepository;
import com.spring.sample.java.Repository.MinOrders;
import java.util.List;
// import java.util.Map;
// import org.springframework.jdbc.core.JdbcTemplate;

@Service
@Transactional // メソッド開始時にトランザクションを開始、終了時にコミットする
public class GetMinOrdersService {
    @Autowired
    MinOrdersRepository reposioty;
    // @Autowired
    // private JdbcTemplate jdbc;

    public List<MinOrders> getPersons(){
        return reposioty.findAll();
    }
    // public List<Map<String, Object>> getPersons() {
    //     List<Map<String, Object>> list = jdbc.queryForList("SELECT * FROM MINORDERS");
    // return list;
//   }
}
