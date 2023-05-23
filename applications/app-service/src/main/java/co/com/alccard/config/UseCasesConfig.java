package co.com.alccard.config;

import co.com.alccard.model.user.gateways.UserRepositoryGateway;
import co.com.alccard.usecase.user.UserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesConfig {

        @Bean
        public UserUseCase userUseCase(UserRepositoryGateway userRepositoryGateway) {
                return new UserUseCase(userRepositoryGateway);
        }


}
