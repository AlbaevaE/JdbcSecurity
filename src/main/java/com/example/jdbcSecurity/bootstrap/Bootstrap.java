package com.example.jdbcSecurity.bootstrap;

import com.example.jdbcSecurity.model.User;
import com.example.jdbcSecurity.model.UserRoles;
import com.example.jdbcSecurity.repository.UserRepository;
import com.example.jdbcSecurity.repository.UserRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserRolesRepository userRolesRepository;

    @Override
    public void run(String... args) throws Exception {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        User user = new User("user1",
                passwordEncoder.encode("123"),
                1);
        userRepository.save(user);
        User user2 = new User("user2",
                passwordEncoder.encode("1234"),
                2);
        userRepository.save(user2);
        User user3 = new User("user3",
                passwordEncoder.encode("1235"),
                3);
        userRepository.save(user3);

        UserRoles ur = new UserRoles("ROLE_ADMIN",user);
        userRolesRepository.save(ur);
        UserRoles uroles = new UserRoles("ROLE_USER",user2);
        userRolesRepository.save(uroles);
        UserRoles uroles3 = new UserRoles("ROLE_USER",user3);
        userRolesRepository.save(uroles3);

    }
}
