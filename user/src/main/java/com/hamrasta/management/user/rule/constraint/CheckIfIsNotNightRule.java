package com.hamrasta.management.user.rule.constraint;

import com.hamrasta.management.user.constant.Messages;
import com.hamrasta.management.user.payload.GetUserProfileRequest;
import com.hamrasta.management.user.rule.config.UserRuleOrder;
import com.hamrasta.trellis.context.rule.ConstraintRule;
import org.springframework.http.HttpStatus;

public class CheckIfIsNotNightRule extends ConstraintRule<GetUserProfileRequest> {
    @Override
    public boolean condition(GetUserProfileRequest getUserProfileRequest) throws Throwable {
        return true;
    }

    @Override
    public String message(GetUserProfileRequest getUserProfileRequest) {
        return Messages.CAN_NOT_GET_PROFILE_AT_NIGHT.getMessage();
    }

    @Override
    public HttpStatus httpStatus() {
        return HttpStatus.BAD_REQUEST;
    }

    @Override
    public Integer getOrder() {
        return UserRuleOrder.CHECK_IF_IS_NOT_NIGHT_RULE.getOrder();
    }
}
