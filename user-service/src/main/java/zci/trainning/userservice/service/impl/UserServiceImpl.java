package zci.trainning.userservice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import zci.trainning.userservice.dto.DepartmentDto;
import zci.trainning.userservice.dto.ResponseDto;
import zci.trainning.userservice.dto.UserDto;
import zci.trainning.userservice.entity.User;
import zci.trainning.userservice.repository.UserRepository;
import zci.trainning.userservice.service.APIClient;
import zci.trainning.userservice.service.UserService;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private APIClient apiClient;


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public ResponseDto getUser(Long userId) {
        ResponseDto responseDto = new ResponseDto();
        User user = userRepository.findById(userId).get();
        UserDto userDto = mapToUser(user);

        DepartmentDto departmentDto = apiClient.getDepartmentById(Long.valueOf(user.getDepartmentId()));

        responseDto.setUser(userDto);
        responseDto.setDepartment(departmentDto);

        return responseDto;
    }

    private UserDto mapToUser(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }
}
