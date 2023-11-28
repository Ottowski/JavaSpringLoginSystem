// CustomUserDetailsService class implements the UserDetailsService interface to load user details.
package com.example.individuellUppgift2;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    // UserRepository for database operations related to user entities.
    private final UserRepository userRepository;

    // Constructor for CustomUserDetailsService, injecting UserRepository dependency.
    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Load user details by username.
    @Override
    public UserDetails loadUserByUsername(String username) {
        // Find user by username in the database.
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Username: " + username + " not found"));
    }
}