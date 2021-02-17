package com.hamrasta.management.user.api.rest.controller;

import com.hamrasta.management.user.action.GetProfileAction;
import com.hamrasta.management.user.payload.GetUserProfileRequest;
import com.hamrasta.management.user.payload.GetUserProfileResponse;
import com.hamrasta.trellis.ui.web.controller.IController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements IController {

    //    @PreAuthorize("hasRole('user-read')")
    @GetMapping("/profile")
    public ResponseEntity<GetUserProfileResponse> profile(@RequestParam(required = false) boolean isMale) throws Throwable {
        String userId = "123";
        return ResponseEntity.ok(call(GetProfileAction.class, userId, new GetUserProfileRequest(isMale)));
    }

    @GetMapping("/test")
    public ResponseEntity<String> profile() throws Throwable {
        String userId = "123";
        return ResponseEntity.ok("everything is ok");
    }
    @GetMapping("/info")
    public ResponseEntity<String> info() throws Throwable {
        String userId = "123";
        return ResponseEntity.ok("");
    }

}
