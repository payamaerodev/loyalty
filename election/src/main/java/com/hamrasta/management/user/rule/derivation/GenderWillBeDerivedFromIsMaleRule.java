package com.hamrasta.management.user.rule.derivation;

import com.hamrasta.management.user.constant.UserGender;
import com.hamrasta.management.user.payload.GetUserProfileRequest;
import com.hamrasta.management.user.rule.config.UserRuleOrder;
import com.hamrasta.trellis.context.rule.DerivationRule;
import org.apache.commons.lang3.ObjectUtils;

public class GenderWillBeDerivedFromIsMaleRule extends DerivationRule<GetUserProfileRequest> {

    public GenderWillBeDerivedFromIsMaleRule() {
        super(GetUserProfileRequest::getGender);
    }

    @Override
    public boolean condition(GetUserProfileRequest request) throws Throwable {
        return ObjectUtils.isNotEmpty(request.isMale());
    }

    @Override
    public Object getDerivedValue(GetUserProfileRequest request) throws Throwable {
        return request.isMale() ? UserGender.MALE : UserGender.FEMALE;
    }

    @Override
    public Integer getOrder() {
        return UserRuleOrder.GENDER_WILL_BE_DERIVED_FROM_IS_MALE_RULE.getOrder();
    }

}
