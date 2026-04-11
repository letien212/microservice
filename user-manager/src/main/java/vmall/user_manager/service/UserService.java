package vmall.user_manager.service;

import vmall.user_manager.dto.request.CreateAccountRequest;
import vmall.user_manager.dto.response.CreateAccountResponse;

public interface UserService {
    CreateAccountResponse createAccount(CreateAccountRequest request);
}
