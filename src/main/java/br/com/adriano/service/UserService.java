package br.com.adriano.service;

import br.com.adriano.ui.model.request.UserDetailsModelRequest;
import br.com.adriano.ui.model.response.UserRest;

public interface UserService {
    UserRest createUser(UserDetailsModelRequest userDetails);
}
