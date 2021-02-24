package com.hamrasta.management.user.payload;

import com.hamrasta.management.user.constant.UserGender;
import com.hamrasta.management.user.rule.constraint.CheckIfIsNotNightRule;
import com.hamrasta.management.user.rule.derivation.GenderWillBeDerivedFromIsMaleRule;
import com.hamrasta.trellis.context.rule.Rules;
import com.hamrasta.trellis.core.payload.RequestMessage;
import com.hamrasta.trellis.validator.Required;

@Rules(
        constraints = {
                CheckIfIsNotNightRule.class
        },
        derivations = {
                GenderWillBeDerivedFromIsMaleRule.class
        }
)
public class GetUserProfileRequest extends RequestMessage {
    @Required
    private boolean isMale;


    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }


    public GetUserProfileRequest(boolean isMale) {
        setMale(isMale);
    }

    public static String getGender(GetUserProfileRequest getUserProfileRequest) {
        return getUserProfileRequest.isMale ? "isMale" : "isFemale";
    }
}
