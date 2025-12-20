package com.ums.backend.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ums.backend.entity.User;
import com.ums.backend.repository.UserRepository;

@Service
    public class CustomUserDetailService  implements UserDetailsService{
    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        User user = userRepo.findByUsername(username)
                .orElseThrow(() ->
                       new UsernameNotFoundException("User not found: " + username)
                );

        return new CustomUserDetail(user);
    }
}
