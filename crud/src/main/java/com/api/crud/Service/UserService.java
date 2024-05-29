package com.api.crud.Service;

import com.api.crud.Model.UserModel;
import com.api.crud.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public ArrayList<UserModel> getUsers() {
        return (ArrayList<UserModel>)  userRepository.findAll();
    }


   public UserModel saveUser(UserModel user){
        return userRepository.save(user);
   }

   public UserModel getUserById(Long id){
        return userRepository.findById(id).get();
   }

   public void deleteUser(Long id){
       userRepository.deleteById(id);
   }

    public UserModel updateUser(Long id, UserModel user){
        return userRepository.save(user);
    }



}
