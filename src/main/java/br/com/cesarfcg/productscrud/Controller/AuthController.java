package br.com.cesarfcg.productscrud.Controller;

import br.com.cesarfcg.productscrud.Dto.Request.LoginRequestDTO;
import br.com.cesarfcg.productscrud.Dto.Request.RegisterRequestDTO;
import br.com.cesarfcg.productscrud.Dto.Request.UserRequestDTO;
import br.com.cesarfcg.productscrud.Dto.Response.LoginResponseDTO;
import br.com.cesarfcg.productscrud.Dto.Response.RegisterResponseDTO;
import br.com.cesarfcg.productscrud.Entity.UserEntity;
import br.com.cesarfcg.productscrud.Repository.UserRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserRepository userRepository;
    private final AuthenticationManager authenticationManager;
    private  final PasswordEncoder passwordEncoder;
    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@Valid @RequestBody LoginRequestDTO loginRequestDTO){
        var usernamePassword = new UsernamePasswordAuthenticationToken(loginRequestDTO.login(), loginRequestDTO.password());
        var auth = authenticationManager.authenticate(usernamePassword);
        return ResponseEntity.ok().build()   ;

    }
    @PostMapping("/register")
    public ResponseEntity<RegisterResponseDTO> register(@Valid @RequestBody RegisterRequestDTO registerRequestDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setLogin(registerRequestDTO.login());
        userEntity.setPassword(passwordEncoder.encode(registerRequestDTO.password()));
        UserEntity savedUser =  userRepository.save(userEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(new RegisterResponseDTO(savedUser.getLogin()));
    }
}
