package ru.votingsystem.web.user;

import org.springframework.stereotype.Controller;
import ru.votingsystem.model.User;
import ru.votingsystem.web.SecurityUtil;

@Controller
public class ProfileController extends AbstractUserController {
    public User get(){return super.get(SecurityUtil.authUserId());}
}
