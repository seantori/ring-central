package com.ringcentral.paths.subscription;

import com.ringcentral.definitions.DeliveryMode;

public class PostParameters {
    public DeliveryMode deliveryMode;
    public String[] eventFilters;

    public PostParameters() {
    }

    public PostParameters(DeliveryMode deliveryMode, String[] eventFilters) {
        this.deliveryMode = deliveryMode;
        this.eventFilters = eventFilters;
    }
}
