package com.cts.srcmed.serviceimpl;



import com.cts.srcmed.model.User;
import com.cts.srcmed.repository.UserLoginRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class LoginServiceImplTest {

    @Mock
    private UserLoginRepo userRepository;

    @InjectMocks
    private LoginServiceImpl loginService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testLogin_ValidCredentials() {
        String username = "john";
        String password = "password";
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        Mockito.when(userRepository.findByUsername(username)).thenReturn(user);

        Assertions.assertDoesNotThrow(() -> loginService.login(username, password));
    }

    
}