package com.hamrasta.management.user.api.rest.controller;

import com.hamrasta.management.user.action.GetProfileAction;
import com.hamrasta.management.user.payload.GetUserProfileResponse;
import com.hamrasta.trellis.ui.web.controller.IController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements IController {

    @GetMapping("/profile")
    public ResponseEntity<GetUserProfileResponse> profile() throws Throwable {
        return ResponseEntity.ok(call(GetProfileAction.class));
    }

}
