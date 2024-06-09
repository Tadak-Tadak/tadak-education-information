package com.web.tadak.repository.user;

import com.web.tadak.entity.user.AuthProvider;
import com.web.tadak.entity.user.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthProviderRepository authProviderRepository;

    @Test
    void testCreateUser(){

        //Given
        AuthProvider authProvider = AuthProvider.builder()
                .provider("naver")
                .build();

        authProvider = authProviderRepository.save(authProvider);

        User user = User.builder()
                .userId("testuser")
                .email("test@test")
                .password("password")
                .nickname("testNick")
                .majorStatus("y")
                .education("testtest")
                .createdAt(LocalDateTime.now())
                .status("teststat")
                .providerId(authProvider)
                .build();

        //When
        User savedUser = userRepository.save(user);

        //Then
        assertThat(savedUser.getId()).isNotNull();
        assertThat(savedUser.getProviderId()).isNotNull();
        assertThat(savedUser.getProviderId().getProvider()).isEqualTo("naver");
    }

    @Test
    void testReadUser() {
        // Given
        AuthProvider authProvider = AuthProvider.builder()
                .provider("naver")
                .build();
        authProvider = authProviderRepository.save(authProvider);

        User user = User.builder()
                .userId("testuser")
                .email("test@test")
                .password("password")
                .nickname("testNick")
                .majorStatus("y")
                .education("testtest")
                .createdAt(LocalDateTime.now())
                .status("teststat")
                .providerId(authProvider)
                .build();

        // When
        User savedUser = userRepository.save(user);
        userRepository.flush();

        User foundUser = userRepository.findById(savedUser.getId()).orElseThrow();

        // Then
        assertThat(foundUser.getUserId()).isEqualTo("testuser");
    }

    @Test
    void testDeleteUser(){
        // Given
        AuthProvider authProvider = AuthProvider.builder()
                .provider("naver")
                .build();
        authProvider = authProviderRepository.save(authProvider);

        User user = User.builder()
                .userId("testuser")
                .email("test@test")
                .password("password")
                .nickname("testNick")
                .majorStatus("y")
                .education("testtest")
                .createdAt(LocalDateTime.now())
                .status("teststat")
                .providerId(authProvider)
                .build();

        //When
        User savedUser = userRepository.save(user);
        userRepository.flush();

        userRepository.deleteById(savedUser.getId());
        userRepository.flush();

        //Then
        assertThat(userRepository.findById(savedUser.getId())).isEmpty();

    }



}