package com.hamrasta.management.user.action;

import com.hamrasta.management.user.payload.GetUserProfileRequest;
import com.hamrasta.management.user.payload.GetUserProfileResponse;
import com.hamrasta.management.user.task.GetFemaleTask;
import com.hamrasta.management.user.task.GetMaleTask;
import com.hamrasta.trellis.context.action.Action2;
import org.springframework.stereotype.Service;

@Service
public class GetProfileAction extends Action2<GetUserProfileResponse, String, GetUserProfileRequest> {

    @Override
    public GetUserProfileResponse execute(String id, GetUserProfileRequest request) throws Throwable {
        if (request.isMale())
            return plainToClass(call(GetMaleTask.class, id), GetUserProfileResponse.class);
        else
            return plainToClass(call(GetFemaleTask.class, id), GetUserProfileResponse.class);
    }

}
