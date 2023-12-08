package uni.fmi.masters.rest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.fmi.masters.dto.UserDTO;
import uni.fmi.masters.services.UserService;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserRestController {
    @Autowired
    private UserService userService;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<UserDTO> findAll() {
        return userService.findAll().stream().map(this::convertToDTO).toList();
    }


}
