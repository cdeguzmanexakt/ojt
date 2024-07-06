package alexander.springboot_ojt.service.impl;

import alexander.springboot_ojt.model.User;
import alexander.springboot_ojt.repository.UserRepository;
import alexander.springboot_ojt.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepo;

    @Override
    public List<User> listAllUser() {
        return userRepo.findAll();
    }
}
