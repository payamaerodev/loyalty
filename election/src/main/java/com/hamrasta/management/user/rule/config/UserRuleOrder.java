package com.hamrasta.management.user.rule.config;

public enum UserRuleOrder  {
    CHECK_IF_IS_NOT_NIGHT_RULE(0),
    GENDER_WILL_BE_DERIVED_FROM_IS_MALE_RULE(1);

    private final int order;

    public int getOrder() {
        return order;
    }

    UserRuleOrder(int order) {
        this.order = order;
    }
}
