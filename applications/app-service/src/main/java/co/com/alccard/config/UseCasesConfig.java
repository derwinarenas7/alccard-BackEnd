package co.com.alccard.config;

import co.com.alccard.model.user.gateways.UserRepository;
import co.com.alccard.usecase.user.UserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesConfig {

        @Bean
        public UserUseCase userUseCase(UserRepository userRepository) {
                return new UserUseCase();
        }

        /*@Bean
        public UserRepository userRepository() {
                UserRepository userRepository = new UserRepository();
                return userRepository;
        }*/

}
