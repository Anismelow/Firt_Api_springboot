package com.api.crud.Repository;

import com.api.crud.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserRepository extends JpaRepository <UserModel, Long> {

}
