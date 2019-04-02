package com.company.dao;

import com.company.entity.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
@Table(name="user")
@Qualifier("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {

    public User findById(Long id);

    //add
    public User save(User user);

    @Query(value = "SELECT u FROM User u WHERE name=:name")
    public User findName(@Param("name") String name);

    @Modifying
    @Query(value = "update User u set u.name = ?2 where u.id = ?1")
    public void updateNamebyId(Long id, String name);

    @Modifying
    @Query(value = "delete from User where id = ?1")
    public void deleteUserById(Long id);
}
