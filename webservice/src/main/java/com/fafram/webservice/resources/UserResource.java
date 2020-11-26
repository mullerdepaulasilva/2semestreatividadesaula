package com.fafram.webservice.resources;


import com.fafram.webservice.entities.User;
import com.fafram.webservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/users") // caminho do recurso
public class UserResource {

    @Autowired
    private UserService service;


    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
       return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
   public ResponseEntity<User> findById(@PathVariable Long id){

        User user = service.findById(id);
        return ResponseEntity.ok().body(user);
   }

   @PostMapping
   public ResponseEntity<User> insert(@RequestBody User user){
      user = service.insert(user);
      return ResponseEntity.ok().body(user);
   }
   @DeleteMapping(value = "/{id}")
   public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
   }
   @PutMapping (value = "/{id}") //indica que o metodo responde uma requisição put HTML
   public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user){
        user = service.update(id, user);
        return ResponseEntity.ok().body(user);

   }
}
