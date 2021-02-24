package com.hamrasta.management.user.action;

import com.hamrasta.management.user.payload.User;
import com.hamrasta.management.user.payload.GetUserProfileResponse;
import com.hamrasta.trellis.context.action.Action;
import org.springframework.stereotype.Service;

@Service
public class GetProfileAction extends Action<GetUserProfileResponse> {

    @Override
    public GetUserProfileResponse execute() throws Throwable {
        // TODO get from keycloak
        User user=null;
        return plainToClass(user, GetUserProfileResponse.class);
    }

}
