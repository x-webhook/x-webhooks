package com.xwebhook;

import com.xwebhook.models.Ordering;

public class ApplicationListOptions extends ListOptions {
    private Ordering order;

    public void setOrder(final Ordering order) {
        this.order = order;
    }

    public Ordering getOrder() {
        return this.order;
    }
}
