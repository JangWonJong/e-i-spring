package kr.co.eis.api.auth.domains;

import kr.co.eis.api.user.domains.Role;
import kr.co.eis.api.auth.services.AuthServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Base64;
import java.util.List;

/**
 * packageName: kr.co.eis.api.security.domain
 * fileName   : SecurityProvider
 * author     : Jangwonjong
 * date       : 2022-05-23
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-23     Jangwonjong       최초 생성
 */
@Log
@Component
@RequiredArgsConstructor
public class AuthProvider implements AuthenticationProvider {

    private final AuthServiceImpl userDetailsService;

    @Value("${security.jwt.token.security-key:secret-key}")
    private String securityKey;

    @Value("${security.jwt.token.expiration-length:3600000}")
    private long validityInMs = 3600000; // 1시간 토큰 유효기간

    @PostConstruct
    protected void init(){
        securityKey = Base64.getEncoder().encodeToString(securityKey.getBytes());
        log.info("securityKet:"+securityKey);

    }
    public String createToken(String username, List<Role> roles){
        return "";
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return false;
    }
}
