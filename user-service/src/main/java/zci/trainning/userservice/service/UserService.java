package zci.trainning.userservice.service;

import zci.trainning.userservice.dto.ResponseDto;
import zci.trainning.userservice.entity.User;

public interface UserService {

    User saveUser(User user);
    ResponseDto getUser(Long userId);
}
