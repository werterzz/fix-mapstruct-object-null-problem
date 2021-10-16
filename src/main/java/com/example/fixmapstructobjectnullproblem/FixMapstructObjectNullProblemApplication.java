package com.example.fixmapstructobjectnullproblem;

import com.example.fixmapstructobjectnullproblem.dto.UserDto;
import com.example.fixmapstructobjectnullproblem.entity.User;
import com.example.fixmapstructobjectnullproblem.mapper.UserMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FixMapstructObjectNullProblemApplication {

	private final UserMapper userMapper;

	public FixMapstructObjectNullProblemApplication(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(FixMapstructObjectNullProblemApplication.class, args);
	}

	@GetMapping("/")
	public ResponseEntity<UserDto> getUser() {
		User user = new User();
		UserDto userDto = userMapper.toUserDto(user);
		return ResponseEntity.ok(userDto);
	}
}
