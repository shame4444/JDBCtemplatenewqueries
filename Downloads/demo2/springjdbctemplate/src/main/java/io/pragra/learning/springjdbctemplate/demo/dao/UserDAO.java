package io.pragra.learning.springjdbctemplate.demo.dao;

import io.pragra.learning.springjdbctemplate.demo.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAO {
    private JdbcTemplate jdbcTemplate;

    public UserDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void readAndPrintUser(){
        String sql = "SELECT * FROM User_Detail";
        List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        users.forEach(System.out::println);
    }
    public int addUser(User user){
        String sql = "insert into User_Detail values (?,?,?)";
        return jdbcTemplate.update(sql,user.getId(),user.getFirstName(),user.getLastName());
    }
    public int updateUser(User user){
        String sql = "update User_Detail set last_name= ? where id = ?";
        return jdbcTemplate.update(sql,user.getLastName(),user.getId());
    }
    public User findUserById(int id){
        String sql = "select * from User_Detail where id= ?";
        return jdbcTemplate.queryForObject( sql, new BeanPropertyRowMapper<>(User.class), id);
    }
}
