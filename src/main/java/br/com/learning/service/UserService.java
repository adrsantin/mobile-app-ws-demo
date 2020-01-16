package br.com.learning.service;

import br.com.learning.ui.model.request.UserDetailsModelRequest;
import br.com.learning.ui.model.response.UserRest;

public interface UserService {
    UserRest createUser(UserDetailsModelRequest userDetails);
}
