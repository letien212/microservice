package vmall.user_manager.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vmall.common.api.response.ApiResponse;
import vmall.user_manager.dto.request.CreateAccountRequest;
import vmall.user_manager.dto.response.CreateAccountResponse;
import vmall.user_manager.service.UserService;


@RestController
@RequestMapping(value = "/api/v1/user/accounts")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<ApiResponse<CreateAccountResponse>> createAccount(
            @RequestBody CreateAccountRequest request
    ){
        CreateAccountResponse response = userService.createAccount(request);
        return ResponseEntity.ok(ApiResponse.success(response));
    }

}
